package synchronizedEjemplo;
//Uso de Sincronizacion para controlar el acceso.
class sumArray{
    private int sum;
    //sumArray está sincronizado
    synchronized int sumArray(int nums[]){
        sum=0;
        for (int i=0; i<nums.length;i++){
            sum+=nums[i];
            System.out.println("Total acumulado de "+Thread.currentThread().getName()+" es "+sum);
        try {
            Thread.sleep(500);//permitir el cambio de tarea
        }catch (InterruptedException exc){
            System.out.println("Hilo interrumpido");
        }
        }
        return sum;
    }
}
class MiHilo implements Runnable{
    Thread hilo;
    static sumArray sumarray= new sumArray();
    int a[];
    int resp;
    //Construye un nuevo hilo.
    MiHilo(String nombre, int nums[]){
        hilo= new Thread(this,nombre);
        a=nums;
    }
    //Un método que crea e inicia un hilo
    public static MiHilo creaEInicia (String nombre,int nums[]){
        MiHilo miHilo=new MiHilo(nombre,nums);
        miHilo.hilo.start(); //Inicia el hilo
        return miHilo;
    }
    //Punto de entrada del hilo
    public void run(){
        int sum;
        System.out.println(hilo.getName()+ " iniciando.");
        resp=sumarray.sumArray(a);
        System.out.println("Suma para "+hilo.getName()+ " es "+resp);
        System.out.println(hilo.getName()+ " terminado.");
    }
}
class Sincronizacion {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        MiHilo mh1 = MiHilo.creaEInicia("#1",a);
        MiHilo mh2 = MiHilo.creaEInicia("#2",a);
        try {
            mh1.hilo.join();
            mh2.hilo.join();
        }catch (InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
    }
}
/*
			Explicación del ejemplo
			
			Examinemos este programa en detalle. El programa crea tres clases. El primero es SumArray. Contiene el método
			sumArray(), que suma una matriz de enteros. La segunda clase es MiHilo, que usa un objeto estático de tipo 
			SumArray para obtener la suma de una matriz de enteros. Este objeto se llama sumarray y como es estático, 
			solo hay una copia de él compartida por todas las instancias de MiHilo. Finalmente, la clase Sincronizacion
			crea dos hilos y cada uno calcula la suma de una matriz entera.
			
			Dentro de sumArray(), sleep() se usa para permitir deliberadamente que se produzca un cambio de tarea, 
			si se puede –pero no. Debido a que sumArray() está sincronizado, puede ser utilizado solo por un hilo a 
			la vez. Por lo tanto, cuando el segundo hilo (hijo) comienza la ejecución, no ingresa sumArray() hasta 
			después de que el primer hilo secundario haya terminado con él. Esto asegura que se produzca el resultado 
			correcto.
			
			Para comprender completamente los efectos de synchronized, intente eliminarlo de la declaración de 
			sumArray(). Después de hacer esto, sumArray() ya no está sincronizado, y cualquier cantidad de hiloss 
			puede usarlo al mismo tiempo.
 */
//mas info https://javadesdecero.es/avanzado/sincronizacion-de-hilos/
package NivelesDeAcceso.protectede;

public class Ejemplo3_1 extends Ejemplo3
{
    public static void main(String[] args)
    {
        //La siguientes dos l�neas generan error, pues atributo2 es privado y atributo 3 es default
        //System.out.println(atributo2);
        //System.out.println(atributo3);

        System.out.println(atributo1);//S� tenemos acceso a atributo1
    }
}
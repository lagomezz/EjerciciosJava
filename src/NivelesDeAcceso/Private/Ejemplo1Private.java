package NivelesDeAcceso.Private;

public class Ejemplo1Private
{
    private int atributo1;//Este atributo es privado
    private int contador = 0; //Contador de registro

    //Si un atributo es privado podemos crear m�todo get y set ...
    //... para �ste y permitir el acceso a �l desde otras instancias

    public void setAtributo1(int valor)
    {
        contador++;//Contador que lleva el registro de ediciones del atributo1
        atributo1 = valor;//Establecemos el valor del atributo
    }

    public int getAtributo1()
    {
        return atributo1;//Retornamos el valor actual del atributo
    }

    //Get para el contador
    public int getContador()
    {
        return contador;
    }
    //Notar que no ponemos un set, pues no nos interesa que el contador pueda ser cambiado.
}
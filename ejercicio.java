
import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        int opcion,a,b;
        String opcion2;
        do {
            //Impresion
        System.out.println("-----|Calculadora Basica|-----");
        System.out.println("-----|1.-Suma|----------------");
        System.out.println("-----|2.-Resta|---------------");
        System.out.println("-----|3.-Multiplicacion|------");
        System.out.println("-----|4.-Division|------------");
        System.out.println("-----|5.-Salir|---------------");
        System.out.println("Seleccione una opcion: ");
        opcion = sc.nextInt();
        //Hacemos uso de un switch para que el usuario elegia una opcion
        switch (opcion) {
            case 1:
            System.out.println("Ingrese el primer numero: ");
            a = sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            b = sc.nextInt();
            //Llamando el Metodo sumar
            System.out.println("La suma es: " + Sumar(a, b));
                break;
            case 2:
            System.out.println("Ingrese el primer numero: ");
            a = sc.nextInt();
            System.out.println("Ingrese el segundo numero");
            b = sc.nextInt();
            System.out.println("La resta es: " +  Resta(a, b));
                break;
            case 3:
            System.out.println("Ingrese el primer numero: ");
            a = sc.nextInt();
            System.out.println("Ingrese el segundo numero");
            b = sc.nextInt();
            System.out.println("El resultado de la Multiplicacion es: " + Multiplicacion(a, b));
                break;
            case 4:
            System.out.println("Ingrese el primer numero: ");
            a = sc.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            b = sc.nextInt();
            System.out.println("La division es: " + Division(a, b));
                break;
            case 5:
            System.out.println("Saliendo del Sistema");
            break;
            default:
            System.out.println("Opcion no Valida");
            break;
            }
            sc.nextLine();
            System.out.println("¿Desea volver? s/n");
            opcion2 = sc.nextLine();
            //Mientras que el usuario aprete s ,entonces el programa seguira
        } while (opcion2.equalsIgnoreCase("s"));
        System.out.println("Muchas gracias por utilizar mi sistema");
        System.out.println("PDS: TherDragonDevs");
        System.out.println("16/07/2025");
        
    }
    //Metodos e Funciones
    public static int Sumar(int a ,int b){
    
       return a + b;
    }
    public static int Resta(int a, int b){
        return  a - b;
    }
    public static int Multiplicacion(int a,int b){
        return a * b;
    }
    public static int Division(int  a,int  b){
        return a / b;
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Andrés Panchi");

        Scanner sc = new Scanner(System.in);
        System.out.println("Desea ingresar al sistema? (si/no)");
        String respuesta = sc.nextLine();

        if ("si".equals(respuesta)) {
            int contador = 0;

            while (contador < 3) {
                System.out.println("Ingrese su nombre:");
                String nombre = sc.nextLine();

                System.out.println("Ingrese sus años de experiencia:");
                int añosExperiencia = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese su especialidad:");
                String especialidad = sc.nextLine();


                System.out.println("----- Resumen -----");
                System.out.println("Nombre: " + nombre);
                System.out.println("Años de experiencia: " + añosExperiencia);
                System.out.println("Especialidad: " + especialidad+"/n");

                contador++;
            }
        } else {
            System.out.println("Adios.");
        }
        sc.close();
    }
}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Andrés Panchi");

        Scanner sc = new Scanner(System.in);
        System.out.println("Desea ingresar al sistema?");

        String respuesta = sc.nextLine();

        while("si".equals(respuesta)) ;{
            System.out.println("Ingrese su nombre");
            String nombre = sc.nextLine();
            System.out.println("Ingrese sus años de experiencia" );
            int añosExperiencia = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese su especialidad");
            String especialidad = sc.nextLine();

        }
    }
}
package domain;

import funciones.Operaciones;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Operaciones operacion = new Operaciones();
        System.out.println("---- Calculadora ----");

        int opcion = -1;
        while (opcion != 0) {
            try {
                imprimirMenu();
                Scanner scan1 = new Scanner(System.in);
                opcion = Integer.parseInt(scan1.nextLine());

                switch (opcion) {
                    case 1:
                        operacion.sumar();
                        break;
                    case 2:
                        operacion.restar();
                        break;
                    case 3:
                        operacion.dividir();
                        break;
                    case 4:
                        operacion.multiplicar();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opción no encontrada");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e);
            }
            System.out.println("");
        }
    }

    private static void imprimirMenu() {
        System.out.println("""
                           Seleccione la operación a realizar:
                           1. Sumar
                           2. Restar
                           3. Dividir
                           4. Multiplicar
                           0. Salir""");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import java.util.Scanner;

public class Operaciones {
    double resultado;
    double num1;
    double num2;

    Scanner scan1 = new Scanner(System.in);
    public void sumar() {


        System.out.println("Escribe el primer número: ");
        num1 = Integer.parseInt(scan1.nextLine());
        System.out.println("Escribe el segundo número: ");
        num2 = Integer.parseInt(scan1.nextLine());
        resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);
    }

    public void restar() {

        System.out.println("Escribe el primer número: ");
        num1 = Integer.parseInt(scan1.nextLine());
        System.out.println("Escribe el segundo número: ");
        num2 = Integer.parseInt(scan1.nextLine());
        resultado = num1 - num2;
        System.out.println("El resultado es: " + resultado);
    }

    public void multiplicar() {


        System.out.println("Escribe el primer número: ");
        num1 = Integer.parseInt(scan1.nextLine());
        System.out.println("Escribe el segundo número: ");
        num2 = Integer.parseInt(scan1.nextLine());
        resultado = num1 * num2;
        System.out.println("El resultado es: " + resultado);
    }

    public void dividir() {


        System.out.println("Escribe el primer número: ");
        num1 = Integer.parseInt(scan1.nextLine());
        System.out.println("Escribe el segundo número: ");
        num2 = Integer.parseInt(scan1.nextLine());
        if (num1 == 0 || num2 == 0) {
            System.out.println("No es posible dividir por cero");
        } else {
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        }
    }
}

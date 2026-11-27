/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pila<String> pila = new Pila<>();
        int opcion;

        do {
            System.out.println("\n===== MENni PILA (LIFO) =====");
            System.out.println("1. Apilar (push)");
            System.out.println("2. Desapilar (pop)");
            System.out.println("3. Ver tope (peek)");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Ver tamanio");
            System.out.println("6. Verificar si esta vacia");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Valor: ");
                    String valor = teclado.nextLine();
                    pila.push(valor);
                    System.out.println("apilado");
                    break;
                case 2:
                    if (pila.estaVacia()) {
                        System.out.println("esta vacia");
                    } else {
                        System.out.println("Desapilado: " + pila.pop());
                    }
                    break;
                case 3:
                    if (pila.estaVacia()) {
                        System.out.println("esta vacia");
                    } else {
                        System.out.println("Tope actual: " + pila.peek());
                    }
                    break;
                case 4:
                    pila.mostrar();
                    break;
                case 5:
                    System.out.println("Tamanio: " + pila.getTamanio());
                    break;
                case 6:
                    if (pila.estaVacia()) {
                        System.out.println("Si esta vacia");
                    } else {
                        System.out.println("No esta vacia");
                    }
                    break;
                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);

        teclado.close();
    }
}
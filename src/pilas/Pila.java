/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author angel
 */
public class Pila<T> {
    
    private NodoPila<T> tope;
    private int tamanio;

    public Pila() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        if (tope == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getTamanio() {
        return tamanio;
    }

    public void push(T valor) {
        NodoPila<T> nuevo = new NodoPila<>(valor);
        nuevo.setSiguiente(tope);
        tope = nuevo;
        tamanio = tamanio + 1;
    }

    public T pop() {
        if (estaVacia()) {
            throw new IllegalStateException("esta vacia");
        } else {
            T valor = tope.getDato();
            tope = tope.getSiguiente();
            tamanio = tamanio - 1;
            return valor;
        }
    }

    public T peek() {
        if (estaVacia()) {
            throw new IllegalStateException("esta vacia");
        } else {
            return tope.getDato();
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("(pila vacia)");
        } else {
            NodoPila<T> actual = tope;
            System.out.print("Tope --");
            while (actual != null) {
                System.out.print(actual.getDato());
                if (actual.getSiguiente() != null) {
                    System.out.print(" -> ");
                }
                actual = actual.getSiguiente();
            }
            System.out.println();
        }
    }
}

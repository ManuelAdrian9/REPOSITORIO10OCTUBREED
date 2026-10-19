package REPOSITORIO10OCTUBREED;

public class ColaEstatica {
    private int[] elementos;
    private int frente;
    private int fin;
    private int max;

    public ColaEstatica(int tamano) {
        this.max = tamano;
        this.elementos = new int[max];
        this.frente = 0;
        this.fin = -1;
    }

    public boolean estaVacia() {
        return frente > fin;
    }

    public boolean estaLlena() {
        return fin == max - 1;
    }

    public void encolar(int x) {
        if (estaLlena()) {
            System.out.println("La cola estática está llena.");
            return;
        }
        fin++;
        elementos[fin] = x;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola estática está vacía.");
            return -1;
        }
        int valor = elementos[frente];
        frente++;
        return valor;
    }

    // Método Peek solicitado
    public int peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía. No hay elementos al frente.");
            return -1;
        }
        return elementos[frente];
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola vacía.");
            return;
        }
        System.out.print("Frente -> ");
        for (int i = frente; i <= fin; i++) {
            System.out.print("[" + elementos[i] + "] ");
        }
        System.out.println("<- Fin");
    }
}

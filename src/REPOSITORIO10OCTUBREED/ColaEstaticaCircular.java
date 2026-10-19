package REPOSITORIO10OCTUBREED;

public class ColaEstaticaCircular {
    private int[] elementos;
    private int frente;
    private int fin;
    private int max;
    private int tamano; // Control del número actual de elementos

    public ColaEstaticaCircular(int tamanoMax) {
        this.max = tamanoMax;
        this.elementos = new int[max];
        this.frente = 0;
        this.fin = -1;
        this.tamano = 0;
    }

    public boolean estaVacia() {
        return tamano == 0;
    }

    public boolean estaLlena() {
        return tamano == max;
    }

    public void encolar(int x) {
        if (estaLlena()) {
            System.out.println("La cola circular está llena.");
            return;
        }
        fin = (fin + 1) % max; // Movimiento circular del puntero fin
        elementos[fin] = x;
        tamano++;
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("La cola circular está vacía.");
            return -1;
        }
        int valor = elementos[frente];
        frente = (frente + 1) % max; // Movimiento circular del puntero frente
        tamano--;
        return valor;
    }

    // Método Peek complementado bajo la guía solicitada
    public int peek() {
        // Valida si la cola está vacía (tamaño == 0)
        if (tamano == 0) {
            System.out.println("La cola circular está vacía.");
            return -1;
        }
        // Si no está vacía, retorna el elemento en 'frente' sin modificar apuntadores
        return elementos[frente];
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola circular vacía.");
            return;
        }
        System.out.print("Frente -> ");
        int auxiliar = frente;
        for (int i = 0; i < tamano; i++) {
            System.out.print("[" + elementos[auxiliar] + "] ");
            auxiliar = (auxiliar + 1) % max;
        }
        System.out.println("<- Fin");
    }
}

package REPOSITORIO10OCTUBREED;

public class MainDinamica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA DINÁMICA ===");
        ColaDinamica cola = new ColaDinamica();

        cola.encolar(5);
        cola.encolar(15);
        cola.encolar(25);
        cola.mostrar();

        System.out.println("Total de nodos activos: " + cola.contarElementos());
        System.out.println("Elemento en el frente (peek): " + cola.peek());

        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();

        System.out.println("Total de nodos activos: " + cola.contarElementos());
        System.out.println("Nuevo frente (peek): " + cola.peek());
    }
}

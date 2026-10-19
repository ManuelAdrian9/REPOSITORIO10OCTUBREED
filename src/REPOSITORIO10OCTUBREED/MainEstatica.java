package REPOSITORIO10OCTUBREED;

public class MainEstatica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA ===");
        ColaEstatica cola = new ColaEstatica(3);

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());

        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Nuevo frente (peek): " + cola.peek());
    }
}

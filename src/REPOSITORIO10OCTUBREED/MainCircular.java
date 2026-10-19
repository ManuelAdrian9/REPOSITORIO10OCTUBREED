package REPOSITORIO10OCTUBREED;

public class MainCircular {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===");
        ColaEstaticaCircular cola = new ColaEstaticaCircular(3);

        cola.encolar(100);
        cola.encolar(200);
        cola.encolar(300);
        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());

        System.out.println("Desencolado: " + cola.desencolar());
        System.out.println("Insertando elemento circular (400)...");
        cola.encolar(400);
        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());
    }
}

public class Main {
    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new NoFila("Primeira"));
        minhaFila.enqueue(new NoFila("Segunda"));
        minhaFila.enqueue(new NoFila("Terceira"));
        minhaFila.enqueue(new NoFila("Quarta"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new NoFila("Última"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);

    }
}

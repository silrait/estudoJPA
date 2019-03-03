package br.com.silrait;

import br.com.silrait.modelo.Pessoa;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Carlos Da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(1, "Joaquim Torres", "joaquim@gmail.com");
        Pessoa p3 = new Pessoa(1, "Ana Maria", "anamaria@gmail.com");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

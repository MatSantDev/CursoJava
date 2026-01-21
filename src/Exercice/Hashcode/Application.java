package Exercice.Hashcode;

public class Application {

    public static void main(String[] args) {

        Client client1 = new Client("Maria", "maria@gmail.com");
        Client client2 = new Client("Maria", "alex@gmail.com");

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client1.equals(client2));
        System.out.println(client1 == client2); //false, referencia de memoria
    }
}

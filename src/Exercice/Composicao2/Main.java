package Exercice.Composicao2;

import Exercice.Composicao2.Entities.Client;
import Exercice.Composicao2.Entities.Order;
import Exercice.Composicao2.Entities.OrderItem;
import Exercice.Composicao2.Entities.Product;
import Exercice.Composicao2.Enums.OrderStatus;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Product p1 = new Product("TV", 1000.00);
        Product p2 = new Product("Mouse", 40.00);

        OrderItem orderItem1 = new OrderItem(2, 800.00, p1);
        OrderItem orderItem2 = new OrderItem(2, 70.00, p2);

        Client client = new Client("Mateus", "teste@teste.com", sdf.parse("15/09/2004"));
        Order order = new Order(new Date(), OrderStatus.PENDING_PAYMENT, client, List.of(orderItem1, orderItem2));


        System.out.println("ORDER SUMMARY");
        System.out.println(order);

    }
}

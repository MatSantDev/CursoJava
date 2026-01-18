package Exercice.Enum;

import Exercice.Enum.Entities.Enums.OrderStatus;
import Exercice.Enum.Entities.Order;

import java.time.ZoneId;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(12, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus orderStatus = OrderStatus.PROCESSING;
        OrderStatus orderStatus1 = OrderStatus.valueOf("processing".toUpperCase());

        System.out.println(orderStatus);
        System.out.println(orderStatus1);

    }
}

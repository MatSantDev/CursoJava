    package Exercice.Composicao2.Entities;

import Exercice.Composicao2.Enums.OrderStatus;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus orderStatus;
    private Client client;
    private List<OrderItem> orderItemList = new ArrayList<>();

    public Order() {}

    public Order(Date moment, OrderStatus orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Order(Date moment, OrderStatus orderStatus, Client client, List<OrderItem> orderItemList) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
        this.orderItemList = orderItemList;
    }

    public double total(){
        double sum = 0;
        for (OrderItem orderItem : orderItemList){
            sum+= orderItem.subTotal();
        }

        return sum;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void addItems(OrderItem item) {
        orderItemList.add(item);
    }

    public void removeItems(OrderItem item) {
        orderItemList.remove(item);
    }

    @Override
    public String toString() {
        return "Order{" +
                "moment=" + moment + "\n" +
                ", orderStatus=" + orderStatus + "\n" +
                ", client=" + client + "\n" +
                ", items=" + orderItemList + "\n" +
                "Total: " + total() +
                '}';
    }
}

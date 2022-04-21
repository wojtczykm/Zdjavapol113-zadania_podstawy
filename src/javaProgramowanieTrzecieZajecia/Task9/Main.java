package javaProgramowanieTrzecieZajecia.Task9;

public class Main {
    public static void main(String[] args) {
        OrderItem cukier = new OrderItem("cukier",3,4);
        OrderItem milk = new OrderItem("mleko",5,9);
        OrderItem bread = new OrderItem("chleb",6,7);
        OrderItem egg = new OrderItem("jaja",10,1.5);
        cukier.print();
        milk.print();

        Order order = new Order(3);
        order.addItem(cukier);
        order.addItem(milk);
        order.addItem(bread);
        order.addItem(egg);
        order.addItem(milk);

    }
}

package javaProgramowanieTrzecieZajecia.Task9;

public class Order {
    private int maxOrderItem;
    private int currentItemsInOrder = 0;
    private OrderItem[] orderItems;

    public Order(int maxOrderItem){
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }

    public boolean addItem(OrderItem orderItem){
        if(!orderItem.isCorrect()){//czy jest poprawne
            System.out.println("item is incorrect");
            return false;
        }
        if(currentItemsInOrder>=maxOrderItem){//czy jest miejsce w koszyku
            System.out.println("order it full");
            return false;
        }

        orderItems[currentItemsInOrder] = orderItem;//wkłada do koszyka produkt
        currentItemsInOrder++;
        return true;
    }

}

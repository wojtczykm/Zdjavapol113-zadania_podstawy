package javaProgramowanieTrzecieZajecia.Task9;

import javaProgramowanieTrzeciKwiecien.StringHelper;

public class OrderItem {
    private String procuctName;
    private int quantity;
    private double price;

    public OrderItem(String procuctName, int quantity, double price) {
        this.procuctName = procuctName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getAmount() {
        return quantity * price;
    }

    public boolean isCorrect(){
        return StringHelper.isValid(procuctName) && quantity>0 && price>0;
    }

    public void print (){
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "\t| ";
        sb.append(procuctName).append(SEPARATOR);
        sb.append(price).append("zł").append(SEPARATOR);
        sb.append(quantity).append(" pcs").append(SEPARATOR);
        sb.append(getAmount()).append("zł").append(SEPARATOR);
        System.out.println(sb);
    }

}

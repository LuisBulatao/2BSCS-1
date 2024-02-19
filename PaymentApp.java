import javax.swing.border.Border;

public class PaymentApp {
    public static void main(String[] args){

        Order order = new Order("keyboard", 10, 300.00);
        System.out.println("Order item is " + order.getItem().getClass());
        System.out.println("Unit Price is " + order.getUnitPrice());
        System.out.println("Quantity is " + order.getQuantity());

        Order GCash = new Order();
        GCash.setDis("GCash");
        GCash.getQuantity()






        //Setter MAYA, CONTSTRUCTOR GCASH SHOOPPEPAY

    }
}


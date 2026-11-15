package di.practice;
// Same package.

// The program's entry point. It "assembles" which object plugs into which.
// Assembling by hand like this is "manual DI". In Spring, the Spring container (IoC container) does this assembly for you.
// (IoC = Inversion of Control: control over creating/connecting objects moves from your code to the framework.)
public class Main {
    // main: the first method Java calls when the program starts.
    public static void main(String[] args) {
        // To switch to card, uncomment the line below and comment out the Cash line after it.
        // Only the payment method is swapped, with zero changes to OrderService -> the benefit of OCP + DI.
//        PaymentService paymentService = new CardPaymentService();
        // Left side is the interface type, right side is the real implementation (cash). A parent-type variable can hold a child object.
        PaymentService paymentService = new CashPaymentService();

        // Pass the payment method we created into OrderService's constructor. = the moment "injection" happens.
        // (In Spring, @Autowired or automatic constructor injection does this job.)
        OrderService orderService = new OrderService(paymentService);

        // Place a 10000 won order -> prints the order message -> then the chosen payment method's pay() runs.
        orderService.order(10000);
    }
}

package di.practice;
// Same package.

// This class handles orders. It doesn't pay by itself; it "delegates" payment to PaymentService. (separation of roles)
// In Spring you usually add @Service here, and Spring passes the needed objects in through the constructor.
public class OrderService {

    // The key point: the field type is the interface (PaymentService), NOT a concrete class (Card/Cash)!
    // -> No matter which payment method comes in, this class never needs to be modified. (OCP)
    // private: blocks direct access from outside the class / final: once set, it can never be changed (safe).
    private final PaymentService paymentService;

    // Constructor: runs when an OrderService object is created.
    // DI (Dependency Injection): instead of creating the needed object (PaymentService) with "new" myself,
    // it is "handed in from outside". Receiving it via the constructor is called "constructor injection" (the way Spring recommends).
    // If we wrote new CardPaymentService() inside, we would be stuck with Card and couldn't change it without editing this class.
    public OrderService(PaymentService paymentService) {
        // this.paymentService = the field, right-side paymentService = the parameter. Store what we received into the field.
        this.paymentService = paymentService;
    }

    // Order feature: receives an amount and processes the order.
    public void order(int amount) {
        // Print an order message (in real life: stock check, saving the order, etc. would go here).
        System.out.println("주문을 처리합니다.");

        // Delegate payment to PaymentService. Whether it is card or cash, we neither need to know nor can know here.
        // The pay() of whichever object was injected gets executed. (polymorphism)
        this.paymentService.pay(amount);
    }



}

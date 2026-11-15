package di.practice;
// Same package as PaymentService and OrderService.

// Just like Card, this is another payment method that implements PaymentService.
// Both classes implement the "same-named feature" pay() in "different ways". (polymorphism)
// A new payment method only needs a new class to be ADDED -> no existing code changes -> OCP is satisfied.
public class CashPaymentService implements PaymentService {

    // Marks that we rewrite the interface's pay() in our own way.
    @Override
    public void pay(int amount) {
        // The cash payment behavior. Only the printed message differs from Card above.
        System.out.println("현금으로 " + amount + "원 결제했습니다.");
    }
}

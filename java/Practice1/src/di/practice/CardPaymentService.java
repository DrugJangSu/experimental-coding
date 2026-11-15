package di.practice;
// Classes in the same package can use each other without an import statement.

// "implements" means "I promise to follow PaymentService's contract", so pay() MUST be written here.
// This is just one implementation of PaymentService; OrderService doesn't even know this class exists. (OCP)
// Later in Spring, you put @Service (or @Component) above a class to say "Spring, please create and manage this object for me."
public class CardPaymentService implements PaymentService{

    // @Override marks that we are redefining the parent (interface) method. The compiler reports an error if the name/parameters don't match.
    @Override
    public void pay(int amount) {
        // The actual card payment behavior. (In real life, code that talks to the card company goes here.)
        System.out.println("카드로 " + amount + "원 결제했습니다.");
    }
}
5

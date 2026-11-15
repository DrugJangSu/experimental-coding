package di.practice;
// The package this file belongs to. Think of it as a "folder" that groups related classes.

// An interface is just a contract (blueprint): it says WHAT must exist, not HOW it works.
// Why use an interface?
//  1) Card, cash, bank transfer... all can be used through the same "pay(amount)" contract. (polymorphism)
//  2) The user (OrderService) doesn't need to know the concrete classes (Card, Cash). (loose coupling)
//  3) It is the key tool for OCP (Open-Closed Principle).
//     OCP = "Open for extension (adding a new payment method is OK), closed for modification (existing code stays untouched)."
//     Example: to add KakaoPay, just write one new class that implements PaymentService.
//         OrderService does not change by even one line.
public interface PaymentService {

    // The payment contract. An interface method has no body ({ }) and ends with a semicolon (;).
    // How to actually pay is decided by each class that implements this interface.
    void pay(int amount);
}

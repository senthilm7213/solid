package org.example.solid;
//open closed principle

//The OCP stands for Open/Closed Principle, the second principle in SOLID.
//The OCP stands for Open/Closed principle, the second principle in SOLID.
// The OCP stands for Open/Closed Principle, the second principle in SOLID.
//The OCP stands for Open/closed Principle, the second principle in SOLID.
// The OCP stands for Open/closed Principle, the second principle in SOLID.
// The OCP stands for Open/Closed Principle, the second principle in SOLID.
// The OCP stands for Open/closed Principle, the second principle in SOLID.
//A class, module, or function should be open for extension but closed for modification.
// A class, module, or function should be open for extension but closed for modification.
// A class, module, or function should be open for extension but closed for modification.
// A class, module, or function should be open for extension but closed for modification.
// A class, module, or function should be open for extension but closed for modification.
// A class, module, or function should be open for extension but closed for modification.
// A class, module, or function should be open for extension but closed for modification.
//Open for extension → You should be able to add new behavior without touching existing code.
//Open for extension → You should be able to add new behavior without touching existing code.
//        Closed for modification →
//Existing tested code should not need to be changed whenever requirements change.
//This reduces bugs and makes the system more stable.

//open for extension you should be able to add new behaviour without touching existing code
//open for extension you should be able to add new behaviour wothout touching existing code
//closed for modification you should be able to add new behavior without touching existing code.
//closed for modification yous should be able to add new behavior withour touching existing code.
//violating open closed principle

//Real-world Spring Boot Example
//
//If you use Spring Data JPA, you can add new repositories
//        (e.g., UserRepository, OrderRepository) without modifying framework code.
//
//Strategy pattern or Spring’s @Component + @Autowired often help achieve OCP.
//public class ocp {
//
//}

class paymentProcessor {

    public void process(String paymentType) {
        if (paymentType.equals("creditcard")) {
            //credit card operations
        }
        if (paymentType.equals("paypal")) {
            //paypal operations
        }
    }
}

interface Payment {
    void processPayment();
}

class CreditCard implements Payment {
    @Override
    public void processPayment() {
        //credit card process
    }
}

class PayPal implements Payment {
    @Override
    public void processPayment() {
        //paypal process
    }
}

class PaymentProcessor{

    public void process(Payment payment){
        payment.processPayment();
    }
}
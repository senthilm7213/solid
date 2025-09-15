package org.example.solid;

public class InterfaceSegregationP {

    //I → Interface Segregation Principle (ISP)

    // No client should be forced to depend on methods it does not use.
//  No client should be forced to depend on methods it does not use.
// No client should be forced to depend on methods it does not use.
// No client should be forced to depend on methods it does not use.
// No client should be forced to depend on methods it does not use.
// No client should be forced to depend on methods it does not use.
// No client should be forced to depend on methods it does not use.
//  No client should be forced to depend on methods it does not use.
//  No client should be forced to depend on methods it does not use.
    // No client should be forced to depend on methods it does not use.
//  No client should be forced to depend on methods it does not use

    //Instead of one large fat interface, break it into smaller, specific ones.
//
//Clients should only know about the methods that are relevant to them.
//clients should only know about the methods that are relevant to them.
//clients should only know about the methods that are relevant to them.
//clients should only know about the methods that are relevant to them.
    //clients should only know about the methods that are relevant to them.
//clients should only know about the methods that are relevant to them.
    //clients should only know about the methods that are relevant to them
    //clients should only know about the methods that are relevant to them.
    //clients should only know about the methods that are relevant to them.
    // clients should only know about the methods that are relevant to them.
// }
//violate Interface segregation principle violate Interface
// segregation principle Interface segregation principle
    // Interface segregation principle pattern.
    public interface Worker {
        void work();

        void eat();
    }

    public class Robot implements Worker {
        public void work() {

        }

        public void eat() {
            System.out.println("this is not applicable for this");
        }
    }
}

interface workable {
    void work();
}

interface eatables {
    void eat();
}

class Robot implements workable {
    public void work() {
        System.out.println("work in process");
    }
}
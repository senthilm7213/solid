package org.example.solid;


//L stands for Liskov Substitution Principle (LSP)
// L stands for Liskov Substitution

// L stands for Liskov Substitution
// L stands for Liskov Substitution

// l stands for liskov substitution
// l stands for liskov substitution
// l stands for liskov substitution

// l stands for liskov substitution
// l stands for liskov substitution

// liskov substitution principle

//Objects of a superclass should be replaceable
// with objects of its subclasses without breaking the application.

//Objectss of a superclass should be replaceable
//with objects of its subclasses without breakind the application.
/*What it means

If class B is a subclass of class A, then anywhere you use A, you should be able to use B without unexpected behavior.

Subclasses should honor the contract of the parent class.

In other words: “Don’t surprise the caller when they use a subclass.”*/
//violate LSP
class bird{

   void fly(){
       System.out.println("bird is fying");
    }
}

class ostrich extends bird{

    @Override
    void fly() {
        System.out.println("can't fly");
    }
}

//============

interface birds{
    void fly();
}

interface eatable{
    void eat();

}

class ostrich1 implements eatable{
    @Override
    public void eat() {
        System.out.println("eating");
    }
}

class sparrow implements eatable, birds{
    public void eat(){}
    public void fly(){}
}
public class lsp {
}

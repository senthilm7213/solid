package org.example.solid;

//The class should have only one reason to change it should have only responsibility or a job.
//single responsibility

//The Single Responsibility Principle (SRP) is one of the
// SOLID principles of object-oriented design.
//The Single Responsibility Principle is one of the SOLID principles of object oriented design
//The Single Responsibility Principle is one of the SOLID Priniciples of object oriented design
/*
The single responsibility Priniciple is one of the SOLID Priniciples of object oriented design

 The single responsibility priniciple is one of the SOLID priniciples of object oriented design
A class should have only one reason to change, meaning it should only have one responsibility
        or one job.

A class should have only one reason to change, meaning it should only have one responsibility
        or one job.

A class should have only one reason to change, meaning it should only have one responsibility

or one job.

A class should have only one reason to change, meaning it should only one responsibility or one job.

A class should have only one reason to change, meaning it should only one responsibility or one job.

A class should have only one reason to change, meaning it should only one responsibility or one job.



A class should have only one reason to change, meaning it should only one responsibility or one job.

*/

//violating srp
public class srp {
    private String invoiceNumber;

    public void calculateTotal(){
        //calculate total
    }

    public void saveToDB(){
        //persistence
    }

    public void printInvoice(){

        //printing invoice
    }

    //srp has 3 responsibilities
    //calculateTotal - business logic;
    //save to DB - persistence
    //printing = printInvoice

}

public class Invoice1{
   private String invoiceNumber;
   public void calculateTotal(){}

}
public class InvoiceDB{
    public void saveToDB(){

    }




}

public class InvoicePrinter{

    public void printInvoice(){}
}

/*
In a Spring Boot app:

Controller → handles HTTP requests.

        Service → contains business logic.

        Repository → handles database persistence.

This separation naturally follows SRP.*/

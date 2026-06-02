/*
EASY
Mobile Details System

Create a class Mobile:

Attributes:
brand
price
storage
Tasks:
Use constructor to initialize values
Create 2 mobile objects
Display details using method
Twist:

Price must be private and only shown via method.
  */
package day7_prog;
class MobileDetails {
    String brand;
    int storage;
    private int price;

    MobileDetails(String brand,int price,int storage){
        this.brand=brand;
        this.price=price;
        this.storage=storage;
    }

    void showDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Storage : " + storage + " GB");
    }
}

public class Mobile {

    public static void main(String[] args) {

        MobileDetails m1 =
            new MobileDetails("Samsung",25000,128);

        MobileDetails m2 =
            new MobileDetails("OnePlus",30000,256);

        m1.showDetails();
        m2.showDetails();
    }
}

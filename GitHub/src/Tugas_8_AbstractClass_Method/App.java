package Tugas_8_AbstractClass_Method;

public class App {
    public static void main(String[] args) {
    Owner owner = new Owner("Bintang Fatih");
    Car car = new Car(owner, "BMW E36", 2000, 2600);
    car.displayInformation();
    System.out.println();
    Owner owner2 = new Owner("Lek Ryan");
    Car car2 = new Car(owner2, "Honda Civic", 2019, 1800);
    car2.displayInformation();
    System.out.println();
    Owner owner3 = new Owner("Gin Benjay");
    Car car3 = new Car(owner3, "Ford Mustang", 2022, 2500);
    car3.displayInformation();
    System.out.println();
    Owner owner4 = new Owner("Zuu Ritzu");
    Car car4 = new Car(owner4, "BMW X5", 2020, 2200);
    car4.displayInformation();
    } }

package seminars.second.hw;

import seminars.second.simple_shopping_cart.Product;

import java.util.ArrayList;
import java.util.List;

import static seminars.second.hw.Car.getYearRelease;

public class Main {
    public static void main(String[] args) {
//
        //System.out.println(Car.getCompany()+Car.getModel()+ getYearRelease());
        Car car = new Car("Dodge", "Ram", 2010);
        Motorcycle motorcycle=new Motorcycle("Honda", "CB-1300", 2013);

        System.out.println(car.toString()+" with "+car.getNumWheels()+" wheels,"+" testDrive speed "+ car.testDrive()+" and speed "+car.getSpeed());
        System.out.println(motorcycle.toString()+" with "+motorcycle.getNumWheels()+" wheels,"+" testDrive speed "+ motorcycle.testDrive()+" and speed "+motorcycle.getSpeed());
        

    }



}
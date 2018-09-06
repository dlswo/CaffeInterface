package org.letter;

import java.util.Scanner;

public abstract class AbstractBeverage implements Beverage {

    Scanner scanner;

    AbstractBeverage(){
        scanner = new Scanner(System.in);
    }

    public void print(String msg){
        System.out.println(msg);
    }


}

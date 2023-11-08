package chapter6;

import chapter6.Tax;

public class Sample1 {
    public static void main(String[] args) {
        Tax tax = new Tax(100,"田中宏",300_300, 100_100);
        System.out.println((tax.zeigaku()));
    }
}

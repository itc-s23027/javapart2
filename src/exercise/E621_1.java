package exercise;

import chapter6.Tax;

public class E621_1 {
    public static void main(String[] args) {
        Tax Kimura = new Tax(110,"木村一郎",300000,90000);
        Tax suzuki = new Tax(120,"鈴木浩二",250000,120000);
        Tax saito = new Tax(130,"斎藤渉",400000,180000);

        System.out.println(Kimura.zeigaku());
        System.out.println(suzuki.zeigaku());
        System.out.println(saito.zeigaku());
    }
}

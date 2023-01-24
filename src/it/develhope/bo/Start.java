package it.develhope.bo;

public class Start {
    public static void main(String[] args) {

        System.out.println("----------Starting operations----------");

        System.out.println("!(!(!(false ^ false) || (true && true))): " + (!(!(!(false ^ false) || (true && true)))));

        System.out.println("---------------------------------------");

        int x = 3;
        int y = 2;
        System.out.println("Considering x=3, y=2: !((x * y) <= 6) && (x - y != 1): " + (!((x * y) <= 6) && (x - y != 1)));

        System.out.println("----------------------------------------");

    }
}

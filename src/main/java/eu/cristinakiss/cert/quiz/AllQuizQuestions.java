package eu.cristinakiss.cert.quiz;

import java.util.ArrayList;
import java.util.List;

public class AllQuizQuestions {

    public static void main(String[] args) {
        int bite = 95;
        int ham = 100;
        ham -= ++bite;
        bite = (byte)(Byte.MAX_VALUE + 1);

        System.out.println("ham:"+ham);
        System.out.println("bite:"+bite);

        int kale = 5;
        int turmeric = 50;
        kale *= 4;
        turmeric -=  kale++ + 10;
        turmeric /= (long)10;
//        System.out.println(kale);//21
//        System.out.println(turmeric);//2

        int[] ingrArray = new int[4];
        ingrArray[0] = 10;
        ingrArray[1] = 20;
        ingrArray[2] = 30;
        ingrArray[3] = 40;
//        list(ingrArray);

//        doWhile();
//        collectionsOne();
        strings();
    }

    private static void list(int[] ingredients) {
        for(var i : ingredients) {
            System.out.println(ingredients[i]);
        }
    }

    private static void doWhile() {
//        int pet = 5;
//        int i=0;
//        do {
//            long parrot = 7;
//            System.out.print(pet++ +" ");
//            parrot -= ++pet;
//        } while (parrot <= 10);
    }

    private static void collectionsOne() {
        List<Integer> houseNumbers = new ArrayList<>();
        houseNumbers.add(Integer.valueOf("8891"));
        houseNumbers.add(9001);
        houseNumbers.add(null);
        houseNumbers.add(Integer.parseInt("3579"));
        System.out.println(houseNumbers);
        for (int no: houseNumbers) System.out.println(no);
    }

    private static void strings() {
        StringBuilder alphabet = new StringBuilder("abcdefgh");
        alphabet.delete(3, 9);
        alphabet.insert(1, "*").append("#");
        System.out.println(alphabet);
    }
}

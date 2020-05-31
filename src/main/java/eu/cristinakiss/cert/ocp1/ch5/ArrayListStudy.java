package eu.cristinakiss.cert.ocp1.ch5;

import java.util.ArrayList;

public class ArrayListStudy {

    public static void main(String[] args) {
        ArrayList list = new ArrayList(5);
        list.add(1);
        list.add("apple");
        for (Object o : list) System.out.println(o);

        System.out.println("CONVERSIONS");
//        Object[] objArray1 = list.toArray();
//        for (int i = 0; i < objArray1.length; i++) {
//            System.out.println(objArray1[i]);
//        }
//        System.out.println("objArray2");
//        Object[] objArray2 = list.toArray(new Object[5]);
//        for (int i = 0; i < objArray2.length; i++) {
//            System.out.println(objArray2[i]);
//        }
        System.out.println("objArray3");
        Object[] objArray3 = list.toArray(new Object[1]);
        for (int i = 0; i < objArray3.length; i++) {
            System.out.println(objArray3[i]);
        }
//        objArray3 = new Object[40];
        objArray3[0]="zero";
        for (int i = 0; i < objArray3.length; i++) {
            System.out.println(objArray3[i]);
        }
    }
}

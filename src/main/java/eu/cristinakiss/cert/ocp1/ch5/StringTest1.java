package eu.cristinakiss.cert.ocp1.ch5;

public class StringTest1 {

    public static void main(String[] args) {
        String s1 = "unu";
        System.out.println(s1);
        String s2 = s1.concat("");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);

        System.out.println("t...");
        String t1 = "abc";
        String t2 = new String("abc");
        System.out.println(t1 == t2);

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.println(sb);
        sb.append("world");
        System.out.println(sb);

        String sub = sb.substring(2,4);
        System.out.println(sub);

        int[] a [] = new int[500][];
//        int[] aa [] = new int[][];//Error:(29, 34) java: array dimension missing
    }
}

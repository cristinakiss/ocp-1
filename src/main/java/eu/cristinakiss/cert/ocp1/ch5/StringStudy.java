package eu.cristinakiss.cert.ocp1.ch5;

public class StringStudy {

    public static void main(String[] args) {
        String s1 = "1" + 2 + 3;
        System.out.println(s1);

        String s2 = 1 + 2 + "3";
        System.out.println(s2);

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

//        String x = "Hello World";
//        String y = "Hello World";
//        System.out.println(x == y);

        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z);

    }
}

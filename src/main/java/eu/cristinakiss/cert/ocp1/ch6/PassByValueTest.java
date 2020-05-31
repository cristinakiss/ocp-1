package eu.cristinakiss.cert.ocp1.ch6;

public class PassByValueTest {

    public static void test(int a) {
        System.out.println(a);
        a = 5;
        System.out.println(a);
    }

    public static void test2(String a) {
        System.out.println(a);
        a = "world";
        System.out.println(a);
    }

    public static void test3(String a) {
        System.out.println(a);
        a += "world";
        System.out.println(a);
    }

    public static void test4(StringBuilder a) {
        System.out.println(a);
        a.append("world");
        System.out.println(a);
    }

    public static void main(String[] args) {
//        int num = 3;
//        test(num);
//        System.out.println("num:"+num);

//        String name = "hello";
//        test3(name);
//        System.out.println(name);

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        test4(sb);
        System.out.println(sb);
    }
}

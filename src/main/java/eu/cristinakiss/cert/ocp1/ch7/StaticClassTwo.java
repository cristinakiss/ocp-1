package eu.cristinakiss.cert.ocp1.ch7;

public class StaticClassTwo {

    {
        System.out.println("No, THIS is the beginning!");
    }

    static {
        System.out.println("this is the beginning");
    }

    {
        value = 2;
    }

    static int value = 5;

    {
        System.out.println("value in:"+value);
    }

    static {
        System.out.println("value st:"+value);
    }

    public static void main(String[] args) {
        StaticClassTwo ref= new StaticClassTwo();
        System.out.println("==>"+ref.value);
    }

    static {
//        System.out.println(hello);//Error:(16, 28) java: illegal forward reference
        System.out.println("middle");
    }

    static int hello = 3;

    static {
        System.out.println(hello);
    }
}

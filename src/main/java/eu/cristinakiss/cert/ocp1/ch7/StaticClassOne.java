package eu.cristinakiss.cert.ocp1.ch7;

class StaticParent {
    static {
        System.out.println("parent");
    }
}

public class StaticClassOne extends StaticParent {

    static {
        System.out.println("world");
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}

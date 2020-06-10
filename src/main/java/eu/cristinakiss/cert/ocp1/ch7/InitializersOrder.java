package eu.cristinakiss.cert.ocp1.ch7;

class InitParent {

    static {
        System.out.println("parent static");
    }

    {
        System.out.println("parent init");
    }

    InitParent() {
        System.out.println("parent constr");
    }
}

public class InitializersOrder extends InitParent {

    InitializersOrder(){
        System.out.println("child constr");
    }

    static {
        System.out.println("child static");
    }

    {
        System.out.println("child init");
    }


    public static void main(String[] args) {
        new InitializersOrder();
    }
}

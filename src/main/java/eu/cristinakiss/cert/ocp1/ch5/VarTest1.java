package eu.cristinakiss.cert.ocp1.ch5;

public class VarTest1 {

    {
        var f = 12;
        System.out.println(f);
    }


    public static void main(String[] args) {
        int a = 8;
        var b = 5;
        System.out.println(b);

        new VarTest1();

        var exc = new ArrayIndexOutOfBoundsException();

        var v = 5;
//        var w;// Error:(21, 13) java: cannot infer type for local variable w
////        (cannot use 'var' on variable without initializer)
//        w = 6;

        var we = 2147483648L;
        System.out.println(we);
    }
}

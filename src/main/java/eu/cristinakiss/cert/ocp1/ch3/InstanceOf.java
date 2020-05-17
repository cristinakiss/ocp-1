package eu.cristinakiss.cert.ocp1.ch3;

public class InstanceOf {

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o instanceof String);
    }

    public static void time(Number number) {
//        System.out.println(number instanceof String);//Error:(11, 28) java: incompatible types: java.lang.Number cannot be converted to java.lang.String
    }
}

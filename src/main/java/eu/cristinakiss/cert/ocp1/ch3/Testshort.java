package eu.cristinakiss.cert.ocp1.ch3;

public class Testshort {

    public static void main(String[] args) {
        int i = 6;
        short s = 6;


        float f = 4.5f;
        s = (short)f;
        System.out.println(s);
//        short s2 = (long)f;
//        short s3 = 123333L;
//        short s4 = (short)(long)f;
//        short s4 = f;

        float f2 = 1;

        byte c = (int)(long)45;
//        byte c2 = (int)(long)450;//Error:(21, 19) java: incompatible types: possible lossy conversion from int to byte
        byte c3 = (int)(long)127;
//        byte c4 = (int)(long)128;//Error:(21, 19) java: incompatible types: possible lossy conversion from int to byte

//        byte b=128;
        int n = Integer.MAX_VALUE +2;
        System.out.println(n);
        double d = Double.MAX_VALUE+1;
        System.out.println(d);
    }
}

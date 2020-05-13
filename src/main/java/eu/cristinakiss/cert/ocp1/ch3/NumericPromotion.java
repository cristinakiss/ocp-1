package eu.cristinakiss.cert.ocp1.ch3;

public class NumericPromotion {

    public static void main(String[] args) {
        short sh = 29;
        System.out.println(sh);

        byte b = 1;
        System.out.println(b);
        byte b2 = (int) 2;
        System.out.println(b2);
//        byte b3 = Integer.MAX_VALUE;//Error:(10, 26) java: incompatible types: possible lossy conversion from int to byte
//        System.out.println(b3);

        double d = 2;// defaults to INT
        double d2 = (int)2;
        double d3 = (double)2;
        System.out.println(d+" "+d2+" "+d3);
        double dd = 2.0;// defaults to DOUBLE
        double dd2 = 2.0d;
        double dd3 = 2.0f;
        System.out.println(dd+" "+dd2+" "+dd3);

        float f = 3;
        float f2 = (int) 3;
        float f3 = 3f;
        System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);
//        float f4 = 4.2;//Error:(28, 20) java: incompatible types: possible lossy conversion from double to float
//        System.out.println(f4);

        short s1 = 3;
        short s2 = 4;
        var sr = s1 * s2;
        System.out.println(sr);
//        short sr2 = s1 * s2;//Error:(35, 24) java: incompatible types: possible lossy conversion from int to short

//        float egg = 2.0 / 9;        // DOES NOT COMPILE
        //Error:(37, 25) java: incompatible types: possible lossy conversion from double to float
//        int tadpole = (int)5 * 2L;  // DOES NOT COMPILE
        //Error:(38, 30) java: incompatible types: possible lossy conversion from long to int
//        short frog = 3 - 2.0;       // DOES NOT COMPILE
        //  Error:(39, 24) java: incompatible types: possible lossy conversion from double to short

//        int fish = 1.0;        // DOES NOT COMPILE
        //Error:(44, 20) java: incompatible types: possible lossy conversion from double to int
//        short bird = 1921222;  // DOES NOT COMPILE
        //Error:(46, 22) java: incompatible types: possible lossy conversion from int to short
//        int mammal = 9f;       // DOES NOT COMPILE
        //Error:(51, 22) java: incompatible types: possible lossy conversion from float to int
//        long reptile = 192301398193810323;  // DOES NOT COMPILE
        //Error:(53, 24) java: integer number too large
        long reptile2 = 192301398193810323L; // merge!
    }
}

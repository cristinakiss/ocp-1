package eu.cristinakiss.cert.ocp1.ch2;

public class VarLearn {

    int n = 5;

    {
        n = 7;
    }

    {
        n = 9;
    }

    public VarLearn() {
        n = 8;
    }

    public static void main(String[] args) {
        VarLearn l = new VarLearn();
        System.out.println(l.n);
    }

    public void justAMeth1() {

    }

    public void $justAMeth1() {

    }

    public void _justAMeth1() {

    }

//    public void 1justAMeth1() {
//
//    }

    public void justAMeth2() {
        int y = 10;
        int x;
//        int z = x + y; // Error:(43, 17) java: variable x might not have been initialized
    }

    public void m() {
//        int public = 9;
        var a = 0; // works!
        int var = 2;// also works!
    }

    public void applesMethod() {
        var apples = (short)10;//this makes it a short, numerical type of 16 bits signed
        apples = (byte)5;//this is OK, because we place a byte, numerical type of 8 bits signed into a short,
        // numerical type of 16 bits, so it fits! short takes -2^(n-1), 2^(n-1)-1 where n = 16 => -2^15,2^15-1
        // short: [-32,768, 32,767‬‬]
//        apples = 1_000_000;//Error:(56, 18) java: incompatible types: possible lossy conversion from int to short
        // compilation error because 1000000 > 32767 !
    }

//    public void thisDoesNOTCompile() {
//        var n;// Error:(62, 13) java: cannot infer type for local variable n
////        (cannot use 'var' on variable without initializer)
//        n=9;
//        System.out.println(n);
//    }
}

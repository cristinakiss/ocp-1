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
}

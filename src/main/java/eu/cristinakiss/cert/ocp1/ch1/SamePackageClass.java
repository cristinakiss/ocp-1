package eu.cristinakiss.cert.ocp1.ch1;

public class SamePackageClass {

    public static void main(String[] args) {
        Comments c = new Comments();//can use class from same package WITHOUT IMPORT!
        System.out.println(c);
    }
}

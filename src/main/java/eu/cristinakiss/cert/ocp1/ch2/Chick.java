package eu.cristinakiss.cert.ocp1.ch2;

public class Chick {

    public Chick() {
        System.out.println("in the constructor");
    }

    public static void main(String[] args) {
        Chick newChick = new Chick();
        System.out.println(newChick);
    }
}

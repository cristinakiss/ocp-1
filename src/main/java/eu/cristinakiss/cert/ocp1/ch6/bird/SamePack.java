package eu.cristinakiss.cert.ocp1.ch6.bird;

public class SamePack {

    public void accessIt() {
        Bird bird = new Bird();
        System.out.println(bird.text);
    }

    public static void main(String[] args) {
        SamePack samePack = new SamePack();
        samePack.accessIt();
    }
}

package eu.cristinakiss.cert.ocp1.ch6.swan;

import eu.cristinakiss.cert.ocp1.ch6.bird.Bird;

public class Swan extends Bird {

    public void accessIt() {
        Bird bird = new Bird();
//        System.out.println(bird.text);
        //Error:(9, 32) java: text has protected access in eu.cristinakiss.cert.ocp1.ch6.bird.Bird
        Swan swan = new Swan();
        System.out.println(swan.text);
    }

    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.accessIt();
    }
}

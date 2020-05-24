package eu.cristinakiss.cert.quiz;

public class Dog {

    private Dog doggy;

    public void bark(Dog d) {
        System.out.println("woof");
        doggy = d;
    }

    public static void main(String[] args) {
        Dog fido = new Dog();
        Dog shiba= new Dog();
        fido.bark(shiba);
//        System.out.println(fido);
    }
}

package eu.cristinakiss.cert.practice.mock.b;

import eu.cristinakiss.cert.practice.mock.a.Parent;

public class Child extends Parent {

    public void hello() {
        System.out.println("hello");
        c();
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
//        parent.c();//Error:(9, 15) java: c() has protected access in eu.cristinakiss.cert.practice.mock.a.Parent

        Parent parent2 = new Child();
//        parent2.c();//Error:(17, 16) java: c() has protected access in eu.cristinakiss.cert.practice.mock.a.Parent

        Child child = new Child();
        child.c();
    }
}

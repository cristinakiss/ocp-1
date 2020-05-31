package eu.cristinakiss.cert.ocp1.ch5;

public class ArrayTest1 {

    public static void main(String[] args) {
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder();   // DOES NOT COMPILE
        // Error:(9, 27) java: incompatible types: java.lang.StringBuilder cannot be converted to java.lang.String
        System.out.println(objects[0]);
//        objects[0] = new StringBuilder();
        objects[0] = new String();
        System.out.println(objects[0]);
        // Exception in thread "main" java.lang.ArrayStoreException: java.lang.StringBuilder
    }
}

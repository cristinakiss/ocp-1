package eu.cristinakiss.cert.ocp1.ch4;

public class ForLoops {

    public static void main(String[] args) {
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
//            System.out.println("x < 5 && y < 10 = "+(x < 5 && y < 10)+ ": x= "+x+ " y= " +y + " ");
            System.out.print(y+ " ");
        }
        System.out.print(x + " ");
    }
}

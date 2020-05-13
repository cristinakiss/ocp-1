package eu.cristinakiss.cert.ocp1.ch3;

public class NumericPromotion2 {

    public static void main(String[] args) {
        short s = 12;
        System.out.println(s);

//        short sbig = 32769;// literal interpreted as int
        // compiler knows the table and sees that 32767 does NOT fit into an int
        // Error:(9, 22) java: incompatible types: possible lossy conversion from int to short

        short s1 = 3;
        short s2 = 4;
//        short ss = s1 * s2;//numeric promotion rule: both operands auto-promoted to int!
        // cannot put int into short!
        // compiler complains: it does not compute!!
        //Error:(11, 23) java: incompatible types: possible lossy conversion from int to short

        short mouse = 10;
        short hamster = 3;
//        short capybara = mouse * hamster;//Error:(22, 32) java: incompatible types: possible lossy conversion from int to short
        short capybara = (short) (mouse * hamster);//Error solved!
    }
}

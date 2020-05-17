package eu.cristinakiss.cert.ocp1.ch4;

public class NestedForLoops {

    public static void main(String[] args) {
        int[][] marray = { {1, 2} , {3,4}, {5,6,7} };
        for (int[] m: marray) {
            System.out.print("length:"+m.length+" ");
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i]+" - ");
            }
            System.out.println();
        }
    }
}

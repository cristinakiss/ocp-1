package eu.cristinakiss.cert.practice.oca;

public class Sudoku {

    static int[][] game = new int[6][];
    static int[] hello = new int[4];

    public static void main(String[] args) {
//        game[3][3] = 6;
        Object[] obj = game;
//        obj[3] = "X";
        System.out.println(obj.length);
        obj[3] = hello;
        System.out.println(game[3][3]);
    }
}

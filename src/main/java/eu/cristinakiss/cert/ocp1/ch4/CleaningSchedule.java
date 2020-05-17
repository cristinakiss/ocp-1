package eu.cristinakiss.cert.ocp1.ch4;

public class CleaningSchedule {

    public static void main(String[] args) {
        CLEANING:
        for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    continue CLEANING;
                }
                System.out.println("Cleaning: " + stables + "," + leopard);
            }
        }

        System.out.println("var2");
//        CLEANING:
        for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    continue /*CLEANING*/;
                }
                System.out.println("Cleaning: " + stables + "," + leopard);
            }
        }
    }

}

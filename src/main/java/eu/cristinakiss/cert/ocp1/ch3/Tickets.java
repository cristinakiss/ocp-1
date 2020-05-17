package eu.cristinakiss.cert.ocp1.ch3;

public class Tickets {

    public static void main(String[] args) {
        int ticketsTaken = 1;
        int ticketsSold = 3;

//        ticketsSold += 1 + ++ticketsTaken;

//        ticketsSold += 1 + ticketsTaken++;
        ticketsSold = ticketsSold + (1 + ticketsTaken++);
        int a = ticketsSold + (1 + ticketsTaken++);
        // 3 + (1 + 1) = 3 + 2 = 5
        //ticketsTaken=2
        System.out.println(ticketsSold+" =5");
        System.out.println(ticketsTaken+" =2");

//        ticketsTaken *= 2;
//        ticketsSold += (long)1;
    }
}

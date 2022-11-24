import java.util.*;

class tshr implements Runnable {

    static int ticket = 1000;
    int sticket;
    Thread t;

    tshr(String name) {
        sticket = 0;
        t = new Thread(this, name);
        t.start();
    }

    private static int saleticket() {
        Random rd = new Random();
        int n = (rd.nextInt(3)) + 1;
        return n;
    }

    public void run() {
        while (grabGold()) {
            sticket += saleticket();
        }
        System.out.println(t.getName() + "賣掉" + sticket + "張票");
    }

    private synchronized static boolean grabGold() {
        if (ticket > 0) {

            ticket -= saleticket();
            return true;
        } else {
            return false;
        }
    }
}

public class w3hw {
    public static void main(String[] args) {
        tshr tA = new tshr("賣票機A");
        tshr tB = new tshr("賣票機B");
        tshr tC = new tshr("賣票機C");
        tshr tD = new tshr("賣票機D");

    }
}

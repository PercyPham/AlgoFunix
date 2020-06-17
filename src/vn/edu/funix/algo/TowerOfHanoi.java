package vn.edu.funix.algo;

public class TowerOfHanoi {
    public static void move(int numOfDiscs, String from, String to, String inter) {
        if (numOfDiscs == 1) {
            System.out.println("Move disc 1 from " + from + " to " + to);
            return;
        }

        move(numOfDiscs - 1, from, inter, to);
        System.out.println("Move disc " + numOfDiscs + " from " + from + " to " + to);
        move(numOfDiscs - 1, inter, to, from);
    }
}

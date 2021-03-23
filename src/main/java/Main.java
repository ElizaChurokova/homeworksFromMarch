import java.sql.SQLOutput;

public class Main {
    public static int value=2;

    public static void main(String[] args) {
        System.out.println("Start value = " + value);
        PlusThread plusThread = new PlusThread();
        plusThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        Thread multThread = new Thread(new MultThread());
        multThread.start();


        SubstractThread substractThread = new SubstractThread();
        substractThread.start();

        Thread divisionThread = new Thread(new DivisionThread());
        divisionThread.start();

        System.out.println("End value = " + value);
    }
}

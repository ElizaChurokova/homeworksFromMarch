public class DivisionThread implements Runnable{
    @Override
    public void run() {
        Main.value /= 2;
    }
}

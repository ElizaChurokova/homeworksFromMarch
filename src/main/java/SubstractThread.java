public class SubstractThread extends Thread{
    @Override
    public void run() {
        Main.value -= 2;
    }
}

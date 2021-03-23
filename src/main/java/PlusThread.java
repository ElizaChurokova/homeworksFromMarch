public class PlusThread extends Thread{
    @Override
    public void run() {
        Main.value += 2;
    }
}

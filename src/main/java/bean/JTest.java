package bean;

/**
 * Created by @ssysong.ssy  2016-07-06 11:22
 */
public class JTest {
    public void fun() {

    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                while (1 == 1) {
                }
            }
        }).start();
    }
}

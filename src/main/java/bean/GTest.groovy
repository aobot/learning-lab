package bean

import java.util.concurrent.TimeUnit

/**
 * Created by @ssysong.ssy  2016-07-06 12:01
 */
class GTest {
    public static void main(String[] args) {
        new GTest().fun()
        TimeUnit.MINUTES.sleep(111)
    }

    void fun() {
        def t = new Thread(new Runnable() {
            @Override
            void run() {
                def i = 1
                while (true) {
                    i++
                    if (i % 100000 == 1) {
                        println i
                    }
                }
                println i
            }
        })
        t.start()

        t.interrupt()
        TimeUnit.SECONDS.sleep(1)
        println t.isInterrupted()
    }
}

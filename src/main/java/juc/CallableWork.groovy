package juc

import java.util.concurrent.ArrayBlockingQueue

/**
 * Created by @ssysong.ssy  2016-06-21 06:12
 */
class CallableWork {
    def queue = new ArrayBlockingQueue<Integer>()

    class Producer implements Runnable {

        @Override
        void run() {
            queue.put()
        }
    }

    class Consumer implements Runnable {

        @Override
        void run() {
            queue.take()
        }
    }
}

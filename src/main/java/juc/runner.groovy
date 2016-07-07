package juc

import java.util.concurrent.ExecutorCompletionService
import java.util.concurrent.Executors
import java.util.concurrent.Semaphore

/**
 * Created by @ssysong.ssy  2016-06-21 06:13
 */

def executor = new ExecutorCompletionService(Executors.newCachedThreadPool())
def a = new Semaphore(3)

(1..5).each {
    executor.submit(new CallableWork())
}


executor.shutdown()

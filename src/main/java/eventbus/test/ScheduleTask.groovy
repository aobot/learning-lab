package eventbus.test

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

/**
 * Created by aobot on 2016-08-05 16:16.
 */
@Component('scheduleTask')
class ScheduleTask {
    def c = 0

    @Scheduled(cron = '*/2 * * * * ?')
    public void work() {
        println c
        if (c++ % 3 == 2) {
            println 'exception'
            throw new IllegalStateException()
        }
        println new Date()
    }
}

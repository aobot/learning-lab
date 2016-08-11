package gson.test

import gson.test.dao.FlyLivingsDao
import org.springframework.stereotype.Service

import javax.annotation.Resource

/**
 * Created by aobot on 2016-08-11 14:41.
 */
@Service('flyLivingsService')
class FlyLivingsService {
    @Delegate
    @Resource
    FlyLivingsDao flyLivingsDao

}

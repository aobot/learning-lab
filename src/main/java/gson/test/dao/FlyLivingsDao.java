package gson.test.dao;

import gson.test.model.FlyLivings;

import java.util.List;

/**
 * Created by aobot on 2016-08-11 14:24.
 */
public interface FlyLivingsDao {
    void add(FlyLivings livings);
    List<FlyLivings> getAll();
}

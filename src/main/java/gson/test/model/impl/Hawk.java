package gson.test.model.impl;

/**
 * Created by aobot on 2016-08-11 10:20.
 */
public class Hawk {
    private Integer speed  ;

    public Hawk(Integer speed) {
        this.speed = speed;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Hawk{" +
                "speed=" + speed +
                '}';
    }
}

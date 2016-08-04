package eventbus.test.event;

import java.util.Date;

/**
 * Created by aobot on 2016-08-04 19:30.
 */
public class AdOnlineEvent {
    private String message ;
    private Date when ;

    public AdOnlineEvent() {
    }

    public AdOnlineEvent(String message, Date when) {
        this.message = message;
        this.when = when;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "AdOnlineEvent{" +
                "message='" + message + '\'' +
                ", when='" + when + '\'' +
                '}';
    }
}

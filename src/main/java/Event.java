import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by Dzenyaa on 17.09.2017.
 */
public class Event {
    int id=new Random().nextInt();
    DateFormat df;
    public Event(Date date, DateFormat df) {
        this.date=date;
        this.df=df;
    }


    @Override
    public String toString() {
        return "event{" +
                "id=" + id +
                ", сообщение='" + msg + '\'' +
                ", дата=" + df.format(date) +
                '}';
    }

    String msg;
    Date date;


    public void setMsg(String msg) {
        this.msg = msg;
    }

}

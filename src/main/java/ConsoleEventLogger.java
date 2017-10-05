/**
 * Created by Dzenyaa on 17.09.2017.
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event)
    {
        System.out.println(event.toString());
    }
}

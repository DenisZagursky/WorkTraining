import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dzenyaa on 17.09.2017.
 */
public class App {
    Client client;
    EventLogger eventLogger;

    public App(Client client, EventLogger obj) {
        this.client = client;
        eventLogger= obj;

    }

    public App() {
    }

    void logEvent(Event event)
    {
        //String message=msg.replaceAll(client.getId(),client.getName());
        eventLogger.logEvent(event);

    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        App app= (App) ctx.getBean("app");
        for (int i=0;i<20;i++)
        {Event event=(Event) ctx.getBean("event");
        app.logEvent(event);
        }
        ctx.close();


    }
}

/**
 * Created by Dzenyaa on 17.09.2017.
 */
public class Client {
    String id;
    String name;

    public Client(String s, String jhon) {
        id=s;
        name=jhon;
    }

    public Client() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

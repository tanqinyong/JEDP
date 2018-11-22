import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.*;
// import car class

@ManagedBean(name="userCreation")
@ApplicationScoped
public class userCreation {

    public List<User> createUsers(int size) {
        List<User> list = new ArrayList<User>();
        for(int i = 0;i < size;i++) {
            list.add(new User(getRandomId(),getRandomYear(), getRandomPrice(), getRandomSoldState()));
        }
        System.out.print(list);

        System.out.print("Hello");
        return list;
    }
    public String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    public int getRandomYear() {
        System.out.println("me");
        return (int) (Math.random() * 50 + 1960);
    }


    public int getRandomPrice() {
        return (int) (Math.random() * 100000);
    }

    public boolean getRandomSoldState() {
        return (Math.random() > 0.5) ? true: false;
    }



}

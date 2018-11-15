
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean
public class User implements Serializable {

    public String id;
    public int year;
    public int price;
    public boolean soldState;

    public User() { }

    public User(String id,int year,int price,boolean soldState) {
        System.out.println("WTF");
        this.id=id;
        this.year=year;
        this.price=price;
        this.soldState=soldState;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public boolean isSoldState() {
        return soldState;
    }

    public void setSoldState(boolean soldState) {
        this.soldState = soldState;
    }
}

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
// import car class? & usercreation?

@ManagedBean
@ViewScoped

public class DataGridView implements Serializable {

    private List<User> users;

    private User selectedUser;

    @ManagedProperty("#{userCreation}")
    private userCreation creation;

    @PostConstruct
    public void init() {
        users = creation.createUsers(48);
        System.out.println("LOL");
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(userCreation creation) {
        this.creation = creation;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public userCreation getCreation() {
        return creation;
    }

    public void setCreation(userCreation creation) {
        this.creation = creation;
    }


}

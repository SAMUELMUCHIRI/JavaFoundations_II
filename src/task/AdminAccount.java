package task;
import task.UserAccount;

public class AdminAccount extends UserAccount{
    private int accessLevel ;

    public AdminAccount(String userName , String email, int accessLevel)
    {
        super(userName , email);
        this.accessLevel = accessLevel ;

    }
    public String toString()
    {
        return super.toString() + "\n\tAccessLevel : "+ this.accessLevel;
    }

    public void resetUserPassword(String targetUsername) {
        System.out.println(this.getUserName() + " has reset the password for "+ targetUsername);
    }

}

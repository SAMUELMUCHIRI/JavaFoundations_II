package task;


public class AdminAccount extends UserAccount{
    private int accessLevel ;

    public AdminAccount(String userName , String email, int accessLevel) throws Exception
    {
        super(userName , email);
        if(accessLevel < 0)
        {
            throw new Exception("Invalid Access Level");
        }
        else
        {
            this.accessLevel = accessLevel ;
        }


    }
    public String toString()
    {
        return super.toString() + "\n\tAccessLevel : "+ this.accessLevel;
    }

    public void resetUserPassword(String targetUsername) {
        System.out.println(this.getUserName() + " has reset the password for "+ targetUsername);
    }

}

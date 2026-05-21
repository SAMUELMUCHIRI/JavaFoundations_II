package task;

public class UserAccount  {

    private String userName ;
    private String email ;
    private int loginCount ;
    private static int totalAccounts;

    public UserAccount(String userName , String email)
    {
        this.userName =userName;
        this.email = email;
        totalAccounts++;
    }

    public UserAccount()
    {
        this.userName = "guest";
        this.email = "guest@tana.com";
    }

    public String getUserName()
    {
        return this.userName;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setUserName(String userName)
    {
        this.userName = userName ;

    }
    public void setEmail(String email) throws Exception
    {
        if (email.contains("@"))
        {
            this.email = email ;
        }
        else
        {
            throw new Exception("Enter a valid email !");
        }
    }
    public void logIn()
    {
        this.loginCount++;
        System.out.println(this.userName +" has logged in. Total logins: "+ this.loginCount);
    }

    public static int getAccountCount()
    {
        return totalAccounts;
    }

    public String toString()
    {
        return "\t\t Account Summary \n\tUserName \t: "+this.userName+"\n\tEmail \t: "+this.email+"\n\tloginCount \t: "+ this.loginCount;
    }
}

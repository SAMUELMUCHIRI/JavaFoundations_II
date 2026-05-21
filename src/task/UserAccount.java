package task;


public class UserAccount  {

    private String userName ;
    private String email ;
    private int loginCount ;
    private static int totalAccounts ;

    public UserAccount(String userName , String email)
    {
        // centralize validation in setters so constructors and setters behave the same
        setUserName(userName);
        try {
            setEmail(email);
        } catch (Exception e) {
            // wrap checked validation exception in unchecked so construction fails clearly
            throw new IllegalArgumentException(e.getMessage(), e);
        }
        totalAccounts++;
    }

    public UserAccount()
    {
        // use setters for consistency
        setUserName("guest");
        try {
            setEmail("guest@tana.com");
        } catch (Exception e) {
            // should not happen for the hard-coded valid email
            throw new IllegalStateException(e);
        }
        totalAccounts++;
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
        if (userName == null || userName.trim().isEmpty()) {
            throw new IllegalArgumentException("userName must not be null or blank");
        }
        this.userName = userName ;

    }
    public void setEmail(String email) throws Exception
    {
        if (email == null) {
            throw new Exception("Enter a valid email !");
        }
        String trimmed = email.trim();
        // simple but stronger validation than contains("@")
        if (!trimmed.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            throw new Exception("Enter a valid email !");
        }
        this.email = trimmed ;
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
    @Override
    public String toString()
    {
        return "\t\t Account Summary \n\tUserName \t: "+this.userName+"\n\tEmail \t\t: "+this.email+"\n\tloginCount \t: "+ this.loginCount;
    }
}

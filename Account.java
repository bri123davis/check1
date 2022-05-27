public class Account {
    private int accountnumber;
    private String Fullname;
    private String accounttype;
    private String accountbalance;
    private String accountinterest;


    public Account(int accountnumber, String Fullname, String accounttype, String accountbalance, String accountinterest) {
        this.accountnumber = accountnumber;
        this.Fullname = Fullname;
        this.accounttype = accounttype;
        this.accountbalance = accountbalance;
        this.accountinterest = accountinterest;
    }

    public int getaccountnumber() {
        return accountnumber;
    }

    public String fullname() {
        return Fullname;
    }

    public String getaccounttype() {
        return accounttype;
    }
    public String getaccountbalance() {
        return accountbalance;
    }
    public String getaccountinterest() {
        return accountinterest;
    }

    public String toString() {
        return accountnumber +"\t"+ Fullname+"\t"+accounttype+"\t"+accountbalance+"\t"+accountinterest;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account(111, "Nkusi Manzyy", "Saving", "40000","0.99"));
        accountList.add(new Account(122, "Safari Rexyy", "debit", "20000","0.29"));
        accountList.add(new Account(133, "Muhoza Divine", "Check", "50000","0.46"));
        accountList.add(new Account(144, "Desire Sentor", "Credit", "60000","0.23"));
        accountList.add(new Account(155, "Boris Rukundo", "Check", "70000","0.87"));
        accountList.add(new Account(166, "Sauda Iragena", "Saving", "80000","0.78"));
        accountList.add(new Account(177, "Mugisha gaby", "Check", "90000","0.56"));
        accountList.add(new Account(188, "Hassan Bright", "Saving", "30000","0.45"));
        accountList.add(new Account(199, "Samuel emman", "Saving", "40000","0.34"));
        accountList.add(new Account(200, "Prime Ngarambe", "Debit", "60000","0.97"));



        for (Account account:accountList){
            System.out.println(account);
        }
    }
}

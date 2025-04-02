public class AccountBank {
    int numberAccount;
    double balance;
    String ownerName;

    public AccountBank(int NumberAccount,double Balance, String ownerName){
        this.numberAccount = NumberAccount;
        this.balance = Balance;
        this.ownerName = ownerName;
    }

    public void deposit(double money) {
        System.out.println(ownerName + " is depositing " + money + "$");
    }

    public void  withdraw(double money) {
        System.out.println(ownerName + " is withdrawing " + money + "$" );
    }
}

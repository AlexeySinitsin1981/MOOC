package week4;

public class Accounts721 {
    public static void main(String[] args) {
        Account alex = new Account("Petr", 100);
        alex.deposit(20);
        System.out.println(alex);
    }
}

 class Account {
    private String name;
    private double balance;

    public void deposit(double amount){
        balance=balance+amount;
    }


    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

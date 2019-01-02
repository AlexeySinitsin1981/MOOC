package week4;

public class YourFirstMoneyTransfer722 {
    public static void main(String[] args) {
        Account firstClient = new Account("Matt's account", 1000);
        Account secondClient = new Account("My account", 0);
        System.out.println(firstClient);
        System.out.println(secondClient);
        firstClient.withdraw(100);
        secondClient.deposit(100);
        System.out.println("--------------------------------------");
        System.out.println(firstClient);
        System.out.println(secondClient);



    }

    public static class Account{
        private String name;
        private double balance;

        void deposit(double amount){

            balance=balance+amount;
        }

        void withdraw(double amount){

            balance=balance-amount;
        }

        double balance(){
            return balance;
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
}


package week4;

public class MoneyTransfers723 {
    public static void main(String[] args) {
        Account a = new Account("Petr", 100.0);
        Account b = new Account("Ivan", 0.0);
        Account c = new Account("Iren", 0.0);
        Account.transfer(a, b, 50);
        Account.transfer(b, c, 25);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }

    public static class Account {
        private String name;
        private double balance;

        public void deposit(double amount) {

            balance = balance + amount;
        }

        public void withdraw(double amount) {

            balance = balance - amount;
        }

        public double balance() {

            return balance;
        }


        public static void transfer(Account from, Account to, double howMuch) {
            from.withdraw(howMuch);
            to.deposit(howMuch);
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

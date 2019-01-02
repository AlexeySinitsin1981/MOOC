package week4;

public class Accounts72{
    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);
    }
    public static class Account{
        String name;
        double balance;

        public void withdrawal(double sum){

            balance=balance-sum;
        }

        public void deposit(double sum){

            balance=balance+sum;
        }
        public double balance(){

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

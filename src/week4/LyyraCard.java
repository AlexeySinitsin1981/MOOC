package week4;

public class LyyraCard {
    private double balance;


    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }
    public void payEconomical() {
        if(this.balance>=2.50){
            this.balance = this.balance - 2.50;
        }
    }

    public void payGourmet() {
        if(this.balance>=4){
            this.balance = this.balance - 4.00;
        }
    }

    public void loadMoney(double amount) {
        if(this.balance<=150 && amount>0){
        this.balance = this.balance + amount;
            if(this.balance>=150){
                this.balance = 150.0;
            }
        }
    }


    public String toString() {
        return "The card has " + this.balance +" euros";
    }


}


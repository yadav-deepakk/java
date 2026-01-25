package oops;

class Account {
  private double balance = 0.00;

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    if (balance >= 0) {
      this.balance = balance;
    }
  }
}

public class Encapsulation {

  public static void main(String[] args) {

    Account account = new Account();
    account.setBalance(5000.00);
    double accountBalance = account.getBalance();
    System.out.println("Balance: " + accountBalance);

  }

}

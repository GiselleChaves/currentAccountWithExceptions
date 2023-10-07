public class currentAccount {
  private double balance;
 
  public currentAccount(double openingBalance){
    balance = openingBalance;
  }

  public void deposito(double value){
    balance += value;    
  }

  public void retirada(double value){
    balance -= value;
  }
    
  public double getBalance(){ 
    return(balance); 
  }
}
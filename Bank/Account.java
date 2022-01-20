public abstract class Account implements AccountInterface{
    private int agency;
    private int countCode;
    private double balance;

    @Override
    public void withdraw(double value) {
        
        
    }

    @Override
    public void deposit(double value) {
        
        
    }

    @Override
    public void transfer(double value, Account destinyAccount) {
        
        
    }

    public int getAgency(){
        return agency;
    }

    public int getCountCode(){
        return countCode;
    }

    public double getBalance(){
        return balance;
    }


}

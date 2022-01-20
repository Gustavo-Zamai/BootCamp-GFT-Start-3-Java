public abstract class Account implements AccountInterface{
    private static int STANDARD_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int countCode;
    protected double balance;

    public Account(){
        this.agency = STANDARD_AGENCY;
        this.countCode = SEQUENTIAL++;
    }




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

public abstract class Account implements AccountInterface{
    private static int STANDARD_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int countCode;
    protected double balance;
    protected Clients client;

    public Account(Clients client){
        this.agency = STANDARD_AGENCY;
        this.countCode = SEQUENTIAL++;
        this.client = client;
    }




    @Override
    public void withdraw(double value) {
        this.balance = balance - value;
        
    }

    @Override
    public void deposit(double value) {
        this.balance = balance + value;
        
    }

    @Override
    public void transfer(double value, Account destinyAccount) {
        this.withdraw(value);
        destinyAccount.deposit(value);
        
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

    protected void printCommonInfo(){
        System.out.println(String.format("Holder: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Count Code: %d", this.countCode));
        System.out.println(String.format("Balance:U$ %.2f", this.balance));
    }


}

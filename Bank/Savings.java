public class Savings  extends Account{
 
    public Savings(Clients client) {
        super(client);
    }

    @Override
    public void printExtract(){
        System.out.println("***Extract Saving Account***");
        super.printCommonInfo();
    }
    
}

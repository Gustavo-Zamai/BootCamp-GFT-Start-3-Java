public class CheckingAccount extends Account{
    public CheckingAccount(Clients client) {
        super(client);
    }

    public void printExtract(){
        System.out.println("***Extract Checking Account***");
        super.printCommonInfo();
    }
}

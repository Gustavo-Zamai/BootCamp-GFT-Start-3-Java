public class Main {
    public static void main (String [] args){
        Clients gustavo = new Clients();
        gustavo.setName("Gustavo");


        Account saving = new Savings(gustavo);
        Account check = new CheckingAccount(gustavo);

        check.deposit(252.36);

        saving.printExtract();
        check.printExtract();
        
    }
}

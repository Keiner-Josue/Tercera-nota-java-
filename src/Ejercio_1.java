public class Ejercio_1 {
    public static class BankAccount {
        //Atributos
        String accountNumber;
        String owner;
        double balance;

        //Metodos
        void deposit(double amount){
            balance += amount;
            System.out.println("Deposit: "+ amount + "| New balance: "+ balance);
        }
        void withdraw(double amount){
            if (balance >= amount) {
                balance -= amount;
                System.out.println("withdrawl: "+ amount + "now the balance is: "+ balance);
            }else {
                System.out.println("insufficient funds");
            }
        }
        void showBalance(){
            System.out.println(owner+" your account balance is: "+ balance);
        }
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountNumber = "4458-1414-5255-4115";
        account1.balance = 1500000;
        account1.owner = "Keiner Barbosa";
        account1.showBalance();
        System.out.println("Number account: "+account1.accountNumber);
        System.out.println("Name owner: "+account1.owner);
        account1.deposit(500000);
        account1.withdraw(1000000);
    }
}
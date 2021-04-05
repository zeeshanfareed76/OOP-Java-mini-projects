
package lab6;

public class Home_Activity_1 {

    public static void main(String args[]) {
        SavingAccounts s1= new SavingAccounts(2000);
        SavingAccounts s2= new SavingAccounts(3000);
        SavingAccounts.setInterestRate(3);
        s1.calculateMonthlyRate();
        s1.printBalance();
        s2.calculateMonthlyRate();
        s2.printBalance();
        
        SavingAccounts.setInterestRate(4);
        s1.calculateMonthlyRate();
        s1.printBalance();
        s2.calculateMonthlyRate();
        s2.printBalance();
    }
}

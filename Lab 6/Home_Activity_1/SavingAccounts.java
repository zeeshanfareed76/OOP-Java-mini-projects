
package lab6;

public class SavingAccounts {
    private static double annualInterestRate;
    private double savingBalance;
    private double newBalance;
    
    public SavingAccounts(int a){
    savingBalance=a;
    
    }
    
    public static void setInterestRate(int b){
        annualInterestRate=b;
    }
    
    public void calculateMonthlyRate(){
        newBalance=savingBalance + (savingBalance*(annualInterestRate/100))/12;
        savingBalance=newBalance;
    }
    
    public void printBalance(){
        System.out.println("After "+annualInterestRate+"% Interest Rate New Balance is : "+savingBalance);
    }
}

class SavingsAccount{
    public static double annualInterestRate = 0.0;
    private double savingsBalance;
    public SavingsAccount(double amt){
        this.savingsBalance = amt;
    }
    // calc monthly interest
    public void calculateMonthlyInterest()
    {
        double interest;
        interest = (this.savingsBalance * (annualInterestRate/100))/12;
        this.savingsBalance += interest;
    }
    // display balance
    public void disBalance()
    {
        System.out.printf("$%.2f", this.savingsBalance);
    }
    //static variable
    public static void modifyInterestRate(double newRate)
    {
        annualInterestRate = newRate;
    }
}
public class MainClass{
    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        SavingsAccount.modifyInterestRate(4.0); // interest rate = 4%

        //Titles on table
        System.out.println("Month \t\t Saver1 \t Saver2");

        //Show data for 12 months
        for(int i = 1; i <= 12; ++i){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            //print results in table format from here
            System.out.print("\t" + i + "\t\t");
            saver1.disBalance();

            System.out.print("\t");
            saver2.disBalance();

            System.out.println(); // to here
        }
        System.out.println();

        //Line Below displays action (changing interest rate)
        System.out.println("Setting the Interest Rate to 5.0%");

        SavingsAccount.modifyInterestRate(5.0); //interest rate = 5%

        // Calc Balances
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

// Displaying final data
        System.out.print("Month 13 \t");
        saver1.disBalance();
        System.out.print("\t");
        saver2.disBalance();
        System.out.println();
    }
}
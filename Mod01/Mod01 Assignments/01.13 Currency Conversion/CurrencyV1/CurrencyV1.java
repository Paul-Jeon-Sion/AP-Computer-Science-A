/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Paul Jeon
 * @version 2023/10/12
 */
public class CurrencyV1
{
    public static void main(String [ ] args) 
    {
        // starting US Dollars
        double startingUsDollars = 6500.00;
        
        //UK = United Kingdom
        double poundsSpent = 712;
        double poundsExchangeRate = 1.2981;
        double dollarsSpentInUK = (poundsSpent * poundsExchangeRate);
        
        //Korea
        double wonsSpent = 2123000;
        double wonsExchangeRate = 0.0007977;
        double dollarsSpentInKorea = (wonsSpent * wonsExchangeRate);

        //Australian Dollars = Aud
        double AudSpent = 1472;
        double AudExchangeRate = 0.6763;
        double dollarsSpentInAustralia = (AudSpent * AudExchangeRate);
        
        //Remaining US Dollars
        double dollarsAfterUK = startingUsDollars - dollarsSpentInUK;
        double dollarsAfterKorea = dollarsAfterUK - dollarsSpentInKorea;
        double dollarsAfterAustralia = dollarsAfterKorea - dollarsSpentInAustralia;
        
        // Message to user stating purpose
        System.out.println("--------------------------------------------------");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("--------------------------------------------------");
        System.out.println();

        //Starting amount of US Dollars
        System.out.println("Starting US Dollars: " + "\t\t" + startingUsDollars + "\n");
        System.out.println();
        
        //UK
        System.out.print("United Kingdom (Great Britian):" + "\n");
        System.out.print("\t" + "Pounds Spent: " + "\t\t" + poundsSpent + "\n");
        System.out.print("\t" + "US Dollars Equivalent: " + "\t" + dollarsSpentInUK + "\n");
        System.out.print("\t" + "US Dollars Remaining: " + "\t" + dollarsAfterUK +  "\n");
        
        //South Korea
        System.out.print("South Korea:" + "\n");
        System.out.print("\t" + "Wons Spent: " + "\t\t" + wonsSpent + "\n");
        System.out.print("\t" + "US Dollars Equivalent: " + "\t" + dollarsSpentInKorea + "\n");
        System.out.print("\t" + "US Dollars Remaining: " + "\t" + dollarsAfterKorea +  "\n");

        //Australia
        System.out.print("Australia:" + "\n");
        System.out.print("\t" + "AUD Spent: " + "\t\t" + AudSpent + "\n");
        System.out.print("\t" + "US Dollars Equivalent: " + "\t" + dollarsSpentInAustralia + "\n");
        System.out.print("\t" + "US Dollars Remaining: " + "\t" + dollarsAfterAustralia +  "\n");

        // Complete the code below for Souvenir Purchases
         System.out.println("--------------------------------------------------");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("--------------------------------------------------");

        //Calculations for Souvenir #1
        int costItem1 = 12;                          //cost per item of first souvenir
        int budget1 = 100;                           //budget for first item
        int totalItems1 = budget1 / costItem1;         //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left
    
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                          //cost per item of second souvenir
        int budget2 = 500;                               //budget for second item
        int totalItems2 = (int) (budget2 / costItem2);     //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;      //how much of the budget is left
        
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);
    } // end of main method
} // end of class


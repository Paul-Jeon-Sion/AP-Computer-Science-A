/**
 * the purpose of this program is to help purchase books online
 *
 * @author Paul Jeon
 * @version 2023/10/30
 * 
 */
import java.util.Scanner;
public class BuyBooks
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Good Morning");  
        System.out.println("Please enter your first and last name: ");
        String firstName = in.next();
        String lastName = in.nextLine(); 
        String firstInitial = firstName.substring(0,1);
        String name = firstInitial  + ". " + lastName;
        
        System.out.println("Please enter today's date (mm/dd/yyyy): ");
        String currentDate = in.nextLine();
        
        System.out.println("Please enter the name of book you would like to purchase: ");
        String bookName = in.nextLine();
        
        System.out.println("Please enter desired quantity of the book: ");
        String bookQuantity = in.next();
        
        System.out.println("Please enter the price of " + bookName + ": ");
        String priceOfBook = in.next();
        
        System.out.println("Please enter your debit card number (#####-###-####): ");
        String debitCardNumber = in.next();
        
        System.out.println("Please enter your PIN (####): ");
        String debitCardPIN = in.next();
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("Your e-Receipt \n");
        
        System.out.println(currentDate);
        System.out.println(firstInitial + lastName.substring(1,3) + debitCardNumber.substring(10,14));
        System.out.println("\n");
        
        System.out.println("\t Name: " + name);
        
        System.out.println("\t Account: " + "#####-###-" + debitCardNumber.substring(10,14));
        
        System.out.println("\t Book: " + bookName);
        
        System.out.println("\t Number of books: " + bookQuantity);
        
        System.out.println("\t Book Price: " + priceOfBook + "\n");
        
        double doublePriceOfBook = Double.parseDouble(priceOfBook);
        int intBookQuantity = Integer.parseInt(bookQuantity);
        System.out.println("$" + (doublePriceOfBook * intBookQuantity) + " will be debited to your account.");
        
        System.out.println("Thank you for purchasing our book");
        System.out.print("-----------------------------------------------------------");
    }
}

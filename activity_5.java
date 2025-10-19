//Customer Discount Calculator
//Jewelle Melody T. Boisilio
//BSCS 2-4

import java.util.Scanner;
public class activity_5 {
    static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String choice;
do{
    System.out.println("========== Customer Discount Calculator==========\n");
    System.out.print("Enter the Total Bill Amount (e.g., 100.50): ");
        double initialBill = scan.nextDouble();
    System.out.print("Enter Customer Type [ |Regular | Premium | VIP| Other| ]: ");
        String customerType = scan.nextLine();
        customerType = scan.nextLine();
    
    double percent = 0;
    double discount = 0;

    if (customerType.equals("VIP")||customerType.equals("vip")){
        percent = 0.15;
        discount = percent * initialBill;
    } else if(customerType.equals("Premium")||customerType.equals("premium")){
        percent = 0.10;
        discount = percent * initialBill;
    } else if (customerType.equals("Regular")||customerType.equals("regular")){
        percent = 0.05;
        discount = percent * initialBill;
    } else{
        discount = 0;
    }

    double discountRate = (discount/initialBill)*100;
    double finalBill = initialBill - discount;

    System.out.println("\n----------------------------------------------------\n");
    System.out.println("Customer type: " + customerType);
    System.out.printf("Original Bill: %,.2f%n", initialBill );
    System.out.printf("Discount Rate: %.2f%%%n", discountRate);
    System.out.printf("Final Bill After Discount: %,.2f%n", finalBill);

    System.out.print("\nDo you want to calculate again? [Y|N]: ");
    choice = scan.nextLine();
    System.out.println("\n");

}while(choice.equals("Y")||choice.equals("y"));

    scan.close();
    }
}

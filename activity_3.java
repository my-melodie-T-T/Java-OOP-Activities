//Employee's Annual Bonus
//Jewelle Melody T. Boisilio
//BSCS 2-4

import java.util.Scanner;
public class activity_3{
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        String ans;
do {
        System.out.println("====== Employee's Annual Bonus Calculator======\n");
        System.out.print("Enter your annual salary: ");
            double annualSalary = scan.nextDouble();
        System.out.print("\nEnter years of service: ");
            int yearsOfService = scan.nextInt();
        System.out.print("\nEnter performance rating: ");
            int rating = scan.nextInt();

        double bonusPercentage = 0;

        if (yearsOfService >= 5){
            if (rating >= 90) {
                bonusPercentage = 0.20; 
            } else if (rating >=80){
                bonusPercentage = 0.15;
                } else {
                    bonusPercentage = 0.10;
                }

        } else{
            if (rating >=  90){
                    bonusPercentage = 0.10;
            } else if (rating >= 80){
                 bonusPercentage = 0.05;
                    } else {
                        bonusPercentage = 0.0;
                    }
        }
       
        //calculate bonus and total salary
        double bonus = annualSalary * bonusPercentage;
        double totalSalary = bonus + annualSalary;

        //output
        System.out.println("-------------------------------------------");
        System.out.printf("Bonus: PhP %,.2f%n", bonus);
        System.out.printf("Total Salary: PhP %,.2f%n", totalSalary);
        System.out.println("\n");

        //as user if they wanna calculate again
        System.out.print("Do you want to calculate again? [Y|N]: ");
        scan.nextLine(); // consumes leftover newline
        ans = scan.nextLine();
        System.out.println("\n");
    }
    while(ans.equals("y") || ans.equals("Y"));

         scan.close();
    }
}
//Employee Salary Bonus Calculator 
//Jewelle Melody T. Boisilio
//BSCS 2-4

import java.util.Scanner;
public class activity_4 {
    static void main (String[] args){
   
    String choice;
    Scanner scan = new Scanner(System.in);

do {
    System.out.println("====== Employee's Bonus Calculator =====\n");
    System.out.print("Enter years of service: ");
        int yearsOfService = scan.nextInt();
    System.out.print("Enter performance rating [excellent|good|other]: ");
        String performanceRating = scan.nextLine();
        performanceRating = scan.nextLine();
    System.out.print("Enter salary: ");
        double salary = scan.nextInt();

    double percent = 0;
    double bonus = 0;
    
    if (yearsOfService >= 10){
        if (performanceRating.equals ("excellent")){
            percent = 0.20;
            bonus = percent * salary;
            } else if (performanceRating.equals("good")){
                percent = 0.15;
                bonus = percent * salary;
                } else {
                    bonus = 5000;//fixed bonus
                }
    } else if (yearsOfService >= 5){
            if (performanceRating.equals("excellent")){
                percent = 0.15;
                bonus = percent * salary;
                } else if (performanceRating.equals("good")){
                    percent= 0.10;
                    bonus = percent * salary;
                    } else {
                        percent = 0.05;
                        bonus = percent * salary;
                    }
    } else{
        bonus = 5000; //fixed bonus
    }
        
    double bonusPercent = (bonus/salary) * 100;

    System.out.println("\n------------------------------------------------\n");
    System.out.printf("The bonus is: PhP %,.0f (%.2f%% of PhP %,.0f)%n", bonus, bonusPercent, salary);
    System.out.println("\n");

    //asks user if they wanna calculate again
    System.out.print("Do you want to calculate again? [Y|N]: ");
    scan.nextLine(); // consumes leftover newline
    choice = scan.nextLine();
    System.out.println("\n");

}while(choice.equals("Y")||choice.equals("y"));

    scan.close();


    }
}

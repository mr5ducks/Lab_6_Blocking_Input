import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        //variables
        double gallons = 0;
        double milesGall = 0;
        double priceGall = 0;
        boolean correct;

    do { //this loop can be used for the rest of the code. just change the words
        System.out.print("Enter number of gallons in tank= ");
        if (scanner.hasNextDouble()) {
            gallons = scanner.nextDouble();
            correct = true;
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            correct = false;
        }
    } while (!correct);

    do {//check the variables and the correct var make it true make sure
        System.out.print("Enter fuel efficiency= ");
        if (scanner.hasNextDouble()) {
            milesGall = scanner.nextDouble();
            correct = true;
        } else {
            System.out.println("Please enter a number.");
            scanner.next();
            correct = false;
        }
    } while (!correct);


    do {
        System.out.print("Enter price of gas per gallon= ");
        if (scanner.hasNextDouble()) {
            priceGall = scanner.nextDouble();
            correct = true;
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            correct = false;
        }
        } while (!correct);

        //keep this at the bottom if put at the top the code runs right away and the won't work
        //
        double hundredMiles = (100 / milesGall) * priceGall; //every 100 miles cost
        double maxDist = gallons * milesGall; //the max distance
        //
        System.out.printf("Cost to drive 100 miles: $%.2f\n", hundredMiles);//keep \n it looks better
        System.out.printf("Distance car can go with full: %.2f miles\n", maxDist);

        scanner.close();//don't forget to close scanners
    }
}

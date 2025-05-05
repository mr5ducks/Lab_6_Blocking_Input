import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        //variables
        double cell = 0;
        boolean correct = false;
        double fahr = 0;
        //start of code
        do { //start of the do while loop
        System.out.print("Celsius= ");
        if (scanner.hasNextDouble()) {//start of the if statement in the do while loop
            cell = scanner.nextDouble();
            correct = true;//change correct to false
        } else { //this goes through if user doesn't input correct info
            System.out.println("write a number");
            scanner.next();
            }
        } while (!correct); //end of do while loop !inverts

        fahr = (cell * 9 / 5) + 32;
        System.out.println("Fahrenheit= " + fahr);
        scanner.close();
    }
}

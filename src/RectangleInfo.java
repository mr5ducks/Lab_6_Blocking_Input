import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        //variables at the top
        double width = 0;
        double height = 0;
        boolean correct;

    do { //reuse this code for the rest of the program
        System.out.print("Enter the width of the rectangle= ");
        if (scanner.hasNextDouble()) {
            width = scanner.nextDouble();
            correct = true; //make true false
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            correct = false;
        }
    } while (!correct);


    do {
        System.out.print("Enter the height of the rectangle= ");
        if (scanner.hasNextDouble()) {
            height = scanner.nextDouble();
            correct = true; //make true false
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            correct = false;
        }
    } while (!correct);

    //keep the math at the bottom so it works
    double area = width * height;
    double perimeter = 2 * (width + height);
    double diagonal = ((width * width) + (height * height));
    //everything prints out here
    System.out.printf("Area of rectangle: %.2f\n", area);
    System.out.printf("Perimeter of rectangle: %.2f\n", perimeter);
    System.out.printf("Length of diagonal: %.2f\n", diagonal);

    scanner.close();
    }
}
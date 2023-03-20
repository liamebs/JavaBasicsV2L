import java.util.Scanner;
public class SquareCalculator {
    // create main class
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // request two double data types
        System.out.print("What is the width? ");
        double width = Double.parseDouble(reader.nextLine());
        System.out.print("What is the height? ");
        double height = Double.parseDouble(reader.nextLine());

        // print width and height to screen
        System.out.println("Width: " + width + "cm");
        System.out.println("Height: " + height + "cm");
        // declare double variable and calculate perimeter
        double perimeter = (width + height) * 2;
        // print result
        System.out.println("\nPerimeter: " + perimeter + "cm");
        // declare and calculate area
        double area = (width * height);
        // print area result
        System.out.println("\nArea: " + area + "cm2");
    }
}

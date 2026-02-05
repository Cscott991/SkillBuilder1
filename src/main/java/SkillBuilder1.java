import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

// Correct expression
        double value = Math.pow(2, 5 * Math.pow(spice, 3));

        System.out.printf("Well %s, the spice value resulted in %.4f%n", name, value);

// Conversion
        int convertedInt = (int)(value * 100);
        double converted = convertedInt / 100.0;

        System.out.println("And the converted value is " + converted);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // Calculate area
        double area = wallHeight * wallWidth;
        System.out.println("Wall area: " + area + " square feet");

        // Gallons needed
        double gallonsNeeded = area / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons%n", gallonsNeeded);

        // Cans needed (rounded up)
        int cansNeeded = (int)Math.ceil(gallonsNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
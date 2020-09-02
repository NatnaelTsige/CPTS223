import java.util.Scanner;

public class HelloWorld2 {

    public static void temp(double value, int flag) {
        double celc =5 * (value - 32) / 9;
        System.out.println("Farenheit: " + value + "\n Celcius: " + celc + "\n");
    }

    public static void main(String[] args){

        Scanner readme = new Scanner(System.in);

        System.out.println("Enter to numbers... first on in farenheit and the second in celcius");
        System.out.println("press Enter each input: ");

        double faren, celcius;

        faren = readme.nextDouble();
        celcius = readme.nextDouble();

        double f = 2.4;

        temp(5.6, 0);
        temp(f, 1);
    }
}

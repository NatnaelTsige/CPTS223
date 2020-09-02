public class HelloWorld {

    public static void temp(double faren) {
        double celc =5 * (faren - 32) / 9;
        System.out.println("Farenheit: " + faren + "\n Celcius: " + celc + "\n");
    }

    public static void main(String[] args){
        System.out.println("Hello world!\n");

        double f = 2.4;

        temp(5.6);
        temp(f);
    }

}

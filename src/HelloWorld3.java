public class HelloWorld3 {
    int x = 5;

    public HelloWorld3(){

        System.out.println("Creating HelloWorld object");

    }

    public static void mian(String[] args){
        //prints "Hello, World" to terminal window.
        System.out.println("Hello, World");
        String one = "first" + "second";
        int two;
        float three = 5.99f;
        double another = 4.5;
        char four;
        boolean five;
        System.out.println(one);

        if(three > another){
            System.out.println("three bigger than another");
        }
        int[] intArr = {10, 5, 6, 15};

        HelloWorld first = new HelloWorld();
        HelloWorld second = new HelloWorld();
    }

    int myMethod(){
        return (0);
    }


}

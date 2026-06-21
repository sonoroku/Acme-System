package ver1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from IntelliJ");
        System.out.println("Alex is working locally on his branch");
        heyNow();
        whatFor("Coffee");
    }

    public static void heyNow() {
        String Msg = "Hey Now!";
        System.out.println(Msg);

    }

    public static void whatFor(String stringArg) {
        System.out.println(stringArg + ", what for?");
    }

}

public class Date {
    private Date() {}

    public static String day(int month, int day) {
        return month + "/" + day;
    }

    public static void info(int month, int day) {
        System.out.println("The month of " + month + " on the day of " + day);
    }

    public void victoriaMethod() {
        System.out.println("hello");
    }
}


package guides.multimodules.lib;

public class Converter {

    public static int getFeet(int cm) {
        int feet = (int) (cm / 30.48);
        return feet;
    }

    public static int getInches(int cm) {
        double feet = cm / 30.48;
        int inches = (int) (cm / 2.54) - ((int) feet * 12);
        return inches;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int diff(int a, int b) {
        return a - b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

}

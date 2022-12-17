package module7;

public class Calculator {
    public enum Type {
        MULTIPLICATION,
        SUMMARY,
        DIVISION,
        SUBTRACTION
    }

    public static double calculate(double a, double b, Type type) {
        double result = 0;

        try {

            switch (type) {
                case MULTIPLICATION:
                    result = a * b;
                    break;
                case SUMMARY:
                    result = a + b;
                    break;

                case DIVISION:
                    result = a / b;
                    break;

                case SUBTRACTION:
                    result = a - b;
                    break;

                default:
                    result = -1;

            }
        } catch (Exception err) {
            System.out.println("Something bad has happened ");
               throw err;

        }


        return result;
    }
}


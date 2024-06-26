public class FunctionUsage {
    /*
     * use the following arithmetic operations to
     * add, minus, multiply and divide 2 numbers depending on the
     * overloading concept in OOP.
     */

    int sum(int num1, int num2) {
        return num1 + num2;
    }

    int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    int subtract(int num1, int num2) {
        return num1 - num2;
    }

    int subtract(int num1, int num2, int num3) {
        return num1 - num2;
    }

    String displayFullName(String firstName, String secondName) {
        return firstName + " " + secondName;
    }

    int printCharsLength(String name){
        return name.length();
    }
}
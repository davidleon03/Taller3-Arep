package org.escuelaing.arep.fucioneslmb;

public class Calculator {
    interface IntegerMath {
        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String... args) {

        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath divit = (a, b) -> a / b;
        IntegerMath multi = (a, b) -> a * b;
        System.out.println("40 + 2 = " +
                myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = " +
                myApp.operateBinary(20, 10, subtraction));
        System.out.println("20 / 2 = " +
                myApp.operateBinary(20, 2, divit));
        System.out.println("10 * 5 = " +
                myApp.operateBinary(10, 5, multi));
    }
}

class Calculator {

    // Method Overloading
    final int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int multiply(int a, int b) {
        System.out.println("A");

        return a * b;
    }
}

class CalculatorMain extends Calculator {

    // Method Overiding 
    int multiply(int a, int b) {
        System.out.println("B");
        return a * b*2;
    }

}

class Demo {

    public static void main(String[] args) {
        CalculatorMain calc = new CalculatorMain();
        System.out.println(calc.multiply(2, 3));
        System.out.println(calc.add(5, 10));       // Calls add(int, int)
        System.out.println(calc.add(5, 10, 15));  // Calls add(int, int, int)
    }
}

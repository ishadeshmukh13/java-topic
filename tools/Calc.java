package  tools;

class Calc {

    int n2 = 23;

    public int add(int a, int b) {
        int r = a + b;
        finish("add");
        return r;
    }

    public int minus(int a, int b) {
        int r = a - b;
        finish("minus");
        return r;
    }

    public int multiply(int a, int b) {
        int r = a * b;
        finish("multiply");
        return r;
    }

    public int divide(int a, int b) {
        int r = a / b;
        finish("divide");
        return r;
    }

    public int findReminder(int a, int b) {
        int r = a % b;
        finish("findReminder");
        return r;
    }

    public void finish(String method) {
        System.out.println(method + " method is finish");
    }
}

class CalcMain {

    public static void main(String a[]) {

        Calc calcMethod = new Calc();
        calcMethod.n2 = 20;

        Calc calcMethod2 = new Calc();
        int n1 = 23, n2 = 2;
        System.out.println("instance variable : " + calcMethod.n2 + " " + calcMethod2.n2);

        int resultAdd = calcMethod.add(n1, n2);
        System.out.println("Result add : " + resultAdd);

        int resultMinus = calcMethod.minus(n1, n2);
        System.out.println("Result minus : " + resultMinus);

        int resultMultiply = calcMethod.multiply(n1, n2);
        System.out.println("Result multiply : " + resultMultiply);

        int resultDivide = calcMethod.divide(n1, n2);
        System.out.println("Result divide : " + resultDivide);

        int resultRemainder = calcMethod.findReminder(n1, n2);
        System.out.println("Result remainder : " + resultRemainder);

    }
}

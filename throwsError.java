
class A {
    public int show(int a, int b) throws ArithmeticException {
        return a / b;
    }
}

class ThrowError {
    public static void main(String args[]) {
        A obj = new A();
        try {
            obj.show(9, 0);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

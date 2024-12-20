
class A {

    public A() {
        System.out.println("Hello  A default construtor ");
    }

    public A(int c) {
        System.out.println("Hello A parameter construtor " + c);
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("Hello B default construtor ");
    }

    public B(int c) {
        this();
        System.out.println("Hello B parameter construtor ");
    }
}

class Demo {

    public static void main(String arg[]) {

        B obj1 = new B(2);
    }
}

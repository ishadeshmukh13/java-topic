
interface A {

    void show();
}

class B implements A {

    public void show() {
        System.err.println("hello");
    }
}

interface C {

    void show();
}

class Demo {

    public static void main(String arg[]) {
        B obj = new B();
        obj.show();

        C obj2=new C(){
            public void show(){
                System.err.println("hello");
            }
        };

    }
}

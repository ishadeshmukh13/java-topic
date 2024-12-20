
class A {

    public void showTheDataBelognsToTHecChildParent() {
        System.out.println("Hello  A default construtor ");
    }

}

class B extends A {
    @Override
    public void showTheDataBelognsToTHecChildParent() {
        System.out.println("Hello B default construtor ");
    }

}

class Demo {

    public static void main(String arg[]) {

        B obj1 = new B();
        obj1.showTheDataBelognsToTHecChildParent();
    }
}

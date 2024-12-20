
class StaticVariable {

    int id;
    String model;
    static String name;

    static {
        name = "isha";
    }

    public void show() {
        System.out.println("id is : " + id + " model " + model + " name is " + name);
    }

    public static void show1(StaticVariable obj1) {
        System.out.println("id is : " + obj1.id + " model " + obj1.model + " name is " + name);

    }

}

class StaticTopic {

    public static void main(String args[]) {
        StaticVariable S1 = new StaticVariable();
        S1.id = 23;
        S1.model = "54A";
        StaticVariable.name = "Samsung";
        StaticVariable S2 = new StaticVariable();
        S2.id = 23;
        S2.model = "54A";
        StaticVariable.name = "Apple";
        S1.show();
        S2.show();
        StaticVariable.show1(S1);

    }
}

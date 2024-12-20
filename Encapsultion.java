
class EncapsulationTopic {

    private int age;
    private String name;
 public EncapsulationTopic(){
        this.age=20;
        this.name="name";
    }

    public EncapsulationTopic(int age,String name){
        this.age=age;
        this.name=name;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Demo {
    public static void main(String args[]) {

        EncapsulationTopic obj1 = new EncapsulationTopic(20,"ish");
        obj1.setAge(23);
        obj1.setName("Isha");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}

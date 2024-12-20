class StringTopic {
    public static void main(String[] abc) {
        String name = new String("Isha"); 
        StringBuffer name1=new StringBuffer("isha");
        name="ishh";
        System.out.println("Hello " + name);
        //for capacity (memory space)
        System.out.println("string buffer " + name1.capacity());  //20
    }
}

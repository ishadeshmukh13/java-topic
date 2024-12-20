
class HelloWorld {

    public static void main(String a[]) {

        //primitive variable 
        int t = 10;
        long b = 233342l;
        char name = 'a';
        double c = 23343.24535;
        float d = 242.344f;
        boolean isCheck = true;

        //Type conversion and casting
        
        byte byteNo = 127;
        int no = 256;
        // this is wrong  error incompatible types: possible lossy conversion from int to byte(
        // byteNo = no;

        //this is right we need to convert no to byte and we assing or copy 
        byteNo = (byte) no;
        System.out.println(byteNo);
        System.out.println(no);

        //this is right
        no = byteNo;
        System.out.println(byteNo);
        System.out.println(no);

        System.out.println("Hello World");
    }
}

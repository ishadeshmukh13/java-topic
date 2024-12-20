
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Demo {

    public static void main(String args[]) throws IOException {
        System.out.println("enter your age :");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // System.out.println(Integer.parseInt(bf.readLine()));
        // bf.close();

        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(num);


    }
}

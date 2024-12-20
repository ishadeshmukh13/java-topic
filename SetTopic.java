
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Demo {

    public static void main(String[] args) {
        Set<Integer> arr = new HashSet<Integer>();
        for (int i = 2; i < 20; i++) {
            arr.add(i * 2);
        }
        System.out.println("adding -> " + arr);
        System.out.println("Size of arr before  -> " +  arr.size());
        arr.add(4);
        System.out.println("Size of arr after -> " +  arr.size());
       
        for (int n : arr) {
            System.out.println("element is -> " + n);
        }
        Set<Integer> arr2 = new TreeSet<Integer>();
        for (int i = 2; i < 20; i++) {
            arr2.add(i * 2);
        }
        System.out.println("adding -> " + arr2);
        System.out.println("Size of arr2 before  -> " +  arr2.size());
        arr2.add(4);
        System.out.println("Size of arr2 after -> " +  arr2.size());
       
        for (int n : arr2) {
            System.out.println("element is -> " + n);
        }

            System.out.println("End  -> ");

        Iterator<Integer> numOfArr2=arr2.iterator();
        while(numOfArr2.hasNext()){
            System.out.println("element is -> " + numOfArr2.next());

        }
    }
}

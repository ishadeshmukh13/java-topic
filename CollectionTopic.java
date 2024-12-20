
import java.util.ArrayList;
import java.util.Collection;

class Demo {

    public static void main(String args[]) {
        Collection<Integer> arr = new ArrayList<Integer>();
        arr.add(23);
        arr.add(22);
        arr.add(43);
        arr.add(89);
        arr.add(90);
        arr.add(121);
        arr.add(11);
        arr.add(244);
        System.out.println("Helloooo  " + arr);
        Collection arr2 = new ArrayList();
        arr.add(26);
        arr.add(27);
        arr.addAll(arr2);
        System.out.println("Helloooo  " + arr);
        arr.remove(23);
        System.out.println("Helloooo  " + arr);
        System.out.println("Helloooo  " + arr.isEmpty());
        System.out.println("Helloooo  " + arr.size());

        for (int num : arr) {
            System.out.println("Helloooo  " + num);

        }

    }
}

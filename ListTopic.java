
import java.util.ArrayList;
import java.util.List;

class Demo {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(12);
        arr.add(22);
        arr.add(11);
        arr.add(33);
        arr.add(13);
        arr.add(44);
        System.out.println("List --> " + arr);
        arr.addFirst(23);
        System.out.println("List --> " + arr);
        arr.addLast(55);
        System.out.println("List --> " + arr);
        System.out.println("List of start element --> " + arr.getFirst());
        System.out.println("List of last element --> " + arr.getLast());
        System.out.println("index find of 23 --> " +  arr.indexOf(23));
        System.out.println("index get of 2378 --> " +  arr.get(0));

    }
}


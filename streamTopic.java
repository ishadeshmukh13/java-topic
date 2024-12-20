
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Demo {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(12);
        arr.add(22);
        arr.add(11);
        arr.add(14);
        Stream<Integer> arr2 = arr.stream().filter(item -> item % 2 == 0);
        Stream<Integer> arr3 = arr.stream().map(item -> item * 2);
        int result=arr.stream().reduce(1, (a,e)->a+e);
            System.out.println("reduce function -> " + result);

        arr2.forEach((n) -> {
            System.out.println("filter function -> " + n);
        }
        );
        arr3.forEach((n) -> {
            System.out.println("map function -> " + n);
        }
        );
    }
}

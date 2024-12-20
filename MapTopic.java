
import java.util.HashMap;
import java.util.Map;

class Demo {

    public static void main(String args[]) {
        Map<String,Integer> student = new HashMap<>();
        student.put("ish", 1);
        student.put("isha", 2);
        student.put("ishi", 3);
        student.put("aish", 4);
        System.out.println("student.keySet()"+student.keySet());

        for(String key: student.keySet()){
        System.out.println(student.get(key));
        }
    }
}



class CalcAdvance extends Calc {

    public int addAccording(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        return temp;
    }
}


class CalcAdvance2 {

    public int multiplyAccording(int arr[]) {
        int temp = 1;
        for (int i = 0; i < arr.length; i++) {
            temp *= arr[i];
        }
        return temp;
    }
}


class CalcPow extends CalcAdvance {

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }
}

class Demo {

    public static void main(String args[]) {
        // in calc.java
        CalcAdvance obj1 = new CalcAdvance();
        obj1.add(2, 3);

    }
}

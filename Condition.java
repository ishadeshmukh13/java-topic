
class Condition {

    public static void main(String a[]) {

        int c = 20;
        int b = 2;

        //if else
        if (c > b) {
            System.out.println("c is greater then b"); 
        }else if (b == c) {
            System.out.println("c is equal then b"); 
        }else {
            System.out.println("b is greater then c");
        }

        //ternary operator
        int result = 3;
        boolean isResult = result > 20 ? true : false;
        System.out.println(isResult);

        //switch case
        int isDay = 8;
        switch (isDay) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}

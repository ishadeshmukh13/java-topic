
class Array {
    public static void main(String a[]) {

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int num2[] = new int[2]; //[0,0]
        for (int i = 0; i < num2.length; i++) {
            num2[i] = i + 2;
            System.out.println("index of " + num2[i]);

        }

        System.out.println("End Loop of Num2");

        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] + 2;
            System.out.println("index of " + num[i]);
        }

        System.out.println("End Loop of Num");

        int num3[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                num3[i][j] = (int) (Math.random() * 10);
                System.out.print(num3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("End Loop of Num3");

        for (int n[] : num3) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println("End Loop of Num3");

        int num5[][][] = new int[2][2][2];

        for (int n[] []: num5) {
            for (int m[] : n) {
            for (int k: m) {
                  k=(int) (Math.random() * 10);
                System.out.print(k+ " ");
            }
            }
            System.out.println();
        }

       

        System.out.println("End Loop of Num4");

    }
}

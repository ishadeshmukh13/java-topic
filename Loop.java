class Loop{
    public static void main(String a[]){
        int no=10;
        for(int i=0;i<=no;i++){
            System.out.println(i);
        }
        for(int i=0;i<=5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
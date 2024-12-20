
class IshaException extends Exception {

    IshaException(String err) {
        super(err);
    }
}

class ExceptionTopic {

    public static void main(String args[]) {

        int i = 7;
        int j = 2;
        int k = 0;
        String a = "ish";
        int[] arr = new int[8];
        try {
            k = j / i;
            // k = arr[3];
            // k = a.length();

            if (k == 0) {
                throw new IshaException("I don't want to print 0");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("your are accessing wrong index this index is wrong");

        } 
        catch(IshaException e){
            System.out.println("you can not divide by 0"+e);

        }
        
        catch (ArithmeticException e) {
            System.out.println("you can not divide by 0");

        } catch (Exception e) {
            System.out.println("Something went wrong" + e);

        }
        System.out.println("Hello result is " + k);
    }
}

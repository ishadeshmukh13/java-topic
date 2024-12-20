
enum Status {
    Pending,
    Reject,
    Success,
    Running;
}

enum Status2 {
    Pending(9000),
    Reject(8000),
    Success(4000),
    Running(1000);
    private int price;

    private Status2(int price) {
        this.price = price;
    }

    public int showPrice() {
        return this.price;
    }

    public int setPrice(int price) {
        this.price = price;
        return this.price;
    }

}

class Demo {

    public static void main(String[] d) {
        Status s = Status.Pending;
        System.out.println("hello " + s + s.ordinal());
        switch (s) {
            case Status.Running:
                System.out.println("hello " + s);
                break;
            case Status.Reject:
                System.out.println("hello " + s);
                break;
            case Status.Success:
                System.out.println("hello " + s);
                break;
            case Status.Pending:
                System.out.println("hello " + s);
                break;

        }

        Status2 B = Status2.Pending;
        B.setPrice(2000);
        System.out.println("hello " + B.showPrice()
        );

    }
}

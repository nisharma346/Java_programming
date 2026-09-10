
class Sum {

    int a;
    int b;

    void add(int x, int y) {
        a = x;
        b = y;
    }

    int addTwo() {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int sum1, sum2;
        Sum s1 = new Sum();
        Sum s2 = new Sum();

        s1.add(10, 40);
        s2.add(45, 30);

        sum1 = s1.addTwo();
        sum2 = s2.addTwo();

        System.out.println("a+b=" + sum1);
        System.out.println("a+b=" + sum2);
    }
}

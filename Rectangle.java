
class Rectangle {

    int length, width;

    Rectangle(int x, int y) {
        length = x;
        width = y;

    }

    int rectArea() {
        return (length * width);
    }

    public static void main(String[] args) {
        int A;
        Rectangle R1 = new Rectangle(90, 40);
        A = R1.rectArea();
        System.out.println("Area is:" + A);
    }

}

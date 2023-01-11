
class RectangleComputation {

  double length;
  double width;

  public RectangleComputation() {

    length = 5.3;
    width = 3.4;
  }

  public RectangleComputation(double length, double width) {

    this.length = length;
    this.width = width;
  }

  public double getrectanglearea() {
    return length * width;

  }

  public double getrectanglecircumference() {
    return 2 * (length + width);

  }

  public static void main(String[] args) {

    RectangleComputation st = new RectangleComputation(15, 13);

    System.out.println("Area of the rectangle is :" + st.getrectanglearea());
    System.out.println("Circumference of the rectangle is :" + st.getrectanglecircumference());
  }
}
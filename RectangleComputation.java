
class RectangleComputation {

  double height;

  double radius;

  public RectangleComputation() {

    height = 10.4;
    radius = 8.4;
  }

  public RectangleComputation(double height, double radius) {

    this.height = height;
    this.radius = radius;
  }

  /*
   * public double length(){
   * return length ;
   * 
   * }
   * public double width(){
   * return width ;
   * 
   * }
   * public double getrectanglearea(){
   * return length*width;
   * 
   * }
   * public double getrectanglecircumference(){
   * return 2*(length+width);
   * 
   * }
   */

  public double alldataofcyclender() {
    double SurfaceArea = 2 * 3.14 * height;

    return SurfaceArea;

  }

  public static void main(String[] args) {

    RectangleComputation st = new RectangleComputation(15.3, 10.4);

    System.out.println("SurfaceArea of the cyclender is :" + st.alldataofcyclender());

  }
}
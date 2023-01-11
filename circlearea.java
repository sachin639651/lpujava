
class RectangleComputation {
  
  double length;
  double width;

  public RectangleComputation() {
   
     length = 5.3;
	 width=3.4;
  }

  public RectangleComputation(double length , double width) {
   
    this.lenght = length;
this.width=width; 	
  }

 
public double getrectangl	earea(){
return  lenght*width;

}
public double getrectanglecircumference(){
return  2*(length+width);

}


  public static void main(String[] args) {
	  
	  
	  
    circlearea st = new circlearea(15);
 
    System.out.println("Area of the rectangle is :"+st.getrectanglearea());
 System.out.println("Circumference of the rectangle is :"+st.getrectanglecircumference());
  }
}
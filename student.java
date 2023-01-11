 
class student {
  
  int radius;

  public student() {
   
    radius = 5;
  }

  public student(int radius) {
   
    this.radius = radius; 	
  }

 
public double getCircalarea(){
return radius*2*3.14;

}


  public static void main(String[] args) {
    student st = new student(5);
    System.out.println("Area of the circle is :"+st.getCircalarea());

  }
}
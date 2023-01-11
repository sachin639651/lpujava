class Student1{
String name;
int id;
String hostel;

Student1(){
name = "NA";
id = 1;
hostel =null;
}

Student1(String name, int id, String hostel){
this.name = name;
this.id = id;
this.hostel = hostel;
}

String getName(){
return  name;
}

public static void main(String[] args){
Student1 st = new Student1();

// create your own object here
Student1 s=new Student1("sachin",12,"bh"); 

Student1 st2 = new Student1("Gyan",10,null);

//Code print the name of st2 here
System.out.println("name :"+s.getName());
System.out.println("name :"+st2.getName());

}
}
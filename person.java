class person{
String Name="Sachin";
int Age=1;
String Gender;
Long PhoneNo;


public person(String Name, int Age){
this.Name=Name;	
	this.Age=Age;
}

public Object Getname(){
 Age=Age+1;
 if(Age%7==0){
	  System.out.println(Age); 
 }

  if(Age<=200){
	 Getname();  
  }

 return null;
}
public static void main(String[] Args){
 
	  person p=new person("Sachin",20);
	  p.Getname();
	  
}

}


public class ex89 {

		 int rollno;  
		 String name;  
		 String city;  
		  
		 ex89(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
	 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			   ex89 s1=new ex89(101,"Raj","lucknow");  
			   ex89 s2=new ex89(102,"Vijay","ghaziabad");  
			     
			   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  

	}

}

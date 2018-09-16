
public class ex88 {

		 int rollno;  
		 String name;  
		 String city;  
		  
		 ex88(int rollno, String name, String city){  
		 this.rollno=rollno;  
	 this.city=city;  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ex88 s1=new ex88(101,"Raj","lucknow");  
			   ex88 s2=new ex88(102,"Vijay","ghaziabad");  
			     
			   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  

	}

}


public class ex18 {

		     int rollno;  
		     String name;  
		     static String college = "ITS";  
		       
		     static void change(){  
		     college = "BBDIT";  
		     }  
		  
		     ex18(int r, String n){  
		     rollno = r;  
		     name = n;  
		     }  
		  
		     void display (){System.out.println(rollno+" "+name+" "+college);}  

	public static void main(String[] args) {
			    ex18.change();  
			  
			    ex18 s1 = new ex18 (111,"ravindar");  
		        ex18 s2 = new ex18 (222,"ilakiya");  
			    ex18 s3 = new ex18 (333,"Priya");  
			  
			    s1.display();  
			    s2.display();  
			    s3.display();  


	}

}

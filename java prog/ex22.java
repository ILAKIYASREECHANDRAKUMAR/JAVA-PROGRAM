
public class ex22 {

	         int id;  
		    String name;  
		    String city;  
		      
		    ex22(int id,String name){  
		    this.id = id;  
		    this.name = name;  
		    }  
		    ex22(int id,String name,String city){  
		    this(id,name);//now no need to initialize id and name  
	    this.city=city;  
		    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  

	public static void main(String[] args) {
		 ex22 e1 = new ex22(111,"raj");  
		 ex22 e2 = new ex22(222,"banu","delhi");  
		 e1.display();  
	     e2.display();  


	}

}

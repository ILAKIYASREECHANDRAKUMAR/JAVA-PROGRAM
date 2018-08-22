
public class ex20 {

		    int id;  
		    String name;  
		      
		    ex20(int id,String name){  
		    this.id = id;  
		    this.name = name;  
		    }  
		    void display(){System.out.println(id+" "+name);}  

	public static void main(String[] args) {
		        ex20 s1 = new ex20(111,"ilakiya");  
			    ex20 s2 = new ex20(222,"Abinaya");  
			    s1.display();  
			    s2.display();  


	}

}

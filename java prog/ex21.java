
public class ex21 {

		    int id;  
		    String name;  
		    ex21(){System.out.println("default constructor is invoked");}  
		      
		    ex21(int id,String name){  
		    this ();//it is used to invoked current class constructor.  
		    this.id = id;  
		    this.name = name;  
		    }  
		    void display(){System.out.println(id+" "+name);}  

	public static void main(String[] args) {
			    ex21 e1 = new ex21(111,"dharshini");  
			    ex21 e2 = new ex21(222,"ilakiya");  
			    e1.display();  
			    e2.display();  


	}

}

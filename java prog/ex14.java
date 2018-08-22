
public class ex14 {
		    int id;  
		    String name;  
		    int age;  
		    ex14(int i,String n){  
		    id = i;  
		    name = n;  
		    }  
		    ex14(int i,String n,int a){  
		    id = i;  
		    name = n;  
		    age=a;  
		    }  
		    void display(){System.out.println(id+" "+name+" "+age);}  

	
	public static void main(String[] args) {
		        ex14 s1 = new ex14(111,"Kirubu");  
			    ex14 s2 = new ex14(222,"Ashwini",25);  
			    s1.display();  
			    s2.display();  


	}

}


public class clonning {

		int rollno;  
		String name;  
		  
		clonning(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
		}  
		  
		public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  

	public static void main(String[] args) {
			try{  
				clonning s1=new clonning(101,"amit");  
				  
				clonning s2=(clonning)s1.clone();  
				  
				System.out.println(s1.rollno+" "+s1.name);  
				System.out.println(s2.rollno+" "+s2.name);  
				  
				}catch(CloneNotSupportedException c){}  
				  


	}

}

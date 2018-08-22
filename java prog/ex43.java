
public class ex43 {

		 void eat(){System.out.println("animal is eating...");}  
		}  
		  
		class Dog1 extends ex43{  
		 void eat(){System.out.println("dog is eating...");}  
	  
		 public static void main(String args[]){  
		  ex43 a=new Dog1();  
		  a.eat();  
		

	}

}

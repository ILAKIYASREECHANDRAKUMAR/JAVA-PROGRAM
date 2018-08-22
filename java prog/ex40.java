
public class ex40 {
		int getRateOfInterest(){return 0;}  
		}  
	  
		class SBI extends ex40{  
		int getRateOfInterest(){return 8;}  
		}  
		  
	class ICICI extends ex40{  
		int getRateOfInterest(){return 7;}  
		}  
	class AXIS extends ex40{  
		int getRateOfInterest(){return 9;}  
		}  
		  
		class Test3{  


	
	public static void main(String[] args) {
			ex40 b1=new SBI();  
			ex40 b2=new ICICI();  
			ex40 b3=new AXIS();  
			System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
			System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());  
			System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());  

		

	}

}

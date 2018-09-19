import java.util.regex.*;  
public class ex97 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
		System.out.println(Pattern.matches("[a-zA-Z09]{6}", "kkvarun32")); 
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));  

	}

}

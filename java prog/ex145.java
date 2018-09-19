		import java.io.*;  
	import java.util.zip.*;  

public class ex145 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{  
				FileInputStream fin=new FileInputStream("Deflater.java");  
				  
				FileOutputStream fout=new FileOutputStream("def.txt");  
				DeflaterOutputStream out=new DeflaterOutputStream(fout);  
				  
				int i;  
				while((i=fin.read())!=-1){  
				out.write((byte)i);  
				out.flush();  
				}  
				  
				fin.close();  
				out.close();  
				  
				}catch(Exception e){System.out.println(e);}  
				System.out.println("rest of the code");  

	}

}

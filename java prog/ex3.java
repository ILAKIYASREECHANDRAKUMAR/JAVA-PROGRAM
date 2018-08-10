
public class ex3 {

	int rollno;
	String name;
	void insertrecord(int r,String n){
		rollno=r;
		name=n;
	}
	void displayinformation(){
		System.out.println(rollno+""+name);
	}
	public static void main(String[] args) {
		ex3 s1=new ex3();
		ex3 s2=new ex3();
		s1.insertrecord(111,"ilakiya");
		s2.insertrecord(112,"kirubu");
		s1.displayinformation();
		s2.displayinformation();

	}

}

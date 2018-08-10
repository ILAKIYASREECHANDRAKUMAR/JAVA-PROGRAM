
public class ex8 {
	void sum(int x,int y){
		System.out.println(x+y);
	}
	void sum(double x,double y,double z)
	{
		System.out.println(x+y+z);
	}

		public static void main(String[] args) {
			ex8 s=new ex8();
			s.sum(150,250);
			s.sum(67.56,76.23,20.5);


	}

}

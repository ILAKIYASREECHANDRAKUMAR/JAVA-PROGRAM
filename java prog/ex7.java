
public class ex7 {
void sum(int x,int y){
	System.out.println(x+y);
}
void sum(int x,int y,int z)
{
	System.out.println(x+y+z);
}
	public static void main(String[] args) {
		ex7 s=new ex7();
		s.sum(15,25);
		s.sum(67,76,78);

	}

}


public class ex5 {
void fact(int n){
	int fact=1;
	for(int i=1;i<n;i++)
	{
		fact=fact*i;
	}
	System.out.println("the factorial is:"+fact);
}
	public static void main(String[] args) {
		new ex5().fact(10);//calling method with anonymous object

	}

}

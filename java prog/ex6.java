
public class ex6 {
int length;
int width;
void insert(int l,int w)
{
	length=l;
	width=w;
}
void area()
{
	System.out.println(length*width);
}

	public static void main(String[] args) {
	ex6 r1 = new ex6(),r2=new ex6();//creating two objects
	r1.insert(30,45);
	r2.insert(30, 20);
	r1.area();
	r2.area();

	}

}


public class ex4 {
int length;
int width;
void insert(int l,int w){
	length=l;
	width=w;
}
void calculatearea()
{
	System.out.println(length*width);
}
	public static void main(String[] args) {
	ex4 r1=new ex4();
	ex4 r2=new ex4();
r1.insert(15, 20);
r2.insert(25, 38);
r1.calculatearea();
r2.calculatearea();
	}

}

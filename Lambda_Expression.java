package Java_coding_Assignment;

public class Lambda_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int width=10;
		   Drawable d2=()->{
			   System.out.println("Drawing"+width);
			   
		   };
		   d2.draw();

	}

}
interface Drawable
{
	public void draw();
}

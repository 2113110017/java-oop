package example04;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();
		Triangle trgl=new Triangle();
		rect.setValuas(4, 5);
		trgl.setValuas(4, 5);
		System.out.println("rect a:{0} "+ rect.area());
		System.out.println("trgl b:{0} "+ trgl.area());

	}

}

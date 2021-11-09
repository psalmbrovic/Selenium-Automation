package Exercise2;


public class calling {
	public static void main(String[] args) {
		Square s = new Square();
		int r1 = s.square(2);
		int r2 = s.square(5);
		s.sum(r1, r2);
	}

}

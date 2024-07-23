package interfaces;

public class AreaImp implements Area {

	@Override
	public void areaRect(double length, double breadth) {
		
		System.out.println("Area of Rectangle : "+ length * breadth);
		
	}

	@Override
	public void areaSqure(double side) {
		
		System.out.println("Area of Squre : "+ side * side);
		
	}

	@Override
	public void areaTrangle(double breadth, double height) {
		
		System.out.println("Area of trangle : "+ 0.5 * breadth * height);
		
	}

	@Override
	public void areaCircle(double redious) {
		
		System.out.println("Area of Circle : "+ pie * redious * redious);
		
	}

}

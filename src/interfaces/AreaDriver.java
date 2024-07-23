package interfaces;

public class AreaDriver {

	public static void main(String[] args) {
		
		Area a1 = new AreaImp();
		a1.areaRect(10, 15);
		a1.areaSqure(25);
		a1.areaCircle(10);
		a1.areaTrangle(15, 25);
	}
}

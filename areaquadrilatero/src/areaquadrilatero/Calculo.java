package areaquadrilatero;

public class Calculo {


		
		public static void calcula(double lado1) {
			double areaQuadrado=lado1*lado1;
			System.out.println("�rea do quadrado � "+areaQuadrado);
		}


		public static void calcula(double lado1,double lado2) {
			double areaRetangulo=lado1*lado2;
			System.out.println("�rea do ret�ngulo � "+areaRetangulo);
		}
		
		public static void calcula(double baseMaior,double baseMenor,double altura) {
			double areaTrapezio=(baseMaior+baseMenor)*altura/2;
			System.out.println("�rea do trap�zio � "+areaTrapezio);
		}
}

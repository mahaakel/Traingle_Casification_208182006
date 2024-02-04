package Traingle_Casification_class_1.Traingle_Casification_class_1;


/**
 * Hello world!
 *
 */

enum Triangle_Types {
	  equilateral,
	  isosceles,
	  Scalene,
	  Nottriangle,
      ERROR
    
	} 

class TriangleClassifier {
	
	private static Triangle_Types triangle;
	
	public static void classifyTriangle(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			triangle = Triangle_Types.ERROR;
		} else if (isEquilateral(a, b, c)) {
			triangle = Triangle_Types.equilateral;
		} else if (isIsosceles(a, b, c)) {
			triangle = Triangle_Types.isosceles;
		} else if (!isTriangle(a, b, c)) {
			triangle = Triangle_Types.Nottriangle;
		} else {
			triangle = Triangle_Types.Scalene;
		}

	}

	private static boolean isTriangle(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a;
	}

	private static boolean isIsosceles(int a, int b, int c) {
		return isTriangle(a, b, c) && ((a == b) || (b == c) || (c == a));
	}    
	    	


	private static boolean isEquilateral(int a, int b, int c) {
		return isTriangle(a, b, c) && a == b && b == c && a == c;
	}
	   
	    
	public static Triangle_Types get_type() {
		return triangle;
	}
}

package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  // Test for Equilateral triangle
	public void equilateralTriangle(){
        int a = 10;
        int b = 10;
        int c = 10;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	//// Test  for scalene  Triangle 
	@Test
	public void scaleneTriangle(){
        int a = 3;
        int b = 4;
        int c = 5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());    
    }
	
	
	
	
	/// Test for isoScales Triangle
	@Test
	public void isoScalesTriangle() {
		int a = 5;
		int b = 5;
		int c = 3;
		triangle.classifyTriangle(a, b, c);
		String expected =Triangle_Types.isosceles.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
		
			
	}
	
	
	
	
	/// Test for false data (not a triangle)
	@Test
	public void notTraingle() {
		int a = 1 ;
		int b = 2 ;
		int c = 8;
		triangle.classifyTriangle(a, b, c);
		String expected =Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	
	
	
	
	// Test for an error input 
	@Test 
	public void input_IsError() {
		int a = -3;
		int b = -1;
		int c = 6;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.ERROR.toString();
		String result =  triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	
	
	
	
	
	

}  
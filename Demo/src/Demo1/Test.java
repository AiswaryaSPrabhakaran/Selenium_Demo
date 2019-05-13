package Demo1;

import java.util.ArrayList;


			
					    	    		public static void main(String[] args) {
					    	    			 class Rectangle {
					    	    				 double width;
					    	    				 double height;

					    	    				 Rectangle() {
					    	    				  width = 10;
					    	    				  height = 10;
					    	    				 }

					    	    				 double area() {
					    	    				  return width * height;
					    	    				 }
					    	    				}

					    	    				public class Test {
					    	    				 public static void main(String args[]) {
					    	    				  Rectangle mybox1 = new Rectangle();
					    	    				  double area;
					    	    				  area = mybox1.area();
					    	    				  System.out.println("Area is " + area);

					    	    				 }
					    	    				}}

/*public class Test
{
 private char var;
 public static void  main(String[] args)
 {
  char var1 = 'a';
  char var2 = var1;
  var2 = 'e';

  Test obj1 = new Test();
  Test obj2 = obj1;
  obj1.var = 'i';
  obj2.var = 'o';

  System.out.println(var1 + " , " + var2);
  System.out.println(obj1.var + " , " + obj2.var);
 }
}*/

					    	    	
					    
					    
					    
					    	


				
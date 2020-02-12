import java.util.Scanner;
public class spherevolume {

	public static void main(String[] args) {
		  //Scanner object
	       Scanner scanner=new Scanner(System.in);
	       //Declare double variables diameter and volume
	       double diameter;
	       double volume;
	       //intialize the double variable PI with 3.14
	       final double PI=3.14;
	       System.out.println("CALCULATION OF VOLUME OF SPHERE");
	      
	       System.out.println("Enter diameter of sphere : ");
	       //read diamter of the sphere
	       diameter=scanner.nextDouble();
	      
	       //calculate the radius of the sphere
	       double radius=diameter/2;
	      
	       //find the volume of the sphere
	       volume=(4/3.0)*PI*radius*radius*radius;
	       //print the volume of the sphere
	       System.out.println("Volume of the sphere : "+volume);
	      
	   }//end of the main


	}



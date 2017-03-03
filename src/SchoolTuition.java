/* Sasha Jones
 * CISC 181 - Prof. Bert Gibbons
 * Quiz 2: School Tuition Calculator
 *
*/
import java.util.Scanner;

public class SchoolTuition {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		double initialTuition= 0, perIncrease = 0, totalTuition = 0, amount =0;
		String dash = "___________________";
		
		
		System.out.println("What is the initial tution? " );
		initialTuition = input.nextDouble();
		
		System.out.println("What is the percentage increase for each year ? ");
		perIncrease = input.nextDouble();
				
		
		 for(int x = 1; x <= 4; x++) {
	         amount = initialTuition * Math.pow(1+ (perIncrease / 100), x);
	         System.out.printf("Year " + x + ": %,.2f \n" , amount);
	         totalTuition += amount;
	         if(x>1 && x<4) {
	         System.out.printf("Tuition from start to now: $%,.2f \n",totalTuition);
	         }
	         System.out.println(dash);

	      }
		System.out.printf("The total cost of tuition for 4 years\n"
				+ "at the University of Delaware is: $%,.2f \n",totalTuition);

		input.close();
	}
	

}

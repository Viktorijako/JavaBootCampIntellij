/**
 * 
 */
package activity;

/**
 * @viktorijako
 *
 */
public class NumToWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
				
		int i = 5;
		String numText = "";

		switch(i) {
		
		case 1:
			numText = "Value of x is ONE";break;
		case 2:
			numText = "Value of x is TWO";break;
		case 3:
			numText = "Value of x is THREE";break;
		case 4:
			numText = "Value of x is FOUR";break;
		case 5:
			numText = "Value of x is FIVE";break;
			// complete the code.


			default:
			numText = "NUMBER " + i;
			break;

		}
		
		System.out.println(numText);
		
	
	}
	

}

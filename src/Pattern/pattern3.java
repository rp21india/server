package Pattern;
import java.util.*;
public class pattern3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter numner ");
	int n=sc.nextInt();
	char ch='*';
	for(int i=n;i>=0;i--) {
		for(int j=i;j>=0;j--) {
			System.out.print(ch+ "");
		}
		System.out.println();
	}
}
}
/*
enter numner 
5
******
*****
****
***
**
*

*/


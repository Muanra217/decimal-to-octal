//Muhamad Dian Rahendra 1910512071

package konversibiloktal;
import java.util.Scanner;
public class konversibiloktal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Decimal to octal conversion program");
	        Scanner msk =new Scanner(System.in);
	        System.out.print("Input decimal value :");
	        int bil = msk.nextInt();
	        stack bn=new stack(10);
	        int n=bil;
	        while (bil>0){
	            n=bil%8;
	          bn.push(n);
	            bil=bil/8;
	           
	        }
	        System.out.print("Octal value : ");
	        while(!bn.isEmpty()){          
	        long nilai = bn.pop();
	        System.out.print(nilai);
	        System.out.print(" ");
	       
	    }
	       
	    System.out.println(" ");


	       
	}

}

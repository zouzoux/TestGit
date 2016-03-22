
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(8);
	}
	public static void printSquares(int n){
		   int t=n;
	        if(n<=0){
	        	return;
	        }
	         if(n%2==1)
	        {
	            System.out.print(n*n+" ");
	            printSquares(--n);
	        }
	        else
	        {
	        	printSquares(--n);
	            System.out.print(t*t+" ");
	        }

	    }

	}



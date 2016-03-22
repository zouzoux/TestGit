
public class Exercise1 {

	public static void main(String[] args) {
		
	System.out.println(counter1(0100101));

	}
	//Method that use recursion to count the 1s in a binary number
	public static int counter1(int n){
		int counter;
		if(n==0){
			counter = 0;
			return counter;
		}else if (n==1){
			counter =1;
			return counter;
		}else{
			if(n%2!=0){
				counter =counter1((n-1)/2) +1;
				return counter;
			}else{
				counter = counter1(n/2);
				return counter;
			}
		}
	}

}


public class CalcEven {

	public static void main(String[] args) {
		System.out.println(multiplyEven(-4));

	}
	public static int multiplyEven(int n){
		int counter = 0;
		int result =1;
		if(n<=0){
			throw new IllegalArgumentException();
		}else{
		for(int i=2;counter<n;i= i+2){
			result = result * i;
		
			counter++;
		}
		return result;
		}
	}

}

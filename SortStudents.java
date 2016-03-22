import java.util.Scanner;
import java.io.*;
public class SortStudents {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		  File file = new File("/Users/zouz/Downloads/HW6/student.dat");

		 Scanner  getData = new Scanner(file);
		  while(getData.hasNext()){
			  for(int i=0;i<5;i++){
				  String firstName = getData.next();
				  String lastName = getData.next();
				  int id = Integer.parseInt(getData.next());
				  int grade = Integer.parseInt(getData.next());
				  String letterGrade = getData.next();
			  }
			  Student "student"+i = new Student();
		  }
	}

}

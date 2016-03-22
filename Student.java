
public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int grade;
	private String letterGrade;
	
	public Student(String firstName,String lastName,int id,int grade,String letterGrade){
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.grade = grade;
		this.letterGrade = letterGrade;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public int getId(){
		return this.id;
	}
	
	public int getGrade(){
		return this.grade;
	}
}

package week3.day1.org.student;

public class Students {

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(123);
		stud.getStudentInfo(123, "Aruna");
		stud.getStudentInfo("abc.com", 98435677);

	}
	
	public void getStudentInfo(int id) {
		System.out.println("Id" +id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Id"+id);
		System.out.println(name);
	}
	
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println(email);
		System.out.println("number" +phoneNumber);
	}

}

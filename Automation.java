package week3.day1.assignments;

public class Automation implements Language,TestTool{

	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.language();
		auto.testTool();
	}
	
	public void java()		
	{
		System.out.println("Language - JAVA");
	}
	
	public void selenium()	
	{
		System.out.println("Testing Tool - Selenium");
		
	}
	public void language() {
	
		System.out.println(name);
		
		
		this.java();
	}
	
	public void testTool() {
		System.out.println(name1);
		
		
	}
	
	

	
	

}

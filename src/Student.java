
public class Student {
	
		private String name;
		private int age;
		private char gender;
		private String module;
		
	public Student(String name, int age, char gender, String module){
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.module = module;
		}
	public void displayStudentDetails() {
		System.out.println("Name: " + name + " Age: " + age + " Gender: " + gender + " Module: " + module);
	}
		
}


 

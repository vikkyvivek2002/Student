class Student {

	int rollno ;
	String name ;
	
	Student(int rollnum, String sname)
	{
		rollno = rollnum;
		name = sname;
	}
	
	public void printStudent()
	{
		System.out.println(rollno);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student(11, "sai");
		obj.printStudent();

	}

}

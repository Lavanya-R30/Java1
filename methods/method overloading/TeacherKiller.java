class TeacherKiller{
	public static void main(String[] values){
		System.out.println("invoking main in Teacher Killer");
		Teacher teacher=new Teacher();
		System.out.println(teacher.name);
		System.out.println(teacher.subject);
		System.out.println(teacher.age);
		System.out.println(teacher.experience);
		System.out.println(teacher.salary);
		System.out.println("****************************8");
		Teacher teacher1=new Teacher();
		teacher1.name="Dharani";
		teacher1.subject="Science";
		teacher1.age=40;
	    teacher1.experience=18;
		teacher1.salary=22000;
		System.out.println( teacher1.name);
		System.out.println(teacher1.subject);
		System.out.println(teacher1.age);
		System.out.println(teacher1.experience);
		System.out.println(teacher1.salary);
		
	}
}
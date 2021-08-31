import java.util.Scanner;
public class main1{

	public static void main(String[] args) {
		System.out.println("welcome to the app");
Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit app");
			System.out.println();
	int c=sc.nextInt();
	if(c==1) {
		//add student
		System.out.println("enter student name:");
		String a=sc.next();
		System.out.println("enter student phone number:");
		String b=sc.next();
		System.out.println("enter student city:");
		String d=sc.next();
	Student st=new Student(a,b,d);
	System.out.println(st);
	boolean answer=StudentDao.insert(st);

	if (answer) {
		System.out.println("student is added successfully");
	}
	else {
		System.out.println("something went wrong try again");
	}
	}
	else if(c==2) {
		//delete student
		System.out.println("enter student id to delete");
		int userid =sc.nextInt();
	boolean answer=	StudentDao.delete(userid);
	if(answer) {
		System.out.println("student is deleted successfull");
	}
	else {
		System.out.println("something went wrong");
	}
	}
	else if(c==3) {
		//display student
		StudentDao.showstudent();
	}
	else if(c==4) {
		break;
	}
		}
		System.out.println("thanx for using this app");
	}

}

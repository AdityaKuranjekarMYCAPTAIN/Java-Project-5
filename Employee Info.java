
//Employee.java-->

public class Employee{
	 String Name;
	 int Year;
	 String Address;
}



//PrintingInformation.java-->

public class PrintingInformation {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.Name = "Robert";
		emp1.Year = 1994;
		emp1.Address = "64C-WallsStreet";
		emp2.Name = "Sam";
		emp2.Year = 2000;
		emp2.Address = "68D-WallsStreet";
		emp3.Name = "John";
		emp3.Year = 1999;
		emp3.Address = "26B-WallsStreet";
		System.out.println("Name\tYear of Joining\t\tAddress");
		System.out.println(emp1.Name+"\t\t"+emp1.Year+"\t\t"+emp1.Address);
		System.out.println(emp2.Name+"\t\t"+emp2.Year+"\t\t"+emp2.Address);
		System.out.println(emp3.Name+"\t\t"+emp3.Year+"\t\t"+emp3.Address);

	}

}


//By Aditya Kuranjekar------------->>>>>>>>>HAPPY CODING<<<<<<<<<<<<--------

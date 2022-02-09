package infosys.demo.settersgetters;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Rohit");
		emp.setDesignation("Manager");
		emp.setGraduate(true);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getDesignation());
		System.out.println(emp.isGraduate());
		if(emp.isGraduate()) // if(emp.isGraduate()==true)
		{
			System.out.println("Graduate");
		}
		else
		{
			System.out.println("Not a Graduate");
		}

	}

}

package infosys.demo.constructordemo2;
 
    public class EmployeeMain{
     public static void main(String args[]){
     Employee emp=new Employee(); // constructor call is implicit  
     System.out.println(emp.getId());  // other methods are explicitly called
     System.out.println(emp.getName());
     Employee emp1=new Employee(); 
     emp1.setId(111);
     System.out.println(emp1.getId());  // other methods are explicitly called
     System.out.println(emp1.getName());
    }
   }
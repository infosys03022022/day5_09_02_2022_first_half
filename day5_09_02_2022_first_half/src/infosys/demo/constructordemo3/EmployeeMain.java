package infosys.demo.constructordemo3;
 
    public class EmployeeMain{
     public static void main(String args[]){
     Employee emp=new Employee(1,"Infosys"); // constructor call is implicit  
     System.out.println(emp.getId());  // other methods are explicitly called
     System.out.println(emp.getName());
       Employee emp2=new Employee(2,"Xyz"); // constructor call is implicit  
     System.out.println(emp2.getId());  // other methods are explicitly called
     System.out.println(emp2.getName());
     // System.out.println(emp.id);
     }
   }
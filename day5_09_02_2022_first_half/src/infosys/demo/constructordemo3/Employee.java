package infosys.demo.constructordemo3;
 
  public class Employee{
    private int id;
    private String name;

    public Employee(int i, String n){
      id=i;
      name=n;
     }
    public void setId(int i){
     id=i;
    }

    public int getId(){
     return id;
    }

    public void setName(String nm){
     name=nm;
    }
    public String getName(){
    return name;
     }   

  }
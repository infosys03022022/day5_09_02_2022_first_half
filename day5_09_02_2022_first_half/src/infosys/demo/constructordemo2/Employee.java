package infosys.demo.constructordemo2;
 
  public class Employee{
    private int id;
    private String name;

    public Employee(){
      id=1;
      name="Infosys";
     }
    public void setId(int id){
     this.id=id;
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

package infosys.demo.settersgetters;

public class Employee {
   private int id;
   private String name;
   private String designation;
   private boolean graduate;
   // To have setter and getter from IDE
   // 1) Right click on the editor
   // 2) Select source
   // 3) Select setters and getters

   public void setId(int id) {
		this.id = id;
	}  
   
   public int getId() {
	return id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public boolean isGraduate() {
	return graduate;
}
public void setGraduate(boolean graduate) {
	this.graduate = graduate;
}
   
}

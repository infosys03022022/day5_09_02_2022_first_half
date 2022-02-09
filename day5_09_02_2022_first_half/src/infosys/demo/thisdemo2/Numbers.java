package infosys.demo.thisdemo2;

public class Numbers {
private int num1;
private int num2;
private int result;
// this keyword represents the current object
// The lines here are saying
// this.num1=num1;
// The current object which is having num1 as a member
// variable/instance variable should get the 
// value from the parameter.
public  Numbers(int num1, int num2, int result)
{
	//The num1 which is in the LHS is the instance num1
	// The num1 which is in the RHS is the parameter num1
	
	this.num1=num1;
	this.num2=num2;
	this.result=result;
}

public void display()
{
	System.out.println(num1+"\n"+num2+"\n"+result);
}
}

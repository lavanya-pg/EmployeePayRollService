package employeepayrollservice;

public class EmployeePayRollData 
{
	public int id;
	public String name;
	public double salary;
	
	public EmployeePayRollData(Integer id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "id = "+id+", Name = "+name+", salary = "+salary;
	}
		
}
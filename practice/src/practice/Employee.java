package practice;

/*
 * @author Abdsaleh
 */
class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
			
	}
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return day + "/" + month + "/" + year;
	}
}


public class Employee 
{
	private  String empName;
	private int empId;
	private float empSalary;
	private Date empBod;
	
	public Employee()
	{
		
	}
	
	public Employee(String empName, int empId, float empSalary,Date empBod)
	{
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empBod = empBod;
	}

	public void setEmpBod(Date empBod) {
		this.empBod = empBod;
	}

	public Date getEmpBod() {
		return empBod;
	}
	
	public String getEmpName()
	{
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee{" + "empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + ", empBod=" + empBod + '}';
	}


	
	
}

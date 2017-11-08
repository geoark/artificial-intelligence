public class departments
{
	private String department;
	private String codeOfDepartment;
	
	public departments(String department,String codeOfDepartment)
	{
		this.department=department;
		this.codeOfDepartment=codeOfDepartment;
    }
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
    public String getDepartment() {
        return department;
    } 
	
	public void setCodeOfDepartment(String codeOfDepartment) {
		this.codeOfDepartment = codeOfDepartment;
	}
	
    public String getCodeOfDepartment() {
        return codeOfDepartment;
    } 
	
	
}
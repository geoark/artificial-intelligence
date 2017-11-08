public class courses
{
	private String codeOfLesson;
	private String nameOfLesson;
	private String nameOfProfessor;
	private String department;
	private String semester;
	private String capacity;
	
	public courses(String codeOfLesson,String nameOfLesson,String nameOfProfessor,String department,String semester,String capacity)
	{
		this.codeOfLesson=codeOfLesson;
		this.nameOfLesson=nameOfLesson;
		this.nameOfProfessor=nameOfProfessor;
		this.department=department;
		this.semester=semester;
		this.capacity=capacity;
    }
	
	public void setCodeOfLesson(String codeOfLesson) {
		this.codeOfLesson = codeOfLesson;
	}
	
    public String getCodeOfLesson() {
        return codeOfLesson;
    } 
	
	public void setNameOfLesson(String nameOfLesson) {
		this.nameOfLesson = nameOfLesson;
	}
	
    public String getNameOfLesson() {
        return nameOfLesson;
    }

	public void setNameOfProfessor(String nameOfProfessor) {
		this.nameOfProfessor = nameOfProfessor;
	}
	
    public String getNameOfProfessor() {
        return nameOfProfessor;
    }
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
    public String getDepartment() {
        return department;
    }
	
	public void setSemester(String semester) {
		this.semester = semester;
	}
	
    public String getSemester() {
        return semester;
    }
	
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
    public String getCapacity() {
        return capacity;
    }
}
public class instructors
{
	private String codeOfProfessor;
	private String nameOfProfessor;
	private String notAvailableDay;
	
	public instructors(String codeOfProfessor,String nameOfProfessor,String notAvailableDay)
	{
		this.codeOfProfessor=codeOfProfessor;
		this.nameOfProfessor=nameOfProfessor;
		this.notAvailableDay=notAvailableDay;
    }
	
	public void setCodeOfProfessor(String codeOfProfessor) {
		this.codeOfProfessor = codeOfProfessor;
	}
	
    public String getCodeOfProfessor() {
        return codeOfProfessor;
    } 
	
	public void setNameOfProfessor(String nameOfProfessor) {
		this.nameOfProfessor = nameOfProfessor;
	}
	
    public String getNameOfProfessor() {
        return nameOfProfessor;
    }

	public void setNotAvailableDay(String notAvailableDay) {
		this.notAvailableDay = notAvailableDay;
	}
	
    public String getNotAvailableDay() {
        return notAvailableDay;
    }
}	
public class slots
{
	private String days;
	private String valid;
	private String id;
	
	
	
	public slots(String id,String days,String valid)
	{
		this.days=days;
		this.valid=valid;
		this.id=id;
		
		
    }
	
	public void setDays(String days) {
		this.days = days;
		
	}
	
    public String getDays() {
        return days;
    } 
	
	public void setId(String id) {
		this.id = id;
		
	}
	
    public String getId() {
        return id;
    } 
	
	public void setValid(String valid) {
		this.valid = valid;
		
	}
	
    public String getValid() {
        return valid;
    } 
	
	
}
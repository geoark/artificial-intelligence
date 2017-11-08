public class rooms
{
	private String codeOfRooms;
	private String nameOfRooms;
	private String capacity;
	
	public rooms(String codeOfRooms,String nameOfRooms,String capacity)
	{
		this.codeOfRooms=codeOfRooms;
		this.nameOfRooms=nameOfRooms;
		this.capacity=capacity;
    }
	
	public void setCodeOfRooms(String codeOfRooms) {
		this.codeOfRooms = codeOfRooms;
	}
	
    public String getCodeOfRooms() {
        return codeOfRooms;
    } 
	
	public void setNameOfRooms(String nameOfRooms) {
		this.nameOfRooms = nameOfRooms;
	}
	
    public String getNameOfRooms() {
        return nameOfRooms;
    }

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
    public String getCapacity() {
        return capacity;
    }
	
	
}
import java.io.*;
import java.util.*;

public class ReadFiles 
{
	public static void main(String[] args) 
	{
		ArrayList<slots> slot = new ArrayList<slots>();
		slot=readingSlots(slot);
		
		ArrayList<departments> depa = new ArrayList<departments>();
		depa=readingDepartments(depa);
		
		ArrayList<rooms> room = new ArrayList<rooms>();
		room=readingRooms(room);
		
		ArrayList<instructors> instructor = new ArrayList<instructors>();
		instructor=readingInstructors(instructor);
	
		ArrayList<courses> course = new ArrayList<courses>();
		course=readingCourses(course);

	}	
	public static String readingFile(String fileName)
	{	
		String current="";
		try
		{
			//Create object of FileReader
			FileReader inputFile = new FileReader(fileName);

			//Instantiate the BufferedReader Class
			BufferedReader bufferReader = new BufferedReader(inputFile);
			//return bufferReader;
			String line;
			while ((line = bufferReader.readLine()) != null)
			{
				current += line + "\n";
				
			}
			//Close the buffer reader
			bufferReader.close();
		}
		catch
		(Exception e)
		{
			System.out.println("Error while reading file line by line:" + e.getMessage());
				
		}
		return current;
	}
	
	
	public static ArrayList<slots> readingSlots(ArrayList<slots> slot)
	{
		String fileName = "slots.txt";
		String line;
		
		line=readingFile(fileName);
		BufferedReader reader = new BufferedReader(new StringReader(line));
		
		try
		{
			
			while ((line =  reader.readLine()) != null)   
			
			
			{
				StringTokenizer st = new StringTokenizer(line);
				String current = st.nextToken();
				int a=current.indexOf('[');
				int b=current.indexOf(']');
				String Id = current.substring(a+1, b);
					
					
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String days=current.substring(a+1, b);
					
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String valid=current.substring(a+1, b);
					
				slots s = new slots(Id,days,valid);
				slot.add(s);
				
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}
		return slot;
	}
	public static ArrayList<departments> readingDepartments(ArrayList<departments> depa)
	{
		String fileName = "departments.txt";
		String line;
		
		line=readingFile(fileName);
		BufferedReader reader = new BufferedReader(new StringReader(line));
		
		try
		{
			
			while ((line =  reader.readLine()) != null)   
			
			
			{
				StringTokenizer st = new StringTokenizer(line);
				String current = st.nextToken();
				int a=current.indexOf('[');
				int b=current.indexOf(']');
				String department = current.substring(a+1, b);
					
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String codeOfDepartment=current.substring(a+1, b);
					
				departments d = new departments(department,codeOfDepartment);
				depa.add(d);
				
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}
		return depa;
	}
	
	
	
	public static ArrayList<rooms> readingRooms(ArrayList<rooms> room)
	{
		String fileName = "rooms.txt";
		String line;
		
		line=readingFile(fileName);
		BufferedReader reader = new BufferedReader(new StringReader(line));
		
		try
		{
			
			while ((line =  reader.readLine()) != null)   
			
			
			{
				StringTokenizer st = new StringTokenizer(line);
				String current = st.nextToken();
				int a=current.indexOf('[');
				int b=current.indexOf(']');
				String codeOfRooms = current.substring(a+1, b);
					
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String nameOfRooms=current.substring(a+1, b);
				
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String capacity=current.substring(a+1, b);
					
				rooms r = new rooms(codeOfRooms,nameOfRooms,capacity);
				room.add(r);;
				
				
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}
		return room;
	}
	
	public static ArrayList<instructors> readingInstructors(ArrayList<instructors> instructor)
	{
		String fileName = "instructors.txt";
		String line;
		
		line=readingFile(fileName);
		BufferedReader reader = new BufferedReader(new StringReader(line));
		
		try
		{
			
			while ((line =  reader.readLine()) != null)   
			
			
			{
				StringTokenizer st = new StringTokenizer(line);
				String current = st.nextToken();
				int a=current.indexOf('[');
				int b=current.indexOf(']');
				String codeOfProfessor = current.substring(a+1, b);
					
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String nameOfProfessor=current.substring(a+1, b);
				
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String notAvailableDay=current.substring(a+1, b);
					
				instructors i = new instructors(codeOfProfessor,nameOfProfessor,notAvailableDay);
				instructor.add(i);
				
				
				
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}
		return instructor;
	}
	
	public static ArrayList<courses> readingCourses(ArrayList<courses> course)
	{
		String fileName = "courses.txt";
		String line;
		
		line=readingFile(fileName);
		BufferedReader reader = new BufferedReader(new StringReader(line));
		
		try
		{
			
			while ((line =  reader.readLine()) != null)   
			
			
			{
				StringTokenizer st = new StringTokenizer(line);
				String current = st.nextToken();
				int a=current.indexOf('[');
				int b=current.indexOf(']');
				String codeOfLesson = current.substring(a+1, b);
					
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String nameOfLesson=current.substring(a+1, b);
				
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String nameOfProfessor=current.substring(a+1, b);
				
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String department=current.substring(a+1, b);
				
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String semester=current.substring(a+1, b);
				
				a=current.indexOf('[',a+1);
				b=current.indexOf(']',b+1);
				String capacity =current.substring(a+1, b);
					
				courses c = new courses(codeOfLesson,nameOfLesson,nameOfProfessor,department,semester,capacity);
				course.add(c);
			}
			reader.close();
		}
		catch (Exception e)
		{
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}
		return course;
	}
}
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Main extends ReadFiles
{
	public static void main(String[] args)
	{
		ArrayList <slots> slot = new ArrayList<slots>();
		slot=readingSlots(slot);
		
		ArrayList<courses> course = new ArrayList<courses>();
		course=readingCourses(course);
		
		ArrayList<rooms> room = new ArrayList<rooms>();
		room=readingRooms(room);
		
		String[][] math1 = new String[7][9];
		
		math1[0][0]=course.get(0).getNameOfLesson();
		math1[0][3]=course.get(1).getNameOfLesson();
		math1[0][7]=course.get(2).getNameOfLesson();
		math1[1][1]=course.get(4).getNameOfLesson();
		math1[1][8]=course.get(3).getNameOfLesson();
		math1[2][4]=course.get(5).getNameOfLesson();
		math1[2][8]=course.get(14).getNameOfLesson();
		math1[3][0]=course.get(6).getNameOfLesson();
		math1[3][3]=course.get(9).getNameOfLesson();
		math1[3][5]=course.get(8).getNameOfLesson();
		math1[3][7]=course.get(7).getNameOfLesson();
		math1[4][1]=course.get(12).getNameOfLesson();
		math1[4][2]=course.get(10).getNameOfLesson();
		math1[4][4]=course.get(13).getNameOfLesson();
		math1[4][6]=course.get(11).getNameOfLesson();
		
		Genetic g = new Genetic();
		Chromosome x = g.geneticAlgorithm(10, 0.03, 8, 100,math1);
		x.print(slot,course,room);
	}

}

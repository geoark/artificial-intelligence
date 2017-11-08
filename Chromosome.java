import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Chromosome extends ReadFiles implements Comparable<Chromosome>{
    //Table that holds the chromosome itself
    
	private String [][] genes;
    //Integer that holds the fitness score of the chromosome
	private int fitness;
	public static void main(String[] args) {
		ArrayList <slots> slot = new ArrayList<slots>();
		slot=readingSlots(slot);
		
		ArrayList<instructors> instructor = new ArrayList<instructors>();
		instructor=readingInstructors(instructor);
		
		ArrayList<courses> course = new ArrayList<courses>();
		course=readingCourses(course);
		
		ArrayList<rooms> room = new ArrayList<rooms>();
		room=readingRooms(room);
		
		ArrayList<departments> depa = new ArrayList<departments>();
		depa=readingDepartments(depa);
		
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
		
		String[][] math2 = new String[7][9];
		
		math2[0][2]=course.get(0).getNameOfLesson();
		math2[0][5]=course.get(1).getNameOfLesson();
		math2[0][6]=course.get(2).getNameOfLesson();
		math2[0][8]=course.get(7).getNameOfLesson();
		math2[1][0]=course.get(4).getNameOfLesson();
		math2[1][4]=course.get(8).getNameOfLesson();
		math2[1][6]=course.get(3).getNameOfLesson();
		math2[2][1]=course.get(12).getNameOfLesson();
		math2[2][3]=course.get(5).getNameOfLesson();
		math2[2][7]=course.get(14).getNameOfLesson();
		math2[3][1]=course.get(6).getNameOfLesson();
		math2[3][4]=course.get(9).getNameOfLesson();
		math2[4][0]=course.get(10).getNameOfLesson();
		math2[4][3]=course.get(13).getNameOfLesson();
		math2[4][8]=course.get(11).getNameOfLesson();
		
		String[][] math3 = new String[7][9];
		
		math3[0][0]=course.get(6).getNameOfLesson();
		math3[0][5]=course.get(13).getNameOfLesson();
		math3[0][7]=course.get(11).getNameOfLesson();
		math3[1][3]=course.get(9).getNameOfLesson();
		math3[1][8]=course.get(7).getNameOfLesson();
		math3[2][0]=course.get(0).getNameOfLesson();
		math3[2][2]=course.get(10).getNameOfLesson();
		math3[2][4]=course.get(5).getNameOfLesson();
		math3[2][6]=course.get(2).getNameOfLesson();
		math3[3][3]=course.get(1).getNameOfLesson();
		math3[3][5]=course.get(8).getNameOfLesson();
		math3[3][8]=course.get(3).getNameOfLesson();
		math3[4][0]=course.get(12).getNameOfLesson();
		math3[4][2]=course.get(4).getNameOfLesson();
		math3[4][7]=course.get(14).getNameOfLesson();
		
		String[][] math4 = new String[7][9];
		
		math4[0][2]=course.get(10).getNameOfLesson();
		math4[0][4]=course.get(9).getNameOfLesson();
		math4[0][8]=course.get(11).getNameOfLesson();
		math4[1][1]=course.get(6).getNameOfLesson();
		math4[1][5]=course.get(13).getNameOfLesson();
		math4[1][6]=course.get(7).getNameOfLesson();
		math4[2][2]=course.get(0).getNameOfLesson();
		math4[2][3]=course.get(5).getNameOfLesson();
		math4[2][7]=course.get(14).getNameOfLesson();
		math4[3][0]=course.get(4).getNameOfLesson();
		math4[3][1]=course.get(12).getNameOfLesson();
		math4[3][4]=course.get(1).getNameOfLesson();
		math4[4][3]=course.get(8).getNameOfLesson();
		math4[4][7]=course.get(2).getNameOfLesson();
		math4[4][8]=course.get(3).getNameOfLesson();
	}

 //Constructs a randomly created chromosome
	public Chromosome(String[][] math1){
		this.genes = new String[15][1];
		int k = 0;
		
		for(int i=0; i<7; i++){
			for(int j=0; j<9; j++){
				if(math1[i][j] != null){
				    this.genes[k][0] = math1[i][j];
				    k += 1;
				}
			}
		}
		this.calculateFitness();
	}

    //Constructs a copy of a chromosome
	public Chromosome(String [][] genes,String[][] math1){
		this.genes = new String[15][1];
		for(int k=0; k<this.genes.length; k++){
			
				this.genes[k][0] = genes[k][0];
				k += 1;
			
		}
		this.calculateFitness();
	}
	
	public String[][] getGenes(){
		return this.genes;
	}
	
	public int getFitness(){
		return this.fitness;
	}
	
	public void setGenes(String[][] genes){
		for(int i=0; i<this.genes.length; i++){
			this.genes[i][0] = genes[i][0];
		}
	}
	
	public void setFitness(int fitness){
		this.fitness = fitness;
	}

    
	public void calculateFitness(){
		ArrayList<instructors> instructor = new ArrayList<instructors>();
		instructor=readingInstructors(instructor);
		
		ArrayList<courses> course = new ArrayList<courses>();
		course=readingCourses(course);
		
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
		
		//to skor pou tha auxanetai an isxuei o periorismos
		int non_threats = 0;
		//to mathima pou pairnoume apo ton pinaka genes[i]
		String mathima;
		String kathigitis;
		String dayOff;
		for(int i=0; i<15; i++){
			mathima =this.genes[i][0];
			//paw ston arraylist course ton trexw oloklhro kai an vrw to mathima pou exw apothikeusei sth metavlhth iso tote
			//paw kai briskw ton kathigiti pou kanei to mathima sthn arraylist course kai to apothikeuw sthn metavlhth kathigitis
			//paw twra sthn arraylist instructor thn trexw kai vlepw an uparxei o kathigitiw pou exw apothikeusei sthn metavlhth kathighths
			//an uparxei phgainw kai apothikeuw thn mera pou den einai diathesimos se mia metavlhth dayOff.
			//paw kai trexw twra tiw sthles thw array pou exw ftiaxei me onoma math1
			//an h dayOff einai h deytera kai to mathima m brisketai sth thesi math[1][m]
			//tote paw kai auxanw to skor kata ena kai vgainw teleiws apo thn if
			//restriction 4
			for(int j=0; j<15; j++){	
				if(course.get(j).getNameOfLesson().equals(mathima)){
					kathigitis = course.get(j).getNameOfProfessor();
					for(int k=0; k<5; k++){
						if(instructor.get(k).getNameOfProfessor().equals(kathigitis)){
							dayOff= instructor.get(k).getNotAvailableDay();
							for (int m=0; m<9; m++){
								for(int l=0; l<7; l++){
								    if(math1[l][m] != null){
								            if((dayOff.equals("Monday"))&& (mathima.equals(math1[0][m]))){
									            non_threats++;
								            }
								            else if((dayOff.equals("Tuesday")) && (mathima.equals(math1[1][m]))){
									            non_threats++;
								            }
								            else if((dayOff.equals("Wednesday")) &&(mathima.equals(math1[2][m]))){
								               	non_threats++;
								            }
								            else if((dayOff.equals("Thursday")) && (mathima.equals(math1[3][m]))){
									            non_threats++;
								            }
								            else if((dayOff.equals("Friday")) && (mathima.equals(math1[4][m]))){
								              	non_threats++;
								            }
									}
								}
							}
						}
					}
				}
			}
		
			//restriction 3
			String xwros;
			for(int j=0; j<15; j++){
				if (course.get(j).getNameOfLesson().equals(mathima)){
					xwros= course.get(j).getCapacity();
					for(int n=0; n<7; n++){
						for(int m=0; m<9; m++){
							if(math1[n][m] != null){
						        if (xwros.equals("SMALL") && ((!mathima.equals(math1[n][0]))|| (!mathima.equals(math1[n][1])) || (!mathima.equals(math1[n][2])))){
							        non_threats++;
						        }
						        else if (xwros.equals("MEDIUM") && ((!mathima.equals(math1[n][3]))|| (!mathima.equals(math1[n][4])) || (!mathima.equals(math1[n][5])))){
							        non_threats++;
						        }
					         	else if (xwros.equals("LARGE") && ((!mathima.equals(math1[n][6]))|| (!mathima.equals(math1[n][7])) || (!mathima.equals(math1[n][8])))){
							        non_threats++;
						        }
							}
						}
					}
				}
			}
		}
		
		String mathima1="";
		String mathima2="";
		String tmima1 = "";
		String tmima2="";
		String examino1="";
		String examino2="";
		for(int i=0; i<15;i++){
			for(int j=i+1; j<15;j++){
				mathima1=this.genes[i][0];
				mathima2=this.genes[j][0];
				
				for(int k=0; k<course.size();k++){
					if (course.get(k).getNameOfLesson().equals(mathima1)){
						tmima1= course.get(k).getDepartment();
						examino1=course.get(k).getSemester();
					}
					if(course.get(k).getNameOfLesson().equals(mathima2)){
						tmima2=course.get(k).getDepartment();
						examino2=course.get(k).getSemester();
					}
				}
				//restrictions 1+2
				for (int n=0; n<7; n++){
					for (int m=0; m<9; m++){
						if(math1[n][m] != null && mathima1 != null && mathima2 != null ){
						    if (mathima1.equals(math1[n][m]) && mathima2.equals(math1[n][m])){
						     	non_threats++;
						    }
						
					     	if (mathima1.equals(math1[n][m]) && mathima2.equals(math1[n][m])&& tmima1.equals(tmima2) && examino1.equals(examino2)){
						     	non_threats++;
						    }
						}
					}
				}
				//restrictions 6+8
				for(int n=0;n<9;n++){
					for(int m=0;m<9;m++){
						for(int x=0; x<7; x++){
							if(math1[0][n] != null && math1[1][n]!= null && math1[2][n]!= null && math1[3][n]!= null && math1[4][n]!= null){
						        if (mathima1.equals(math1[0][n]) && mathima2.equals(math1[1][m]) && tmima1.equals(tmima2) && examino1.equals(examino2)){
							        non_threats++;
						        }
						        else if (mathima1.equals(math1[1][n]) && mathima2.equals(math1[2][m]) && tmima1.equals(tmima2) && examino1.equals(examino2)){
							        non_threats++;
						        }
					         	else if (mathima1.equals(math1[2][n]) && mathima2.equals(math1[3][m]) && tmima1.equals(tmima2) && examino1.equals(examino2)){
							        non_threats++;
						        }
						        else if (mathima1.equals(math1[3][n]) && mathima2.equals(math1[4][m]) && tmima1.equals(tmima2) && examino1.equals(examino2)){
							       non_threats++;
						        }
						
						
						        if (mathima1.equals(math1[0][n]) && mathima2.equals(math1[1][m]) && tmima1.equals(tmima2)){
							       non_threats++;
						        }
						        else if (mathima1.equals(math1[1][n]) && mathima2.equals(math1[2][m]) && tmima1.equals(tmima2)){
						         	non_threats++;
						        }
						        else if (mathima1.equals(math1[2][n]) && mathima2.equals(math1[3][m]) && tmima1.equals(tmima2)){
							       non_threats++;
						        }
						        else if (mathima1.equals(math1[3][n]) && mathima2.equals(math1[4][m]) && tmima1.equals(tmima2)){
							        non_threats++;
						        }
							}
						}
					}
				}
				//restrictions 5+7
			    for (int n=0; n<9; n++)
				{
					for(int m=0; m<9; m++){
						for(int x=0; x<7; x++){
						    if(math1[x][m] != null && mathima1 != null && mathima2 != null){    
								if ((mathima1.equals(math1[0][n])) && (mathima2.equals(math1[0][m])) && (tmima1.equals(tmima2)) && (examino1.equals(examino2)))
						        {
							        non_threats++;
						        }
						        else if ((mathima1.equals(math1[1][n])) && (mathima2.equals(math1)) && (tmima1.equals(tmima2)) && (examino1.equals(examino2)))
						        {
							       non_threats++;
						        }
						        else if ((mathima1.equals(math1[2][n])) && (mathima2.equals(math1[2][m])) && (tmima1.equals(tmima2)) && (examino1.equals(examino2)))
						        {
							        non_threats++;
						        }
						        else if ((mathima1.equals(math1[3][n])) && (mathima2.equals(math1)) && (tmima1.equals(tmima2)) && (examino1.equals(examino2)))
						        {
							          non_threats++;
						        }
						        else if ((mathima1.equals(math1[4][n])) && (mathima2.equals(math1)) && (tmima1.equals(tmima2)) && (examino1.equals(examino2)))
						        {
							        non_threats++;
						        }
						
						        if ((mathima1.equals(math1[0][n])) && (mathima2.equals(math1[0][m])) && (tmima1.equals(tmima2)))
						        {
							       non_threats++;
						        }
						        else if ((mathima1.equals(math1[1][n])) && (mathima2.equals(math1[1][m])) && (tmima1.equals(tmima2)))
						        {
							        non_threats++;
						        }
						        else if ((mathima1.equals(math1[2][n])) && (mathima2.equals(math1)) && (tmima1.equals(tmima2)))
						        {
							        non_threats++;
						        }
						        else if ((mathima1.equals(math1[3][n])) && (mathima2.equals(math1[3][m])) && (tmima1.equals(tmima2)))
						        {
						         	non_threats++;
						        }
					        	else if ((mathima1.equals(math1)) && (mathima2.equals(math1[4][m])) && (tmima1.equals(tmima2)))
						        {
							       non_threats++;
						        }
						    }
						}
					}
				}
			}
		}
		this.fitness = non_threats;
	}

    //Mutate 
	public void mutate(){
		Random r = new Random();
		int s = Integer.parseInt(this.genes[r.nextInt(15)][0]);
		s = r.nextInt(15);
		this.calculateFitness();
	}
	

	
    public static void print(ArrayList <slots> slot,ArrayList<courses> course,ArrayList <rooms> room){
	 
	    
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
		
	    try{
		    
            File file = new File("schedule.txt");//output txt
			file.createNewFile();
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter out = new BufferedWriter(fw);
		

 
			String [][] sch = new String[8][10];
			for(int j=0; j<8; j++){
				for(int i=0; i<10; i++){
					if(i==0 && j != 0){
						sch[j][i]="";
					    sch[j][i]+=slot.get(j-1).getDays()+"";
						
			            
					}else if(j==0 &&  i!= 0){
						if(i>=1 && i<=3){
							if(i==1){
								sch[j][i]="";
						        sch[j][j]+="09:00-12:00,"+room.get(0).getNameOfRooms();
							}else if(i==2){
								sch[j][i]="";
						        sch[j][i]+="12:00-15:00,"+room.get(0).getNameOfRooms();
							}else{
								sch[j][i]="";
						        sch[j][i]+="15:00-18:00,"+room.get(0).getNameOfRooms();
							}
						}
						if(i>=4 && i<=6){
							if(i==4){
								sch[j][i]="";
						        sch[j][i]+="09:00-12:00,"+room.get(1).getNameOfRooms();
							}else if(i==5){
								sch[j][i]="";
						        sch[j][i]+="12:00-15:00,"+room.get(1).getNameOfRooms();
							}else{
								sch[j][i]="";
						        sch[j][i]+="15:00-18:00,"+room.get(1).getNameOfRooms();
							}
						}
						if(i>=7 && i<=9){
							if(i==7){
								sch[j][i]="";
						        sch[j][i]+="09:00-12:00,"+room.get(2).getNameOfRooms();
							}else if(i==8){
								sch[j][i]="";
						        sch[j][i]+="12:00-15:00,"+room.get(2).getNameOfRooms();
							}else{
								sch[j][i]="";
						        sch[j][i]+="15:00-18:00,"+room.get(2).getNameOfRooms();
							}
						
						}
					}else if(j != 0 && i != 0){
						if(math1[j-1][i-1] != null){
						    sch[j][i]=math1[j-1][i-1];
						}else{
							sch[j][i]="           ";
						}
					}
					if(i==0 && j==0){
						sch[j][i]="          ";
					}
					
				}
			}
			
            StringWriter sw = null;
		    sw = new StringWriter();
			StringBuffer sb=sw.getBuffer();
           
           
			for(int i=0; i<8; i++){
				String l ="";
			    for(int j=0; j<10; j++){
				    l+=sch[i][j] +" |";
				   
			    }
				out = new BufferedWriter(sw);
				out.write(l);
				out.newLine();
				String p="-------------------------------------------------------------------------------------------------------------------------------------------------------";
				out.write(p);
				out.newLine();
				out.flush();
				
				sb = sw.getBuffer();
				 
		    }
		
            writeToFile("schedule.txt",sb);
			System.out.println(sb);
			
 
		    out.close();
	    }
        catch ( IOException e){
			System.out.println("Error!"+e.getMessage());
        }
      
        	  
	}
	 public static void writeToFile(String pFilename, StringBuffer pData) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(pFilename));
        out.write(pData.toString());
        out.flush();
        out.close();
    }
      	  
	
	
	
    @Override
	public boolean equals(Object obj){
		for(int i=0; i<this.genes.length; i++){
			if(this.genes[i][0] != ((Chromosome)obj).genes[i][0]){
					return false;
			}
		}
		return true;
	}

	//The compareTo function has been overriden so sorting can be done according to fitness scores
	@Override
	public int compareTo(Chromosome x){
		return this.fitness - x.fitness;
	}
}
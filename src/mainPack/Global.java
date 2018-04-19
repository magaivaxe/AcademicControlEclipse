package mainPack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Global 
{
	static final int MAX_LENGHT = 50;
	static final double W_MISESSION = .30;
	static final double W_PROJET = .30;
	static final double W_EXAMEFINAL = .40;
	
	static String currentfname =  "";
	static boolean notSaved = false;
	
	static class Student
	{
		String id,prenom,nom,status;
		double miSession,projet,examenFinal,moyenne;
	}
	
	static class InputStudent
	{
		String id,prenom,nom;
		double miSession,projet,examenFinal,moyenne;
	}
	
	static void calcAvgSt(int i) 
	{
		studentList.get(i).moyenne = W_MISESSION * studentList.get(i).miSession +
									W_PROJET * studentList.get(i).projet + 
									W_EXAMEFINAL * studentList.get(i).examenFinal;
		
		if (studentList.get(i).moyenne >= 60.0) {studentList.get(i).status = "approuvé";}
		else {studentList.get(i).status = "échec";}
	}
	
	static ArrayList<Student> studentList = new ArrayList<Student>(MAX_LENGHT);
	static int actual_lenght = 0;
	
	static ArrayList<Student> searchResult = new ArrayList<Student>(MAX_LENGHT);
	static int actual_search_lenght = 0;
	
	static void myReadFile (String fname) throws IOException
	{
		BufferedReader myFile = new BufferedReader(new FileReader(fname));
		actual_lenght = 0;
		String v = myFile.readLine();
		//Loop to assign values
		while(v != null && actual_lenght < MAX_LENGHT)
		{
			//Set data on the list
			String [] w = v.split(" ");
			studentList.set(actual_lenght, new Student());
			//Get values
			studentList.get(actual_lenght).id = w[0];
			studentList.get(actual_lenght).prenom = w[1];
			studentList.get(actual_lenght).nom = w[2];
			studentList.get(actual_lenght).miSession = stringToNonNegDouble(w[3]);
			studentList.get(actual_lenght).projet = stringToNonNegDouble(w[4]);
			studentList.get(actual_lenght).examenFinal = stringToNonNegDouble(w[5]);
			studentList.get(actual_lenght).moyenne = stringToNonNegDouble(w[6]);
			studentList.get(actual_lenght).status = w[7];
			//incrementing and read lines
			actual_lenght++;
			v = myFile.readLine();
		}
		//Close the file
		myFile.close();
		currentfname = fname;
		notSaved = false;
	}
	
	/**
	 * 
	 * @param str String to return as double
	 * @return
	 */
	private static double stringToNonNegDouble(String str) 
	{
		//Try to convert the string to double
		try{
			double toReturn = Double.parseDouble(str);
			return toReturn;
		}
		catch(Exception e){
			return -1;
		}
		
	}
}































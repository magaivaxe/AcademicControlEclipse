package mainPack;

import java.util.ArrayList;

public class Global 
{
	static final int MAX_LENGHT = 50;
	static final double W_MISESSION = .30;
	static final double W_PROJET = .30;
	static final double W_EXAMEFINAL = .40;
	
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
		
		if (studentList.get(i).moyenne >= 60.0) 
		{
			studentList.get(i).status = "approuvé";
		}
		else 
		{
			studentList.get(i).status = "échec";
		}
	}
	
	
	static ArrayList<Student> studentList = new ArrayList<Student>(MAX_LENGHT);
	static int actual_lenght = 0;
	
	static ArrayList<Student> searchResult = new ArrayList<Student>(MAX_LENGHT);
	static int actual_search_lenght = 0;
}

package sample_ins;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class testIns {

	
	


	public static void main(String... args)
	{
		
		String filename="src/inputfile.txt";
		List<Pojo> list= read_file(filename);
		
		int num;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your choice, 1. Find expired policy details, 2. Find Policy cost per vendor");
		num=scanner.nextInt();
		switch(num)
		{
			
			case 1:
		for(Pojo i : list)
		{
			Date currentDate = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
				Date s;
				try {
					s = sdf.parse(i.getDate_of_expiry());
				
			//System.out.println(doeF);
				if(s.getTime() >= currentDate.getTime()){
					//System.out.println("This policy no"+ " "+ i.getPolicy_no() +" "+ "is still valid");
				}else
				{
				     
				   throw new Invalid(); 
				}
			
				} catch (ParseException | Invalid e) {
					// TODO Auto-generated catch block
					System.out.println("The policy No"+" "+ i.getPolicy_no()+ " " +"is expired with expiration date of"+" "+ i.getDate_of_expiry());
				}
			
		}
		
		break;
		
		case 2:
				
		for(Pojo j : list)
		{
			j.setPolicy_no(j.getPolicy_no().substring(0, 2));
		}
		Map<String, Integer> sum = list.stream().collect(
		        Collectors.groupingBy(Pojo::getPolicy_no, Collectors.summingInt(Pojo::getCost_of_policy)));
		System.out.println(sum);
		
		//Pojo o= new Pojo();
		//i.setPolicy_no(i.getPolicy_no().substring(0,2));
		
		 break;
		
		default:
        	System.out.println("Invalid Option");
        break;
	}
		
		
	} 
		
	public static List<Pojo> read_file(String a)
	{List<Pojo> lPojo =new ArrayList<>();
		try
		{
			
			
			BufferedReader br = new BufferedReader (new FileReader(a));
			
			String line;
			line=br.readLine();
			while(line!=null)
			{
				String[] attr = line.split(" ");
				Pojo obj = new Pojo(attr[0],Integer.parseInt(attr[1]),attr[2],attr[3],attr[4],attr[5]);
				lPojo.add(obj);
				line=br.readLine();
				
			}
			br.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	
		return lPojo;
		
	}
}
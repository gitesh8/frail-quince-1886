package com.HodUseCase;

import java.util.Scanner;

import com.dao.HodDao;
import com.dao.HodDaoImpl;
import com.exceptions.HodException;

public class AssignProblemToEng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Engineer id");
		int e = ip.nextInt();
		
		System.out.println("Enter Complain id");
		int c = ip.nextInt();
		
		HodDao hd = new HodDaoImpl();
		
		try {
			System.out.println(hd.assignProblemToEng(e, c)+"\n");
			Menu.main(args);
		} catch (HodException e1) {
			// TODO Auto-generated catch block
			System.out.println("\n"+e1.getMessage()+" Try Again"+"\n");
		}
		
		ip.close();
	}

}

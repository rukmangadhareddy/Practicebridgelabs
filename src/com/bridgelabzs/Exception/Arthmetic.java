package com.bridgelabzs.Exception;

import java.io.File;
import java.io.IOException;

public class Arthmetic {
	
public static void main(String[] args) throws IOException {
	File file = new File("C:\\New folder\\resume.txt ");
	System.out.println(file.createNewFile());
	if (file.exists()){
		file.delete();
//	else (file.createNewFile(file))
//	return ;
	
//	System.out.println(file.delete());
	System.out.println(file.toString());         
	
	
	
	
	
	
	
	
//	File file = new File("./sample.txt");
//	if(file.exists());
//	files.createNewFile();
	
}
}
}

	
//	FileReader fr = new FileReader(file);
	
//	
//	System.out.println("code is excuted");
//	int fNumber = 9;
//	int sNumber =0;
//	int result=0  ;
//		try {
//		result= fNumber/sNumber;
//	}
//	catch(ArithmeticException ae) {
//		
//		System.out.println(ae.toString());
//		
//		}
////		catch(Exception out of bound) {
////			System.out.println("");
////	}
//		finally {
//			System.out.println("finally block"); 
//		}
//	System.out.println("outputis:"+result);
//}
//}

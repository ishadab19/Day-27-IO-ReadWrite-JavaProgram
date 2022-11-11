package com.io.java;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.List;
import static java.nio.file.StandardWatchEventKinds.*;

public class EmployeePayrollService {
	
	
	public void listFilesDirectory() throws IOException, InterruptedException  {
		ArrayList<String> writing = new ArrayList<String>();
			
			writing.add("Id : 01");
			writing.add("Name : Shadab");
			writing.add("Salary : 100000");
//		File Exist => Override                        
				// Will create new file if not exist                  
				Files.write(Paths.get("C:\\Users\\mesha\\OneDrive\\Desktop\\DataBase\\Day-27-IO_ReadWrite_JavaProgram\\src\\com\\io\\java\\TestDemo.txt"), writing, StandardOpenOption.CREATE);
	System.out.println("Exporting Into File Is Done...");
	}
public static void main(String[] args) throws IOException, InterruptedException {
	EmployeePayrollService obj=new EmployeePayrollService();
	obj.listFilesDirectory();
}
}
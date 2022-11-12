package examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStmtDemo {

	public static void main(String[] args) {
		String Query ="Select * from  bankAccount where bankName =?";

		Scanner scObj = new Scanner(System.in);
		System.out.println("please enter name of accountHolderName");
		String userInput =scObj.nextLine();
		scObj.close();

		Query = Query.concat(userInput);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver ");
			
		Connection conObj=DriverManager.getConnection("jdbc:mysql://localhost : 3306 / fs4-connection","root","Password1!");

PreparedStatement pStmtObj = conObj.prepareStatement(Query);
pStmtObj.setString(1, userInput);
 ResultSet rsObj = pStmtObj.executeQuery();
		
		
		 while(rsObj.next());{
				System.out.println(rsObj.getInt("accountNumber")+" "+rsObj.getString("accountHolderName")+" "+rsObj.getInt("bankName")+" "+
			rsObj.getInt("branchName"));
			}
		 
		 rsObj.close();
		 pStmtObj.close();
		 conObj.close();
		 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

		}

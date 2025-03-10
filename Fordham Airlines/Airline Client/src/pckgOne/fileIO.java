// Class: 	fileIO.java - part of Airline Client
// Description: This class simply updates the transaction log 

package pckgOne;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fileIO 
{
		public void wrTransactionData(String dataStr)
		{
	        FileWriter fwg = null;
	        try 
	        {
	        	// open the file in append write mode
	        	fwg = new FileWriter("transactionLog.txt", true);
	        }
	        catch (IOException e)
	        {
	        	e.printStackTrace();
	        }
	   	    
	        BufferedWriter bwg = new BufferedWriter(fwg);
	        PrintWriter outg   = new PrintWriter(bwg);
			
	        String timeStamp = new SimpleDateFormat("MM-dd-yyyy HH.mm.ss").format(new Date());
	        
	        outg.println(timeStamp + " : " + "\r\n" + dataStr);
	        
	        outg.close();
		}
}

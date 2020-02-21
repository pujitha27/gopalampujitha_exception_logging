package task_4_b;
import java.lang.System;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

 public class Interest
	{
		public static final Logger LOGGER=LogManager.getLogger(Interest.class);
	public static void main(String args[])
	{
	   double principal;
	   int period,choice;
	   float rateOfInterest;
	   Scanner sc=new Scanner(System.in);
	   LOGGER.info("Calculation of interest\n-------------------------");
	   LOGGER.info("Enter the principal amount:");
	   principal=sc.nextDouble();
	   LOGGER.info("Enter the period(in years):");
	   period=sc.nextInt();
	   LOGGER.info("Enter the rate of interest:");
	   rateOfInterest=sc.nextFloat();
	   Calculation cal=new Calculation();
	   while(true)
	   {
		   LOGGER.info("What should I calculate for the above information:\n1.Simple interest\n2.Compound Interest");
	   	choice=sc.nextInt();
	  	 if(choice==1)
	   	 {
	  		LOGGER.info("Simple Interest:"+cal.calculateSimpleInterest(principal,period,rateOfInterest));
	     	  break;
	   	 }
	  	 else if(choice==2)
	    	{
	  		LOGGER.info("Compound Interest:"+cal.calculateCompoundInterest(principal,period,rateOfInterest));
	    	 break;
	    	}
	  	 else
	  		LOGGER.info("Enter a valid option");
	   }
	   sc.close();
	}
	}


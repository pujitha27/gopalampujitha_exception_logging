package task_4_a;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateEstimate {
	public static final Logger LOGGER=LogManager.getLogger(CalculateEstimate.class);
	public static void main(String args[])
	  {
	     int material_choice,automation_choice=2;
	     double area;
	     Scanner sc=new Scanner(System.in);
	     LOGGER.info("Estimation of construction cost of a house:\n---------------------------------------");
	     LOGGER.info("Enter the area of the plot:");
	     area=sc.nextDouble();
	     LOGGER.info("Enter the material choice:\n1.Standard Materials\n2.Above Standard Materials\n3.High Standard Materials");
	     material_choice=sc.nextInt();
	     while(true)
	     {
	       if(material_choice>3 || material_choice<0)
	    	   LOGGER.info("Enter a valid option");
	       else if(material_choice==3)
	         {

	           while(true)
	          {
	        	   LOGGER.info("Do you want a fully automated house?\n1.Yes\n2.No");
	           automation_choice=sc.nextInt();
	           
	           if(automation_choice!=1 && automation_choice!=2)
	             {
	        	   LOGGER.info("Enter a valid option");
	               
	             }
	           else break;
	          }
	          break;
	         }
	       else break;
	 
	     }
	     ConstructionCost c=new ConstructionCost(); 
	     LOGGER.info("Estimated construction cost of house: "+c.estimateConstructionCost(material_choice,area,automation_choice));
         sc.close();
	  }
}

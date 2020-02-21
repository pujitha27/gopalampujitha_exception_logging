package task_4_a;

public class ConstructionCost {
	int standard_materials=1200,above_standard_materials=1500;
	  int high_standard_materials=1800;
	  int high_standard_fully_automated=2500;
	  public double estimateConstructionCost(int material_choice,double area,int automation_choice)
	  {
	    double construction_cost=0;
	    if(material_choice==1)
	        construction_cost=area*standard_materials;
	    else if(material_choice==2)
	        construction_cost=area*above_standard_materials;
	    else 
	    {
	        if(material_choice==3 && automation_choice==2)
	        {
	            construction_cost=area*high_standard_materials;
	        }
	        else if(material_choice==3 && automation_choice==1)
	        {
	            construction_cost=area*high_standard_fully_automated;
	        }
	    }
	    return construction_cost;
	     
	    
	  }
}

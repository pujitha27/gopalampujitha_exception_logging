package task_4_b;

public class Calculation
{
  public double calculateSimpleInterest(double principal,int period,float rateOfInterest)
  {
    return (principal*period*rateOfInterest)/100;
  }
 public double calculateCompoundInterest(double principal,int period,float rateOfInterest)
  {
    double compoundAmount=principal*(Math.pow(1+(rateOfInterest/100),period));
    //System.console().writer().println(compoundAmount);
    return compoundAmount-principal;
  }

}

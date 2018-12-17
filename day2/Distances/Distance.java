
public class Distance {
	 int feet;
    double inches;
	public Distance(int feet, double inches)
	{
         this.feet = feet;
         this.inches = inches;
     }
	public Distance(){
		
	}
	void display(){
		System.out.println("feet:"+feet+"\t"+"inches:"+inches);
	}
	public static  Distance add(Distance object1,Distance object2)
	{
		 Distance result = new Distance();
		 result.feet = object1.feet + object2.feet;
		 result.inches = object1.inches + object2.inches;
		 result.feet = 0;
		 if(result.inches>=12.0)
		 {
			 result.inches -= 12.0;
			 result.feet++;
	     }
		 result.feet += object1.feet+object2.feet;
		 return result;
     }
}

	

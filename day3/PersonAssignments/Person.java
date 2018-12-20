import java.time.LocalDate;
import java.time.Period;
import java.util.Date;


public class Person {
	private String name;
	private Date dateOfBirth;
	private int day;
	private int month;
	private int year;
	private int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public Person(String name,int year,int month,int day)
	{
		this.name = name;
		this.day = year;
		this.month = month;
		this.year = day;
	}

	public  void display()
	{
		LocalDate DateOfBirth = LocalDate.of(1995,07,04);           

		LocalDate localdate = LocalDate.now();

		Period year1 =Period.between(DateOfBirth,localdate);              //for difference of dateOfBirth

	    String	 name = getName();

		String dateOfBirth = day+"/"+month+"/"+year;

		String age =  year1.getYears()+" Years "+year1.getMonths()+" Months "+year1.getDays()+" Days ";
		
	}
	
	public String olderOne(Person person , Person person1)
	{
		LocalDate personDateOfBirth = LocalDate.of(person.year,person.month,person.day);
		LocalDate person1DateBirth = LocalDate.of(person1.year,person1.month,person1.day);
		Period year1 =Period.between(personDateOfBirth,person1DateBirth);
		if(year1.getDays()>0 || year1.getMonths()>0 || year1.getYears()>0)                   //condition to compare days,months and year which above zero  for displaying separate person name details                     
		{
			return person.name+" is older than " +person1.name+" by "+year1.getYears()+" years ,"+year1.getMonths()+"months, and "+year1.getDays()+"days";
	    }
	   else
	   {
			return person1.name+" is older than " +person.name+" by "+year1.getYears()+" years ,"+year1.getMonths()+"months, and "+year1.getDays()+"days";
	   }

	}
}

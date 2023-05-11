package PracticeProject8;
       public class student 
		{  
		    String fname; 
		    String lname ; 
		    int age;
		    public student(String fname, String lname, int age ) 
		    { 
		        this.fname = fname; 
		        this.lname = lname; 
		        this.age = age; 
		       } 
		    public String getName() 
		    { 
		        return fname; 
		    } 
		    public String getLName() 
		    { 
		        return lname; 
		    } 
		    public int getAge() 
		    { 
		        return age; 
		    } 
		    
		    @Override
		    public String toString() 
		    { 
		        return("Hi my name is "+ this.getName()+ ".\nMy last name,age  are " + this.getLName()+","
		        		+ " " + this.getAge()+ " "+ "."); 
		    } 
		    
		    public static void main(String[] args) 
		    { 
		        student s = new student("Harsh","goerge", 25); 
		        System.out.println(s.toString()); 
		    } 
		}


	



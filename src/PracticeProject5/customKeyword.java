package PracticeProject5;

class CustomException extends Exception {
	   String msg;
	   CustomException(String str) {
	      msg = str;
	   }
	   public String toString() {
	      return ("Custom Exception Occurred : "+msg);
	   }
	}
	public class customKeyword {
	   public static void main(String args[]) {
	      try {
	         throw new CustomException("This is a custom message....");
	      } catch(CustomException e) {
	         System.out.println(e);
	      }
	   }
	}
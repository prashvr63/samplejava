
public class q7 {
	
	enum Day{
		SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6),SATURDAY(7);
		private int value;
		private Day(int value) {
			this.value=value;
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Day day:Day.values()) {
			//line1
			System.out.print(day.toString()+"-");
			/*
			 * System.out.println(day.getValue()+"-"); System.out.println(day.names()+"-");
			 * System.out.println(day.getName()+"-");
			 */
		}
	}

}

//what should be placed at line 1 to get output as follows
//SUNDAY-MONDAY-TUESDAY-WEDNESDAY-THURSDAY-FRIDAY-SATURDAY



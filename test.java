
public class test {
 public static void main (String[] args){
	 Time4WorkParser tester = new Time4WorkParser();
	 Command testCommand = tester.parse("add homework for CS2103. 101015 1600");
	 
	 System.out.println(testCommand.getCommand());
	 
	 Tasks holder = testCommand.getTask();
	 	 
	 System.out.println(holder.getDescription());
	 System.out.println(holder.getType());

	 
Command testCommand2 = tester.parse("add CS2103 meeting. 101015 1800 101015 2000");
	 
	 System.out.println(testCommand2.getCommand());
	 
	 Tasks holder2 = testCommand2.getTask();
	 	 
	 System.out.println(holder2.getDescription());
	 System.out.println(holder2.getType());
	 
Command testCommand3 = tester.parse("add eat medicine.");
	 
	 System.out.println(testCommand3.getCommand());
	 
	 Tasks holder3 = testCommand3.getTask();
	 	 
	 System.out.println(holder3.getDescription());
	 System.out.println(holder3.getType());
	 
	 Command testCommand4 = tester.parse("search fox");
	 
System.out.println(testCommand4.getCommand());
System.out.println(testCommand4.getSearchKeyword());
	 
Command testDelete = tester.parse("delete 4");
System.out.println(testDelete.getCommand());
System.out.println(testDelete.getIndexToBeDeleted());

Command testExit = tester.parse("exit");
System.out.println(testExit.getCommand());

Command testInvalid = tester.parse("hahaha idiots");
System.out.println(testInvalid.getCommand());


 }
}

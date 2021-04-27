
public class Q6 {
	public static void main(String[] args) {
		if(args.length==1 | args[1].equals("Test")) {
			System.out.println("test case");
		}else {
			System.out.println("production"+	args[0]);
		}
	}
}


// result when we execute command line invocation as Java Fork Java

//test case
//production java --->ans
//production
//Arrayindexoutofbound exception at run time
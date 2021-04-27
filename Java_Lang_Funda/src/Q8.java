import java.io.IOException;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoke" +jsp());
	}
	
	static String jsp() {
		try {
			throw new IOException();
		}catch(IOException e) {
			return "IO";
		}finally {
			System.out.println("before method return");
			return "Finish";
		}
	}

}

//Invoke IO

//Invoke IO
//Invoke Finish

//Invoke Finsh

//Compile time error as jsp method has not returned any value
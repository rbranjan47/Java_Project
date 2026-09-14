package Legacy.Java_Gromming;

public class extend_ThreadClass extends Thread{
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e) {
			System.out.println("Exception occured!");
		}
	}
	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++) {
			extend_ThreadClass obj = new extend_ThreadClass();
			obj.start();
		}
	}

}

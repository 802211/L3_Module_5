import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.fibo();
	}
	
	public void fibo() {
		String a = JOptionPane.showInputDialog("How many numbers do you want in the Fibonacci sequence?");
		int n = Integer.parseInt(a);
		int j = 0;
		System.out.println(j);
		for (int i = 0; i < n; i++) {
			System.out.println(j+1);
			j = j+1+j;
		
			System.out.println(j);
		}
	}
	
}

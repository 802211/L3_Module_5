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
		int k = 1;
		System.out.println(j);
		System.out.println(k);
		for (int i = 0; i < n; i++) {
			int x = j + k;
			System.out.println(x);
			j = k;
			k = x;
		}
	}

}

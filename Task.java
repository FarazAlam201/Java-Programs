package lab8;

// FARAZ ALAM (13948)

interface Callback {
void callback(int param);
}
class Client implements Callback {
// Implement Callback's interface
public void callback(int p) {
System.out.println("callback called with " + p);
	}
}
public class Task{
	public static void main(String []args ) {
		Client client = new Client();
		client.callback(5);
	}
}


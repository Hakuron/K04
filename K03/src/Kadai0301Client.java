import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Kadai0301Client {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try(Socket c_sock = new Socket("localhost",50001);
			InputStream is = c_sock.getInputStream();
			DataInputStream dis = new DataInputStream(is);
		    OutputStream os = c_sock.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
		  ){
			String res = dis.readUTF();
			System.out.println(res);
			Scanner sc = new Scanner(System.in);
			String studentNumber = sc.next();
			dos.writeUTF(studentNumber);
			res = dis.readUTF();
			System.out.println(res);
			String name = sc.next();
			dos.writeUTF(name);
			res = dis.readUTF();
			System.out.println(res);
		}catch(IOException e) {
			  e.getMessage();
		  }
	}

}

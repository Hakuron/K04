import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Kadai0301Server {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try(ServerSocket s_socket = new ServerSocket(50001);
		    Socket sock = s_socket.accept();
			OutputStream os =  sock.getOutputStream();
			DataOutputStream  dos = new DataOutputStream(os);
			InputStream is = sock.getInputStream();
			DataInputStream dis = new DataInputStream(is);){
			
			dos.writeUTF("Student Number -->");
			String studentNumber = dis.readUTF();
			dos.writeUTF("Name -->");
			String name = dis.readUTF();
			System.out.println("Student Number：" + studentNumber + "Name :"+name);
			dos.writeUTF("Thanks");
		}catch(IOException e) {
			e.getMessage();
		}
		
	}

}

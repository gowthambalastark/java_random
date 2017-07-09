import java.io.*;
import java.net.*;
class Server{
	public static void main(String[] args) throws Exception{
	ServerSocket server=new ServerSocket(7777); //create a server that listen on port no 7777
	Socket client=server.accept();
	while(true){
	PrintWriter out=new PrintWriter(client.getOutputStream(),true);
	BufferedReader bf=new BufferedReader(new InputStreamReader(client.getInputStream())); // get input from user
	String bb=bf.readLine();
	if(bb!=null){
		System.out.println("Received from user "+bb);
	}
	out.println("Hello From Server");
}
}
}
// conect to server using telnet => telnet localhost 7777
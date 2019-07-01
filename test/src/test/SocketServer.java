package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(2000);
		Socket accept = serverSocket.accept();

		BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
		PrintWriter pw = new PrintWriter(accept.getOutputStream(), true);
		String s = br.readLine();
		pw.println(s);

	}
}

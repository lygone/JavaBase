package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by panyi on 2018/3/15.
 */
public class Server {
    public static void main(String[] args) {
        BufferedReader br=null;
        PrintWriter pw=null;
        try{
            ServerSocket serverSocket=new ServerSocket(2000);
            Socket socket=serverSocket.accept();
            //获取输入流
            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //获取输入流
            pw=new PrintWriter(socket.getOutputStream(),true);
            String s=br.readLine();
            pw.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

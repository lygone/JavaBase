package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by panyi on 2018/3/15.
 */
public class Client {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            Socket socket = new Socket("localhost", 2000);
            //获取输入流与输出流
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println("Hello");
            String s = null;
            while (true) {
                s = br.readLine();
                if (s != null)
                    break;
            }
            System.out.println(s);
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
                pw.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
import java.io.IOException; 
import java.net.ServerSocket; 
import java.net.Socket; 
import java.util.Date;

/** 
 * * Java program to create a simple HTTP Server to demonstrate how to use 
 * * ServerSocket and Socket class.
 * */

public class SimpleServer {

    SimpleServer(){
        try {

            final ServerSocket server = new ServerSocket(8080,100);
            System.out.println("Listening for connection on port 8080 ...."); 
            while (true){ 
                Socket socket = server.accept();
                Date today = new Date(); 
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today; 
                socket.getOutputStream().write(httpResponse.getBytes("UTF-8")); 
            }  
        } catch( IOException exception){
                exception.printStackTrace();
        } finally {
            //close connection
        }
    }

    public static void main(String[] args) throws IOException { 
        
        
    } 
}

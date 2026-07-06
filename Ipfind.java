import java.net.*;
import java.util.Scanner;
public class Ipfind {
public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.print("Enter the website URL: ");
String host= s.nextLine();
try {
InetAddress inetAddress=InetAddress.getByName(host);
String ip=inetAddress.getHostAddress();
System.out.println("IP Address of " + host+" is: "+ ip);
} catch  (UnknownHostException e) {

System.out.println("Unable to resolve " + host);
}
s.close();
}
}










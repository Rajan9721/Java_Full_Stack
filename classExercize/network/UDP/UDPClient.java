package classExercize.network.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        String s = "india is a good country.";
        byte b[] = s.getBytes();
        DatagramPacket dp = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), 8);
        ds.send(dp);
    }
}

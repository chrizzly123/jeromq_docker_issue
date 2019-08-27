package dockerissue;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ.Socket;

public class Client {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("setting up");
    Thread.sleep(1000);

    ZContext context = new ZContext();
    Thread.sleep(1000);

    Socket sub = context.createSocket(SocketType.SUB);
    Thread.sleep(1000);

    System.out.println("connected: " + sub.connect("tcp://127.0.0.1:10000"));
    Thread.sleep(1000);

    System.out.println("subscribed: " + sub.subscribe("server"));
    Thread.sleep(1000);

    System.out.println("now trying to receive, which will throw the exception:");
    sub.recv();
  }
}




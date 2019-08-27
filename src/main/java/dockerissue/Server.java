package dockerissue;

import org.zeromq.SocketType;
import org.zeromq.ZContext;
import org.zeromq.ZMQ.Socket;

public class Server {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("setting up");
    Thread.sleep(1000);

    ZContext context = new ZContext();
    Thread.sleep(1000);

    Socket pub = context.createSocket(SocketType.PUB);
    Thread.sleep(1000);

    System.out.println("binding: " + pub.bind("tcp://127.0.0.1:10000"));
    Thread.sleep(1000);

    System.out.println("now ready...");
    Thread.currentThread().join(); //sleep
  }
}




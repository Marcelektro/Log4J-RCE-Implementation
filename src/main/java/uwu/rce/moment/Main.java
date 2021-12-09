package uwu.rce.moment;

import org.apache.logging.log4j.core.net.server.ObjectInputStreamLogEventBridge;
import org.apache.logging.log4j.core.net.server.TcpSocketServer;

import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * I DID NOT MAKE THIS
 *
 * https://github.com/pimps/CVE-2017-5645
 */

public class Main {

    public static void main(String[] args) {
        TcpSocketServer<ObjectInputStream> myServer = null;
        try {
            myServer = new TcpSocketServer<>(3710, new ObjectInputStreamLogEventBridge());
        } catch (IOException e) {
            e.printStackTrace();
        }
        myServer.run();
    }

}

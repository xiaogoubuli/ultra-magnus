package ws.server.jaxws;

import ws.server.jaxws.service.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * web service publish
 * http://localhost:8888/ws/jaxws/hello?wsdl
 * http://localhost:8888/ws/jaxws/hello?xsd=1
 *
 * @author xiaogoubuli
 */
public class JaxwsPublish {
    public static void main(String[] args) {
        String address = "http://localhost:8888/ws/jaxws/hello";
        Endpoint.publish(address, new HelloServiceImpl());
        System.out.println("web service published.");
    }
}

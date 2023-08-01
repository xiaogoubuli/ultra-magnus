package ws.client.cxf;

import ws.client.cxf.service.HelloServiceImpl;
import ws.client.cxf.service.HelloServiceImplService;

/**
 * wsdl2java -keep -encoding utf-8 -p ws.client.cxf.service -verbose http://localhost:8080/ws/cxf/hello?wsdl
 * wsdl2java -keep -encoding utf-8 -p ws.client.cxf.service -verbose ../resources/hello.wsdl
 *
 * @author xiaogoubuli
 */
public class CxfClient {
    public static void main(String[] args) {
        HelloServiceImplService service = new HelloServiceImplService();
        HelloServiceImpl serviceImpl = service.getHelloServiceImplPort();
        String message = serviceImpl.sayHello("Sun");
        System.out.println(message);
    }
}

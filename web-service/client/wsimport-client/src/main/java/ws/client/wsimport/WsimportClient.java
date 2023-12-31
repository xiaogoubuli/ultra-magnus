package ws.client.wsimport;

import ws.client.wsimport.service.HelloServiceImpl;
import ws.client.wsimport.service.HelloServiceImplService;

/**
 * wsimport -keep -encoding utf-8 -p ws.client.wsimport.service -verbose http://localhost:8888/ws/jaxws/hello\?wsdl
 *
 * wsimport -keep -encoding utf-8 -p ws.client.wsimport.service -verbose ../resources/hello.wsdl
 * 这种方式生成的java文件需要将里面的file:../resources/hello.wsdl替换为上面的http://localhost:8888/ws/jaxws/hello\?wsdl
 *
 * @author xiaogoubuli
 */
public class WsimportClient {
    public static void main(String[] args) {
        HelloServiceImplService service = new HelloServiceImplService();
        HelloServiceImpl serviceImpl = service.getHelloServiceImplPort();
        String message = serviceImpl.sayHello("Sun");
        System.out.println(message);
    }
}

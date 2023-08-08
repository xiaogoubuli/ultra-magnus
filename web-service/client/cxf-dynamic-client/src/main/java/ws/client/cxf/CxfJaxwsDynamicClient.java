package ws.client.cxf;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * @author xiaogoubuli
 */
public class CxfJaxwsDynamicClient {
    public static void main(String[] args) {
        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://localhost:8080/ws/cxf/hello?wsdl");
        try {
            Object[] objects = client.invoke("sayHello", "Sun");
            String message = (String) objects[0];
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package ws.server.cxf.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ws.server.cxf.service.HelloService;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

/**
 * @author xiaogoubuli
 */
@Configuration
public class CxfConfig {
    @Resource
    private Bus bus;
    @Resource
    private HelloService helloService;

    /**
     * 发布web service
     * http://localhost:8080/ws/cxf/hello?wsdl
     *
     * @return 端点
     */
    @Bean
    public Endpoint helloServer() {
        EndpointImpl endpoint = new EndpointImpl(bus, helloService);
        endpoint.publish("/hello");
        return endpoint;
    }
}

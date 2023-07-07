package ws.server.cxf.service.impl;

import org.springframework.stereotype.Service;
import ws.server.cxf.service.HelloService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author xiaogoubuli
 */
@Service
@WebService
public class HelloServiceImpl implements HelloService {
    @WebMethod
    @WebResult(name = "resultName")
    @Override
    public String sayHello(@WebParam(name = "name") String name) {
        return "Hello: " + name;
    }
}

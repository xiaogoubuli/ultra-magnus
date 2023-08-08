package ws.client.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.4
 * 2023-11-16T17:57:06.438+08:00
 * Generated source version: 3.5.4
 *
 */
@WebService(targetNamespace = "http://impl.service.cxf.server.ws/", name = "HelloServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloServiceImpl {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://impl.service.cxf.server.ws/", className = "ws.client.cxf.service.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://impl.service.cxf.server.ws/", className = "ws.client.cxf.service.SayHelloResponse")
    @WebResult(name = "resultName", targetNamespace = "")
    public java.lang.String sayHello(

        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );
}

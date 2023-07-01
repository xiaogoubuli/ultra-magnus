package ws.server.jaxws.service;

/**
 * @author xiaogoubuli
 */
public interface HelloService {
    /**
     * 说欢迎
     *
     * @param name 姓名
     * @return 欢迎语
     */
    String sayHello(String name);
}

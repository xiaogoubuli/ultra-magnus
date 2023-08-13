package ws.server.cxf.auto;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author xiaogoubuli
 */
@Component
public class CxfAutoPublish implements ApplicationRunner {
    @Resource
    private Bus bus;
    @Resource
    private WebApplicationContext ctx;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String[] beanNames = ctx.getBeanNamesForAnnotation(AutoPublish.class);
        EndpointImpl endpoint;
        for (String beanName : beanNames) {
            String path = Objects.requireNonNull(ctx.getType(beanName)).getAnnotation(AutoPublish.class).path();
            endpoint = new EndpointImpl(bus, ctx.getBean(beanName));
            endpoint.publish(path);
        }
    }
}

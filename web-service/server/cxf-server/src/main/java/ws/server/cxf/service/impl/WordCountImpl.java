package ws.server.cxf.service.impl;

import org.springframework.stereotype.Service;
import ws.server.cxf.auto.AutoPublish;
import ws.server.cxf.service.WordCount;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Objects;

/**
 * @author xiaogoubuli
 */
@Service
@WebService
@AutoPublish(path = "/word-count")
public class WordCountImpl implements WordCount {
    @WebMethod
    @WebResult(name = "count")
    @Override
    public int count(@WebParam(name = "words") String words) {
        if (Objects.isNull(words) || words.trim().length() == 0) {
            return 0;
        }
        return words.trim().split("\\s+").length;
    }
}

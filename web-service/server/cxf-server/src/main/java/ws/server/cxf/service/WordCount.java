package ws.server.cxf.service;

/**
 * @author xiaogoubuli
 */
public interface WordCount {
    /**
     * 统计单词个数
     *
     * @param words 单词
     * @return 单词个数
     */
    int count(String words);
}

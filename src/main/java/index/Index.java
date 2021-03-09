package index;

/**
 * @author liubo
 * @version 1.0
 * @date 2021/2/5 1:45 PM
 */
public interface Index {

    /**
     * 添加索引
     * @param name
     */
    void setIndex(String name,long pos);

    /**
     * 根据索引获取值
     * @param name
     * @return
     */
    long getIndex(String name);

    boolean checkName(String name);

}

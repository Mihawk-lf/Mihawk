package index;

import storage.Storge;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author liubo
 * @version 1.0
 * @date 2021/2/5 1:39 PM
 */
public class IdIndex implements Index{

    private static int pos = 0;

    @Resource
    private Storge storge;



    /**
     * key 存储 name字段，value存储文件位置
     */
    public static Map<String,Long> nameMap;

    static {
//        nameMap = ;

    }

    public void setIndex(String o,long pos) {
        nameMap.put(o,pos);
    }

    public long getIndex(String name) {
        return nameMap.get(name);
    }

    public boolean checkName(String name) {
        return false;
    }
}

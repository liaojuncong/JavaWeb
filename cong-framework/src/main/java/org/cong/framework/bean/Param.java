package org.cong.framework.bean;

import org.cong.framework.util.CastUtil;
import org.cong.framework.util.CollectionUtil;

import java.util.Map;

/**
 * 请求参数对象
 *
 * @author liaojuncong
 * @since 1.0.0
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取 long 型参数值
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取的有字段信息
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }

    /**
     * 验证参数是否为空
     */
    public boolean isEmpty() {
        return CollectionUtil.isEmpty(paramMap);
    }
}

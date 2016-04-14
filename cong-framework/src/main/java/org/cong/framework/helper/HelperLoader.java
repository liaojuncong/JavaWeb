package org.cong.framework.helper;

import org.cong.framework.util.ClassUtil;

/**
 * 加载相应的 Helper 类
 *
 * @author liaojuncong
 * @since 1.0.0
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}

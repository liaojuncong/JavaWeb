package org.cong.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by liaojuncong on 4/5/16.
 */
public final class StringUtil {
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String[] splitString(String str, String separatorChars) {
        return StringUtils.split(str, separatorChars);
    }
}

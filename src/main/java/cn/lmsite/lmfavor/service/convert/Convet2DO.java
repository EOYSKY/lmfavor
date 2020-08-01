package cn.lmsite.lmfavor.service.convert;

import java.lang.reflect.Field;
import java.time.LocalDateTime;

import cn.lmsite.lmfavor.entity.UserInfoDO;
import cn.lmsite.lmfavor.vo.user.UserVO;
import com.sun.media.jfxmedia.logging.Logger;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * convet2做 服务转换
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
public class Convet2DO {
    public static UserInfoDO convert2UserDO(UserVO userVO) {
        UserInfoDO userInfoDO = new UserInfoDO();
        try {
            PropertyUtils.copyProperties(userInfoDO, userVO);
        } catch (ReflectiveOperationException e) {
            Logger.logMsg(1, "反射操作抛出的常见异常.");
        }
        if (userInfoDO.getGmtCreate() == null) {
            userInfoDO.setGmtCreate(LocalDateTime.now());
        }
        if (userInfoDO.getGmtModify() == null) {
            userInfoDO.setGmtModify(LocalDateTime.now());
        }
        return userInfoDO;
    }

    /**
     * 合并对象
     *
     * @param first  第一个
     * @param second 第二个
     * @return {@link T}* @throws IllegalAccessException 非法访问异常
     */
    @SuppressWarnings("unchecked")
    public static <T> T mergeObjects(T first, T second) {
        Class<?> clazz = first.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Object returnValue = null;
        try {
            returnValue = clazz.newInstance();
            for (Field field : fields) {
                field.setAccessible(true);
                Object value1 = field.get(first);
                Object value2 = field.get(second);
                Object value = (value1 != null) ? value1 : value2;
                field.set(returnValue, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (T) returnValue;
    }
}

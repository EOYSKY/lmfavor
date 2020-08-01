package cn.lmsite.lmfavor.web.convert;

import cn.lmsite.lmfavor.vo.user.UserRequest;
import cn.lmsite.lmfavor.vo.user.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * 用户转换
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Slf4j
public class UserConvert {
    /**
     * 转换req2 View Object
     *
     * @param request 请求
     * @return {@link UserVO}* @throws IllegalAccessException 非法访问异常
     * @throws ReflectiveOperationException 反射操作抛出的常见异常
     */
    public static UserVO convertReq2Vo(UserRequest request) {
        UserVO userVO = new UserVO();
        try {
            PropertyUtils.copyProperties(userVO, request);
        } catch (ReflectiveOperationException e) {
            log.info("反射操作抛出的常见异常");
        }
        return userVO;
    }
}

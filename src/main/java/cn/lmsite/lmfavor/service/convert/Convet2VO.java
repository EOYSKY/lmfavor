package cn.lmsite.lmfavor.service.convert;

import cn.lmsite.lmfavor.entity.UserInfoDO;
import cn.lmsite.lmfavor.vo.user.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * 服务转换
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Slf4j
public class Convet2VO {
    public static UserVO convert2UserVO(UserInfoDO userInfoDO) {
        UserVO userVO = new UserVO();
        try {
            PropertyUtils.copyProperties(userVO, userInfoDO);
        } catch (ReflectiveOperationException e) {
            log.info("反射操作抛出的常见异常");
        }
        return userVO;
    }
}

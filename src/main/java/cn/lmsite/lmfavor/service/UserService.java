package cn.lmsite.lmfavor.service;

import cn.lmsite.lmfavor.commons.result.ServiceResult;
import cn.lmsite.lmfavor.vo.user.UserVO;

/**
 * 用户服务
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
public interface UserService {

    /**
     * 用户注册
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Integer>}
     */
    ServiceResult<Integer> userRegister(UserVO userVO);

    /**
     * 用户登录
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Boolean>}
     */
    ServiceResult<Boolean> userLogIn(UserVO userVO);

    /**
     * 用户退出
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Boolean>}
     */
    ServiceResult<Boolean> userSignOut(UserVO userVO);

    /**
     * 用户信息更新
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Integer>}
     */
    ServiceResult<Integer> userInfoUpdate(UserVO userVO);

    /**
     * 用户删除
     *
     * @param id 用户id
     * @return {@link ServiceResult<Boolean>}
     */
    ServiceResult<Boolean> userDelete(Integer id);

    /**
     * 登录检查
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Boolean>}
     */
    ServiceResult<Boolean> loginCheck(UserVO userVO);
}

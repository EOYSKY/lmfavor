package cn.lmsite.lmfavor.web.api.user;

import cn.lmsite.lmfavor.commons.result.BaseResult;
import cn.lmsite.lmfavor.commons.result.ServiceResult;
import cn.lmsite.lmfavor.enums.CommonResultEnum;
import cn.lmsite.lmfavor.service.UserService;
import cn.lmsite.lmfavor.vo.user.UserRequest;
import cn.lmsite.lmfavor.web.convert.UserConvert;
import cn.lmsite.lmfavor.web.utils.ApiResultEnhanced;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户服务api
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Slf4j
@Controller
@ResponseBody
@RequestMapping(value = "/request/")
public class UserServiceApi extends ApiResultEnhanced {

    /** 用户服务 */
    @Autowired
    private UserService userService;

    /**
     * 用户注册
     *
     * @param userRequest 用户请求
     * @return {@link BaseResult<Integer>}
     */
    @RequestMapping(value = "user/register", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public BaseResult<Integer> userRegister(@RequestBody UserRequest userRequest) {
        return buildResultForService(userService.userRegister(UserConvert.convertReq2Vo(userRequest)));
    }

    /**
     * 用户登录
     *
     * @param userRequest 用户请求
     * @return {@link BaseResult<Integer>}
     */
    @RequestMapping(value = "user/login", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public BaseResult<Boolean> userLogIn(@RequestBody UserRequest userRequest) {
        log.info("userName:{},password:{}",userRequest.getUserName(),userRequest.getPassword());
        ServiceResult<Boolean> serviceResult = userService.userLogIn(UserConvert.convertReq2Vo(userRequest));
        return serviceResult.getData() ? buildResultForService(serviceResult) :
                new BaseResult<>(CommonResultEnum.A0120, false);
    }

    /**
     * 用户退出
     *
     * @param userRequest 用户请求
     * @return {@link BaseResult<Integer>}
     */
    @RequestMapping(value = "user/signout", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public BaseResult<Boolean> userSignOut(@RequestBody UserRequest userRequest) {
        return buildResultForService(userService.userSignOut(UserConvert.convertReq2Vo(userRequest)));
    }

    /**
     * 用户信息更新
     *
     * @param userRequest 用户请求
     * @return {@link BaseResult<Integer>}
     */
    @RequestMapping(value = "user/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public BaseResult<Integer> userInfoUpdate(@RequestBody UserRequest userRequest) {
        return buildResultForService(userService.userInfoUpdate(UserConvert.convertReq2Vo(userRequest)));
    }

    /**
     * 用户删除
     *
     * @param id 用户id
     * @return {@link BaseResult<Integer>}
     */
    @RequestMapping(value = "user/{id}/delete", method = RequestMethod.GET)
    public BaseResult<Boolean> userInfoUpdate(@PathVariable Integer id) {
        return buildResultForService(userService.userDelete(id));
    }
}

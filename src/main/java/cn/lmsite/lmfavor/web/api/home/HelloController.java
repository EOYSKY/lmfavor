package cn.lmsite.lmfavor.web.api.home;

import cn.lmsite.lmfavor.commons.result.BaseResult;
import cn.lmsite.lmfavor.enums.CommonResultEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 你好控制器
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Controller
@ResponseBody
@RequestMapping(value = "/request/")
public class HelloController {

    /**
     * 用户注册
     *
     * @return {@link BaseResult<Integer>}
     */
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public BaseResult<String> userRegister() {
        return new BaseResult<>(CommonResultEnum.A0000, "你好， LmFavor！接口访问成功！\n敬请使用 - @DilysLyu ");
    }
}

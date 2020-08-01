package cn.lmsite.lmfavor.service.impl;

import cn.lmsite.lmfavor.commons.result.ServiceResult;
import cn.lmsite.lmfavor.dao.UserInfoService;
import cn.lmsite.lmfavor.entity.UserInfoDO;
import cn.lmsite.lmfavor.enums.ResultCodeEnum;
import cn.lmsite.lmfavor.service.UserService;
import cn.lmsite.lmfavor.service.convert.Convet2DO;
import cn.lmsite.lmfavor.service.convert.Convet2VO;
import cn.lmsite.lmfavor.vo.user.UserVO;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务impl
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@Setter
@Service
public class UserServiceImpl implements UserService {

    /** 用户信息服务 */
    @Autowired
    private UserInfoService userInfoService;

    /**
     * 用户注册
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Integer>}
     */
    @Override
    public ServiceResult<Integer> userRegister(UserVO userVO) {
        int insert = userInfoService.userRegister(Convet2DO.convert2UserDO(userVO));
        return insert > 0 ? new ServiceResult<>(insert) : new ServiceResult<>(ResultCodeEnum.SYSTEM_ERROR);
    }

    /**
     * 用户登录
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Boolean>}
     */
    @Override
    public ServiceResult<Boolean> userLogIn(UserVO userVO) {
        UserInfoDO userInfoDO = userInfoService.selectByUserName(userVO.getUserName());
        UserVO queryUserVO = Convet2VO.convert2UserVO(userInfoDO);
        boolean result = StringUtils.equals(userVO.getUserName(), queryUserVO.getUserName()) &&
                StringUtils.equals(userVO.getPassword(), queryUserVO.getPassword());
        return new ServiceResult<>(result);
    }

    /**
     * 用户退出
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Boolean>}
     */
    @Override
    public ServiceResult<Boolean> userSignOut(UserVO userVO) {
        return null;
    }

    /**
     * 用户信息更新
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Integer>}
     */
    @Override
    public ServiceResult<Integer> userInfoUpdate(UserVO userVO) {
        UserInfoDO infoDO = Convet2DO.convert2UserDO(userVO);
        infoDO.setGmtCreate(null);
        UserInfoDO userInfoDO = userInfoService.selectByUserName(userVO.getUserName());
        UserInfoDO newInfoDO = Convet2DO.mergeObjects(infoDO, userInfoDO);
        int update = userInfoService.updateByPrimaryKey(newInfoDO);
        return update > 0 ? new ServiceResult<>(update) : new ServiceResult<>(ResultCodeEnum.SYSTEM_ERROR);
    }

    /**
     * 用户删除
     *
     * @param id 用户id
     * @return {@link ServiceResult<Boolean>}
     */
    @Override
    public ServiceResult<Boolean> userDelete(Integer id) {
        int delete = userInfoService.deleteByPrimaryKey(id);
        return delete > 0 ? new ServiceResult<>(true) : new ServiceResult<>(false, ResultCodeEnum.SYSTEM_ERROR);
    }

    /**
     * 登录检查
     *
     * @param userVO 用户 View Object
     * @return {@link ServiceResult<Boolean>}
     */
    @Override
    public ServiceResult<Boolean> loginCheck(UserVO userVO) {
        return null;
    }
}

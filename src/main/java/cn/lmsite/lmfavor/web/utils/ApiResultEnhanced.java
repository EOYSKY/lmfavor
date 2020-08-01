package cn.lmsite.lmfavor.web.utils;

import cn.lmsite.lmfavor.commons.result.BasePageResult;
import cn.lmsite.lmfavor.commons.result.BaseResult;
import cn.lmsite.lmfavor.commons.result.ServicePageResult;
import cn.lmsite.lmfavor.commons.result.ServiceResult;
import cn.lmsite.lmfavor.enums.ResultCodeEnum;

/**
 * api结果功能增强类
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
public class ApiResultEnhanced {

    /**
     * 通过service结果构建api返回结果
     *
     * @param serviceResult
     * @param <T>
     * @return
     */
    protected static <T> BaseResult<T> buildResultForService(ServiceResult<T> serviceResult) {
        ResultCodeEnum resultCode = serviceResult.getResultCode();
        return new BaseResult<>(ResultCodeEnum.SUCCESS == resultCode, resultCode.getCode(),
                serviceResult.getData(), resultCode.getMsg());
    }

    /**
     * 通过service page 结果构建api返回结果
     *
     * @param serviceResult
     * @param <T>
     * @return
     */
    protected static <T> BasePageResult<T> buildPageResForService(ServicePageResult<T> serviceResult) {
        ResultCodeEnum resultCode = serviceResult.getResultCode();
        return new BasePageResult<>(ResultCodeEnum.SUCCESS == resultCode, resultCode.getCode(),
                serviceResult.getData(), resultCode.getMsg(), serviceResult.getPageNo(), serviceResult.getPageSize(),
                serviceResult.getTotalCount());
    }
}
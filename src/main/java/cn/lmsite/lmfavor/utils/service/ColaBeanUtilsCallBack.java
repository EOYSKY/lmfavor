package cn.lmsite.lmfavor.utils.service;

/**
 * ColaBeanUtils 回调函数
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
@FunctionalInterface
public interface ColaBeanUtilsCallBack<S, T> {

    /**
     * 回调函数
     *
     * @param t t
     * @param s 年代
     */
    void callBack(S t, T s);
}
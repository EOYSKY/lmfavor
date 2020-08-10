package cn.lmsite.lmfavor.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import cn.lmsite.lmfavor.utils.service.ColaBeanUtilsCallBack;

import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * BeanUtils对List集合的操作工具
 *
 * @author Jonny.Chang  ( https://jonnyhub.com )  @jonny6015
 */
public class ColaBeanUtils {

    /**
     * 复制属性列表
     *
     * @param sources 来源
     * @param target  目标
     * @return {@link List<T>}
     */
    public static <S, T> List<T> copyListProperties(List<S> sources, Supplier<T> target) {
        return copyListProperties(sources, target, null);
    }

    /**
     * 复制列表 Properties
     *
     * @param sources  来源
     * @param target   目标
     * @param callBack 回电话
     * @return {@link List<T>}
     */
    public static <S, T> List<T> copyListProperties(List<S> sources, Supplier<T> target, ColaBeanUtilsCallBack<S, T> callBack) {
        List<T> list = new ArrayList<>(sources.size());
        for (S source : sources) {
            T t = target.get();
            copyProperties(source, t);
            list.add(t);
            if (callBack != null) {
                callBack.callBack(source, t);
            }
        }
        return list;
    }
}

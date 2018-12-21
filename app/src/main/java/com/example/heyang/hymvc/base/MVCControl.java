package com.example.heyang.hymvc.base;

/**
 * @author heyang
 * @data 2018/12/21
 * @email 15258836173@163.com
 * Description:
 */
public abstract class MVCControl<V> {
    protected V mView;

    public void atteachView(V view) {
        mView = view;
    }

}

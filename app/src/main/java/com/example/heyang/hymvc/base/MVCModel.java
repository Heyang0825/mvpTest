package com.example.heyang.hymvc.base;

/**
 * @author heyang
 * @data 2018/12/21
 * @email 15258836173@163.com
 * Description:
 */
public abstract class MVCModel<C> {
    protected C mControl;

    public MVCModel(C mControl) {
        this.mControl = mControl;
    }
}

package com.example.heyang.hymvc.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author heyang
 * @data 2018/12/21
 * @email 15258836173@163.com
 * Description: 所有Activity的基类
 */
public abstract class BaseActivity<C extends MVCControl> extends AppCompatActivity {
    protected C mControl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mControl = initControl();
        if (mControl != null) {
            mControl.atteachView(this);
        }
        setContentView(getLayoutId());
        creatViewAndData();
    }

    protected abstract C initControl();

    protected abstract void creatViewAndData();

    protected abstract int getLayoutId();
}

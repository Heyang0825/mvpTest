package com.example.heyang.hymvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.heyang.hymvc.base.BaseActivity;
import com.example.heyang.hymvc.base.MVCControl;
import com.example.heyang.hymvc.control.UserInfoControl;
import com.example.heyang.hymvc.view.UserInfoView;

public class HeyangMVPActivity extends BaseActivity<UserInfoControl> implements UserInfoView {


    private TextView tv_userInfo;
    private Button bt_userInfo;

    @Override
    protected UserInfoControl initControl() {
        return new UserInfoControl();
    }

    @Override
    protected void creatViewAndData() {
        tv_userInfo = (TextView) findViewById(R.id.tv_user_info);
        bt_userInfo = (Button) findViewById(R.id.bt_user_info);
        mControl.getUserInfo();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_heyang_mvp;
    }

    @Override
    public void backHttpInfo(final String msg) {
        bt_userInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_userInfo.setText(msg);
            }
        });
    }
}

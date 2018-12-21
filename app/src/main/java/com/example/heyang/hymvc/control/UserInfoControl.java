package com.example.heyang.hymvc.control;

import android.widget.TabHost;

import com.example.heyang.hymvc.base.MVCControl;
import com.example.heyang.hymvc.model.UserInfoModel;
import com.example.heyang.hymvc.view.UserInfoView;

/**
 * @author heyang
 * @data 2018/12/21
 * @email 15258836173@163.com
 * Description:
 */
public class UserInfoControl extends MVCControl<UserInfoView> {

    protected  UserInfoModel mModel;


    public UserInfoControl() {
        this.mModel = new UserInfoModel(this);
    }

    public void getUserInfo() {
        mModel.postHttpGetUser();
    }

    public void backHttpInfo(String msg) {
        mView.backHttpInfo(msg);
    }
}

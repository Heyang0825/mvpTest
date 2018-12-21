package com.example.heyang.hymvc.model;

import com.example.heyang.hymvc.base.MVCModel;
import com.example.heyang.hymvc.control.UserInfoControl;
import com.example.heyang.hymvc.view.UserInfoView;

/**
 * @author heyang
 * @data 2018/12/21
 * @email 15258836173@163.com
 * Description:
 */
public class UserInfoModel extends MVCModel<UserInfoControl> {


    public UserInfoModel(UserInfoControl mControl) {
        super(mControl);
    }

    public void postHttpGetUser() {
        //网络请求
        mControl.backHttpInfo("啊哈哈哈哈");
    }
}

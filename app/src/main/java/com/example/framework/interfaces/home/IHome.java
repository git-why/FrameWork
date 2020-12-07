package com.example.framework.interfaces.home;


import com.example.framework.bean.BannerBean;
import com.example.framework.interfaces.IBasePresenter;
import com.example.framework.interfaces.IBaseView;

public interface IHome {

    interface IView extends IBaseView {

        void onDataReturn(BannerBean result);
    }

    interface IPresenter extends IBasePresenter<IView> {
        void getData();
    }
}

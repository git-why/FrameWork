package com.example.framework.interfaces.home;


import com.example.framework.bean.BannerBean;
import com.example.framework.interfaces.IBasePresenter;
import com.example.framework.interfaces.IBaseView;

/**
 * @author why
 */
public interface IHome {

    interface IView extends IBaseView {

        /**
         * 返回数据
         *
         * @param result
         */
        void onDataReturn(BannerBean result);
    }

    interface IPresenter extends IBasePresenter<IView> {

        /**
         * 获取数据
         */
        void getData();
    }
}

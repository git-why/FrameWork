package com.example.framework.presenter;

import com.example.framework.base.BasePresenter;
import com.example.framework.bean.BannerBean;
import com.example.framework.common.CommonSubscriber;
import com.example.framework.interfaces.home.IHome;
import com.example.framework.net.HttpManager;
import com.example.framework.util.RxUtils;

/**
 * @author: Why
 * Created on 2020/12/1 17:18
 * E_Mail why_23456@163.com
 * Desc:
 */
public class HomePresenter extends BasePresenter<IHome.IView> implements IHome.IPresenter {
    @Override
    public void getData() {
        addSubscribe(HttpManager.getInstance().getApiService().getHomeBannerData()
                .compose(RxUtils.<BannerBean>rxScheduler())
                .subscribeWith(new CommonSubscriber<BannerBean>(mView) {
                    @Override
                    public void onNext(BannerBean bannerBean) {
                        mView.onDataReturn(bannerBean);
                    }
                }));
    }
}

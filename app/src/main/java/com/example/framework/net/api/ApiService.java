package com.example.framework.net.api;


import com.example.framework.bean.BannerBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * @author why
 */
public interface ApiService {

    /**
     * 首页banner
     *
     * @return
     */
    @GET("banner/json")
    Flowable<BannerBean> getHomeBannerData();

}

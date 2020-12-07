package com.example.framework.net.api;


import com.example.framework.bean.BannerBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface ApiService {


    @GET("banner/json")
    Flowable<BannerBean> getHomeBannerData();

}

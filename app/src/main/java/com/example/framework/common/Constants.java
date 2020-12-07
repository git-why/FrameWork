package com.example.framework.common;


import com.example.framework.app.MyApp;

import java.io.File;

public class Constants {

    public static final String PATH_DATA = MyApp.getInstance().getExternalCacheDir().getAbsolutePath() + File.separator + "datas";

    public static final String PATH_CACHE = PATH_DATA + "/framework";
    public static final String Base_WanUrl = "https://www.wanandroid.com/";



}

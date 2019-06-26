package com.mrwwx;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

public class MrwwxApplication  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig config = new InitConfig.Builder()
                //图片库接口
                .setImgAdapter(new GlideImageAdapter())
                //网络库接口
//                .setHttpAdapter(new InterceptWXHttpAdapter())
                .build();
        WXSDKEngine.initialize(this,config);
    }
}

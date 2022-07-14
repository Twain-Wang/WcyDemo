package com.jsyiyi.javacode.Glide;

import android.graphics.drawable.Drawable;

import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.jsyiyi.testkotlin.R;

@GlideExtension
public class MyGlideExtension{

    /**
     * 实现private的构造函数
     */
    private MyGlideExtension() {
    }

    @GlideOption
    public static BaseRequestOptions<?> injectOptions (BaseRequestOptions<?> options) {
         return options
//                设置图片变换为圆角
                .circleCrop()
//                设置站位图
                .placeholder(R.mipmap.loading)
//                设置加载失败的错误图片
                .error(R.mipmap.loader_error);

    }
}

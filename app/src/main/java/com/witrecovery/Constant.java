package com.witrecovery;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Aeolus on 2017/12/18.
 */

public class Constant {
    //  gank io api
    public static final String BASE_URL = "http://gank.io/api/";
    public static final long CONNECT_TIMEOUT = 15000;
    public static final long READ_TIMEOUT = 15000;
    public static final long WRITE_TIMEOUT = 15000;
    public static final String CACHE_FILE_NAME = "gank.cache";
    public static final int MEIZI_COUNT = 5;        //默认取5天数据
    public static final int RECYCLERVIEW_CARD_HELPER_NULL = -1;
    public static final long SPLASH_FINISH_DELAY = 3000;
    // SP key
    public static final String KEY_SPLASH_IMAGE_PATH = "key_splash_image_path";
    public static final String KEY_HAS_GOT_MY_HEAD_IMAGE = "key_has_got_my_head_image";

    //category
    public static final String CATEGORY_ANDROID = "Android";
    public static final String CATEGORY_IOS = "iOS";
    public static final String CATEGORY_WEB = "前端";
    public static final String CATEGORY_SUGGEST = "瞎推荐";
    public static final String CATEGORY_MEIZI = "福利";
    public static final String CATEGORY_VIDEO = "休息视频";
    public static final String CATEGORY_EXTEND = "拓展资源";
    public static final String CATEGORY_APP = "App";
    public static final String CATEGORY_ALL = "all";


    @StringDef({
            CATEGORY_ANDROID, CATEGORY_IOS, CATEGORY_WEB, CATEGORY_SUGGEST,
            CATEGORY_MEIZI, CATEGORY_VIDEO, CATEGORY_EXTEND, CATEGORY_APP, CATEGORY_ALL
    })
    @Retention(RetentionPolicy.SOURCE)
    public @interface Category {
    }

    // github config
    public static final String GITHUB_SERVER = "https://api.github.com/";
    // my github account for my head image
    public static final String MY_GITHUB_ACCOUNT = "yangxiaobinhaoshuai";

    // SharePreference key
    public static final String KEY_USER_NAME = "key_user_name";
    public static final String KEY_USER_ID_LOGIN = "key_user_id_login";
}

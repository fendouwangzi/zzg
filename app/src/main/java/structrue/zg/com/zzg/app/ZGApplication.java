package structrue.zg.com.zzg.app;

import android.app.Application;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import structrue.zg.com.zzg.app.exception.LocalFileHandler;
import zg.com.zglibrary.util.LogUtil;
import zg.com.zglibrary.util.ToastUtil;


/**
 * Created by oracleen on 2016/6/28.
 */
public class ZGApplication extends Application {

    private static ZGApplication mApplication;
    public static String currentGirl = "http://ww2.sinaimg.cn/large/610dc034jw1f5k1k4azguj20u00u0421.jpg";

    @Override
    public void onCreate() {
        super.onCreate();

        mApplication = this;

        //配置是否显示log
        LogUtil.isDebug = true;

        //配置时候显示toast
        ToastUtil.isShow = true;

        //配置程序异常退出处理
        Thread.setDefaultUncaughtExceptionHandler(new LocalFileHandler(this));
    }

    public static OkHttpClient defaultOkHttpClient() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(3, TimeUnit.SECONDS)
                .writeTimeout(3, TimeUnit.SECONDS)
                .readTimeout(3, TimeUnit.SECONDS)
                .addInterceptor(loggingInterceptor)
                .build();
        return client;
    }

    public static ZGApplication getIntstance() {
        return mApplication;
    }
}

package structrue.zg.com.zzg;

import android.os.Bundle;
import android.view.View;

import zg.com.zglibrary.base.AppActivity;
import zg.com.zglibrary.base.BaseFragment;

/**
 * @file_name SplashActivity.java
 * @description:  启动页面
 * @author zhongzhigang
 * created at 2017/2/9
 */

public class SplashActivity extends AppActivity {

    @Override
    protected BaseFragment getFirstFragment() {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        System.out.println("hhh");
    }

    @Override
    public void onClick(View view) {

    }
}

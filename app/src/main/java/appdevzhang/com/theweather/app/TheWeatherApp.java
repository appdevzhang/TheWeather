package appdevzhang.com.theweather.app;

import android.app.Application;

import appdevzhang.com.theweather.net.RequestManager;

/**
 * @ClassName: TheWeatherApp
 * @Description:
 * @author: appdevzhang
 * @email: 1160030655@qq.com
 * @date: 15/9/1 下午11:05
 */
public class TheWeatherApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        RequestManager.init(this);
    }

}

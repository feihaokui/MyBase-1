package com.xcz.baselib.mvp;

import android.content.Context;

/**
 * Created by xcz
 * on 2018/5/15.
 */
public interface BaseMvpView {
    void showMsg(String msg);

    void startLoading();

    void stopLoading();

    void noNetWork();

    Context getActivityContext();
}

package com.okry.mvpdaggertest.mvp;

/**
 * Created by mr on 15/5/8.
 */
public interface MvpPresenter {

    public void attachView(MvpView view);
    public void detachView();

}

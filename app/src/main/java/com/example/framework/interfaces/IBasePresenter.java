package com.example.framework.interfaces;

public interface IBasePresenter<V extends IBaseView> {

    void onAttachView(V v);

    void onDetach();
}

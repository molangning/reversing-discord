package com.facebook.datasource;

/* renamed from: com.facebook.datasource.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC3577d<T> {
    void onCancellation(DataSource<T> dataSource);

    void onFailure(DataSource<T> dataSource);

    void onNewResult(DataSource<T> dataSource);

    void onProgressUpdate(DataSource<T> dataSource);
}

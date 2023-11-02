package com.facebook.datasource;

/* renamed from: com.facebook.datasource.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3574b<T> implements InterfaceC3577d<T> {
    @Override // com.facebook.datasource.InterfaceC3577d
    public void onCancellation(DataSource<T> dataSource) {
    }

    @Override // com.facebook.datasource.InterfaceC3577d
    public void onFailure(DataSource<T> dataSource) {
        try {
            onFailureImpl(dataSource);
        } finally {
            dataSource.close();
        }
    }

    protected abstract void onFailureImpl(DataSource<T> dataSource);

    @Override // com.facebook.datasource.InterfaceC3577d
    public void onNewResult(DataSource<T> dataSource) {
        boolean mo31712a = dataSource.mo31712a();
        try {
            onNewResultImpl(dataSource);
        } finally {
            if (mo31712a) {
                dataSource.close();
            }
        }
    }

    protected abstract void onNewResultImpl(DataSource<T> dataSource);

    @Override // com.facebook.datasource.InterfaceC3577d
    public void onProgressUpdate(DataSource<T> dataSource) {
    }
}
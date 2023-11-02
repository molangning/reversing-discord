package com.facebook.react.bridge;

import android.os.AsyncTask;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {
    private final JSExceptionHandler mExceptionHandler;

    @Deprecated
    public GuardedAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    protected abstract void doInBackgroundGuarded(Params... paramsArr);

    protected GuardedAsyncTask(JSExceptionHandler jSExceptionHandler) {
        this.mExceptionHandler = jSExceptionHandler;
    }

    @Override // android.os.AsyncTask
    public final Void doInBackground(Params... paramsArr) {
        try {
            doInBackgroundGuarded(paramsArr);
            return null;
        } catch (RuntimeException e) {
            this.mExceptionHandler.handleException(e);
            return null;
        }
    }
}
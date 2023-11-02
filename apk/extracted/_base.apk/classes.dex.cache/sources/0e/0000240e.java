package com.facebook.react.bridge;

import android.os.AsyncTask;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
    private final JSExceptionHandler mExceptionHandler;

    @Deprecated
    protected GuardedResultAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    protected abstract Result doInBackgroundGuarded();

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Result result) {
        try {
            onPostExecuteGuarded(result);
        } catch (RuntimeException e) {
            this.mExceptionHandler.handleException(e);
        }
    }

    protected abstract void onPostExecuteGuarded(Result result);

    public GuardedResultAsyncTask(JSExceptionHandler jSExceptionHandler) {
        this.mExceptionHandler = jSExceptionHandler;
    }

    @Override // android.os.AsyncTask
    public final Result doInBackground(Void... voidArr) {
        try {
            return doInBackgroundGuarded();
        } catch (RuntimeException e) {
            this.mExceptionHandler.handleException(e);
            throw e;
        }
    }
}
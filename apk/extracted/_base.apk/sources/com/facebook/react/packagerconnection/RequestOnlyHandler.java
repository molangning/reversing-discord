package com.facebook.react.packagerconnection;

import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class RequestOnlyHandler implements RequestHandler {
    private static final String TAG = JSPackagerClient.class.getSimpleName();

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public final void onNotification(Object obj) {
        C13677a.m1854j(TAG, "Notification is not supported");
    }

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public abstract void onRequest(Object obj, Responder responder);
}

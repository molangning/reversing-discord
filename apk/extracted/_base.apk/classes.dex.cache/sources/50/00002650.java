package com.facebook.react.packagerconnection;

import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NotificationOnlyHandler implements RequestHandler {
    private static final String TAG = JSPackagerClient.class.getSimpleName();

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public abstract void onNotification(Object obj);

    @Override // com.facebook.react.packagerconnection.RequestHandler
    public final void onRequest(Object obj, Responder responder) {
        responder.error("Request is not supported");
        C13677a.m1854j(TAG, "Request is not supported");
    }
}
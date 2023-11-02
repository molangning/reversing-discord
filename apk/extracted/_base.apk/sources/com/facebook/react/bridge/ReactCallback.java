package com.facebook.react.bridge;

import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
interface ReactCallback {
    @InterfaceC6107a
    void decrementPendingJSCalls();

    @InterfaceC6107a
    void incrementPendingJSCalls();

    @InterfaceC6107a
    void onBatchComplete();
}

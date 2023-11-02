package p420x8;

import android.os.Looper;
import android.os.Message;
import p339s9.HandlerC12442f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x8.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class HandlerC13743e extends HandlerC12442f {

    /* renamed from: a */
    final /* synthetic */ C13739c f35470a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC13743e(C13739c c13739c, Looper looper) {
        super(looper);
        this.f35470a = c13739c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C13739c.m1603d(this.f35470a, message);
    }
}

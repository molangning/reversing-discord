package p214l9;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.C0115m;
import p366u9.AbstractBinderC12934u0;

/* renamed from: l9.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class BinderC10101e extends AbstractBinderC12934u0 {

    /* renamed from: c */
    private final /* synthetic */ TaskCompletionSource f26328c;

    public BinderC10101e(C10097a c10097a, TaskCompletionSource taskCompletionSource) {
        this.f26328c = taskCompletionSource;
    }

    @Override // p366u9.InterfaceC12928r0
    /* renamed from: x */
    public final void mo3659x(Status status, PendingIntent pendingIntent) {
        C0115m.m41125b(status, pendingIntent, this.f26328c);
    }
}
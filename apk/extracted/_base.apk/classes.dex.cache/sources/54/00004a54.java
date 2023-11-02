package p299q9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.C0115m;

/* renamed from: q9.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class BinderC11812k extends AbstractBinderC11808g {

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f30801c;

    public BinderC11812k(C11803b c11803b, TaskCompletionSource taskCompletionSource) {
        this.f30801c = taskCompletionSource;
    }

    @Override // p299q9.InterfaceC11809h
    /* renamed from: y */
    public final void mo6834y(Status status) {
        C0115m.m41126a(status, this.f30801c);
    }
}
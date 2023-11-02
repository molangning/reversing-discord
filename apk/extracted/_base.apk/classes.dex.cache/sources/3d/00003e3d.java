package p195k8;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: k8.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9177i0 implements InterfaceC9155c {
    @Override // p195k8.InterfaceC9155c
    /* renamed from: a */
    public long mo16374a() {
        return SystemClock.uptimeMillis();
    }

    @Override // p195k8.InterfaceC9155c
    /* renamed from: b */
    public long mo16373b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p195k8.InterfaceC9155c
    /* renamed from: c */
    public InterfaceC9184m mo16372c(Looper looper, Handler.Callback callback) {
        return new C9179j0(new Handler(looper, callback));
    }
}
package p195k8;

import android.os.Handler;
import android.os.Message;

/* renamed from: k8.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C9179j0 implements InterfaceC9184m {

    /* renamed from: a */
    private final Handler f24152a;

    public C9179j0(Handler handler) {
        this.f24152a = handler;
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: a */
    public boolean mo16336a(Runnable runnable) {
        return this.f24152a.post(runnable);
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: b */
    public Message mo16335b(int i) {
        return this.f24152a.obtainMessage(i);
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: c */
    public boolean mo16334c(int i) {
        return this.f24152a.hasMessages(i);
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: d */
    public Message mo16333d(int i, int i2, int i3, Object obj) {
        return this.f24152a.obtainMessage(i, i2, i3, obj);
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: e */
    public Message mo16332e(int i, Object obj) {
        return this.f24152a.obtainMessage(i, obj);
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: f */
    public void mo16331f(Object obj) {
        this.f24152a.removeCallbacksAndMessages(obj);
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: g */
    public Message mo16330g(int i, int i2, int i3) {
        return this.f24152a.obtainMessage(i, i2, i3);
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: h */
    public boolean mo16329h(int i) {
        return this.f24152a.sendEmptyMessage(i);
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: i */
    public boolean mo16328i(int i, long j) {
        return this.f24152a.sendEmptyMessageAtTime(i, j);
    }

    @Override // p195k8.InterfaceC9184m
    /* renamed from: j */
    public void mo16327j(int i) {
        this.f24152a.removeMessages(i);
    }
}

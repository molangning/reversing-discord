package p201kf;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lk.InterfaceC10220b;
import lk.InterfaceC10221c;
import p217lf.EnumC10143e;
import p233mf.C10447a;
import p233mf.C10451d;
import ye.InterfaceC14013e;

/* renamed from: kf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9220b<T> extends AtomicInteger implements InterfaceC14013e<T>, InterfaceC10221c {

    /* renamed from: j */
    final InterfaceC10220b<? super T> f24262j;

    /* renamed from: k */
    final C10447a f24263k = new C10447a();

    /* renamed from: l */
    final AtomicLong f24264l = new AtomicLong();

    /* renamed from: m */
    final AtomicReference<InterfaceC10221c> f24265m = new AtomicReference<>();

    /* renamed from: n */
    final AtomicBoolean f24266n = new AtomicBoolean();

    /* renamed from: o */
    volatile boolean f24267o;

    public C9220b(InterfaceC10220b<? super T> interfaceC10220b) {
        this.f24262j = interfaceC10220b;
    }

    @Override // ye.InterfaceC14013e, lk.InterfaceC10220b
    /* renamed from: a */
    public void mo905a(InterfaceC10221c interfaceC10221c) {
        if (this.f24266n.compareAndSet(false, true)) {
            this.f24262j.mo905a(this);
            EnumC10143e.m12181c(this.f24265m, this.f24264l, interfaceC10221c);
            return;
        }
        interfaceC10221c.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // lk.InterfaceC10221c
    public void cancel() {
        if (!this.f24267o) {
            EnumC10143e.m12183a(this.f24265m);
        }
    }

    @Override // lk.InterfaceC10220b
    /* renamed from: d */
    public void mo12122d() {
        this.f24267o = true;
        C10451d.m11522a(this.f24262j, this, this.f24263k);
    }

    @Override // lk.InterfaceC10220b
    /* renamed from: f */
    public void mo12121f(T t) {
        C10451d.m11520c(this.f24262j, t, this, this.f24263k);
    }

    @Override // lk.InterfaceC10221c
    /* renamed from: g */
    public void mo12120g(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        EnumC10143e.m12182b(this.f24265m, this.f24264l, j);
    }

    @Override // lk.InterfaceC10220b
    public void onError(Throwable th2) {
        this.f24267o = true;
        C10451d.m11521b(this.f24262j, th2, this, this.f24263k);
    }
}

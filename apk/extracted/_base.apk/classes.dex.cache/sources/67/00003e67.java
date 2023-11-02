package p201kf;

import bf.InterfaceC2276b;
import cf.C2523a;
import cf.C2528b;
import java.util.concurrent.atomic.AtomicReference;
import lk.InterfaceC10221c;
import nf.C10859a;
import p067df.InterfaceC5830a;
import p067df.InterfaceC5832c;
import p217lf.EnumC10143e;
import ye.InterfaceC14013e;

/* renamed from: kf.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9219a<T> extends AtomicReference<InterfaceC10221c> implements InterfaceC14013e<T>, InterfaceC10221c, InterfaceC2276b {

    /* renamed from: j */
    final InterfaceC5832c<? super T> f24258j;

    /* renamed from: k */
    final InterfaceC5832c<? super Throwable> f24259k;

    /* renamed from: l */
    final InterfaceC5830a f24260l;

    /* renamed from: m */
    final InterfaceC5832c<? super InterfaceC10221c> f24261m;

    public C9219a(InterfaceC5832c<? super T> interfaceC5832c, InterfaceC5832c<? super Throwable> interfaceC5832c2, InterfaceC5830a interfaceC5830a, InterfaceC5832c<? super InterfaceC10221c> interfaceC5832c3) {
        this.f24258j = interfaceC5832c;
        this.f24259k = interfaceC5832c2;
        this.f24260l = interfaceC5830a;
        this.f24261m = interfaceC5832c3;
    }

    @Override // ye.InterfaceC14013e, lk.InterfaceC10220b
    /* renamed from: a */
    public void mo905a(InterfaceC10221c interfaceC10221c) {
        if (EnumC10143e.m12179e(this, interfaceC10221c)) {
            try {
                this.f24261m.accept(this);
            } catch (Throwable th2) {
                C2528b.m33061b(th2);
                interfaceC10221c.cancel();
                onError(th2);
            }
        }
    }

    @Override // bf.InterfaceC2276b
    /* renamed from: b */
    public boolean mo16034b() {
        return get() == EnumC10143e.CANCELLED;
    }

    @Override // lk.InterfaceC10221c
    public void cancel() {
        EnumC10143e.m12183a(this);
    }

    @Override // lk.InterfaceC10220b
    /* renamed from: d */
    public void mo12122d() {
        InterfaceC10221c interfaceC10221c = get();
        EnumC10143e enumC10143e = EnumC10143e.CANCELLED;
        if (interfaceC10221c != enumC10143e) {
            lazySet(enumC10143e);
            try {
                this.f24260l.run();
            } catch (Throwable th2) {
                C2528b.m33061b(th2);
                C10859a.m9887j(th2);
            }
        }
    }

    @Override // bf.InterfaceC2276b
    public void dispose() {
        cancel();
    }

    @Override // lk.InterfaceC10220b
    /* renamed from: f */
    public void mo12121f(T t) {
        if (!mo16034b()) {
            try {
                this.f24258j.accept(t);
            } catch (Throwable th2) {
                C2528b.m33061b(th2);
                get().cancel();
                onError(th2);
            }
        }
    }

    @Override // lk.InterfaceC10221c
    /* renamed from: g */
    public void mo12120g(long j) {
        get().mo12120g(j);
    }

    @Override // lk.InterfaceC10220b
    public void onError(Throwable th2) {
        InterfaceC10221c interfaceC10221c = get();
        EnumC10143e enumC10143e = EnumC10143e.CANCELLED;
        if (interfaceC10221c != enumC10143e) {
            lazySet(enumC10143e);
            try {
                this.f24259k.accept(th2);
                return;
            } catch (Throwable th3) {
                C2528b.m33061b(th3);
                C10859a.m9887j(new C2523a(th2, th3));
                return;
            }
        }
        C10859a.m9887j(th2);
    }
}
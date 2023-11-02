package p164j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8464d0 implements InterfaceC8468f0 {

    /* renamed from: a */
    public final /* synthetic */ LongConsumer f22590a;

    private /* synthetic */ C8464d0(LongConsumer longConsumer) {
        this.f22590a = longConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8468f0 m17674a(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return longConsumer instanceof C8466e0 ? ((C8466e0) longConsumer).f22592a : new C8464d0(longConsumer);
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    public final /* synthetic */ void accept(long j) {
        this.f22590a.accept(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8464d0) {
            obj = ((C8464d0) obj).f22590a;
        }
        return this.f22590a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22590a.hashCode();
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final /* synthetic */ InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        return m17674a(this.f22590a.andThen(C8466e0.m17672a(interfaceC8468f0)));
    }
}
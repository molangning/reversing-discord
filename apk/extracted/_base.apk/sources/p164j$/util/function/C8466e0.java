package p164j$.util.function;

import java.util.function.LongConsumer;

/* renamed from: j$.util.function.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8466e0 implements LongConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8468f0 f22592a;

    private /* synthetic */ C8466e0(InterfaceC8468f0 interfaceC8468f0) {
        this.f22592a = interfaceC8468f0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongConsumer m17672a(InterfaceC8468f0 interfaceC8468f0) {
        if (interfaceC8468f0 == null) {
            return null;
        }
        return interfaceC8468f0 instanceof C8464d0 ? ((C8464d0) interfaceC8468f0).f22590a : new C8466e0(interfaceC8468f0);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        this.f22592a.accept(j);
    }

    @Override // java.util.function.LongConsumer
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return m17672a(this.f22592a.mo17293j(C8464d0.m17674a(longConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8468f0 interfaceC8468f0 = this.f22592a;
        if (obj instanceof C8466e0) {
            obj = ((C8466e0) obj).f22592a;
        }
        return interfaceC8468f0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22592a.hashCode();
    }
}

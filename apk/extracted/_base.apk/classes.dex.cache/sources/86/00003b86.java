package p164j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8488p0 implements InterfaceC8492r0 {

    /* renamed from: a */
    public final /* synthetic */ LongToIntFunction f22608a;

    private /* synthetic */ C8488p0(LongToIntFunction longToIntFunction) {
        this.f22608a = longToIntFunction;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8492r0 m17652b(LongToIntFunction longToIntFunction) {
        if (longToIntFunction == null) {
            return null;
        }
        return longToIntFunction instanceof C8490q0 ? ((C8490q0) longToIntFunction).f22609a : new C8488p0(longToIntFunction);
    }

    /* renamed from: a */
    public final /* synthetic */ int m17653a(long j) {
        return this.f22608a.applyAsInt(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8488p0) {
            obj = ((C8488p0) obj).f22608a;
        }
        return this.f22608a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22608a.hashCode();
    }
}
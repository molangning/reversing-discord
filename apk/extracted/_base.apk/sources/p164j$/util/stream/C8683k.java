package p164j$.util.stream;

import java.util.Set;
import java.util.stream.Collector;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.C8434I0;
import p164j$.util.function.C8463d;
import p164j$.util.function.Function;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8467f;

/* renamed from: j$.util.stream.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8683k implements InterfaceC8693m {

    /* renamed from: a */
    public final /* synthetic */ Collector f22880a;

    private /* synthetic */ C8683k(Collector collector) {
        this.f22880a = collector;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC8693m m17448d(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C8688l ? ((C8688l) collector).f22886a : new C8683k(collector);
    }

    /* renamed from: a */
    public final /* synthetic */ BiConsumer m17451a() {
        return BiConsumer.VivifiedWrapper.convert(this.f22880a.accumulator());
    }

    /* renamed from: b */
    public final /* synthetic */ Set m17450b() {
        return this.f22880a.characteristics();
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC8467f m17449c() {
        return C8463d.m17675b(this.f22880a.combiner());
    }

    /* renamed from: e */
    public final /* synthetic */ Function m17447e() {
        return Function.VivifiedWrapper.convert(this.f22880a.finisher());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8683k) {
            obj = ((C8683k) obj).f22880a;
        }
        return this.f22880a.equals(obj);
    }

    /* renamed from: f */
    public final /* synthetic */ InterfaceC8438K0 m17446f() {
        return C8434I0.m17705a(this.f22880a.supplier());
    }

    public final /* synthetic */ int hashCode() {
        return this.f22880a.hashCode();
    }
}

package p164j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import p164j$.util.function.C8423D;
import p164j$.util.function.C8436J0;
import p164j$.util.function.C8457a;
import p164j$.util.function.C8465e;

/* renamed from: j$.util.stream.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8688l implements Collector {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8693m f22886a;

    private /* synthetic */ C8688l(InterfaceC8693m interfaceC8693m) {
        this.f22886a = interfaceC8693m;
    }

    /* renamed from: a */
    public static /* synthetic */ Collector m17434a(InterfaceC8693m interfaceC8693m) {
        if (interfaceC8693m == null) {
            return null;
        }
        return interfaceC8693m instanceof C8683k ? ((C8683k) interfaceC8693m).f22880a : new C8688l(interfaceC8693m);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return C8457a.m17678a(((C8683k) this.f22886a).m17451a());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return ((C8683k) this.f22886a).m17450b();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return C8465e.m17673a(((C8683k) this.f22886a).m17449c());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8693m interfaceC8693m = this.f22886a;
        if (obj instanceof C8688l) {
            obj = ((C8688l) obj).f22886a;
        }
        return interfaceC8693m.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return C8423D.m17711a(((C8683k) this.f22886a).m17447e());
    }

    public final /* synthetic */ int hashCode() {
        return this.f22886a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return C8436J0.m17703a(((C8683k) this.f22886a).m17446f());
    }
}
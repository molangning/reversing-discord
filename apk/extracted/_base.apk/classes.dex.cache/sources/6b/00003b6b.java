package p164j$.util.function;

import java.util.Comparator;
import p164j$.util.concurrent.C8406u;

/* renamed from: j$.util.function.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8461c implements InterfaceC8467f {

    /* renamed from: a */
    public final /* synthetic */ int f22585a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f22586b;

    public /* synthetic */ C8461c(Comparator comparator, int i) {
        this.f22585a = i;
        this.f22586b = comparator;
    }

    @Override // p164j$.util.function.BiFunction
    /* renamed from: a */
    public final BiFunction mo17393a(Function function) {
        switch (this.f22585a) {
            case 0:
                function.getClass();
                return new C8406u(this, function);
            default:
                function.getClass();
                return new C8406u(this, function);
        }
    }

    @Override // p164j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f22585a;
        Comparator comparator = this.f22586b;
        switch (i) {
            case 0:
                return comparator.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
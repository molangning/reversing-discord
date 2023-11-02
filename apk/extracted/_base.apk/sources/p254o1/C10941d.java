package p254o1;

import java.util.List;
import p073e1.C6062k;
import p188k1.C9037a;
import p188k1.C9038b;
import p188k1.C9039c;
import p188k1.C9040d;
import p188k1.C9042f;
import p188k1.C9043g;
import p188k1.C9044h;
import p188k1.C9046j;
import p275p1.AbstractC11368c;
import p291q1.C11680l;
import p311r1.C12020a;

/* renamed from: o1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10941d {
    /* renamed from: a */
    private static <T> List<C12020a<T>> m9503a(AbstractC11368c abstractC11368c, float f, C6062k c6062k, InterfaceC10962n0<T> interfaceC10962n0) {
        return C10970u.m9442a(abstractC11368c, c6062k, f, interfaceC10962n0, false);
    }

    /* renamed from: b */
    private static <T> List<C12020a<T>> m9502b(AbstractC11368c abstractC11368c, C6062k c6062k, InterfaceC10962n0<T> interfaceC10962n0) {
        return C10970u.m9442a(abstractC11368c, c6062k, 1.0f, interfaceC10962n0, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C9037a m9501c(AbstractC11368c abstractC11368c, C6062k c6062k) {
        return new C9037a(m9502b(abstractC11368c, c6062k, C10947g.f28716a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C9046j m9500d(AbstractC11368c abstractC11368c, C6062k c6062k) {
        return new C9046j(m9503a(abstractC11368c, C11680l.m7188e(), c6062k, C10951i.f28721a));
    }

    /* renamed from: e */
    public static C9038b m9499e(AbstractC11368c abstractC11368c, C6062k c6062k) {
        return m9498f(abstractC11368c, c6062k, true);
    }

    /* renamed from: f */
    public static C9038b m9498f(AbstractC11368c abstractC11368c, C6062k c6062k, boolean z) {
        float f;
        if (z) {
            f = C11680l.m7188e();
        } else {
            f = 1.0f;
        }
        return new C9038b(m9503a(abstractC11368c, f, c6062k, C10957l.f28738a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C9039c m9497g(AbstractC11368c abstractC11368c, C6062k c6062k, int i) {
        return new C9039c(m9502b(abstractC11368c, c6062k, new C10963o(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C9040d m9496h(AbstractC11368c abstractC11368c, C6062k c6062k) {
        return new C9040d(m9502b(abstractC11368c, c6062k, C10966r.f28751a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static C9042f m9495i(AbstractC11368c abstractC11368c, C6062k c6062k) {
        return new C9042f(C10970u.m9442a(abstractC11368c, c6062k, C11680l.m7188e(), C10938b0.f28706a, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C9043g m9494j(AbstractC11368c abstractC11368c, C6062k c6062k) {
        return new C9043g(m9502b(abstractC11368c, c6062k, C10948g0.f28717a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C9044h m9493k(AbstractC11368c abstractC11368c, C6062k c6062k) {
        return new C9044h(m9503a(abstractC11368c, C11680l.m7188e(), c6062k, C10950h0.f28719a));
    }
}

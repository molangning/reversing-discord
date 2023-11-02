package p468zg;

import bh.InterfaceC2300c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p142hi.AbstractC7302o0;
import p161ii.C7612u;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11987t0;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC12005z0;
import p429xh.C13801c;
import ph.C11638f;
import th.C12758e;

/* renamed from: zg.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14226h0 {

    /* renamed from: zg.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14227a extends AbstractC9614s implements Function1<InterfaceC11902b, Boolean> {

        /* renamed from: j */
        public static final C14227a f36600j = new C14227a();

        C14227a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11902b it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(C14230i.f36603a.m369b(C13801c.m1496s(it)));
        }
    }

    /* renamed from: zg.h0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14228b extends AbstractC9614s implements Function1<InterfaceC11902b, Boolean> {

        /* renamed from: j */
        public static final C14228b f36601j = new C14228b();

        C14228b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11902b it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(C14214e.f36580n.m412j((InterfaceC12005z0) it));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zg.h0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14229c extends AbstractC9614s implements Function1<InterfaceC11902b, Boolean> {

        /* renamed from: j */
        public static final C14229c f36602j = new C14229c();

        C14229c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11902b it) {
            boolean z;
            C9612q.m13917h(it, "it");
            if (AbstractC10870h.m9814f0(it) && C14218f.m402m(it) != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final boolean m381a(InterfaceC11902b interfaceC11902b) {
        C9612q.m13917h(interfaceC11902b, "<this>");
        if (m378d(interfaceC11902b) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final String m380b(InterfaceC11902b callableMemberDescriptor) {
        InterfaceC11902b m1496s;
        C11638f m413i;
        C9612q.m13917h(callableMemberDescriptor, "callableMemberDescriptor");
        InterfaceC11902b m379c = m379c(callableMemberDescriptor);
        if (m379c == null || (m1496s = C13801c.m1496s(m379c)) == null) {
            return null;
        }
        if (m1496s instanceof InterfaceC11989u0) {
            return C14230i.f36603a.m370a(m1496s);
        }
        if (!(m1496s instanceof InterfaceC12005z0) || (m413i = C14214e.f36580n.m413i((InterfaceC12005z0) m1496s)) == null) {
            return null;
        }
        return m413i.m7426b();
    }

    /* renamed from: c */
    private static final InterfaceC11902b m379c(InterfaceC11902b interfaceC11902b) {
        if (AbstractC10870h.m9814f0(interfaceC11902b)) {
            return m378d(interfaceC11902b);
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends InterfaceC11902b> T m378d(T t) {
        boolean z;
        C9612q.m13917h(t, "<this>");
        if (!C14232i0.f36605a.m352g().contains(t.getName()) && !C14222g.f36589a.m390d().contains(C13801c.m1496s(t).getName())) {
            return null;
        }
        if (t instanceof InterfaceC11989u0) {
            z = true;
        } else {
            z = t instanceof InterfaceC11987t0;
        }
        if (z) {
            return (T) C13801c.m1509f(t, false, C14227a.f36600j, 1, null);
        }
        if (!(t instanceof InterfaceC12005z0)) {
            return null;
        }
        return (T) C13801c.m1509f(t, false, C14228b.f36601j, 1, null);
    }

    /* renamed from: e */
    public static final <T extends InterfaceC11902b> T m377e(T t) {
        C9612q.m13917h(t, "<this>");
        T t2 = (T) m378d(t);
        if (t2 != null) {
            return t2;
        }
        C14218f c14218f = C14218f.f36586n;
        C11638f name = t.getName();
        C9612q.m13918g(name, "name");
        if (!c14218f.m403l(name)) {
            return null;
        }
        return (T) C13801c.m1509f(t, false, C14229c.f36602j, 1, null);
    }

    /* renamed from: f */
    public static final boolean m376f(InterfaceC11914e interfaceC11914e, InterfaceC11897a specialCallableDescriptor) {
        C9612q.m13917h(interfaceC11914e, "<this>");
        C9612q.m13917h(specialCallableDescriptor, "specialCallableDescriptor");
        InterfaceC11947m mo4163b = specialCallableDescriptor.mo4163b();
        C9612q.m13919f(mo4163b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC7302o0 mo4224p = ((InterfaceC11914e) mo4163b).mo4224p();
        C9612q.m13918g(mo4224p, "specialCallableDescripto…ssDescriptor).defaultType");
        InterfaceC11914e m4093s = C12758e.m4093s(interfaceC11914e);
        while (true) {
            boolean z = false;
            if (m4093s == null) {
                return false;
            }
            if (!(m4093s instanceof InterfaceC2300c)) {
                if (C7612u.m20241b(m4093s.mo4224p(), mo4224p) != null) {
                    z = true;
                }
                if (z) {
                    return !AbstractC10870h.m9814f0(m4093s);
                }
            }
            m4093s = C12758e.m4093s(m4093s);
        }
    }

    /* renamed from: g */
    public static final boolean m375g(InterfaceC11902b interfaceC11902b) {
        C9612q.m13917h(interfaceC11902b, "<this>");
        return C13801c.m1496s(interfaceC11902b).mo4163b() instanceof InterfaceC2300c;
    }

    /* renamed from: h */
    public static final boolean m374h(InterfaceC11902b interfaceC11902b) {
        C9612q.m13917h(interfaceC11902b, "<this>");
        if (!m375g(interfaceC11902b) && !AbstractC10870h.m9814f0(interfaceC11902b)) {
            return false;
        }
        return true;
    }
}
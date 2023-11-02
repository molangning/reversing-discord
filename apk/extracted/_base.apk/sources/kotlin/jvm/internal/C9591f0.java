package kotlin.jvm.internal;

import kg.C9281k0;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import p140hg.InterfaceC7133e;
import p140hg.InterfaceC7137g;
import p140hg.InterfaceC7139h;

/* renamed from: kotlin.jvm.internal.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9591f0 {

    /* renamed from: a */
    private static final C9593g0 f25337a;

    /* renamed from: b */
    private static final KClass[] f25338b;

    static {
        C9593g0 c9593g0 = null;
        try {
            c9593g0 = (C9593g0) C9281k0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c9593g0 == null) {
            c9593g0 = new C9593g0();
        }
        f25337a = c9593g0;
        f25338b = new KClass[0];
    }

    /* renamed from: a */
    public static KFunction m13970a(C9605m c9605m) {
        return f25337a.mo13961a(c9605m);
    }

    /* renamed from: b */
    public static KClass m13969b(Class cls) {
        return f25337a.mo13960b(cls);
    }

    /* renamed from: c */
    public static KDeclarationContainer m13968c(Class cls) {
        return f25337a.mo13959c(cls, "");
    }

    /* renamed from: d */
    public static KDeclarationContainer m13967d(Class cls, String str) {
        return f25337a.mo13959c(cls, str);
    }

    /* renamed from: e */
    public static InterfaceC7133e m13966e(AbstractC9617v abstractC9617v) {
        return f25337a.mo13958d(abstractC9617v);
    }

    /* renamed from: f */
    public static InterfaceC7137g m13965f(AbstractC9621z abstractC9621z) {
        return f25337a.mo13957e(abstractC9621z);
    }

    /* renamed from: g */
    public static InterfaceC7139h m13964g(AbstractC9582b0 abstractC9582b0) {
        return f25337a.mo13956f(abstractC9582b0);
    }

    /* renamed from: h */
    public static String m13963h(InterfaceC9603l interfaceC9603l) {
        return f25337a.mo13955g(interfaceC9603l);
    }

    /* renamed from: i */
    public static String m13962i(AbstractC9614s abstractC9614s) {
        return f25337a.mo13954h(abstractC9614s);
    }
}

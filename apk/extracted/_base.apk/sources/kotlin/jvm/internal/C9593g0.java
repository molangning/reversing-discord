package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import p140hg.InterfaceC7133e;
import p140hg.InterfaceC7137g;
import p140hg.InterfaceC7139h;

/* renamed from: kotlin.jvm.internal.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9593g0 {
    /* renamed from: a */
    public KFunction mo13961a(C9605m c9605m) {
        return c9605m;
    }

    /* renamed from: b */
    public KClass mo13960b(Class cls) {
        return new C9594h(cls);
    }

    /* renamed from: c */
    public KDeclarationContainer mo13959c(Class cls, String str) {
        return new C9620y(cls, str);
    }

    /* renamed from: d */
    public InterfaceC7133e mo13958d(AbstractC9617v abstractC9617v) {
        return abstractC9617v;
    }

    /* renamed from: e */
    public InterfaceC7137g mo13957e(AbstractC9621z abstractC9621z) {
        return abstractC9621z;
    }

    /* renamed from: f */
    public InterfaceC7139h mo13956f(AbstractC9582b0 abstractC9582b0) {
        return abstractC9582b0;
    }

    /* renamed from: g */
    public String mo13955g(InterfaceC9603l interfaceC9603l) {
        String obj = interfaceC9603l.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    /* renamed from: h */
    public String mo13954h(AbstractC9614s abstractC9614s) {
        return mo13955g(abstractC9614s);
    }
}

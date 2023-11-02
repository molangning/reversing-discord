package p312r2;

import java.util.Collection;
import p276p2.InterfaceC11373a;
import p292q2.InterfaceC11695i;

/* renamed from: r2.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC12034c {

    /* renamed from: r2.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC12035a {
        /* renamed from: a */
        long mo6532a();

        String getId();

        long getSize();
    }

    /* renamed from: r2.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC12036b {
        /* renamed from: a */
        InterfaceC11373a mo6531a(Object obj);

        /* renamed from: b */
        void mo6530b(InterfaceC11695i interfaceC11695i, Object obj);

        /* renamed from: c */
        boolean mo6529c();
    }

    /* renamed from: a */
    void mo6510a();

    /* renamed from: b */
    void mo6509b();

    /* renamed from: c */
    boolean mo6508c(String str, Object obj);

    /* renamed from: d */
    InterfaceC12036b mo6507d(String str, Object obj);

    /* renamed from: e */
    boolean mo6506e(String str, Object obj);

    /* renamed from: f */
    InterfaceC11373a mo6505f(String str, Object obj);

    /* renamed from: g */
    Collection<InterfaceC12035a> mo6504g();

    /* renamed from: h */
    long mo6503h(InterfaceC12035a interfaceC12035a);

    boolean isExternal();

    long remove(String str);
}
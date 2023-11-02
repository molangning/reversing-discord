package p069dh;

import gh.InterfaceC6777n;
import gh.InterfaceC6781r;
import gh.InterfaceC6786w;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import ph.C11638f;

/* renamed from: dh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC5841b {

    /* renamed from: dh.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C5842a implements InterfaceC5841b {

        /* renamed from: a */
        public static final C5842a f16714a = new C5842a();

        private C5842a() {
        }

        @Override // p069dh.InterfaceC5841b
        /* renamed from: a */
        public Set<C11638f> mo24384a() {
            Set<C11638f> m14007d;
            m14007d = C9560w.m14007d();
            return m14007d;
        }

        @Override // p069dh.InterfaceC5841b
        /* renamed from: b */
        public Set<C11638f> mo24383b() {
            Set<C11638f> m14007d;
            m14007d = C9560w.m14007d();
            return m14007d;
        }

        @Override // p069dh.InterfaceC5841b
        /* renamed from: c */
        public Set<C11638f> mo24382c() {
            Set<C11638f> m14007d;
            m14007d = C9560w.m14007d();
            return m14007d;
        }

        @Override // p069dh.InterfaceC5841b
        /* renamed from: d */
        public InterfaceC6786w mo24381d(C11638f name) {
            C9612q.m13917h(name, "name");
            return null;
        }

        @Override // p069dh.InterfaceC5841b
        /* renamed from: f */
        public InterfaceC6777n mo24379f(C11638f name) {
            C9612q.m13917h(name, "name");
            return null;
        }

        @Override // p069dh.InterfaceC5841b
        /* renamed from: g */
        public List<InterfaceC6781r> mo24380e(C11638f name) {
            List<InterfaceC6781r> m14104i;
            C9612q.m13917h(name, "name");
            m14104i = C9545j.m14104i();
            return m14104i;
        }
    }

    /* renamed from: a */
    Set<C11638f> mo24384a();

    /* renamed from: b */
    Set<C11638f> mo24383b();

    /* renamed from: c */
    Set<C11638f> mo24382c();

    /* renamed from: d */
    InterfaceC6786w mo24381d(C11638f c11638f);

    /* renamed from: e */
    Collection<InterfaceC6781r> mo24380e(C11638f c11638f);

    /* renamed from: f */
    InterfaceC6777n mo24379f(C11638f c11638f);
}

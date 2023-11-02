package p247nb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p367ub.InterfaceC12944c;
import p423xb.InterfaceC13776b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: nb.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10536d0 extends AbstractC10527a {

    /* renamed from: a */
    private final Set<Class<?>> f27522a;

    /* renamed from: b */
    private final Set<Class<?>> f27523b;

    /* renamed from: c */
    private final Set<Class<?>> f27524c;

    /* renamed from: d */
    private final Set<Class<?>> f27525d;

    /* renamed from: e */
    private final Set<Class<?>> f27526e;

    /* renamed from: f */
    private final Set<Class<?>> f27527f;

    /* renamed from: g */
    private final InterfaceC10538e f27528g;

    /* renamed from: nb.d0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C10537a implements InterfaceC12944c {

        /* renamed from: a */
        private final Set<Class<?>> f27529a;

        /* renamed from: b */
        private final InterfaceC12944c f27530b;

        public C10537a(Set<Class<?>> set, InterfaceC12944c interfaceC12944c) {
            this.f27529a = set;
            this.f27530b = interfaceC12944c;
        }
    }

    public C10536d0(C10533d<?> c10533d, InterfaceC10538e interfaceC10538e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C10558q c10558q : c10533d.m11306e()) {
            if (c10558q.m11239d()) {
                if (c10558q.m11237f()) {
                    hashSet4.add(c10558q.m11241b());
                } else {
                    hashSet.add(c10558q.m11241b());
                }
            } else if (c10558q.m11240c()) {
                hashSet3.add(c10558q.m11241b());
            } else if (c10558q.m11237f()) {
                hashSet5.add(c10558q.m11241b());
            } else {
                hashSet2.add(c10558q.m11241b());
            }
        }
        if (!c10533d.m11303h().isEmpty()) {
            hashSet.add(InterfaceC12944c.class);
        }
        this.f27522a = Collections.unmodifiableSet(hashSet);
        this.f27523b = Collections.unmodifiableSet(hashSet2);
        this.f27524c = Collections.unmodifiableSet(hashSet3);
        this.f27525d = Collections.unmodifiableSet(hashSet4);
        this.f27526e = Collections.unmodifiableSet(hashSet5);
        this.f27527f = c10533d.m11303h();
        this.f27528g = interfaceC10538e;
    }

    @Override // p247nb.AbstractC10527a, p247nb.InterfaceC10538e
    /* renamed from: a */
    public <T> T mo11278a(Class<T> cls) {
        if (this.f27522a.contains(cls)) {
            T t = (T) this.f27528g.mo11278a(cls);
            if (!cls.equals(InterfaceC12944c.class)) {
                return t;
            }
            return (T) new C10537a(this.f27527f, (InterfaceC12944c) t);
        }
        throw new C10560s(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // p247nb.InterfaceC10538e
    /* renamed from: b */
    public <T> InterfaceC13776b<Set<T>> mo11277b(Class<T> cls) {
        if (this.f27526e.contains(cls)) {
            return this.f27528g.mo11277b(cls);
        }
        throw new C10560s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // p247nb.AbstractC10527a, p247nb.InterfaceC10538e
    /* renamed from: c */
    public <T> Set<T> mo11276c(Class<T> cls) {
        if (this.f27525d.contains(cls)) {
            return this.f27528g.mo11276c(cls);
        }
        throw new C10560s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // p247nb.InterfaceC10538e
    /* renamed from: d */
    public <T> InterfaceC13776b<T> mo11275d(Class<T> cls) {
        if (this.f27523b.contains(cls)) {
            return this.f27528g.mo11275d(cls);
        }
        throw new C10560s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }
}
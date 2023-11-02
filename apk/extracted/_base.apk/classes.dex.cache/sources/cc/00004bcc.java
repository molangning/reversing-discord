package p326rh;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p326rh.AbstractC12170a;
import p326rh.C12185h;
import p326rh.C12196j;
import p326rh.C12234z;
import p326rh.InterfaceC12210q;

/* renamed from: rh.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC12188i extends AbstractC12170a implements Serializable {

    /* renamed from: rh.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static /* synthetic */ class C12189a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31728a;

        static {
            int[] iArr = new int[C12234z.EnumC12241c.values().length];
            f31728a = iArr;
            try {
                iArr[C12234z.EnumC12241c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31728a[C12234z.EnumC12241c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: rh.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC12190b<MessageType extends AbstractC12188i, BuilderType extends AbstractC12190b> extends AbstractC12170a.AbstractC12171a<BuilderType> {

        /* renamed from: j */
        private AbstractC12177d f31729j = AbstractC12177d.f31693j;

        @Override // 
        /* renamed from: m */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: n */
        public final AbstractC12177d m5831n() {
            return this.f31729j;
        }

        /* renamed from: p */
        public abstract BuilderType mo5830p(MessageType messagetype);

        /* renamed from: q */
        public final BuilderType m5829q(AbstractC12177d abstractC12177d) {
            this.f31729j = abstractC12177d;
            return this;
        }
    }

    /* renamed from: rh.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC12191c<MessageType extends AbstractC12192d<MessageType>, BuilderType extends AbstractC12191c<MessageType, BuilderType>> extends AbstractC12190b<MessageType, BuilderType> implements InterfaceC12212r {

        /* renamed from: k */
        private C12185h<C12194e> f31730k = C12185h.m5858g();

        /* renamed from: l */
        private boolean f31731l;

        /* renamed from: s */
        public C12185h<C12194e> m5827s() {
            this.f31730k.m5848q();
            this.f31731l = false;
            return this.f31730k;
        }

        /* renamed from: t */
        private void m5826t() {
            if (!this.f31731l) {
                this.f31730k = this.f31730k.clone();
                this.f31731l = true;
            }
        }

        /* renamed from: u */
        public final void m5825u(MessageType messagetype) {
            m5826t();
            this.f31730k.m5847r(((AbstractC12192d) messagetype).f31732k);
        }
    }

    /* renamed from: rh.i$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12194e implements C12185h.InterfaceC12187b<C12194e> {

        /* renamed from: j */
        final C12196j.InterfaceC12198b<?> f31737j;

        /* renamed from: k */
        final int f31738k;

        /* renamed from: l */
        final C12234z.EnumC12236b f31739l;

        /* renamed from: m */
        final boolean f31740m;

        /* renamed from: n */
        final boolean f31741n;

        C12194e(C12196j.InterfaceC12198b<?> interfaceC12198b, int i, C12234z.EnumC12236b enumC12236b, boolean z, boolean z2) {
            this.f31737j = interfaceC12198b;
            this.f31738k = i;
            this.f31739l = enumC12236b;
            this.f31740m = z;
            this.f31741n = z2;
        }

        @Override // p326rh.C12185h.InterfaceC12187b
        /* renamed from: O */
        public C12234z.EnumC12241c mo5812O() {
            return this.f31739l.m5678a();
        }

        @Override // p326rh.C12185h.InterfaceC12187b
        /* renamed from: P */
        public boolean mo5811P() {
            return this.f31741n;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C12194e c12194e) {
            return this.f31738k - c12194e.f31738k;
        }

        /* renamed from: b */
        public C12196j.InterfaceC12198b<?> m5809b() {
            return this.f31737j;
        }

        @Override // p326rh.C12185h.InterfaceC12187b
        public int getNumber() {
            return this.f31738k;
        }

        @Override // p326rh.C12185h.InterfaceC12187b
        /* renamed from: u */
        public boolean mo5808u() {
            return this.f31740m;
        }

        @Override // p326rh.C12185h.InterfaceC12187b
        /* renamed from: x */
        public C12234z.EnumC12236b mo5807x() {
            return this.f31739l;
        }

        @Override // p326rh.C12185h.InterfaceC12187b
        /* renamed from: y */
        public InterfaceC12210q.InterfaceC12211a mo5806y(InterfaceC12210q.InterfaceC12211a interfaceC12211a, InterfaceC12210q interfaceC12210q) {
            return ((AbstractC12190b) interfaceC12211a).mo5830p((AbstractC12188i) interfaceC12210q);
        }
    }

    /* renamed from: rh.i$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12195f<ContainingType extends InterfaceC12210q, Type> {

        /* renamed from: a */
        final ContainingType f31742a;

        /* renamed from: b */
        final Type f31743b;

        /* renamed from: c */
        final InterfaceC12210q f31744c;

        /* renamed from: d */
        final C12194e f31745d;

        /* renamed from: e */
        final Class f31746e;

        /* renamed from: f */
        final Method f31747f;

        C12195f(ContainingType containingtype, Type type, InterfaceC12210q interfaceC12210q, C12194e c12194e, Class cls) {
            if (containingtype != null) {
                if (c12194e.mo5807x() == C12234z.EnumC12236b.f31826v && interfaceC12210q == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f31742a = containingtype;
                this.f31743b = type;
                this.f31744c = interfaceC12210q;
                this.f31745d = c12194e;
                this.f31746e = cls;
                if (C12196j.InterfaceC12197a.class.isAssignableFrom(cls)) {
                    this.f31747f = AbstractC12188i.m5837l(cls, "valueOf", Integer.TYPE);
                    return;
                } else {
                    this.f31747f = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        /* renamed from: a */
        Object m5805a(Object obj) {
            if (this.f31745d.mo5808u()) {
                if (this.f31745d.mo5812O() == C12234z.EnumC12241c.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        arrayList.add(m5801e(obj2));
                    }
                    return arrayList;
                }
                return obj;
            }
            return m5801e(obj);
        }

        /* renamed from: b */
        public ContainingType m5804b() {
            return this.f31742a;
        }

        /* renamed from: c */
        public InterfaceC12210q m5803c() {
            return this.f31744c;
        }

        /* renamed from: d */
        public int m5802d() {
            return this.f31745d.getNumber();
        }

        /* renamed from: e */
        Object m5801e(Object obj) {
            if (this.f31745d.mo5812O() == C12234z.EnumC12241c.ENUM) {
                return AbstractC12188i.m5836m(this.f31747f, null, (Integer) obj);
            }
            return obj;
        }

        /* renamed from: f */
        Object m5800f(Object obj) {
            if (this.f31745d.mo5812O() == C12234z.EnumC12241c.ENUM) {
                return Integer.valueOf(((C12196j.InterfaceC12197a) obj).getNumber());
            }
            return obj;
        }
    }

    public AbstractC12188i() {
    }

    /* renamed from: l */
    static Method m5837l(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + valueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(valueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e);
        }
    }

    /* renamed from: m */
    static Object m5836m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: o */
    public static <ContainingType extends InterfaceC12210q, Type> C12195f<ContainingType, Type> m5835o(ContainingType containingtype, InterfaceC12210q interfaceC12210q, C12196j.InterfaceC12198b<?> interfaceC12198b, int i, C12234z.EnumC12236b enumC12236b, boolean z, Class cls) {
        return new C12195f<>(containingtype, Collections.emptyList(), interfaceC12210q, new C12194e(interfaceC12198b, i, enumC12236b, true, z), cls);
    }

    /* renamed from: p */
    public static <ContainingType extends InterfaceC12210q, Type> C12195f<ContainingType, Type> m5834p(ContainingType containingtype, Type type, InterfaceC12210q interfaceC12210q, C12196j.InterfaceC12198b<?> interfaceC12198b, int i, C12234z.EnumC12236b enumC12236b, Class cls) {
        return new C12195f<>(containingtype, type, interfaceC12210q, new C12194e(interfaceC12198b, i, enumC12236b, false, false), cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0045  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <MessageType extends p326rh.InterfaceC12210q> boolean m5833r(p326rh.C12185h<p326rh.AbstractC12188i.C12194e> r5, MessageType r6, p326rh.C12180e r7, p326rh.C12181f r8, p326rh.C12183g r9, int r10) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p326rh.AbstractC12188i.m5833r(rh.h, rh.q, rh.e, rh.f, rh.g, int):boolean");
    }

    @Override // p326rh.InterfaceC12210q
    /* renamed from: g */
    public InterfaceC12213s<? extends InterfaceC12210q> mo5764g() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* renamed from: n */
    public void mo5823n() {
    }

    /* renamed from: q */
    public boolean mo5822q(C12180e c12180e, C12181f c12181f, C12183g c12183g, int i) {
        return c12180e.m5977P(i, c12181f);
    }

    /* renamed from: rh.i$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static abstract class AbstractC12192d<MessageType extends AbstractC12192d<MessageType>> extends AbstractC12188i implements InterfaceC12212r {

        /* renamed from: k */
        private final C12185h<C12194e> f31732k;

        /* renamed from: rh.i$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public class C12193a {

            /* renamed from: a */
            private final Iterator<Map.Entry<C12194e, Object>> f31733a;

            /* renamed from: b */
            private Map.Entry<C12194e, Object> f31734b;

            /* renamed from: c */
            private final boolean f31735c;

            /* synthetic */ C12193a(AbstractC12192d abstractC12192d, boolean z, C12189a c12189a) {
                this(z);
            }

            /* renamed from: a */
            public void m5813a(int i, C12181f c12181f) {
                while (true) {
                    Map.Entry<C12194e, Object> entry = this.f31734b;
                    if (entry != null && entry.getKey().getNumber() < i) {
                        C12194e key = this.f31734b.getKey();
                        if (this.f31735c && key.mo5812O() == C12234z.EnumC12241c.MESSAGE && !key.mo5808u()) {
                            c12181f.m5909f0(key.getNumber(), (InterfaceC12210q) this.f31734b.getValue());
                        } else {
                            C12185h.m5839z(key, this.f31734b.getValue(), c12181f);
                        }
                        if (this.f31733a.hasNext()) {
                            this.f31734b = this.f31733a.next();
                        } else {
                            this.f31734b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private C12193a(boolean z) {
                AbstractC12192d.this = r2;
                Iterator<Map.Entry<C12194e, Object>> m5849p = r2.f31732k.m5849p();
                this.f31733a = m5849p;
                if (m5849p.hasNext()) {
                    this.f31734b = m5849p.next();
                }
                this.f31735c = z;
            }
        }

        public AbstractC12192d() {
            this.f31732k = C12185h.m5845t();
        }

        /* renamed from: A */
        private void m5824A(C12195f<MessageType, ?> c12195f) {
            if (c12195f.m5804b() == mo5762f()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        @Override // p326rh.AbstractC12188i
        /* renamed from: n */
        public void mo5823n() {
            this.f31732k.m5848q();
        }

        @Override // p326rh.AbstractC12188i
        /* renamed from: q */
        public boolean mo5822q(C12180e c12180e, C12181f c12181f, C12183g c12183g, int i) {
            return AbstractC12188i.m5833r(this.f31732k, mo5762f(), c12180e, c12181f, c12183g, i);
        }

        /* renamed from: t */
        public boolean m5820t() {
            return this.f31732k.m5851n();
        }

        /* renamed from: u */
        public int m5819u() {
            return this.f31732k.m5854k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: v */
        public final <Type> Type m5818v(C12195f<MessageType, Type> c12195f) {
            m5824A(c12195f);
            Object m5857h = this.f31732k.m5857h(c12195f.f31745d);
            if (m5857h == null) {
                return c12195f.f31743b;
            }
            return (Type) c12195f.m5805a(m5857h);
        }

        /* renamed from: w */
        public final <Type> Type m5817w(C12195f<MessageType, List<Type>> c12195f, int i) {
            m5824A(c12195f);
            return (Type) c12195f.m5801e(this.f31732k.m5856i(c12195f.f31745d, i));
        }

        /* renamed from: x */
        public final <Type> int m5816x(C12195f<MessageType, List<Type>> c12195f) {
            m5824A(c12195f);
            return this.f31732k.m5855j(c12195f.f31745d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: y */
        public final <Type> boolean m5815y(C12195f<MessageType, Type> c12195f) {
            m5824A(c12195f);
            return this.f31732k.m5852m(c12195f.f31745d);
        }

        /* renamed from: z */
        public AbstractC12192d<MessageType>.C12193a m5814z() {
            return new C12193a(this, false, null);
        }

        public AbstractC12192d(AbstractC12191c<MessageType, ?> abstractC12191c) {
            this.f31732k = abstractC12191c.m5827s();
        }
    }

    public AbstractC12188i(AbstractC12190b abstractC12190b) {
    }
}
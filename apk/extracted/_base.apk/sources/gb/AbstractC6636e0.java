package gb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p102fb.C6378h;
import p102fb.InterfaceC6386l;

/* renamed from: gb.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6636e0<K0, V0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.e0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6637a extends AbstractC6641e<Object> {

        /* renamed from: a */
        final /* synthetic */ int f18815a;

        C6637a(int i) {
            this.f18815a = i;
        }

        @Override // gb.AbstractC6636e0.AbstractC6641e
        /* renamed from: c */
        <K, V> Map<K, Collection<V>> mo22256c() {
            return C6666k0.m22190c(this.f18815a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gb.e0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6638b extends AbstractC6641e<K0> {

        /* renamed from: a */
        final /* synthetic */ Comparator f18816a;

        C6638b(Comparator comparator) {
            this.f18816a = comparator;
        }

        @Override // gb.AbstractC6636e0.AbstractC6641e
        /* renamed from: c */
        <K extends K0, V> Map<K, Collection<V>> mo22256c() {
            return new TreeMap(this.f18816a);
        }
    }

    /* renamed from: gb.e0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C6639c<V> implements InterfaceC6386l<List<V>>, Serializable {

        /* renamed from: j */
        private final int f18817j;

        C6639c(int i) {
            this.f18817j = C6653i.m22245b(i, "expectedValuesPerKey");
        }

        @Override // p102fb.InterfaceC6386l
        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f18817j);
        }
    }

    /* renamed from: gb.e0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC6640d<K0, V0> extends AbstractC6636e0<K0, V0> {
        AbstractC6640d() {
            super(null);
        }

        /* renamed from: e */
        public abstract <K extends K0, V extends V0> InterfaceC6717z<K, V> mo22255e();
    }

    /* renamed from: gb.e0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC6641e<K0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gb.e0$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C6642a extends AbstractC6640d<K0, Object> {

            /* renamed from: a */
            final /* synthetic */ int f18818a;

            C6642a(int i) {
                this.f18818a = i;
            }

            @Override // gb.AbstractC6636e0.AbstractC6640d
            /* renamed from: e */
            public <K extends K0, V> InterfaceC6717z<K, V> mo22255e() {
                return C6646f0.m22252b(AbstractC6641e.this.mo22256c(), new C6639c(this.f18818a));
            }
        }

        AbstractC6641e() {
        }

        /* renamed from: a */
        public AbstractC6640d<K0, Object> m22258a() {
            return m22257b(2);
        }

        /* renamed from: b */
        public AbstractC6640d<K0, Object> m22257b(int i) {
            C6653i.m22245b(i, "expectedValuesPerKey");
            return new C6642a(i);
        }

        /* renamed from: c */
        abstract <K extends K0, V> Map<K, Collection<V>> mo22256c();
    }

    private AbstractC6636e0() {
    }

    /* synthetic */ AbstractC6636e0(C6637a c6637a) {
        this();
    }

    /* renamed from: a */
    public static AbstractC6641e<Object> m22263a() {
        return m22262b(8);
    }

    /* renamed from: b */
    public static AbstractC6641e<Object> m22262b(int i) {
        C6653i.m22245b(i, "expectedKeys");
        return new C6637a(i);
    }

    /* renamed from: c */
    public static AbstractC6641e<Comparable> m22261c() {
        return m22260d(AbstractC6656j0.m22235f());
    }

    /* renamed from: d */
    public static <K0> AbstractC6641e<K0> m22260d(Comparator<K0> comparator) {
        C6378h.m22834j(comparator);
        return new C6638b(comparator);
    }
}

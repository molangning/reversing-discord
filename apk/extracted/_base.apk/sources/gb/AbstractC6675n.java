package gb;

import java.util.Comparator;
import p177jb.C8889a;
import p177jb.C8891c;
import p177jb.C8893d;

/* renamed from: gb.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6675n {

    /* renamed from: a */
    private static final AbstractC6675n f18871a = new C6676a();

    /* renamed from: b */
    private static final AbstractC6675n f18872b = new C6677b(-1);

    /* renamed from: c */
    private static final AbstractC6675n f18873c = new C6677b(1);

    /* renamed from: gb.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C6676a extends AbstractC6675n {
        C6676a() {
            super(null);
        }

        @Override // gb.AbstractC6675n
        /* renamed from: d */
        public AbstractC6675n mo22165d(int i, int i2) {
            return m22166k(C8891c.m17077d(i, i2));
        }

        @Override // gb.AbstractC6675n
        /* renamed from: e */
        public AbstractC6675n mo22164e(long j, long j2) {
            return m22166k(C8893d.m17066a(j, j2));
        }

        @Override // gb.AbstractC6675n
        /* renamed from: f */
        public <T> AbstractC6675n mo22163f(T t, T t2, Comparator<T> comparator) {
            return m22166k(comparator.compare(t, t2));
        }

        @Override // gb.AbstractC6675n
        /* renamed from: g */
        public AbstractC6675n mo22162g(boolean z, boolean z2) {
            return m22166k(C8889a.m17082a(z, z2));
        }

        @Override // gb.AbstractC6675n
        /* renamed from: h */
        public AbstractC6675n mo22161h(boolean z, boolean z2) {
            return m22166k(C8889a.m17082a(z2, z));
        }

        @Override // gb.AbstractC6675n
        /* renamed from: i */
        public int mo22160i() {
            return 0;
        }

        /* renamed from: k */
        AbstractC6675n m22166k(int i) {
            return i < 0 ? AbstractC6675n.f18872b : i > 0 ? AbstractC6675n.f18873c : AbstractC6675n.f18871a;
        }
    }

    /* renamed from: gb.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C6677b extends AbstractC6675n {

        /* renamed from: d */
        final int f18874d;

        C6677b(int i) {
            super(null);
            this.f18874d = i;
        }

        @Override // gb.AbstractC6675n
        /* renamed from: d */
        public AbstractC6675n mo22165d(int i, int i2) {
            return this;
        }

        @Override // gb.AbstractC6675n
        /* renamed from: e */
        public AbstractC6675n mo22164e(long j, long j2) {
            return this;
        }

        @Override // gb.AbstractC6675n
        /* renamed from: f */
        public <T> AbstractC6675n mo22163f(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // gb.AbstractC6675n
        /* renamed from: g */
        public AbstractC6675n mo22162g(boolean z, boolean z2) {
            return this;
        }

        @Override // gb.AbstractC6675n
        /* renamed from: h */
        public AbstractC6675n mo22161h(boolean z, boolean z2) {
            return this;
        }

        @Override // gb.AbstractC6675n
        /* renamed from: i */
        public int mo22160i() {
            return this.f18874d;
        }
    }

    private AbstractC6675n() {
    }

    /* synthetic */ AbstractC6675n(C6676a c6676a) {
        this();
    }

    /* renamed from: j */
    public static AbstractC6675n m22167j() {
        return f18871a;
    }

    /* renamed from: d */
    public abstract AbstractC6675n mo22165d(int i, int i2);

    /* renamed from: e */
    public abstract AbstractC6675n mo22164e(long j, long j2);

    /* renamed from: f */
    public abstract <T> AbstractC6675n mo22163f(T t, T t2, Comparator<T> comparator);

    /* renamed from: g */
    public abstract AbstractC6675n mo22162g(boolean z, boolean z2);

    /* renamed from: h */
    public abstract AbstractC6675n mo22161h(boolean z, boolean z2);

    /* renamed from: i */
    public abstract int mo22160i();
}

package p271oi;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.AbstractC11864b;

/* renamed from: oi.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11128d<T> extends AbstractC11127c<T> {

    /* renamed from: l */
    public static final C11129a f29103l = new C11129a(null);

    /* renamed from: j */
    private Object[] f29104j;

    /* renamed from: k */
    private int f29105k;

    /* renamed from: oi.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11129a {
        private C11129a() {
        }

        public /* synthetic */ C11129a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: oi.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11130b extends AbstractC11864b<T> {

        /* renamed from: l */
        private int f29106l = -1;

        /* renamed from: m */
        final /* synthetic */ C11128d<T> f29107m;

        C11130b(C11128d<T> c11128d) {
            this.f29107m = c11128d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p304qf.AbstractC11864b
        /* renamed from: a */
        protected void mo502a() {
            do {
                int i = this.f29106l + 1;
                this.f29106l = i;
                if (i >= ((C11128d) this.f29107m).f29104j.length) {
                    break;
                }
            } while (((C11128d) this.f29107m).f29104j[this.f29106l] == null);
            if (this.f29106l >= ((C11128d) this.f29107m).f29104j.length) {
                m6811e();
                return;
            }
            Object obj = ((C11128d) this.f29107m).f29104j[this.f29106l];
            C9612q.m13919f(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            m6810f(obj);
        }
    }

    private C11128d(Object[] objArr, int i) {
        super(null);
        this.f29104j = objArr;
        this.f29105k = i;
    }

    /* renamed from: i */
    private final void m9115i(int i) {
        Object[] objArr = this.f29104j;
        if (objArr.length <= i) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            C9612q.m13918g(copyOf, "copyOf(this, newSize)");
            this.f29104j = copyOf;
        }
    }

    @Override // p271oi.AbstractC11127c
    /* renamed from: a */
    public int mo9100a() {
        return this.f29105k;
    }

    @Override // p271oi.AbstractC11127c
    /* renamed from: e */
    public void mo9099e(int i, T value) {
        C9612q.m13917h(value, "value");
        m9115i(i);
        if (this.f29104j[i] == null) {
            this.f29105k = mo9100a() + 1;
        }
        this.f29104j[i] = value;
    }

    @Override // p271oi.AbstractC11127c
    public T get(int i) {
        Object m14235K;
        m14235K = C9538f.m14235K(this.f29104j, i);
        return (T) m14235K;
    }

    @Override // p271oi.AbstractC11127c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new C11130b(this);
    }

    public C11128d() {
        this(new Object[20], 0);
    }
}

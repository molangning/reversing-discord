package p271oi;

import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;

/* renamed from: oi.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC11131e<K, T> extends AbstractC11124a<K, T> {

    /* renamed from: j */
    private AbstractC11127c<T> f29108j;

    protected AbstractC11131e(AbstractC11127c<T> arrayMap) {
        C9612q.m13917h(arrayMap, "arrayMap");
        this.f29108j = arrayMap;
    }

    @Override // p271oi.AbstractC11124a
    /* renamed from: a */
    public final AbstractC11127c<T> mo9114a() {
        return this.f29108j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final void m9113h(KClass<? extends K> tClass, T value) {
        C9612q.m13917h(tClass, "tClass");
        C9612q.m13917h(value, "value");
        int m9083d = mo9119e().m9083d(tClass);
        int mo9100a = this.f29108j.mo9100a();
        if (mo9100a != 0) {
            if (mo9100a == 1) {
                AbstractC11127c<T> abstractC11127c = this.f29108j;
                C9612q.m13919f(abstractC11127c, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                C11152o c11152o = (C11152o) abstractC11127c;
                if (c11152o.m9098h() == m9083d) {
                    this.f29108j = new C11152o(value, m9083d);
                    return;
                }
                C11128d c11128d = new C11128d();
                this.f29108j = c11128d;
                c11128d.mo9099e(c11152o.m9098h(), c11152o.m9097i());
            }
            this.f29108j.mo9099e(m9083d, value);
            return;
        }
        this.f29108j = new C11152o(value, m9083d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC11131e() {
        /*
            r2 = this;
            oi.i r0 = p271oi.C11142i.f29121j
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.C9612q.m13919f(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p271oi.AbstractC11131e.<init>():void");
    }
}
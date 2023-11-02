package io.sentry;

/* renamed from: io.sentry.k3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC8003k3 implements Comparable<AbstractC8003k3> {
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AbstractC8003k3 abstractC8003k3) {
        return Long.valueOf(mo18864f()).compareTo(Long.valueOf(abstractC8003k3.mo18864f()));
    }

    /* renamed from: b */
    public long mo18866b(AbstractC8003k3 abstractC8003k3) {
        return mo18864f() - abstractC8003k3.mo18864f();
    }

    /* renamed from: c */
    public final boolean m19029c(AbstractC8003k3 abstractC8003k3) {
        return mo18866b(abstractC8003k3) > 0;
    }

    /* renamed from: d */
    public final boolean m19028d(AbstractC8003k3 abstractC8003k3) {
        return mo18866b(abstractC8003k3) < 0;
    }

    /* renamed from: e */
    public long mo18865e(AbstractC8003k3 abstractC8003k3) {
        if (abstractC8003k3 != null && compareTo(abstractC8003k3) < 0) {
            return abstractC8003k3.mo18864f();
        }
        return mo18864f();
    }

    /* renamed from: f */
    public abstract long mo18864f();
}
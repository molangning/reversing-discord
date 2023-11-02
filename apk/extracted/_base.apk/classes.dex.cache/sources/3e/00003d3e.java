package p180jf;

import java.util.concurrent.ThreadFactory;
import ye.AbstractC14015g;

/* renamed from: jf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8922c extends AbstractC14015g {

    /* renamed from: c */
    private static final ThreadFactoryC8924e f23349c = new ThreadFactoryC8924e("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f23350b;

    public C8922c() {
        this(f23349c);
    }

    @Override // ye.AbstractC14015g
    /* renamed from: a */
    public AbstractC14015g.AbstractC14016a mo903a() {
        return new C8923d(this.f23350b);
    }

    public C8922c(ThreadFactory threadFactory) {
        this.f23350b = threadFactory;
    }
}
package p384v8;

import android.content.Context;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p010a9.InterfaceC0109j;
import p205l0.AbstractC9992a;
import p461z8.AbstractC14124f;

/* renamed from: v8.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13148g extends AbstractC9992a implements InterfaceC0109j {

    /* renamed from: o */
    private final Semaphore f34168o;

    /* renamed from: p */
    private final Set f34169p;

    public C13148g(Context context, Set set) {
        super(context);
        this.f34168o = new Semaphore(0);
        this.f34169p = set;
    }

    @Override // p205l0.AbstractC9992a
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object mo3092A() {
        int i = 0;
        for (AbstractC14124f abstractC14124f : this.f34169p) {
            if (abstractC14124f.m603e(this)) {
                i++;
            }
        }
        try {
            this.f34168o.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p205l0.C9994b
    /* renamed from: o */
    protected final void mo3091o() {
        this.f34168o.drainPermits();
        m12651h();
    }
}
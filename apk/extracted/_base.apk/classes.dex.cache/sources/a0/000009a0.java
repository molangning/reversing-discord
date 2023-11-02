package p029b9;

import android.app.PendingIntent;
import android.os.Bundle;
import p441y8.C13930a;

/* renamed from: b9.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC2208s0 extends AbstractC2224z0<Boolean> {

    /* renamed from: d */
    public final int f6209d;

    /* renamed from: e */
    public final Bundle f6210e;

    /* renamed from: f */
    final /* synthetic */ AbstractC2150c f6211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2208s0(AbstractC2150c abstractC2150c, int i, Bundle bundle) {
        super(abstractC2150c, Boolean.TRUE);
        this.f6211f = abstractC2150c;
        this.f6209d = i;
        this.f6210e = bundle;
    }

    @Override // p029b9.AbstractC2224z0
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ void mo33950a(Boolean bool) {
        PendingIntent pendingIntent = null;
        if (this.f6209d == 0) {
            if (!mo33964g()) {
                this.f6211f.m34083g0(1, null);
                mo33965f(new C13930a(8, null));
                return;
            }
            return;
        }
        this.f6211f.m34083g0(1, null);
        Bundle bundle = this.f6210e;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        mo33965f(new C13930a(this.f6209d, pendingIntent));
    }

    @Override // p029b9.AbstractC2224z0
    /* renamed from: b */
    public final void mo33949b() {
    }

    /* renamed from: f */
    protected abstract void mo33965f(C13930a c13930a);

    /* renamed from: g */
    protected abstract boolean mo33964g();
}
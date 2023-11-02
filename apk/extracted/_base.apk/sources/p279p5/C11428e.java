package p279p5;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.Log;

@TargetApi(16)
/* renamed from: p5.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11428e extends AbstractC11423d {

    /* renamed from: f */
    private final Context f29741f;

    public C11428e(Context context) {
        super(context, "jdns_sd");
        this.f29741f = context.getApplicationContext();
    }

    @Override // p279p5.AbstractC11423d, p279p5.C11434k.InterfaceC11435a
    /* renamed from: a */
    public void mo8060a() {
        super.mo8060a();
    }

    @Override // p279p5.AbstractC11423d
    /* renamed from: g */
    public void mo8072g() {
        super.mo8072g();
        try {
            this.f29741f.getSystemService("servicediscovery");
        } catch (Exception e) {
            Log.e("DNSSDBindable", "Can't start NSD_SERVICE: ", e);
        }
    }
}

package p462z9;

import android.content.Context;
import ca.C2472e;
import ca.InterfaceC2470c;
import ca.InterfaceC2471d;
import ca.InterfaceC2481l;
import com.google.android.gms.nearby.messages.internal.C4706u;
import com.google.android.gms.nearby.messages.internal.C4708w;
import p011aa.C0130b;
import p011aa.InterfaceC0129a;
import p029b9.C2198p;
import p063da.C5797j;
import p154i9.C7478d;
import p385v9.C13170b0;
import p385v9.C13192i1;
import p385v9.C13219w;
import p385v9.InterfaceC13213t;
import p461z8.C14107a;

/* renamed from: z9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14138a {
    @Deprecated

    /* renamed from: a */
    public static final C14107a<C0130b> f36325a = new C14107a<>("Nearby.CONNECTIONS_API", C13219w.f34273b, C13219w.f34272a);
    @Deprecated

    /* renamed from: b */
    public static final InterfaceC0129a f36326b = new C13219w();
    @Deprecated

    /* renamed from: c */
    public static final C14107a<C2472e> f36327c = new C14107a<>("Nearby.MESSAGES_API", C4708w.f12910c, C4708w.f12909b);
    @Deprecated

    /* renamed from: d */
    public static final InterfaceC2470c f36328d = C4708w.f12908a;

    /* renamed from: e */
    public static final InterfaceC2481l f36329e = new C5797j();
    @Deprecated

    /* renamed from: f */
    public static final C14107a f36330f = new C14107a("Nearby.BOOTSTRAP_API", C13170b0.f34183b, C13170b0.f34182a);
    @Deprecated

    /* renamed from: g */
    public static final InterfaceC13213t f36331g = new C13170b0();

    /* renamed from: a */
    public static final InterfaceC2471d m594a(Context context) {
        C2198p.m33984k(context, "Context must not be null");
        return new C4706u(context, null);
    }

    /* renamed from: b */
    public static boolean m593b(Context context) {
        if (C7478d.m20598a(context).m20604a("com.google.android.providers.gsf.permission.READ_GSERVICES") != 0) {
            return true;
        }
        return C13192i1.m3043b(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
    }
}

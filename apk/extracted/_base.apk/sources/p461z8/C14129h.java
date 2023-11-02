package p461z8;

import com.google.android.gms.common.api.Status;
import p010a9.C0113l;
import p029b9.C2198p;

/* renamed from: z8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14129h {
    /* renamed from: a */
    public static <R extends InterfaceC14132k> AbstractC14127g<R> m600a(R r, AbstractC14124f abstractC14124f) {
        C2198p.m33984k(r, "Result must not be null");
        C2198p.m33993b(!r.mo596b().m28240H(), "Status code must not be SUCCESS");
        C14137p c14137p = new C14137p(abstractC14124f, r);
        c14137p.setResult(r);
        return c14137p;
    }

    /* renamed from: b */
    public static AbstractC14127g<Status> m599b(Status status, AbstractC14124f abstractC14124f) {
        C2198p.m33984k(status, "Result must not be null");
        C0113l c0113l = new C0113l(abstractC14124f);
        c0113l.setResult(status);
        return c0113l;
    }
}

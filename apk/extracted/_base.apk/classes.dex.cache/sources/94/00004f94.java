package p384v8;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4614c;
import p081e9.C6186a;
import p461z8.AbstractC14124f;
import p461z8.AbstractC14127g;
import p461z8.C14129h;

/* renamed from: v8.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13156o {

    /* renamed from: a */
    private static final C6186a f34173a = new C6186a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static AbstractC14127g m3087a(AbstractC14124f abstractC14124f, Context context, boolean z) {
        f34173a.m23321a("Revoking access", new Object[0]);
        String m3098e = C13144c.m3101b(context).m3098e();
        m3085c(context);
        if (z) {
            return RunnableC13147f.m3093a(m3098e);
        }
        return abstractC14124f.mo606b(new C13154m(abstractC14124f));
    }

    /* renamed from: b */
    public static AbstractC14127g m3086b(AbstractC14124f abstractC14124f, Context context, boolean z) {
        f34173a.m23321a("Signing out", new Object[0]);
        m3085c(context);
        if (z) {
            return C14129h.m599b(Status.f12648o, abstractC14124f);
        }
        return abstractC14124f.mo606b(new C13152k(abstractC14124f));
    }

    /* renamed from: c */
    private static void m3085c(Context context) {
        C13157p.m3084a(context).m3083b();
        for (AbstractC14124f abstractC14124f : AbstractC14124f.m605c()) {
            abstractC14124f.m602f();
        }
        C4614c.m28210a();
    }
}
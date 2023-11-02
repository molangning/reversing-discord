package p062d9;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC4627h;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.InterfaceC0107i;
import p029b9.C2210t;
import p029b9.C2216w;
import p029b9.InterfaceC2214v;
import p319r9.C12116d;
import p461z8.AbstractC14121e;
import p461z8.C14107a;

/* renamed from: d9.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5786d extends AbstractC14121e<C2216w> implements InterfaceC2214v {

    /* renamed from: k */
    private static final C14107a.C14117g<C5787e> f16611k;

    /* renamed from: l */
    private static final C14107a.AbstractC14108a<C5787e, C2216w> f16612l;

    /* renamed from: m */
    private static final C14107a<C2216w> f16613m;

    /* renamed from: n */
    public static final /* synthetic */ int f16614n = 0;

    static {
        C14107a.C14117g<C5787e> c14117g = new C14107a.C14117g<>();
        f16611k = c14117g;
        C5785c c5785c = new C5785c();
        f16612l = c5785c;
        f16613m = new C14107a<>("ClientTelemetry.API", c5785c, c14117g);
    }

    public C5786d(Context context, C2216w c2216w) {
        super(context, f16613m, c2216w, AbstractC14121e.C14122a.f36316c);
    }

    @Override // p029b9.InterfaceC2214v
    /* renamed from: d */
    public final Task<Void> mo24509d(final C2210t c2210t) {
        AbstractC4627h.C4628a m28164a = AbstractC4627h.m28164a();
        m28164a.m28156d(C12116d.f31426a);
        m28164a.m28157c(false);
        m28164a.m28158b(new InterfaceC0107i() { // from class: d9.b
            @Override // p010a9.InterfaceC0107i
            public final void accept(Object obj, Object obj2) {
                C2210t c2210t2 = C2210t.this;
                int i = C5786d.f16614n;
                ((C5783a) ((C5787e) obj).m34112C()).m24510g0(c2210t2);
                ((TaskCompletionSource) obj2).m28011c(null);
            }
        });
        return m627j(m28164a.m28159a());
    }
}
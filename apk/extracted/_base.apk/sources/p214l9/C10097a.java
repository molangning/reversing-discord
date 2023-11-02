package p214l9;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.AbstractC4627h;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.C0091a;
import p010a9.InterfaceC0107i;
import p010a9.InterfaceC0111k;
import p231m9.C10405p;
import p231m9.C10412s;
import p366u9.C12926q0;
import p366u9.C12930s0;
import p366u9.InterfaceC12932t0;
import p461z8.AbstractC14121e;
import p461z8.C14107a;

/* renamed from: l9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10097a extends AbstractC14121e<C14107a.InterfaceC14111d.C14114c> {

    /* renamed from: k */
    private static final C14107a.C14117g<C12926q0> f26321k;

    /* renamed from: l */
    private static final C14107a<C14107a.InterfaceC14111d.C14114c> f26322l;

    static {
        C14107a.C14117g<C12926q0> c14117g = new C14107a.C14117g<>();
        f26321k = c14117g;
        f26322l = new C14107a<>("Fido.FIDO2_API", new C12930s0(), c14117g);
    }

    @Deprecated
    public C10097a(Activity activity) {
        super(activity, (C14107a<C14107a.InterfaceC14111d>) f26322l, (C14107a.InterfaceC14111d) null, (InterfaceC0111k) new C0091a());
    }

    /* renamed from: C */
    public Task<PendingIntent> m12307C(final C10405p c10405p) {
        return m625l(AbstractC4627h.m28164a().m28158b(new InterfaceC0107i(this, c10405p) { // from class: l9.c

            /* renamed from: a */
            private final C10097a f26325a;

            /* renamed from: b */
            private final C10405p f26326b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f26325a = this;
                this.f26326b = c10405p;
            }

            @Override // p010a9.InterfaceC0107i
            public final void accept(Object obj, Object obj2) {
                C10097a c10097a = this.f26325a;
                C10405p c10405p2 = this.f26326b;
                ((InterfaceC12932t0) ((C12926q0) obj).m34112C()).mo3652D(new BinderC10100d(c10097a, (TaskCompletionSource) obj2), c10405p2);
            }
        }).m28159a());
    }

    /* renamed from: D */
    public Task<PendingIntent> m12306D(final C10412s c10412s) {
        return m625l(AbstractC4627h.m28164a().m28158b(new InterfaceC0107i(this, c10412s) { // from class: l9.b

            /* renamed from: a */
            private final C10097a f26323a;

            /* renamed from: b */
            private final C10412s f26324b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f26323a = this;
                this.f26324b = c10412s;
            }

            @Override // p010a9.InterfaceC0107i
            public final void accept(Object obj, Object obj2) {
                C10097a c10097a = this.f26323a;
                C10412s c10412s2 = this.f26324b;
                ((InterfaceC12932t0) ((C12926q0) obj).m34112C()).mo3651W(new BinderC10101e(c10097a, (TaskCompletionSource) obj2), c10412s2);
            }
        }).m28159a());
    }
}

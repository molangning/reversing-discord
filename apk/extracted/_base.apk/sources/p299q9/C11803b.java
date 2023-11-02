package p299q9;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC4627h;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.InterfaceC0107i;
import p338s8.AbstractC12435b;

/* renamed from: q9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11803b extends AbstractC12435b {
    public C11803b(Context context) {
        super(context);
    }

    @Override // p338s8.AbstractC12435b
    /* renamed from: C */
    public final Task<Void> mo5281C() {
        return m620q(AbstractC4627h.m28164a().m28158b(new InterfaceC0107i() { // from class: q9.j
            @Override // p010a9.InterfaceC0107i
            public final void accept(Object obj, Object obj2) {
                ((C11807f) ((C11810i) obj).m34112C()).m6836e(new BinderC11812k(C11803b.this, (TaskCompletionSource) obj2));
            }
        }).m28156d(C11804c.f30796c).m28155e(1567).m28159a());
    }
}

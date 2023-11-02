package p029b9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import p029b9.C2194o;
import p461z8.AbstractC14127g;

/* renamed from: b9.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C2182k0 implements AbstractC14127g.InterfaceC14128a {

    /* renamed from: a */
    final /* synthetic */ AbstractC14127g f6159a;

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f6160b;

    /* renamed from: c */
    final /* synthetic */ C2194o.InterfaceC2195a f6161c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC2192n0 f6162d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2182k0(AbstractC14127g abstractC14127g, TaskCompletionSource taskCompletionSource, C2194o.InterfaceC2195a interfaceC2195a, InterfaceC2192n0 interfaceC2192n0) {
        this.f6159a = abstractC14127g;
        this.f6160b = taskCompletionSource;
        this.f6161c = interfaceC2195a;
        this.f6162d = interfaceC2192n0;
    }

    @Override // p461z8.AbstractC14127g.InterfaceC14128a
    /* renamed from: a */
    public final void mo601a(Status status) {
        if (status.m28240H()) {
            this.f6160b.m28011c(this.f6161c.mo28256a(this.f6159a.await(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f6160b.m28012b(C2147b.m34123a(status));
    }
}

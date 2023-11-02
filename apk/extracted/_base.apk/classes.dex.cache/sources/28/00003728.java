package p153i8;

import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.ArrayList;
import java.util.Map;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: i8.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC7448f implements DataSource {

    /* renamed from: a */
    private final boolean f19991a;

    /* renamed from: b */
    private final ArrayList<InterfaceC7472x> f19992b = new ArrayList<>(1);

    /* renamed from: c */
    private int f19993c;

    /* renamed from: d */
    private C4515a f19994d;

    public AbstractC7448f(boolean z) {
        this.f19991a = z;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public /* synthetic */ Map mo6321d() {
        return C7454k.m20649a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: f */
    public final void mo6320f(InterfaceC7472x interfaceC7472x) {
        C9149a.m16448e(interfaceC7472x);
        if (!this.f19992b.contains(interfaceC7472x)) {
            this.f19992b.add(interfaceC7472x);
            this.f19993c++;
        }
    }

    /* renamed from: o */
    public final void m20654o(int i) {
        C4515a c4515a = (C4515a) C9191p0.m16243j(this.f19994d);
        for (int i2 = 0; i2 < this.f19993c; i2++) {
            this.f19992b.get(i2).mo20609e(this, c4515a, this.f19991a, i);
        }
    }

    /* renamed from: p */
    public final void m20653p() {
        C4515a c4515a = (C4515a) C9191p0.m16243j(this.f19994d);
        for (int i = 0; i < this.f19993c; i++) {
            this.f19992b.get(i).mo20610b(this, c4515a, this.f19991a);
        }
        this.f19994d = null;
    }

    /* renamed from: q */
    public final void m20652q(C4515a c4515a) {
        for (int i = 0; i < this.f19993c; i++) {
            this.f19992b.get(i).mo20607h(this, c4515a, this.f19991a);
        }
    }

    /* renamed from: r */
    public final void m20651r(C4515a c4515a) {
        this.f19994d = c4515a;
        for (int i = 0; i < this.f19993c; i++) {
            this.f19992b.get(i).mo20608g(this, c4515a, this.f19991a);
        }
    }
}
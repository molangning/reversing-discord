package p317r7;

import p151i6.C7399j;
import p195k8.C9149a;
import p228m6.C10271g;
import p229m7.InterfaceC10320m0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r7.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12090m implements InterfaceC10320m0 {

    /* renamed from: j */
    private final int f31338j;

    /* renamed from: k */
    private final C12094q f31339k;

    /* renamed from: l */
    private int f31340l = -1;

    public C12090m(C12094q c12094q, int i) {
        this.f31339k = c12094q;
        this.f31338j = i;
    }

    /* renamed from: c */
    private boolean m6234c() {
        int i = this.f31340l;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: a */
    public void mo6236a() {
        int i = this.f31340l;
        if (i != -2) {
            if (i == -1) {
                this.f31339k.m6210T();
                return;
            } else if (i != -3) {
                this.f31339k.m6209U(i);
                return;
            } else {
                return;
            }
        }
        throw new C12103s(this.f31339k.m6179t().m29144a(this.f31338j).m11721a(0).f11197u);
    }

    /* renamed from: b */
    public void m6235b() {
        boolean z;
        if (this.f31340l == -1) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f31340l = this.f31339k.m6174y(this.f31338j);
    }

    /* renamed from: d */
    public void m6233d() {
        if (this.f31340l != -1) {
            this.f31339k.m6183o0(this.f31338j);
            this.f31340l = -1;
        }
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: e */
    public boolean mo6232e() {
        if (this.f31340l != -3 && (!m6234c() || !this.f31339k.m6213Q(this.f31340l))) {
            return false;
        }
        return true;
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: i */
    public int mo6231i(C7399j c7399j, C10271g c10271g, boolean z) {
        if (this.f31340l == -3) {
            c10271g.m11993e(4);
            return -4;
        } else if (!m6234c()) {
            return -3;
        } else {
            return this.f31339k.m6196d0(this.f31340l, c7399j, c10271g, z);
        }
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: s */
    public int mo6230s(long j) {
        if (m6234c()) {
            return this.f31339k.m6184n0(this.f31340l, j);
        }
        return 0;
    }
}
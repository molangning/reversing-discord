package p174j8;

import com.google.android.exoplayer2.upstream.cache.InterfaceC4521a;
import com.google.android.exoplayer2.upstream.cache.InterfaceC4528d;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: j8.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8874j implements InterfaceC4528d {

    /* renamed from: a */
    private final long f23256a;

    /* renamed from: b */
    private final TreeSet<C8868d> f23257b = new TreeSet<>(new Comparator() { // from class: j8.i
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m17116h;
            m17116h = C8874j.m17116h((C8868d) obj, (C8868d) obj2);
            return m17116h;
        }
    });

    /* renamed from: c */
    private long f23258c;

    public C8874j(long j) {
        this.f23256a = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m17116h(C8868d c8868d, C8868d c8868d2) {
        long j = c8868d.f23250o;
        long j2 = c8868d2.f23250o;
        if (j - j2 == 0) {
            return c8868d.compareTo(c8868d2);
        }
        if (j < j2) {
            return -1;
        }
        return 1;
    }

    /* renamed from: i */
    private void m17115i(InterfaceC4521a interfaceC4521a, long j) {
        while (this.f23258c + j > this.f23256a && !this.f23257b.isEmpty()) {
            interfaceC4521a.mo28725b(this.f23257b.first());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4528d
    /* renamed from: a */
    public boolean mo17123a() {
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a.InterfaceC4523b
    /* renamed from: b */
    public void mo17122b(InterfaceC4521a interfaceC4521a, C8868d c8868d) {
        this.f23257b.remove(c8868d);
        this.f23258c -= c8868d.f23247l;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a.InterfaceC4523b
    /* renamed from: c */
    public void mo17121c(InterfaceC4521a interfaceC4521a, C8868d c8868d, C8868d c8868d2) {
        mo17122b(interfaceC4521a, c8868d);
        mo17118f(interfaceC4521a, c8868d2);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4528d
    /* renamed from: d */
    public void mo17120d(InterfaceC4521a interfaceC4521a, String str, long j, long j2) {
        if (j2 != -1) {
            m17115i(interfaceC4521a, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4528d
    /* renamed from: e */
    public void mo17119e() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.InterfaceC4521a.InterfaceC4523b
    /* renamed from: f */
    public void mo17118f(InterfaceC4521a interfaceC4521a, C8868d c8868d) {
        this.f23257b.add(c8868d);
        this.f23258c += c8868d.f23247l;
        m17115i(interfaceC4521a, 0L);
    }
}

package p164j$.util.stream;

import java.util.Comparator;
import p164j$.util.AbstractC8516n;
import p164j$.util.Spliterator;
import p164j$.util.function.InterfaceC8438K0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.X2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8624X2 implements Spliterator {

    /* renamed from: a */
    final boolean f22803a;

    /* renamed from: b */
    final AbstractC8744w0 f22804b;

    /* renamed from: c */
    private InterfaceC8438K0 f22805c;

    /* renamed from: d */
    Spliterator f22806d;

    /* renamed from: e */
    InterfaceC8671h2 f22807e;

    /* renamed from: f */
    C8633a f22808f;

    /* renamed from: g */
    long f22809g;

    /* renamed from: h */
    AbstractC8653e f22810h;

    /* renamed from: i */
    boolean f22811i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8624X2(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z) {
        this.f22804b = abstractC8744w0;
        this.f22805c = null;
        this.f22806d = spliterator;
        this.f22803a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8624X2(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z) {
        this.f22804b = abstractC8744w0;
        this.f22805c = c8633a;
        this.f22806d = null;
        this.f22803a = z;
    }

    /* renamed from: g */
    private boolean m17530g() {
        boolean mo17305a;
        while (this.f22810h.count() == 0) {
            if (!this.f22807e.mo17301i()) {
                C8633a c8633a = this.f22808f;
                int i = c8633a.f22815a;
                Object obj = c8633a.f22816b;
                switch (i) {
                    case 4:
                        C8667g3 c8667g3 = (C8667g3) obj;
                        mo17305a = c8667g3.f22806d.mo17305a(c8667g3.f22807e);
                        break;
                    case 5:
                        C8677i3 c8677i3 = (C8677i3) obj;
                        mo17305a = c8677i3.f22806d.mo17305a(c8677i3.f22807e);
                        break;
                    case 6:
                        C8687k3 c8687k3 = (C8687k3) obj;
                        mo17305a = c8687k3.f22806d.mo17305a(c8687k3.f22807e);
                        break;
                    default:
                        C8536C3 c8536c3 = (C8536C3) obj;
                        mo17305a = c8536c3.f22806d.mo17305a(c8536c3.f22807e);
                        break;
                }
                if (mo17305a) {
                    continue;
                }
            }
            if (this.f22811i) {
                return false;
            }
            this.f22807e.end();
            this.f22811i = true;
        }
        return true;
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        m17529h();
        int m17534g = EnumC8616V2.m17534g(this.f22804b.mo17345g1()) & EnumC8616V2.f22776f;
        return (m17534g & 64) != 0 ? (m17534g & (-16449)) | (this.f22806d.characteristics() & 16448) : m17534g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m17531e() {
        AbstractC8653e abstractC8653e = this.f22810h;
        if (abstractC8653e == null) {
            if (this.f22811i) {
                return false;
            }
            m17529h();
            mo17436i();
            this.f22809g = 0L;
            this.f22807e.mo17302g(this.f22806d.getExactSizeIfKnown());
            return m17530g();
        }
        long j = this.f22809g + 1;
        this.f22809g = j;
        boolean z = j < abstractC8653e.count();
        if (z) {
            return z;
        }
        this.f22809g = 0L;
        this.f22810h.clear();
        return m17530g();
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        m17529h();
        return this.f22806d.estimateSize();
    }

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC8516n.m17605j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p164j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        m17529h();
        if (EnumC8616V2.SIZED.m17537d(this.f22804b.mo17345g1())) {
            return this.f22806d.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m17529h() {
        if (this.f22806d == null) {
            this.f22806d = (Spliterator) this.f22805c.get();
            this.f22805c = null;
        }
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC8516n.m17605j(this, i);
    }

    /* renamed from: i */
    abstract void mo17436i();

    /* renamed from: j */
    abstract AbstractC8624X2 mo17435j(Spliterator spliterator);

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f22806d);
    }

    @Override // p164j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f22803a || this.f22811i) {
            return null;
        }
        m17529h();
        Spliterator trySplit = this.f22806d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return mo17435j(trySplit);
    }
}

package p099f8;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p195k8.C9149a;
import p195k8.C9191p0;
import p229m7.C10344s0;
import p260o7.AbstractC11058e;
import p260o7.AbstractC11069m;

/* renamed from: f8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6322c implements InterfaceC6337h {

    /* renamed from: a */
    protected final C10344s0 f17851a;

    /* renamed from: b */
    protected final int f17852b;

    /* renamed from: c */
    protected final int[] f17853c;

    /* renamed from: d */
    private final Format[] f17854d;

    /* renamed from: e */
    private final long[] f17855e;

    /* renamed from: f */
    private int f17856f;

    public AbstractC6322c(C10344s0 c10344s0, int... iArr) {
        boolean z;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        this.f17851a = (C10344s0) C9149a.m16448e(c10344s0);
        int length = iArr.length;
        this.f17852b = length;
        this.f17854d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f17854d[i2] = c10344s0.m11721a(iArr[i2]);
        }
        Arrays.sort(this.f17854d, new Comparator() { // from class: f8.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m22977u;
                m22977u = AbstractC6322c.m22977u((Format) obj, (Format) obj2);
                return m22977u;
            }
        });
        this.f17853c = new int[this.f17852b];
        while (true) {
            int i3 = this.f17852b;
            if (i < i3) {
                this.f17853c[i] = c10344s0.m11720b(this.f17854d[i]);
                i++;
            } else {
                this.f17855e = new long[i3];
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ int m22977u(Format format, Format format2) {
        return format2.f11193q - format.f11193q;
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: b */
    public final boolean mo22912b(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean m22978t = m22978t(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.f17852b && !m22978t; i2++) {
            if (i2 != i && !m22978t(i2, elapsedRealtime)) {
                m22978t = true;
            } else {
                m22978t = false;
            }
        }
        if (!m22978t) {
            return false;
        }
        long[] jArr = this.f17855e;
        jArr[i] = Math.max(jArr[i], C9191p0.m16259b(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // p099f8.InterfaceC6343k
    /* renamed from: c */
    public final Format mo22891c(int i) {
        return this.f17854d[i];
    }

    @Override // p099f8.InterfaceC6343k
    /* renamed from: d */
    public final int mo22890d(int i) {
        return this.f17853c[i];
    }

    @Override // p099f8.InterfaceC6337h
    public void disable() {
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: e */
    public void mo22911e(float f) {
    }

    @Override // p099f8.InterfaceC6337h
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC6322c abstractC6322c = (AbstractC6322c) obj;
        if (this.f17851a == abstractC6322c.f17851a && Arrays.equals(this.f17853c, abstractC6322c.f17853c)) {
            return true;
        }
        return false;
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: g */
    public /* synthetic */ void mo22910g() {
        C6336g.m22916a(this);
    }

    @Override // p099f8.InterfaceC6343k
    /* renamed from: h */
    public final int mo22889h(int i) {
        for (int i2 = 0; i2 < this.f17852b; i2++) {
            if (this.f17853c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public int hashCode() {
        if (this.f17856f == 0) {
            this.f17856f = (System.identityHashCode(this.f17851a) * 31) + Arrays.hashCode(this.f17853c);
        }
        return this.f17856f;
    }

    @Override // p099f8.InterfaceC6343k
    /* renamed from: i */
    public final C10344s0 mo22888i() {
        return this.f17851a;
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: j */
    public /* synthetic */ boolean mo22909j(long j, AbstractC11058e abstractC11058e, List list) {
        return C6336g.m22913d(this, j, abstractC11058e, list);
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: k */
    public /* synthetic */ void mo22908k(boolean z) {
        C6336g.m22915b(this, z);
    }

    @Override // p099f8.InterfaceC6343k
    public final int length() {
        return this.f17853c.length;
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: m */
    public int mo22907m(long j, List<? extends AbstractC11069m> list) {
        return list.size();
    }

    @Override // p099f8.InterfaceC6343k
    /* renamed from: n */
    public final int mo22887n(Format format) {
        for (int i = 0; i < this.f17852b; i++) {
            if (this.f17854d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: o */
    public final int mo22906o() {
        return this.f17853c[mo6283a()];
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: p */
    public final Format mo22905p() {
        return this.f17854d[mo6283a()];
    }

    @Override // p099f8.InterfaceC6337h
    /* renamed from: r */
    public /* synthetic */ void mo22904r() {
        C6336g.m22914c(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean m22978t(int i, long j) {
        return this.f17855e[i] > j;
    }
}

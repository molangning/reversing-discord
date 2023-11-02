package p229m7;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import gb.AbstractC6636e0;
import gb.InterfaceC6634d0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p229m7.InterfaceC10341s;

/* renamed from: m7.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10284c0 extends AbstractC10292f<Integer> {

    /* renamed from: D */
    private static final MediaItem f26789D = new MediaItem.C4365c().m29851d("MergingMediaSource").m29854a();

    /* renamed from: A */
    private int f26790A;

    /* renamed from: B */
    private long[][] f26791B;

    /* renamed from: C */
    private C10286b f26792C;

    /* renamed from: s */
    private final boolean f26793s;

    /* renamed from: t */
    private final boolean f26794t;

    /* renamed from: u */
    private final InterfaceC10341s[] f26795u;

    /* renamed from: v */
    private final Timeline[] f26796v;

    /* renamed from: w */
    private final ArrayList<InterfaceC10341s> f26797w;

    /* renamed from: x */
    private final InterfaceC10298h f26798x;

    /* renamed from: y */
    private final Map<Object, Long> f26799y;

    /* renamed from: z */
    private final InterfaceC6634d0<Object, C10287d> f26800z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m7.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10285a extends AbstractC10314l {

        /* renamed from: c */
        private final long[] f26801c;

        /* renamed from: d */
        private final long[] f26802d;

        public C10285a(Timeline timeline, Map<Object, Long> map) {
            super(timeline);
            int mo11753p = timeline.mo11753p();
            this.f26802d = new long[timeline.mo11753p()];
            Timeline.C4379c c4379c = new Timeline.C4379c();
            for (int i = 0; i < mo11753p; i++) {
                this.f26802d[i] = timeline.m29738n(i, c4379c).f11394p;
            }
            int mo11756i = timeline.mo11756i();
            this.f26801c = new long[mo11756i];
            Timeline.C4378b c4378b = new Timeline.C4378b();
            for (int i2 = 0; i2 < mo11756i; i2++) {
                timeline.mo11757g(i2, c4378b, true);
                long longValue = ((Long) C9149a.m16448e(map.get(c4378b.f11372b))).longValue();
                long[] jArr = this.f26801c;
                longValue = longValue == Long.MIN_VALUE ? c4378b.f11374d : longValue;
                jArr[i2] = longValue;
                long j = c4378b.f11374d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.f26802d;
                    int i3 = c4378b.f11373c;
                    jArr2[i3] = jArr2[i3] - (j - longValue);
                }
            }
        }

        @Override // p229m7.AbstractC10314l, com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public Timeline.C4378b mo11757g(int i, Timeline.C4378b c4378b, boolean z) {
            super.mo11757g(i, c4378b, z);
            c4378b.f11374d = this.f26801c[i];
            return c4378b;
        }

        @Override // p229m7.AbstractC10314l, com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Timeline.C4379c mo11754o(int i, Timeline.C4379c c4379c, long j) {
            long j2;
            super.mo11754o(i, c4379c, j);
            long j3 = this.f26802d[i];
            c4379c.f11394p = j3;
            if (j3 != -9223372036854775807L) {
                long j4 = c4379c.f11393o;
                if (j4 != -9223372036854775807L) {
                    j2 = Math.min(j4, j3);
                    c4379c.f11393o = j2;
                    return c4379c;
                }
            }
            j2 = c4379c.f11393o;
            c4379c.f11393o = j2;
            return c4379c;
        }
    }

    /* renamed from: m7.c0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10286b extends IOException {

        /* renamed from: j */
        public final int f26803j;

        public C10286b(int i) {
            this.f26803j = i;
        }
    }

    public C10284c0(InterfaceC10341s... interfaceC10341sArr) {
        this(false, interfaceC10341sArr);
    }

    /* renamed from: K */
    private void m11946K() {
        Timeline.C4378b c4378b = new Timeline.C4378b();
        for (int i = 0; i < this.f26790A; i++) {
            long j = -this.f26796v[0].m29741f(i, c4378b).m29724l();
            int i2 = 1;
            while (true) {
                Timeline[] timelineArr = this.f26796v;
                if (i2 < timelineArr.length) {
                    this.f26791B[i][i2] = j - (-timelineArr[i2].m29741f(i, c4378b).m29724l());
                    i2++;
                }
            }
        }
    }

    /* renamed from: N */
    private void m11943N() {
        Timeline[] timelineArr;
        Timeline.C4378b c4378b = new Timeline.C4378b();
        for (int i = 0; i < this.f26790A; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                timelineArr = this.f26796v;
                if (i2 >= timelineArr.length) {
                    break;
                }
                long m29728h = timelineArr[i2].m29741f(i, c4378b).m29728h();
                if (m29728h != -9223372036854775807L) {
                    long j2 = m29728h + this.f26791B[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object mo11755m = timelineArr[0].mo11755m(i);
            this.f26799y.put(mo11755m, Long.valueOf(j));
            for (C10287d c10287d : this.f26800z.get(mo11755m)) {
                c10287d.m11938v(0L, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p229m7.AbstractC10292f, p229m7.AbstractC10277a
    /* renamed from: A */
    public void mo11739A(InterfaceC7472x interfaceC7472x) {
        super.mo11739A(interfaceC7472x);
        for (int i = 0; i < this.f26795u.length; i++) {
            m11927J(Integer.valueOf(i), this.f26795u[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p229m7.AbstractC10292f, p229m7.AbstractC10277a
    /* renamed from: C */
    public void mo11738C() {
        super.mo11738C();
        Arrays.fill(this.f26796v, (Object) null);
        this.f26790A = -1;
        this.f26792C = null;
        this.f26797w.clear();
        Collections.addAll(this.f26797w, this.f26795u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p229m7.AbstractC10292f
    /* renamed from: L */
    public InterfaceC10341s.C10342a mo11780E(Integer num, InterfaceC10341s.C10342a c10342a) {
        if (num.intValue() == 0) {
            return c10342a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p229m7.AbstractC10292f
    /* renamed from: M */
    public void mo11779I(Integer num, InterfaceC10341s interfaceC10341s, Timeline timeline) {
        if (this.f26792C != null) {
            return;
        }
        if (this.f26790A == -1) {
            this.f26790A = timeline.mo11756i();
        } else if (timeline.mo11756i() != this.f26790A) {
            this.f26792C = new C10286b(0);
            return;
        }
        if (this.f26791B.length == 0) {
            this.f26791B = (long[][]) Array.newInstance(Long.TYPE, this.f26790A, this.f26796v.length);
        }
        this.f26797w.remove(interfaceC10341s);
        this.f26796v[num.intValue()] = timeline;
        if (this.f26797w.isEmpty()) {
            if (this.f26793s) {
                m11946K();
            }
            C10285a c10285a = this.f26796v[0];
            if (this.f26794t) {
                m11943N();
                c10285a = new C10285a(c10285a, this.f26799y);
            }
            m11958B(c10285a);
        }
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: e */
    public MediaItem mo11732e() {
        InterfaceC10341s[] interfaceC10341sArr = this.f26795u;
        return interfaceC10341sArr.length > 0 ? interfaceC10341sArr[0].mo11732e() : f26789D;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: g */
    public InterfaceC10329p mo11731g(InterfaceC10341s.C10342a c10342a, InterfaceC7440b interfaceC7440b, long j) {
        int length = this.f26795u.length;
        InterfaceC10329p[] interfaceC10329pArr = new InterfaceC10329p[length];
        int mo11758b = this.f26796v[0].mo11758b(c10342a.f27016a);
        for (int i = 0; i < length; i++) {
            interfaceC10329pArr[i] = this.f26795u[i].mo11731g(c10342a.m11723c(this.f26796v[i].mo11755m(mo11758b)), interfaceC7440b, j - this.f26791B[mo11758b][i]);
        }
        C10280b0 c10280b0 = new C10280b0(this.f26798x, this.f26791B[mo11758b], interfaceC10329pArr);
        if (this.f26794t) {
            C10287d c10287d = new C10287d(c10280b0, true, 0L, ((Long) C9149a.m16448e(this.f26799y.get(c10342a.f27016a))).longValue());
            this.f26800z.put(c10342a.f27016a, c10287d);
            return c10287d;
        }
        return c10280b0;
    }

    @Override // p229m7.AbstractC10292f, p229m7.InterfaceC10341s
    /* renamed from: m */
    public void mo11728m() {
        C10286b c10286b = this.f26792C;
        if (c10286b == null) {
            super.mo11728m();
            return;
        }
        throw c10286b;
    }

    @Override // p229m7.InterfaceC10341s
    /* renamed from: q */
    public void mo11725q(InterfaceC10329p interfaceC10329p) {
        if (this.f26794t) {
            C10287d c10287d = (C10287d) interfaceC10329p;
            Iterator<Map.Entry<Object, C10287d>> it = this.f26800z.mo22096a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, C10287d> next = it.next();
                if (next.getValue().equals(c10287d)) {
                    this.f26800z.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            interfaceC10329p = c10287d.f26804j;
        }
        C10280b0 c10280b0 = (C10280b0) interfaceC10329p;
        int i = 0;
        while (true) {
            InterfaceC10341s[] interfaceC10341sArr = this.f26795u;
            if (i < interfaceC10341sArr.length) {
                interfaceC10341sArr[i].mo11725q(c10280b0.m11951e(i));
                i++;
            } else {
                return;
            }
        }
    }

    public C10284c0(boolean z, InterfaceC10341s... interfaceC10341sArr) {
        this(z, false, interfaceC10341sArr);
    }

    public C10284c0(boolean z, boolean z2, InterfaceC10341s... interfaceC10341sArr) {
        this(z, z2, new C10305i(), interfaceC10341sArr);
    }

    public C10284c0(boolean z, boolean z2, InterfaceC10298h interfaceC10298h, InterfaceC10341s... interfaceC10341sArr) {
        this.f26793s = z;
        this.f26794t = z2;
        this.f26795u = interfaceC10341sArr;
        this.f26798x = interfaceC10298h;
        this.f26797w = new ArrayList<>(Arrays.asList(interfaceC10341sArr));
        this.f26790A = -1;
        this.f26796v = new Timeline[interfaceC10341sArr.length];
        this.f26791B = new long[0];
        this.f26799y = new HashMap();
        this.f26800z = AbstractC6636e0.m22263a().m22258a().mo22255e();
    }
}

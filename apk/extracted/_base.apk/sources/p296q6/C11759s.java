package p296q6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p117g7.C6561a;
import p117g7.C6563b;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9207x;

/* renamed from: q6.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11759s {

    /* renamed from: a */
    public final int f30645a;

    /* renamed from: b */
    public final int f30646b;

    /* renamed from: c */
    public final int f30647c;

    /* renamed from: d */
    public final int f30648d;

    /* renamed from: e */
    public final int f30649e;

    /* renamed from: f */
    public final int f30650f;

    /* renamed from: g */
    public final int f30651g;

    /* renamed from: h */
    public final int f30652h;

    /* renamed from: i */
    public final int f30653i;

    /* renamed from: j */
    public final long f30654j;

    /* renamed from: k */
    public final C11760a f30655k;

    /* renamed from: l */
    private final Metadata f30656l;

    /* renamed from: q6.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11760a {

        /* renamed from: a */
        public final long[] f30657a;

        /* renamed from: b */
        public final long[] f30658b;

        public C11760a(long[] jArr, long[] jArr2) {
            this.f30657a = jArr;
            this.f30658b = jArr2;
        }
    }

    public C11759s(byte[] bArr, int i) {
        C9207x c9207x = new C9207x(bArr);
        c9207x.m16118p(i * 8);
        this.f30645a = c9207x.m16126h(16);
        this.f30646b = c9207x.m16126h(16);
        this.f30647c = c9207x.m16126h(24);
        this.f30648d = c9207x.m16126h(24);
        int m16126h = c9207x.m16126h(20);
        this.f30649e = m16126h;
        this.f30650f = m6972k(m16126h);
        this.f30651g = c9207x.m16126h(3) + 1;
        int m16126h2 = c9207x.m16126h(5) + 1;
        this.f30652h = m16126h2;
        this.f30653i = m6977f(m16126h2);
        this.f30654j = c9207x.m16124j(36);
        this.f30655k = null;
        this.f30656l = null;
    }

    /* renamed from: a */
    private static Metadata m6982a(List<String> list, List<C6561a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] m16284O0 = C9191p0.m16284O0(str, "=");
            if (m16284O0.length != 2) {
                C9197r.m16178h("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new C6563b(m16284O0[0], m16284O0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: f */
    private static int m6977f(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: k */
    private static int m6972k(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public C11759s m6981b(List<C6561a> list) {
        return new C11759s(this.f30645a, this.f30646b, this.f30647c, this.f30648d, this.f30649e, this.f30651g, this.f30652h, this.f30654j, this.f30655k, m6974i(m6982a(Collections.emptyList(), list)));
    }

    /* renamed from: c */
    public C11759s m6980c(C11760a c11760a) {
        return new C11759s(this.f30645a, this.f30646b, this.f30647c, this.f30648d, this.f30649e, this.f30651g, this.f30652h, this.f30654j, c11760a, this.f30656l);
    }

    /* renamed from: d */
    public C11759s m6979d(List<String> list) {
        return new C11759s(this.f30645a, this.f30646b, this.f30647c, this.f30648d, this.f30649e, this.f30651g, this.f30652h, this.f30654j, this.f30655k, m6974i(m6982a(list, Collections.emptyList())));
    }

    /* renamed from: e */
    public long m6978e() {
        long j;
        long j2;
        long j3;
        int i = this.f30648d;
        if (i > 0) {
            j2 = (i + this.f30647c) / 2;
            j3 = 1;
        } else {
            int i2 = this.f30645a;
            if (i2 == this.f30646b && i2 > 0) {
                j = i2;
            } else {
                j = 4096;
            }
            j2 = ((j * this.f30651g) * this.f30652h) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    /* renamed from: g */
    public long m6976g() {
        long j = this.f30654j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f30649e;
    }

    /* renamed from: h */
    public Format m6975h(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.f30648d;
        if (i <= 0) {
            i = -1;
        }
        return new Format.C4362b().m29883e0("audio/flac").m29896W(i).m29911H(this.f30651g).m29881f0(this.f30649e).m29899T(Collections.singletonList(bArr)).m29895X(m6974i(metadata)).m29914E();
    }

    /* renamed from: i */
    public Metadata m6974i(Metadata metadata) {
        Metadata metadata2 = this.f30656l;
        return metadata2 == null ? metadata : metadata2.m29249b(metadata);
    }

    /* renamed from: j */
    public long m6973j(long j) {
        return C9191p0.m16225s((j * this.f30649e) / 1000000, 0L, this.f30654j - 1);
    }

    private C11759s(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, C11760a c11760a, Metadata metadata) {
        this.f30645a = i;
        this.f30646b = i2;
        this.f30647c = i3;
        this.f30648d = i4;
        this.f30649e = i5;
        this.f30650f = m6972k(i5);
        this.f30651g = i6;
        this.f30652h = i7;
        this.f30653i = m6977f(i7);
        this.f30654j = j;
        this.f30655k = c11760a;
        this.f30656l = metadata;
    }
}

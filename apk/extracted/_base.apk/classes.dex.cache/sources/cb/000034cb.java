package p122gk;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.ByteString;
import p304qf.AbstractC11866c;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0013B!\b\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002R\"\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m14357d2 = {"Lgk/p;", "Lqf/c;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "h", "", "k", "[Lokio/ByteString;", "i", "()[Lokio/ByteString;", "byteStrings", "", "l", "[I", "()[I", "trie", "a", "()I", "size", "<init>", "([Lokio/ByteString;[I)V", "m", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6843p extends AbstractC11866c<ByteString> implements RandomAccess {

    /* renamed from: m */
    public static final C6844a f19056m = new C6844a(null);

    /* renamed from: k */
    private final ByteString[] f19057k;

    /* renamed from: l */
    private final int[] f19058l;

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J#\u0010\u0012\u001a\u00020\u00112\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u00020\u0002*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m14357d2 = {"Lgk/p$a;", "", "", "nodeOffset", "Lokio/Buffer;", "node", "", "byteStringOffset", "", "Lokio/ByteString;", "byteStrings", "fromIndex", "toIndex", "indexes", "", "a", "", "Lgk/p;", "d", "([Lokio/ByteString;)Lgk/p;", "c", "(Lokio/Buffer;)J", "intCount", "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: gk.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6844a {
        private C6844a() {
        }

        public /* synthetic */ C6844a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m21799a(long j, Buffer buffer, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) {
            boolean z;
            int i4;
            int i5;
            boolean z2;
            int i6;
            int i7;
            Buffer buffer2;
            boolean z3;
            int i8 = i;
            if (i2 < i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (list.get(i9).m8551z() >= i8) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                ByteString byteString = list.get(i2);
                ByteString byteString2 = list.get(i3 - 1);
                int i10 = -1;
                if (i8 == byteString.m8551z()) {
                    int i11 = i2 + 1;
                    i4 = i11;
                    i5 = list2.get(i2).intValue();
                    byteString = list.get(i11);
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (byteString.m8567f(i8) != byteString2.m8567f(i8)) {
                    int i12 = 1;
                    for (int i13 = i4 + 1; i13 < i3; i13++) {
                        if (list.get(i13 - 1).m8567f(i8) != list.get(i13).m8567f(i8)) {
                            i12++;
                        }
                    }
                    long m21797c = j + m21797c(buffer) + 2 + (i12 * 2);
                    buffer.writeInt(i12);
                    buffer.writeInt(i5);
                    for (int i14 = i4; i14 < i3; i14++) {
                        byte m8567f = list.get(i14).m8567f(i8);
                        if (i14 == i4 || m8567f != list.get(i14 - 1).m8567f(i8)) {
                            buffer.writeInt(m8567f & 255);
                        }
                    }
                    Buffer buffer3 = new Buffer();
                    while (i4 < i3) {
                        byte m8567f2 = list.get(i4).m8567f(i8);
                        int i15 = i4 + 1;
                        int i16 = i15;
                        while (true) {
                            if (i16 < i3) {
                                if (m8567f2 != list.get(i16).m8567f(i8)) {
                                    i6 = i16;
                                    break;
                                }
                                i16++;
                            } else {
                                i6 = i3;
                                break;
                            }
                        }
                        if (i15 == i6 && i8 + 1 == list.get(i4).m8551z()) {
                            buffer.writeInt(list2.get(i4).intValue());
                            i7 = i6;
                            buffer2 = buffer3;
                        } else {
                            buffer.writeInt(((int) (m21797c + m21797c(buffer3))) * i10);
                            i7 = i6;
                            buffer2 = buffer3;
                            m21799a(m21797c, buffer3, i8 + 1, list, i4, i6, list2);
                        }
                        buffer3 = buffer2;
                        i4 = i7;
                        i10 = -1;
                    }
                    buffer.mo8606O(buffer3);
                    return;
                }
                int min = Math.min(byteString.m8551z(), byteString2.m8551z());
                int i17 = 0;
                for (int i18 = i8; i18 < min && byteString.m8567f(i18) == byteString2.m8567f(i18); i18++) {
                    i17++;
                }
                long m21797c2 = j + m21797c(buffer) + 2 + i17 + 1;
                buffer.writeInt(-i17);
                buffer.writeInt(i5);
                int i19 = i8 + i17;
                while (i8 < i19) {
                    buffer.writeInt(byteString.m8567f(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i19 == list.get(i4).m8551z()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        buffer.writeInt(list2.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                Buffer buffer4 = new Buffer();
                buffer.writeInt(((int) (m21797c(buffer4) + m21797c2)) * (-1));
                m21799a(m21797c2, buffer4, i19, list, i4, i3, list2);
                buffer.mo8606O(buffer4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        static /* synthetic */ void m21798b(C6844a c6844a, long j, Buffer buffer, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            c6844a.m21799a((i4 & 1) != 0 ? 0L : j, buffer, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        /* renamed from: c */
        private final long m21797c(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:125:0x00ee, code lost:
            continue;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p122gk.C6843p m21796d(okio.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p122gk.C6843p.C6844a.m21796d(okio.ByteString[]):gk.p");
        }
    }

    public /* synthetic */ C6843p(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    /* renamed from: r */
    public static final C6843p m21800r(ByteString... byteStringArr) {
        return f19056m.m21796d(byteStringArr);
    }

    @Override // p304qf.AbstractC11861a
    /* renamed from: a */
    public int mo3916a() {
        return this.f19057k.length;
    }

    @Override // p304qf.AbstractC11861a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return m21806e((ByteString) obj);
        }
        return false;
    }

    /* renamed from: e */
    public /* bridge */ boolean m21806e(ByteString byteString) {
        return super.contains(byteString);
    }

    @Override // p304qf.AbstractC11866c, java.util.List
    /* renamed from: h */
    public ByteString get(int i) {
        return this.f19057k[i];
    }

    /* renamed from: i */
    public final ByteString[] m21804i() {
        return this.f19057k;
    }

    @Override // p304qf.AbstractC11866c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return m21802o((ByteString) obj);
        }
        return -1;
    }

    /* renamed from: k */
    public final int[] m21803k() {
        return this.f19058l;
    }

    @Override // p304qf.AbstractC11866c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return m21801p((ByteString) obj);
        }
        return -1;
    }

    /* renamed from: o */
    public /* bridge */ int m21802o(ByteString byteString) {
        return super.indexOf(byteString);
    }

    /* renamed from: p */
    public /* bridge */ int m21801p(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    private C6843p(ByteString[] byteStringArr, int[] iArr) {
        this.f19057k = byteStringArr;
        this.f19058l = iArr;
    }
}
package p122gk;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001f"}, m14357d2 = {"Lgk/u;", "", "d", "f", "b", "segment", "c", "", "byteCount", "e", "", "a", "sink", "g", "", "[B", "data", "I", "pos", "limit", "", "Z", "shared", "owner", "Lgk/u;", "next", "prev", "<init>", "()V", "([BIIZZ)V", "h", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6851u {

    /* renamed from: h */
    public static final C6852a f19075h = new C6852a(null);

    /* renamed from: a */
    public final byte[] f19076a;

    /* renamed from: b */
    public int f19077b;

    /* renamed from: c */
    public int f19078c;

    /* renamed from: d */
    public boolean f19079d;

    /* renamed from: e */
    public boolean f19080e;

    /* renamed from: f */
    public C6851u f19081f;

    /* renamed from: g */
    public C6851u f19082g;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m14357d2 = {"Lgk/u$a;", "", "", "SHARE_MINIMUM", "I", "SIZE", "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: gk.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6852a {
        private C6852a() {
        }

        public /* synthetic */ C6852a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6851u() {
        this.f19076a = new byte[8192];
        this.f19080e = true;
        this.f19079d = false;
    }

    /* renamed from: a */
    public final void m21789a() {
        boolean z;
        C6851u c6851u = this.f19082g;
        int i = 0;
        if (c6851u != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C9612q.m13920e(c6851u);
            if (!c6851u.f19080e) {
                return;
            }
            int i2 = this.f19078c - this.f19077b;
            C6851u c6851u2 = this.f19082g;
            C9612q.m13920e(c6851u2);
            int i3 = 8192 - c6851u2.f19078c;
            C6851u c6851u3 = this.f19082g;
            C9612q.m13920e(c6851u3);
            if (!c6851u3.f19079d) {
                C6851u c6851u4 = this.f19082g;
                C9612q.m13920e(c6851u4);
                i = c6851u4.f19077b;
            }
            if (i2 > i3 + i) {
                return;
            }
            C6851u c6851u5 = this.f19082g;
            C9612q.m13920e(c6851u5);
            m21783g(c6851u5, i2);
            m21788b();
            C6853v.m21781b(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final C6851u m21788b() {
        C6851u c6851u = this.f19081f;
        if (c6851u == this) {
            c6851u = null;
        }
        C6851u c6851u2 = this.f19082g;
        C9612q.m13920e(c6851u2);
        c6851u2.f19081f = this.f19081f;
        C6851u c6851u3 = this.f19081f;
        C9612q.m13920e(c6851u3);
        c6851u3.f19082g = this.f19082g;
        this.f19081f = null;
        this.f19082g = null;
        return c6851u;
    }

    /* renamed from: c */
    public final C6851u m21787c(C6851u segment) {
        C9612q.m13917h(segment, "segment");
        segment.f19082g = this;
        segment.f19081f = this.f19081f;
        C6851u c6851u = this.f19081f;
        C9612q.m13920e(c6851u);
        c6851u.f19082g = segment;
        this.f19081f = segment;
        return segment;
    }

    /* renamed from: d */
    public final C6851u m21786d() {
        this.f19079d = true;
        return new C6851u(this.f19076a, this.f19077b, this.f19078c, true, false);
    }

    /* renamed from: e */
    public final C6851u m21785e(int i) {
        boolean z;
        C6851u m21780c;
        if (i > 0 && i <= this.f19078c - this.f19077b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 1024) {
                m21780c = m21786d();
            } else {
                m21780c = C6853v.m21780c();
                byte[] bArr = this.f19076a;
                byte[] bArr2 = m21780c.f19076a;
                int i2 = this.f19077b;
                C9536e.m14271g(bArr, bArr2, 0, i2, i2 + i, 2, null);
            }
            m21780c.f19078c = m21780c.f19077b + i;
            this.f19077b += i;
            C6851u c6851u = this.f19082g;
            C9612q.m13920e(c6851u);
            c6851u.m21787c(m21780c);
            return m21780c;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final C6851u m21784f() {
        byte[] bArr = this.f19076a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C9612q.m13918g(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C6851u(copyOf, this.f19077b, this.f19078c, false, true);
    }

    /* renamed from: g */
    public final void m21783g(C6851u sink, int i) {
        C9612q.m13917h(sink, "sink");
        if (sink.f19080e) {
            int i2 = sink.f19078c;
            if (i2 + i > 8192) {
                if (!sink.f19079d) {
                    int i3 = sink.f19077b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = sink.f19076a;
                        C9536e.m14271g(bArr, bArr, 0, i3, i2, 2, null);
                        sink.f19078c -= sink.f19077b;
                        sink.f19077b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f19076a;
            byte[] bArr3 = sink.f19076a;
            int i4 = sink.f19078c;
            int i5 = this.f19077b;
            C9536e.m14273e(bArr2, bArr3, i4, i5, i5 + i);
            sink.f19078c += i;
            this.f19077b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C6851u(byte[] data, int i, int i2, boolean z, boolean z2) {
        C9612q.m13917h(data, "data");
        this.f19076a = data;
        this.f19077b = i;
        this.f19078c = i2;
        this.f19079d = z;
        this.f19080e = z2;
    }
}

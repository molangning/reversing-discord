package dj;

import gg.C6759j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006 "}, m14357d2 = {"Ldj/f0;", "Ldj/k0;", "", "firstEscapedChar", "currentSize", "", "string", "", "d", "expected", "e", "oldSize", "additional", "f", "", "value", "writeLong", "", "char", "a", "text", "c", "b", "g", "toString", "", "[C", "array", "I", "size", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5985f0 implements InterfaceC5997k0 {

    /* renamed from: a */
    private char[] f17024a = C5982e.f17021c.m23963d();

    /* renamed from: b */
    private int f17025b;

    /* renamed from: d */
    private final void m23959d(int i, int i2, String str) {
        int i3;
        int length = str.length();
        while (i < length) {
            int m23957f = m23957f(i2, 2);
            char charAt = str.charAt(i);
            if (charAt < C6014r0.m23875a().length) {
                byte b = C6014r0.m23875a()[charAt];
                if (b == 0) {
                    i3 = m23957f + 1;
                    this.f17024a[m23957f] = charAt;
                } else {
                    if (b == 1) {
                        String str2 = C6014r0.m23874b()[charAt];
                        C9612q.m13920e(str2);
                        int m23957f2 = m23957f(m23957f, str2.length());
                        str2.getChars(0, str2.length(), this.f17024a, m23957f2);
                        i2 = m23957f2 + str2.length();
                        this.f17025b = i2;
                    } else {
                        char[] cArr = this.f17024a;
                        cArr[m23957f] = '\\';
                        cArr[m23957f + 1] = (char) b;
                        i2 = m23957f + 2;
                        this.f17025b = i2;
                    }
                    i++;
                }
            } else {
                i3 = m23957f + 1;
                this.f17024a[m23957f] = charAt;
            }
            i2 = i3;
            i++;
        }
        int m23957f3 = m23957f(i2, 1);
        this.f17024a[m23957f3] = '\"';
        this.f17025b = m23957f3 + 1;
    }

    /* renamed from: e */
    private final void m23958e(int i) {
        m23957f(this.f17025b, i);
    }

    /* renamed from: f */
    private final int m23957f(int i, int i2) {
        int m21930c;
        int i3 = i2 + i;
        char[] cArr = this.f17024a;
        if (cArr.length <= i3) {
            m21930c = C6759j.m21930c(i3, i * 2);
            char[] copyOf = Arrays.copyOf(cArr, m21930c);
            C9612q.m13918g(copyOf, "copyOf(this, newSize)");
            this.f17024a = copyOf;
        }
        return i;
    }

    @Override // dj.InterfaceC5997k0
    /* renamed from: a */
    public void mo23921a(char c) {
        m23958e(1);
        char[] cArr = this.f17024a;
        int i = this.f17025b;
        this.f17025b = i + 1;
        cArr[i] = c;
    }

    @Override // dj.InterfaceC5997k0
    /* renamed from: b */
    public void mo23920b(String text) {
        C9612q.m13917h(text, "text");
        m23958e(text.length() + 2);
        char[] cArr = this.f17024a;
        int i = this.f17025b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < C6014r0.m23875a().length && C6014r0.m23875a()[c] != 0) {
                m23959d(i4 - i2, i4, text);
                return;
            }
        }
        cArr[i3] = '\"';
        this.f17025b = i3 + 1;
    }

    @Override // dj.InterfaceC5997k0
    /* renamed from: c */
    public void mo23919c(String text) {
        C9612q.m13917h(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m23958e(length);
        text.getChars(0, text.length(), this.f17024a, this.f17025b);
        this.f17025b += length;
    }

    /* renamed from: g */
    public void m23956g() {
        C5982e.f17021c.m23964c(this.f17024a);
    }

    public String toString() {
        return new String(this.f17024a, 0, this.f17025b);
    }

    @Override // dj.InterfaceC5997k0
    public void writeLong(long j) {
        mo23919c(String.valueOf(j));
    }
}

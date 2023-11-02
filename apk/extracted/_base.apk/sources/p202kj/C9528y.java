package p202kj;

import java.util.Set;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7660n;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9528y implements InterfaceC9500h<Void> {

    /* renamed from: j */
    private final int f25295j;

    /* renamed from: k */
    private final InterfaceC7660n<Character> f25296k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9528y(InterfaceC7660n<Character> interfaceC7660n, int i) {
        if (interfaceC7660n != null) {
            if (i >= 1) {
                this.f25296k = interfaceC7660n;
                this.f25295j = i;
                return;
            }
            throw new IllegalArgumentException("Must be positive: " + i);
        }
        throw new NullPointerException("Missing condition for unparseable chars.");
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<Void> mo14365c() {
        return null;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        return 0;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    public void mo14363e(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, AbstractC9519t<?> abstractC9519t, boolean z) {
        int i;
        int i2;
        int m14430f = c9518s.m14430f();
        int length = charSequence.length();
        if (this.f25296k == null) {
            i = length - this.f25295j;
        } else {
            int i3 = m14430f;
            for (int i4 = 0; i4 < this.f25295j && (i2 = i4 + m14430f) < length && this.f25296k.test(Character.valueOf(charSequence.charAt(i2))); i4++) {
                i3++;
            }
            i = i3;
        }
        int min = Math.min(Math.max(i, 0), length);
        if (min > m14430f) {
            c9518s.m14424l(min);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9528y)) {
            return false;
        }
        C9528y c9528y = (C9528y) obj;
        if (this.f25295j == c9528y.f25295j) {
            InterfaceC7660n<Character> interfaceC7660n = this.f25296k;
            InterfaceC7660n<Character> interfaceC7660n2 = c9528y.f25296k;
            if (interfaceC7660n == null) {
                if (interfaceC7660n2 == null) {
                    return true;
                }
            } else if (interfaceC7660n.equals(interfaceC7660n2)) {
                return true;
            }
        }
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<Void> mo14361g(InterfaceC7664p<Void> interfaceC7664p) {
        return this;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<Void> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        return this;
    }

    public int hashCode() {
        InterfaceC7660n<Character> interfaceC7660n = this.f25296k;
        if (interfaceC7660n == null) {
            return this.f25295j;
        }
        return interfaceC7660n.hashCode() ^ (~this.f25295j);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9528y.class.getName());
        if (this.f25296k == null) {
            sb2.append("[keepRemainingChars=");
            sb2.append(this.f25295j);
        } else {
            sb2.append("[condition=");
            sb2.append(this.f25296k);
            sb2.append(", maxIterations=");
            sb2.append(this.f25295j);
        }
        sb2.append(']');
        return sb2.toString();
    }
}

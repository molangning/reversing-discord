package p366u9;

import java.util.Iterator;
import java.util.Set;

/* renamed from: u9.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12935v<E> extends AbstractC12927r<E> implements Set<E> {

    /* renamed from: k */
    private transient AbstractC12925q<E> f33640k;

    /* renamed from: o */
    private static int m3654o(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        if (z) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* renamed from: p */
    public static <E> p366u9.AbstractC12935v<E> m3653p(E r13, E r14) {
        /*
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r13
            r13 = 1
            r1[r13] = r14
        L9:
            if (r0 == 0) goto L71
            if (r0 == r13) goto L69
            int r14 = m3654o(r0)
            java.lang.Object[] r6 = new java.lang.Object[r14]
            int r7 = r14 + (-1)
            r3 = r2
            r5 = r3
            r8 = r5
        L18:
            if (r3 >= r0) goto L43
            r4 = r1[r3]
            java.lang.Object r4 = p366u9.C12938x.m3650a(r4, r3)
            int r9 = r4.hashCode()
            int r10 = p366u9.C12921o.m3666a(r9)
        L28:
            r11 = r10 & r7
            r12 = r6[r11]
            if (r12 != 0) goto L37
            int r10 = r8 + 1
            r1[r8] = r4
            r6[r11] = r4
            int r5 = r5 + r9
            r8 = r10
            goto L40
        L37:
            boolean r11 = r12.equals(r4)
            if (r11 != 0) goto L40
            int r10 = r10 + 1
            goto L28
        L40:
            int r3 = r3 + 1
            goto L18
        L43:
            r3 = 0
            java.util.Arrays.fill(r1, r8, r0, r3)
            if (r8 != r13) goto L51
            r13 = r1[r2]
            u9.c0 r14 = new u9.c0
            r14.<init>(r13, r5)
            return r14
        L51:
            int r0 = m3654o(r8)
            int r14 = r14 / 2
            if (r0 >= r14) goto L5b
            r0 = r8
            goto L9
        L5b:
            if (r8 >= r13) goto L61
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r8)
        L61:
            r4 = r1
            u9.z r13 = new u9.z
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r13
        L69:
            r13 = r1[r2]
            u9.c0 r14 = new u9.c0
            r14.<init>(r13)
            return r14
        L71:
            u9.z<java.lang.Object> r13 = p366u9.C12940z.f33644q
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p366u9.AbstractC12935v.m3653p(java.lang.Object, java.lang.Object):u9.v");
    }

    @Override // p366u9.AbstractC12927r
    /* renamed from: e */
    public final AbstractC12925q<E> mo3655e() {
        AbstractC12925q<E> abstractC12925q = this.f33640k;
        if (abstractC12925q == null) {
            AbstractC12925q<E> mo3642s = mo3642s();
            this.f33640k = mo3642s;
            return mo3642s;
        }
        return abstractC12925q;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC12935v) && mo3643r() && ((AbstractC12935v) obj).mo3643r() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C12939y.m3649a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i;
        int i2 = 0;
        for (E e : this) {
            if (e != null) {
                i = e.hashCode();
            } else {
                i = 0;
            }
            i2 = ~(~(i2 + i));
        }
        return i2;
    }

    @Override // p366u9.AbstractC12927r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Iterator iterator() {
        return mo3647d();
    }

    /* renamed from: r */
    boolean mo3643r() {
        return false;
    }

    /* renamed from: s */
    AbstractC12925q<E> mo3642s() {
        return AbstractC12925q.m3661r(toArray());
    }
}

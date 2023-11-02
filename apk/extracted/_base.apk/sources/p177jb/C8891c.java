package p177jb;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p102fb.C6378h;

/* renamed from: jb.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8891c {

    /* renamed from: jb.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C8892a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: j */
        final int[] f23283j;

        /* renamed from: k */
        final int f23284k;

        /* renamed from: l */
        final int f23285l;

        C8892a(int[] iArr, int i, int i2) {
            this.f23283j = iArr;
            this.f23284k = i;
            this.f23285l = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public Integer get(int i) {
            C6378h.m22836h(i, size());
            return Integer.valueOf(this.f23283j[this.f23284k + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C8891c.m17073h(this.f23283j, ((Integer) obj).intValue(), this.f23284k, this.f23285l) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: d */
        public Integer set(int i, Integer num) {
            C6378h.m22836h(i, size());
            int[] iArr = this.f23283j;
            int i2 = this.f23284k;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) C6378h.m22834j(num)).intValue();
            return Integer.valueOf(i3);
        }

        /* renamed from: e */
        int[] m17067e() {
            return Arrays.copyOfRange(this.f23283j, this.f23284k, this.f23285l);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C8892a) {
                C8892a c8892a = (C8892a) obj;
                int size = size();
                if (c8892a.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.f23283j[this.f23284k + i] != c8892a.f23283j[c8892a.f23284k + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f23284k; i2 < this.f23285l; i2++) {
                i = (i * 31) + C8891c.m17075f(this.f23283j[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m17073h;
            if ((obj instanceof Integer) && (m17073h = C8891c.m17073h(this.f23283j, ((Integer) obj).intValue(), this.f23284k, this.f23285l)) >= 0) {
                return m17073h - this.f23284k;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m17072i;
            if ((obj instanceof Integer) && (m17072i = C8891c.m17072i(this.f23283j, ((Integer) obj).intValue(), this.f23284k, this.f23285l)) >= 0) {
                return m17072i - this.f23284k;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f23285l - this.f23284k;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i, int i2) {
            C6378h.m22830n(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f23283j;
            int i3 = this.f23284k;
            return new C8892a(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f23283j[this.f23284k]);
            int i = this.f23284k;
            while (true) {
                i++;
                if (i < this.f23285l) {
                    sb2.append(", ");
                    sb2.append(this.f23283j[i]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }
    }

    /* renamed from: c */
    public static int m17078c(long j) {
        boolean z;
        int i = (int) j;
        if (i == j) {
            z = true;
        } else {
            z = false;
        }
        C6378h.m22837g(z, "Out of range: %s", j);
        return i;
    }

    /* renamed from: d */
    public static int m17077d(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: e */
    public static int m17076e(int i, int i2, int i3) {
        boolean z;
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        C6378h.m22838f(z, "min (%s) must be less than or equal to max (%s)", i2, i3);
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: f */
    public static int m17075f(int i) {
        return i;
    }

    /* renamed from: g */
    public static int m17074g(int[] iArr, int i) {
        return m17073h(iArr, i, 0, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static int m17073h(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static int m17072i(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public static int m17071j(long j) {
        if (j > 2147483647L) {
            return ViewDefaults.NUMBER_OF_LINES;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: k */
    public static int[] m17070k(Collection<? extends Number> collection) {
        if (collection instanceof C8892a) {
            return ((C8892a) collection).m17067e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) C6378h.m22834j(array[i])).intValue();
        }
        return iArr;
    }
}

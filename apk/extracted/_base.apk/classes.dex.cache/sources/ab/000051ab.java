package p418x6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p195k8.C9208y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13691a {

    /* renamed from: a */
    public final int f35216a;

    /* renamed from: x6.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C13692a extends AbstractC13691a {

        /* renamed from: b */
        public final long f35217b;

        /* renamed from: c */
        public final List<C13693b> f35218c;

        /* renamed from: d */
        public final List<C13692a> f35219d;

        public C13692a(int i, long j) {
            super(i);
            this.f35217b = j;
            this.f35218c = new ArrayList();
            this.f35219d = new ArrayList();
        }

        /* renamed from: d */
        public void m1795d(C13692a c13692a) {
            this.f35219d.add(c13692a);
        }

        /* renamed from: e */
        public void m1794e(C13693b c13693b) {
            this.f35218c.add(c13693b);
        }

        /* renamed from: f */
        public C13692a m1793f(int i) {
            int size = this.f35219d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13692a c13692a = this.f35219d.get(i2);
                if (c13692a.f35216a == i) {
                    return c13692a;
                }
            }
            return null;
        }

        /* renamed from: g */
        public C13693b m1792g(int i) {
            int size = this.f35218c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C13693b c13693b = this.f35218c.get(i2);
                if (c13693b.f35216a == i) {
                    return c13693b;
                }
            }
            return null;
        }

        @Override // p418x6.AbstractC13691a
        public String toString() {
            return AbstractC13691a.m1798a(this.f35216a) + " leaves: " + Arrays.toString(this.f35218c.toArray()) + " containers: " + Arrays.toString(this.f35219d.toArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x6.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13693b extends AbstractC13691a {

        /* renamed from: b */
        public final C9208y f35220b;

        public C13693b(int i, C9208y c9208y) {
            super(i);
            this.f35220b = c9208y;
        }
    }

    public AbstractC13691a(int i) {
        this.f35216a = i;
    }

    /* renamed from: a */
    public static String m1798a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public static int m1797b(int i) {
        return i & 16777215;
    }

    /* renamed from: c */
    public static int m1796c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m1798a(this.f35216a);
    }
}
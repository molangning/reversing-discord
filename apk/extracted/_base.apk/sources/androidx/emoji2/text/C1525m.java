package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.p018os.C1071r;
import androidx.core.util.C1138f;
import java.nio.ByteBuffer;
import p072e0.C6031b;

/* renamed from: androidx.emoji2.text.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1525m {

    /* renamed from: a */
    private final C6031b f3975a;

    /* renamed from: b */
    private final char[] f3976b;

    /* renamed from: c */
    private final C1526a f3977c = new C1526a(1024);

    /* renamed from: d */
    private final Typeface f3978d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1526a {

        /* renamed from: a */
        private final SparseArray<C1526a> f3979a;

        /* renamed from: b */
        private C1512g f3980b;

        private C1526a() {
            this(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public C1526a m36568a(int i) {
            SparseArray<C1526a> sparseArray = this.f3979a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public final C1512g m36567b() {
            return this.f3980b;
        }

        /* renamed from: c */
        void m36566c(C1512g c1512g, int i, int i2) {
            C1526a m36568a = m36568a(c1512g.m36624b(i));
            if (m36568a == null) {
                m36568a = new C1526a();
                this.f3979a.put(c1512g.m36624b(i), m36568a);
            }
            if (i2 > i) {
                m36568a.m36566c(c1512g, i + 1, i2);
            } else {
                m36568a.f3980b = c1512g;
            }
        }

        C1526a(int i) {
            this.f3979a = new SparseArray<>(i);
        }
    }

    private C1525m(Typeface typeface, C6031b c6031b) {
        this.f3978d = typeface;
        this.f3975a = c6031b;
        this.f3976b = new char[c6031b.m23838k() * 2];
        m36576a(c6031b);
    }

    /* renamed from: a */
    private void m36576a(C6031b c6031b) {
        int m23838k = c6031b.m23838k();
        for (int i = 0; i < m23838k; i++) {
            C1512g c1512g = new C1512g(this, i);
            Character.toChars(c1512g.m36620f(), this.f3976b, i * 2);
            m36569h(c1512g);
        }
    }

    /* renamed from: b */
    public static C1525m m36575b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            C1071r.m37959a("EmojiCompat.MetadataRepo.create");
            return new C1525m(typeface, C1521l.m36583b(byteBuffer));
        } finally {
            C1071r.m37958b();
        }
    }

    /* renamed from: c */
    public char[] m36574c() {
        return this.f3976b;
    }

    /* renamed from: d */
    public C6031b m36573d() {
        return this.f3975a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m36572e() {
        return this.f3975a.m23837l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C1526a m36571f() {
        return this.f3977c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Typeface m36570g() {
        return this.f3978d;
    }

    /* renamed from: h */
    void m36569h(C1512g c1512g) {
        boolean z;
        C1138f.m37823g(c1512g, "emoji metadata cannot be null");
        if (c1512g.m36623c() > 0) {
            z = true;
        } else {
            z = false;
        }
        C1138f.m37829a(z, "invalid metadata codepoint length");
        this.f3977c.m36566c(c1512g, 0, c1512g.m36623c() - 1);
    }
}

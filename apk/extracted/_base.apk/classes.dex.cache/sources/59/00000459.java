package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.C0971e;
import androidx.core.provider.C1090g;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.text.TypefaceStyle;
import java.io.File;
import java.io.InputStream;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.core.graphics.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1001c0 {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0971e.C0974c> f3346a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1002a implements InterfaceC1003b<C1090g.C1092b> {
        C1002a() {
            C1001c0.this = r1;
        }

        @Override // androidx.core.graphics.C1001c0.InterfaceC1003b
        /* renamed from: c */
        public int mo38163b(C1090g.C1092b c1092b) {
            return c1092b.m37912e();
        }

        @Override // androidx.core.graphics.C1001c0.InterfaceC1003b
        /* renamed from: d */
        public boolean mo38164a(C1090g.C1092b c1092b) {
            return c1092b.m37911f();
        }
    }

    /* renamed from: androidx.core.graphics.c0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1003b<T> {
        /* renamed from: a */
        boolean mo38164a(T t);

        /* renamed from: b */
        int mo38163b(T t);
    }

    /* renamed from: e */
    private static <T> T m38169e(T[] tArr, int i, InterfaceC1003b<T> interfaceC1003b) {
        return (T) m38168f(tArr, (i & 1) == 0 ? TypefaceStyle.NORMAL : TypefaceStyle.BOLD, (i & 2) != 0, interfaceC1003b);
    }

    /* renamed from: f */
    private static <T> T m38168f(T[] tArr, int i, boolean z, InterfaceC1003b<T> interfaceC1003b) {
        int i2;
        T t = null;
        int i3 = ViewDefaults.NUMBER_OF_LINES;
        for (T t2 : tArr) {
            int abs = Math.abs(interfaceC1003b.mo38163b(t2) - i) * 2;
            if (interfaceC1003b.mo38164a(t2) == z) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i4 = abs + i2;
            if (t == null || i3 > i4) {
                t = t2;
                i3 = i4;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo38035a(Context context, C0971e.C0974c c0974c, Resources resources, int i) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo38034b(Context context, CancellationSignal cancellationSignal, C1090g.C1092b[] c1092bArr, int i) {
        throw null;
    }

    /* renamed from: c */
    public Typeface m38170c(Context context, InputStream inputStream) {
        File m38143e = C1007d0.m38143e(context);
        if (m38143e == null) {
            return null;
        }
        try {
            if (!C1007d0.m38144d(m38143e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(m38143e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m38143e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo38033d(Context context, Resources resources, int i, String str, int i2) {
        File m38143e = C1007d0.m38143e(context);
        if (m38143e == null) {
            return null;
        }
        try {
            if (!C1007d0.m38145c(m38143e, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(m38143e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m38143e.delete();
        }
    }

    /* renamed from: g */
    public C1090g.C1092b mo38167g(C1090g.C1092b[] c1092bArr, int i) {
        return (C1090g.C1092b) m38169e(c1092bArr, i, new C1002a());
    }
}
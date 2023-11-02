package p073e1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import p122gk.C6840m;
import p167j1.C8782c;
import p167j1.C8786g;
import p254o1.C10973w;
import p275p1.AbstractC11368c;
import p291q1.C11674f;
import p291q1.C11680l;

/* renamed from: e1.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6081t {

    /* renamed from: a */
    private static final Map<String, C6077r0<C6062k>> f17307a = new HashMap();

    /* renamed from: b */
    private static final Set<InterfaceC6080s0> f17308b = new HashSet();

    /* renamed from: c */
    private static final byte[] f17309c = {80, 75, 3, 4};

    /* renamed from: A */
    public static C6073p0<C6062k> m23633A(Context context, ZipInputStream zipInputStream, String str, boolean z) {
        try {
            return m23632B(context, zipInputStream, str);
        } finally {
            if (z) {
                C11680l.m7190c(zipInputStream);
            }
        }
    }

    /* renamed from: B */
    private static C6073p0<C6062k> m23632B(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C6062k c6062k = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c6062k = m23601s(AbstractC11368c.m8247H(C6840m.m21829d(C6840m.m21821l(zipInputStream))), null, false).m23646b();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        if (!name.contains(".ttf") && !name.contains(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        String[] split = name.split("/");
                        String str2 = split[split.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            C11674f.m7233c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        hashMap2.put(str3, createFromFile);
                    }
                    String[] split2 = name.split("/");
                    hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c6062k == null) {
                return new C6073p0<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C6063k0 m23610j = m23610j(c6062k, (String) entry.getKey());
                if (m23610j != null) {
                    m23610j.m23649f(C11680l.m7181l((Bitmap) entry.getValue(), m23610j.m23650e(), m23610j.m23652c()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (C8782c c8782c : c6062k.m23670g().values()) {
                    if (c8782c.m17267a().equals(entry2.getKey())) {
                        c8782c.m17263e((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                    C11674f.m7233c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (hashMap.isEmpty()) {
                for (Map.Entry<String, C6063k0> entry3 : c6062k.m23667j().entrySet()) {
                    C6063k0 value = entry3.getValue();
                    if (value == null) {
                        return null;
                    }
                    String m23653b = value.m23653b();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (m23653b.startsWith("data:") && m23653b.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(m23653b.substring(m23653b.indexOf(44) + 1), 0);
                            value.m23649f(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException e) {
                            C11674f.m7232d("data URL did not have correct base64 format.", e);
                            return null;
                        }
                    }
                }
            }
            if (str != null) {
                C8786g.m17249b().m17248c(str, c6062k);
            }
            return new C6073p0<>(c6062k);
        } catch (IOException e2) {
            return new C6073p0<>(e2);
        }
    }

    /* renamed from: C */
    private static boolean m23631C(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: D */
    private static Boolean m23630D(BufferedSource bufferedSource) {
        try {
            BufferedSource peek = bufferedSource.peek();
            for (byte b : f17309c) {
                if (peek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            C11674f.m7234b("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ C6073p0 m23629E(C6062k c6062k) {
        return new C6073p0(c6062k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static /* synthetic */ void m23628F(String str, AtomicBoolean atomicBoolean, C6062k c6062k) {
        Map<String, C6077r0<C6062k>> map = f17307a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m23621M(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static /* synthetic */ void m23627G(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map<String, C6077r0<C6062k>> map = f17307a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m23621M(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ C6073p0 m23623K(WeakReference weakReference, Context context, int i, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return m23597w(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ C6073p0 m23622L(Context context, String str, String str2) {
        C6073p0<C6062k> m11403c = C6043e.m23822h(context).m11403c(context, str, str2);
        if (str2 != null && m11403c.m23646b() != null) {
            C8786g.m17249b().m17248c(str2, m11403c.m23646b());
        }
        return m11403c;
    }

    /* renamed from: M */
    private static void m23621M(boolean z) {
        ArrayList arrayList = new ArrayList(f17308b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((InterfaceC6080s0) arrayList.get(i)).m23634a(z);
        }
    }

    /* renamed from: N */
    private static String m23620N(Context context, int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(m23631C(context) ? "_night_" : "_day_");
        sb2.append(i);
        return sb2.toString();
    }

    /* renamed from: i */
    private static C6077r0<C6062k> m23611i(final String str, Callable<C6073p0<C6062k>> callable, Runnable runnable) {
        final C6062k m17250a;
        C6077r0<C6062k> c6077r0 = null;
        if (str == null) {
            m17250a = null;
        } else {
            m17250a = C8786g.m17249b().m17250a(str);
        }
        if (m17250a != null) {
            c6077r0 = new C6077r0<>(new Callable() { // from class: e1.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C6073p0 m23629E;
                    m23629E = C6081t.m23629E(C6062k.this);
                    return m23629E;
                }
            });
        }
        if (str != null) {
            Map<String, C6077r0<C6062k>> map = f17307a;
            if (map.containsKey(str)) {
                c6077r0 = map.get(str);
            }
        }
        if (c6077r0 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return c6077r0;
        }
        C6077r0<C6062k> c6077r02 = new C6077r0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c6077r02.m23642d(new InterfaceC6065l0() { // from class: e1.p
                @Override // p073e1.InterfaceC6065l0
                public final void onResult(Object obj) {
                    C6081t.m23628F(str, atomicBoolean, (C6062k) obj);
                }
            });
            c6077r02.m23643c(new InterfaceC6065l0() { // from class: e1.q
                @Override // p073e1.InterfaceC6065l0
                public final void onResult(Object obj) {
                    C6081t.m23627G(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, C6077r0<C6062k>> map2 = f17307a;
                map2.put(str, c6077r02);
                if (map2.size() == 1) {
                    m23621M(false);
                }
            }
        }
        return c6077r02;
    }

    /* renamed from: j */
    private static C6063k0 m23610j(C6062k c6062k, String str) {
        for (C6063k0 c6063k0 : c6062k.m23667j().values()) {
            if (c6063k0.m23653b().equals(str)) {
                return c6063k0;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static C6077r0<C6062k> m23609k(Context context, String str) {
        return m23608l(context, str, "asset_" + str);
    }

    /* renamed from: l */
    public static C6077r0<C6062k> m23608l(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return m23611i(str2, new Callable() { // from class: e1.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6073p0 m23606n;
                m23606n = C6081t.m23606n(applicationContext, str, str2);
                return m23606n;
            }
        }, null);
    }

    /* renamed from: m */
    public static C6073p0<C6062k> m23607m(Context context, String str) {
        return m23606n(context, str, "asset_" + str);
    }

    /* renamed from: n */
    public static C6073p0<C6062k> m23606n(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return m23604p(context.getAssets().open(str), str2);
            }
            return m23594z(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new C6073p0<>(e);
        }
    }

    /* renamed from: o */
    public static C6077r0<C6062k> m23605o(final InputStream inputStream, final String str) {
        return m23611i(str, new Callable() { // from class: e1.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6073p0 m23604p;
                m23604p = C6081t.m23604p(inputStream, str);
                return m23604p;
            }
        }, new Runnable() { // from class: e1.n
            @Override // java.lang.Runnable
            public final void run() {
                C11680l.m7190c(inputStream);
            }
        });
    }

    /* renamed from: p */
    public static C6073p0<C6062k> m23604p(InputStream inputStream, String str) {
        return m23603q(inputStream, str, true);
    }

    /* renamed from: q */
    public static C6073p0<C6062k> m23603q(InputStream inputStream, String str, boolean z) {
        try {
            return m23602r(AbstractC11368c.m8247H(C6840m.m21829d(C6840m.m21821l(inputStream))), str);
        } finally {
            if (z) {
                C11680l.m7190c(inputStream);
            }
        }
    }

    /* renamed from: r */
    public static C6073p0<C6062k> m23602r(AbstractC11368c abstractC11368c, String str) {
        return m23601s(abstractC11368c, str, true);
    }

    /* renamed from: s */
    private static C6073p0<C6062k> m23601s(AbstractC11368c abstractC11368c, String str, boolean z) {
        try {
            try {
                C6062k m9438a = C10973w.m9438a(abstractC11368c);
                if (str != null) {
                    C8786g.m17249b().m17248c(str, m9438a);
                }
                C6073p0<C6062k> c6073p0 = new C6073p0<>(m9438a);
                if (z) {
                    C11680l.m7190c(abstractC11368c);
                }
                return c6073p0;
            } catch (Exception e) {
                C6073p0<C6062k> c6073p02 = new C6073p0<>(e);
                if (z) {
                    C11680l.m7190c(abstractC11368c);
                }
                return c6073p02;
            }
        } catch (Throwable th2) {
            if (z) {
                C11680l.m7190c(abstractC11368c);
            }
            throw th2;
        }
    }

    /* renamed from: t */
    public static C6077r0<C6062k> m23600t(Context context, int i) {
        return m23599u(context, i, m23620N(context, i));
    }

    /* renamed from: u */
    public static C6077r0<C6062k> m23599u(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m23611i(str, new Callable() { // from class: e1.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6073p0 m23623K;
                m23623K = C6081t.m23623K(weakReference, applicationContext, i, str);
                return m23623K;
            }
        }, null);
    }

    /* renamed from: v */
    public static C6073p0<C6062k> m23598v(Context context, int i) {
        return m23597w(context, i, m23620N(context, i));
    }

    /* renamed from: w */
    public static C6073p0<C6062k> m23597w(Context context, int i, String str) {
        try {
            BufferedSource m21829d = C6840m.m21829d(C6840m.m21821l(context.getResources().openRawResource(i)));
            if (m23630D(m21829d).booleanValue()) {
                return m23594z(context, new ZipInputStream(m21829d.mo8579z0()), str);
            }
            return m23604p(m21829d.mo8579z0(), str);
        } catch (Resources.NotFoundException e) {
            return new C6073p0<>(e);
        }
    }

    /* renamed from: x */
    public static C6077r0<C6062k> m23596x(Context context, String str) {
        return m23595y(context, str, "url_" + str);
    }

    /* renamed from: y */
    public static C6077r0<C6062k> m23595y(final Context context, final String str, final String str2) {
        return m23611i(str2, new Callable() { // from class: e1.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C6073p0 m23622L;
                m23622L = C6081t.m23622L(context, str, str2);
                return m23622L;
            }
        }, null);
    }

    /* renamed from: z */
    public static C6073p0<C6062k> m23594z(Context context, ZipInputStream zipInputStream, String str) {
        return m23633A(context, zipInputStream, str, true);
    }
}

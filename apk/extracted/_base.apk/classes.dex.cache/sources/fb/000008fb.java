package p021b1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.discord.BuildConfig;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p021b1.C2110z;
import p054d1.AbstractC5717a;
import p054d1.C5726e;

/* renamed from: b1.h1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2043h1 {

    /* renamed from: a */
    public static final DecimalFormat f5687a = m34494Z();

    /* renamed from: b */
    public static final SimpleDateFormat f5688b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z", Locale.US);

    /* renamed from: c */
    private static volatile C5726e f5689c = null;

    /* renamed from: b1.h1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class CallableC2044a implements Callable<Object> {

        /* renamed from: j */
        final /* synthetic */ Context f5690j;

        CallableC2044a(Context context) {
            this.f5690j = context;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            try {
                return C2109y0.m34193e(this.f5690j);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: b1.h1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class CallableC2045b implements Callable<String> {

        /* renamed from: j */
        final /* synthetic */ Context f5691j;

        /* renamed from: k */
        final /* synthetic */ Object f5692k;

        CallableC2045b(Context context, Object obj) {
            this.f5691j = context;
            this.f5692k = obj;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return C2109y0.m34190h(this.f5691j, this.f5692k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.h1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class CallableC2046c implements Callable<Boolean> {

        /* renamed from: j */
        final /* synthetic */ Context f5693j;

        /* renamed from: k */
        final /* synthetic */ Object f5694k;

        CallableC2046c(Context context, Object obj) {
            this.f5693j = context;
            this.f5694k = obj;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            return C2109y0.m34186l(this.f5693j, this.f5694k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.h1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2047d extends AbstractC5717a<Object, Void> {
        C2047d() {
        }

        @Override // p054d1.AbstractC5717a
        /* renamed from: e */
        public Void mo24624a(Object... objArr) {
            ((Runnable) objArr[0]).run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.h1$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2048e extends AbstractC5717a<Context, String> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2075o0 f5695a;

        C2048e(InterfaceC2075o0 interfaceC2075o0) {
            this.f5695a = interfaceC2075o0;
        }

        @Override // p054d1.AbstractC5717a
        /* renamed from: e */
        public String mo24624a(Context... contextArr) {
            InterfaceC2025c0 m34422j = C2055l.m34422j();
            String m34467s = C2043h1.m34467s(contextArr[0]);
            m34422j.mo34443c("GoogleAdId read " + m34467s, new Object[0]);
            return m34467s;
        }

        @Override // p054d1.AbstractC5717a
        /* renamed from: f */
        public void mo24622c(String str) {
            C2055l.m34422j();
            this.f5695a.mo32711a(str);
        }
    }

    /* renamed from: A */
    public static String m34519A(Context context, Object obj, long j) {
        return (String) m34484e0(context, new CallableC2045b(context, obj), j);
    }

    /* renamed from: B */
    public static String m34518B(String str, Throwable th2) {
        if (th2 != null) {
            return m34474l("%s: %s", str, th2);
        }
        return m34474l("%s", str);
    }

    /* renamed from: C */
    public static String m34517C(Exception exc) {
        if (!m34511I(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int indexOf = stringWriter2.indexOf("Caused by:");
        return stringWriter2.substring(indexOf, stringWriter2.indexOf(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, indexOf));
    }

    /* renamed from: D */
    private static String m34516D(String str) {
        String[] split;
        if (str == null || !str.contains("@") || (split = str.split("@")) == null || split.length != 2) {
            return null;
        }
        return split[0];
    }

    /* renamed from: E */
    public static String m34515E(String str) {
        String[] split;
        String m34516D = m34516D(str);
        if (m34516D == null || (split = m34516D.split("\\d+", 2)) == null || split.length == 0) {
            return null;
        }
        return split[0];
    }

    /* renamed from: F */
    public static String m34514F() {
        return "android4.28.8";
    }

    /* renamed from: G */
    public static String[] m34513G() {
        return Build.SUPPORTED_ABIS;
    }

    /* renamed from: H */
    public static long m34512H(int i, EnumC2104w enumC2104w) {
        int i2 = enumC2104w.f5900j;
        if (i < i2) {
            return 0L;
        }
        return (long) (Math.min(((long) Math.pow(2.0d, i - i2)) * enumC2104w.f5901k, enumC2104w.f5902l) * m34492a0(enumC2104w.f5903m, enumC2104w.f5904n));
    }

    /* renamed from: I */
    public static boolean m34511I(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    /* renamed from: J */
    public static String m34510J(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return m34489c(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static int m34509K(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* renamed from: L */
    public static int m34508L(Double d) {
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    /* renamed from: M */
    public static int m34507M(Enum r0) {
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }

    /* renamed from: N */
    public static int m34506N(Long l) {
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    /* renamed from: O */
    public static int m34505O(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: P */
    public static int m34504P(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: Q */
    private static boolean m34503Q(C2107x0 c2107x0, C2027d c2027d) {
        if (c2107x0.f5937b == c2027d.f5579A && c2107x0.f5938c == c2027d.f5580B && c2107x0.f5939d == c2027d.f5583E && c2107x0.f5940e == c2027d.f5584F && m34476j(c2107x0.f5936a, c2027d.f5581C) && m34476j(c2107x0.f5941f, c2027d.f5585G) && m34485e(c2107x0.f5942g, c2027d.f5582D)) {
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private static boolean m34502R(C2107x0 c2107x0, C2027d c2027d) {
        if (c2107x0.f5937b == c2027d.f5586H && c2107x0.f5938c == c2027d.f5587I && m34476j(c2107x0.f5936a, c2027d.f5588J)) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private static boolean m34501S(C2107x0 c2107x0, C2027d c2027d) {
        if (c2107x0.f5937b == c2027d.f5586H && c2107x0.f5938c == c2027d.f5587I && m34476j(c2107x0.f5936a, c2027d.f5589K)) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public static boolean m34500T(C2107x0 c2107x0, String str, C2027d c2027d) {
        if (str.equals(BuildConfig.FLAVOR)) {
            return m34503Q(c2107x0, c2027d);
        }
        if (str.equals("huawei_ads")) {
            return m34502R(c2107x0, c2027d);
        }
        if (str.equals("huawei_app_gallery")) {
            return m34501S(c2107x0, c2027d);
        }
        return false;
    }

    /* renamed from: U */
    public static Boolean m34499U(Context context, Object obj, long j) {
        return (Boolean) m34484e0(context, new CallableC2046c(context, obj), j);
    }

    /* renamed from: V */
    public static boolean m34498V(Uri uri) {
        String uri2;
        if (uri == null || (uri2 = uri.toString()) == null || uri2.length() == 0 || uri2.matches("^(fb|vk)[0-9]{5,}[^:]*://authorize.*access_token=.*")) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public static boolean m34497W(String str, String str2, String str3) {
        if (str == null) {
            m34464v().mo34444b("%s parameter %s is missing", str3, str2);
            return false;
        } else if (!str.equals("")) {
            return true;
        } else {
            m34464v().mo34444b("%s parameter %s is empty", str3, str2);
            return false;
        }
    }

    /* renamed from: X */
    public static String m34496X(String str) {
        return m34510J(str, "MD5");
    }

    /* renamed from: Y */
    public static Map<String, String> m34495Y(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap(map);
        InterfaceC2025c0 m34464v = m34464v();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String str2 = (String) hashMap.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                m34464v.mo34445a("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return hashMap;
    }

    /* renamed from: Z */
    private static DecimalFormat m34494Z() {
        return new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    }

    /* renamed from: a0 */
    private static double m34492a0(double d, double d2) {
        return (new Random().nextDouble() * (d2 - d)) + d;
    }

    /* renamed from: b */
    public static boolean m34491b(Context context, String str) {
        try {
            if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            m34464v().mo34443c("Unable to check permission '%s' with message (%s)", str, e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T m34490b0(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.Class<T> r10) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 0
            java.io.FileInputStream r7 = r7.openFileInput(r8)     // Catch: java.lang.Exception -> L7d java.io.FileNotFoundException -> L8f
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r8.<init>(r7)     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L71
            r7.<init>(r8)     // Catch: java.lang.Exception -> L6b java.io.FileNotFoundException -> L71
            java.lang.Object r8 = r7.readObject()     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            java.lang.Object r3 = r10.cast(r8)     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            b1.c0 r8 = m34464v()     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            java.lang.String r10 = "Read %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            r4[r1] = r9     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            r4[r2] = r3     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            r8.mo34443c(r10, r4)     // Catch: java.lang.Exception -> L2b java.lang.ClassCastException -> L41 java.lang.ClassNotFoundException -> L56
            goto La0
        L2b:
            r8 = move-exception
            b1.c0 r10 = m34464v()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r4 = "Failed to read %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r1] = r9     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r2] = r8     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r10.mo34444b(r4, r5)     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            goto La0
        L41:
            r8 = move-exception
            b1.c0 r10 = m34464v()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r4 = "Failed to cast %s object (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r1] = r9     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r2] = r8     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r10.mo34444b(r4, r5)     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            goto La0
        L56:
            r8 = move-exception
            b1.c0 r10 = m34464v()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r4 = "Failed to find %s class (%s)"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r1] = r9     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r5[r2] = r8     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            r10.mo34444b(r4, r5)     // Catch: java.lang.Exception -> L74 java.io.FileNotFoundException -> L79
            goto La0
        L6b:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
            goto L7f
        L71:
            r7 = r3
            r3 = r8
            goto L90
        L74:
            r8 = move-exception
            r6 = r3
            r3 = r7
            r7 = r6
            goto L7f
        L79:
            r6 = r3
            r3 = r7
            r7 = r6
            goto L90
        L7d:
            r8 = move-exception
            r7 = r3
        L7f:
            b1.c0 r10 = m34464v()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r9
            r4[r2] = r8
            java.lang.String r8 = "Failed to open %s file for reading (%s)"
            r10.mo34444b(r8, r4)
            goto L9d
        L8f:
            r7 = r3
        L90:
            b1.c0 r8 = m34464v()
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r1] = r9
            java.lang.String r4 = "%s file not found"
            r8.mo34443c(r4, r10)
        L9d:
            r6 = r3
            r3 = r7
            r7 = r6
        La0:
            if (r7 == 0) goto Lb6
            r7.close()     // Catch: java.lang.Exception -> La6
            goto Lb6
        La6:
            r7 = move-exception
            b1.c0 r8 = m34464v()
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r1] = r9
            r10[r2] = r7
            java.lang.String r7 = "Failed to close %s file for reading (%s)"
            r8.mo34444b(r7, r10)
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b1.C2043h1.m34490b0(android.content.Context, java.lang.String, java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* renamed from: c */
    public static String m34489c(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return m34474l("%0" + (bArr.length << 1) + "x", bigInteger);
    }

    /* renamed from: c0 */
    public static boolean m34488c0(Context context, String str) {
        try {
            if (context.getPackageManager().resolveContentProvider(str, 0) == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static String m34487d() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: d0 */
    public static void m34486d0(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            runnable.run();
        } else {
            new C2047d().m24623b(runnable);
        }
    }

    /* renamed from: e */
    public static boolean m34485e(Boolean bool, Boolean bool2) {
        return m34477i(bool, bool2);
    }

    /* renamed from: e0 */
    private static <R> R m34484e0(Context context, Callable<R> callable, long j) {
        if (f5689c == null) {
            synchronized (C2043h1.class) {
                if (f5689c == null) {
                    f5689c = new C5726e("PlayAdIdLibrary", true);
                }
            }
        }
        try {
            return (R) f5689c.m24611d(callable, 0L).get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m34483f(Enum r0, Enum r1) {
        return m34477i(r0, r1);
    }

    /* renamed from: f0 */
    public static String m34482f0(String str) {
        return m34510J(str, "SHA-1");
    }

    /* renamed from: g */
    public static boolean m34481g(Integer num, Integer num2) {
        return m34477i(num, num2);
    }

    /* renamed from: g0 */
    public static String m34480g0(String str) {
        return m34510J(str, "SHA-256");
    }

    /* renamed from: h */
    public static boolean m34479h(Long l, Long l2) {
        return m34477i(l, l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> void m34478h0(T r5, android.content.Context r6, java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.io.FileOutputStream r6 = r6.openFileOutput(r7, r2)     // Catch: java.lang.Exception -> L37
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L35
            r7.<init>(r6)     // Catch: java.lang.Exception -> L35
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> L32
            r6.<init>(r7)     // Catch: java.lang.Exception -> L32
            r6.writeObject(r5)     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            b1.c0 r7 = m34464v()     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            java.lang.String r3 = "Wrote %s: %s"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            r4[r2] = r8     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            r4[r1] = r5     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            r7.mo34443c(r3, r4)     // Catch: java.io.NotSerializableException -> L24 java.lang.Exception -> L35
            goto L48
        L24:
            b1.c0 r5 = m34464v()     // Catch: java.lang.Exception -> L35
            java.lang.String r7 = "Failed to serialize %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L35
            r3[r2] = r8     // Catch: java.lang.Exception -> L35
            r5.mo34444b(r7, r3)     // Catch: java.lang.Exception -> L35
            goto L48
        L32:
            r5 = move-exception
            r6 = r7
            goto L39
        L35:
            r5 = move-exception
            goto L39
        L37:
            r5 = move-exception
            r6 = 0
        L39:
            b1.c0 r7 = m34464v()
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r2] = r8
            r3[r1] = r5
            java.lang.String r5 = "Failed to open %s for writing (%s)"
            r7.mo34444b(r5, r3)
        L48:
            if (r6 == 0) goto L5e
            r6.close()     // Catch: java.lang.Exception -> L4e
            goto L5e
        L4e:
            r5 = move-exception
            b1.c0 r6 = m34464v()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r2] = r8
            r7[r1] = r5
            java.lang.String r5 = "Failed to close %s file for writing (%s)"
            r6.mo34444b(r5, r7)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b1.C2043h1.m34478h0(java.lang.Object, android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: i */
    public static boolean m34477i(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : obj.equals(obj2);
    }

    /* renamed from: j */
    public static boolean m34476j(String str, String str2) {
        return m34477i(str, str2);
    }

    /* renamed from: k */
    public static boolean m34475k(Double d, Double d2) {
        return (d == null || d2 == null) ? d == null && d2 == null : Double.doubleToLongBits(d.doubleValue()) == Double.doubleToLongBits(d2.doubleValue());
    }

    /* renamed from: l */
    public static String m34474l(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: m */
    public static Object m34473m(Context context, long j) {
        return m34484e0(context, new CallableC2044a(context), j);
    }

    /* renamed from: n */
    public static String m34472n(Context context) {
        return C2084t.m34342a(context);
    }

    /* renamed from: o */
    public static int m34471o(Context context) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            m34464v().mo34445a("Couldn't read connectivity type (%s)", e.getMessage());
        }
        if (connectivityManager == null) {
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return -1;
        }
        if (networkCapabilities.hasTransport(1)) {
            return 1;
        }
        if (networkCapabilities.hasTransport(0)) {
            return 0;
        }
        if (networkCapabilities.hasTransport(3)) {
            return 3;
        }
        if (networkCapabilities.hasTransport(4)) {
            return 4;
        }
        if (networkCapabilities.hasTransport(2)) {
            return 2;
        }
        if (i < 26) {
            return -1;
        }
        if (networkCapabilities.hasTransport(5)) {
            return 5;
        }
        if (i < 27) {
            return -1;
        }
        if (!networkCapabilities.hasTransport(6)) {
            return -1;
        }
        return 6;
    }

    /* renamed from: p */
    public static String m34470p() {
        return null;
    }

    /* renamed from: q */
    public static String m34469q(ContentResolver contentResolver) {
        if (contentResolver == null) {
            return null;
        }
        try {
            return Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static Boolean m34468r(ContentResolver contentResolver) {
        boolean z;
        try {
            if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static String m34467s(Context context) {
        Object m34473m;
        String str = null;
        try {
            C2110z.C2112b m34185a = C2110z.m34185a(context, 11000L);
            if (m34185a != null) {
                str = m34185a.m34183a();
            }
        } catch (Exception unused) {
        }
        if (str == null && (m34473m = m34473m(context, 11000L)) != null) {
            return m34519A(context, m34473m, 1000L);
        }
        return str;
    }

    /* renamed from: t */
    public static void m34466t(Context context, InterfaceC2075o0 interfaceC2075o0) {
        InterfaceC2025c0 m34422j = C2055l.m34422j();
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m34422j.mo34443c("GoogleAdId being read in the background", new Object[0]);
            String m34467s = m34467s(context);
            m34422j.mo34443c("GoogleAdId read " + m34467s, new Object[0]);
            interfaceC2075o0.mo32711a(m34467s);
            return;
        }
        m34422j.mo34443c("GoogleAdId being read in the foreground", new Object[0]);
        new C2048e(interfaceC2075o0).m24623b(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0006, code lost:
        r2 = r4.getLocales();
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Locale m34465u(android.content.res.Configuration r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L18
            android.os.LocaleList r2 = androidx.appcompat.app.C0327h.m40574a(r4)
            if (r2 == 0) goto L18
            boolean r3 = androidx.core.p018os.C1069p.m37962a(r2)
            if (r3 != 0) goto L18
            r4 = 0
            java.util.Locale r4 = androidx.core.p018os.C1065l.m37966a(r2, r4)
            return r4
        L18:
            if (r0 >= r1) goto L1d
            java.util.Locale r4 = r4.locale
            return r4
        L1d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p021b1.C2043h1.m34465u(android.content.res.Configuration):java.util.Locale");
    }

    /* renamed from: v */
    private static InterfaceC2025c0 m34464v() {
        return C2055l.m34422j();
    }

    /* renamed from: w */
    public static String m34463w(Context context) {
        return C2056l0.m34405a(context);
    }

    /* renamed from: x */
    public static String m34462x(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator)) {
                C2055l.m34422j().mo34445a("Couldn't receive networkOperator string to read MCC", new Object[0]);
                return null;
            }
            return networkOperator.substring(0, 3);
        } catch (Exception unused) {
            C2055l.m34422j().mo34445a("Couldn't return mcc", new Object[0]);
            return null;
        }
    }

    /* renamed from: y */
    public static String m34461y(Context context) {
        try {
            String networkOperator = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator)) {
                C2055l.m34422j().mo34445a("Couldn't receive networkOperator string to read MNC", new Object[0]);
                return null;
            }
            return networkOperator.substring(3);
        } catch (Exception unused) {
            C2055l.m34422j().mo34445a("Couldn't return mnc", new Object[0]);
            return null;
        }
    }

    /* renamed from: z */
    public static int m34460z(Context context) {
        int networkType;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT >= 30) {
                networkType = telephonyManager.getDataNetworkType();
            } else {
                networkType = telephonyManager.getNetworkType();
            }
            return networkType;
        } catch (Exception e) {
            m34464v().mo34445a("Couldn't read network type (%s)", e.getMessage());
            return -1;
        }
    }
}
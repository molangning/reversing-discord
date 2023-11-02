package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p129h5.C7018a;
import p129h5.C7020c;
import p164j$.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SoLoader {

    /* renamed from: b */
    static InterfaceC4324p f10927b;

    /* renamed from: f */
    private static AbstractC4326r[] f10931f;

    /* renamed from: g */
    private static C4300b f10932g;

    /* renamed from: m */
    private static int f10938m;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f10928c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static volatile AbstractC4325q[] f10929d = null;

    /* renamed from: e */
    private static final AtomicInteger f10930e = new AtomicInteger(0);

    /* renamed from: h */
    private static final HashSet<String> f10933h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f10934i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f10935j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static boolean f10936k = true;

    /* renamed from: l */
    private static final String[] f10937l = {System.mapLibraryName("breakpad")};

    /* renamed from: n */
    private static int f10939n = 0;

    /* renamed from: a */
    static final boolean f10926a = true;

    /* renamed from: com.facebook.soloader.SoLoader$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4296a implements InterfaceC4324p {

        /* renamed from: a */
        final /* synthetic */ boolean f10940a;

        /* renamed from: b */
        final /* synthetic */ String f10941b;

        /* renamed from: c */
        final /* synthetic */ String f10942c;

        /* renamed from: d */
        final /* synthetic */ Runtime f10943d;

        /* renamed from: e */
        final /* synthetic */ Method f10944e;

        C4296a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.f10940a = z;
            this.f10941b = str;
            this.f10942c = str2;
            this.f10943d = runtime;
            this.f10944e = method;
        }

        /* renamed from: c */
        private String m30155c(String str) {
            try {
                File file = new File(str);
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            String format = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                            fileInputStream.close();
                            return format;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
                return e.toString();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0035, code lost:
            if (r1 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0037, code lost:
            android.util.Log.e("SoLoader", "Error when loading lib: " + r1 + " lib hash: " + m30155c(r9) + " search path is " + r10);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x009e  */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // com.facebook.soloader.InterfaceC4324p
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo30090a(java.lang.String r9, int r10) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C4296a.mo30090a(java.lang.String, int):void");
        }

        @Override // com.facebook.soloader.InterfaceC4324p
        /* renamed from: b */
        public void mo30089b(String str, InterfaceC4304f interfaceC4304f, int i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4297b extends UnsatisfiedLinkError {
        C4297b(Throwable th2, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.m30144k()) + " error: " + str);
            initCause(th2);
        }
    }

    /* renamed from: A */
    static File m30182A(String str) {
        f10928c.readLock().lock();
        try {
            for (AbstractC4325q abstractC4325q : f10929d) {
                File mo30088c = abstractC4325q.mo30088c(str);
                if (mo30088c != null) {
                    return mo30088c;
                }
            }
            f10928c.readLock().unlock();
            throw new FileNotFoundException(str);
        } finally {
            f10928c.readLock().unlock();
        }
    }

    /* renamed from: a */
    private static void m30181a(Context context, ArrayList<AbstractC4325q> arrayList, int i) {
        if ((f10938m & 8) != 0) {
            f10931f = null;
            File m30075s = AbstractC4326r.m30075s(context, "lib-main");
            try {
                SysUtil.m30152c(m30075s);
                return;
            } catch (IOException e) {
                Log.w("SoLoader", "Failed to delete " + m30075s.getCanonicalPath(), e);
                return;
            }
        }
        File file = new File(context.getApplicationInfo().sourceDir);
        ArrayList arrayList2 = new ArrayList();
        C4298a c4298a = new C4298a(context, file, "lib-main", i);
        arrayList2.add(c4298a);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding backup source from : " + c4298a.toString());
        }
        m30178d(context, i, arrayList2);
        f10931f = (AbstractC4326r[]) arrayList2.toArray(new AbstractC4326r[arrayList2.size()]);
        arrayList.addAll(0, arrayList2);
    }

    /* renamed from: b */
    private static void m30180b(ArrayList<AbstractC4325q> arrayList, String[] strArr) {
        String str;
        if (SysUtil.m30143l()) {
            str = "/system/lib64:/vendor/lib64";
        } else {
            str = "/system/lib:/vendor/lib";
        }
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str + ":" + str2;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding system library source: " + str3);
            }
            arrayList.add(new C4302d(new File(str3), 2, strArr));
        }
    }

    /* renamed from: c */
    private static void m30179c(Context context, ArrayList<AbstractC4325q> arrayList, int i) {
        f10932g = new C4300b(context, i);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding application source: " + f10932g.toString());
        }
        arrayList.add(0, f10932g);
    }

    /* renamed from: d */
    private static void m30178d(Context context, int i, ArrayList<AbstractC4326r> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding backup sources from split apks");
            }
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                File file = new File(strArr[i2]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("lib-");
                int i4 = i3 + 1;
                sb2.append(i3);
                C4298a c4298a = new C4298a(context, file, sb2.toString(), i);
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "adding backup source: " + c4298a.toString());
                }
                arrayList.add(c4298a);
                i2++;
                i3 = i4;
            }
        }
    }

    /* renamed from: e */
    private static void m30177e(Context context, ArrayList<AbstractC4325q> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                C4301c c4301c = new C4301c(new File(str));
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "validating/adding directApk source from splitApk: " + c4301c.toString());
                }
                if (c4301c.m30128h()) {
                    arrayList.add(0, c4301c);
                }
            }
        }
        C4301c c4301c2 = new C4301c(context);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "validating/adding directApk source: " + c4301c2.toString());
        }
        if (c4301c2.m30128h()) {
            arrayList.add(0, c4301c2);
        }
    }

    /* renamed from: f */
    private static void m30176f() {
        if (m30165q()) {
            return;
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    /* renamed from: g */
    private static void m30175g(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        int i2;
        ReentrantReadWriteLock reentrantReadWriteLock;
        AbstractC4326r[] abstractC4326rArr;
        ReentrantReadWriteLock reentrantReadWriteLock2 = f10928c;
        reentrantReadWriteLock2.readLock().lock();
        try {
            if (f10929d != null) {
                reentrantReadWriteLock2.readLock().unlock();
                int i3 = 0;
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (f10926a) {
                    Api18TraceUtils.m30184a("SoLoader.loadLibrary[", str, "]");
                }
                try {
                    reentrantReadWriteLock2.readLock().lock();
                    i2 = 0;
                    for (int i4 = 0; i2 == 0 && i4 < f10929d.length; i4++) {
                        i2 = f10929d[i4].mo30087a(str, i, threadPolicy);
                        if (i2 == 3 && f10931f != null) {
                            if (Log.isLoggable("SoLoader", 3)) {
                                Log.d("SoLoader", "Trying backup SoSource for " + str);
                            }
                            for (AbstractC4326r abstractC4326r : f10931f) {
                                abstractC4326r.m30073u(str);
                                int mo30087a = abstractC4326r.mo30087a(str, i, threadPolicy);
                                if (mo30087a == 1) {
                                    i2 = mo30087a;
                                    break;
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    if (f10926a) {
                        Api18TraceUtils.m30183b();
                    }
                    if (z) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    if (i2 == 0 || i2 == 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("couldn't find DSO to load: ");
                        sb2.append(str);
                        reentrantReadWriteLock.readLock().lock();
                        while (i3 < f10929d.length) {
                            sb2.append("\n\tSoSource ");
                            sb2.append(i3);
                            sb2.append(": ");
                            sb2.append(f10929d[i3].toString());
                            i3++;
                        }
                        C4300b c4300b = f10932g;
                        if (c4300b != null) {
                            File m30134e = C4300b.m30134e(c4300b.m30133f());
                            sb2.append("\n\tNative lib dir: ");
                            sb2.append(m30134e.getAbsolutePath());
                            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        }
                        f10928c.readLock().unlock();
                        sb2.append(" result: ");
                        sb2.append(i2);
                        String sb3 = sb2.toString();
                        Log.e("SoLoader", sb3);
                        throw new UnsatisfiedLinkError(sb3);
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    i3 = i2;
                    if (f10926a) {
                        Api18TraceUtils.m30183b();
                    }
                    if (z) {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                    if (i3 != 0 && i3 != 3) {
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("couldn't find DSO to load: ");
                    sb4.append(str);
                    String message = th.getMessage();
                    if (message == null) {
                        message = th.toString();
                    }
                    sb4.append(" caused by: ");
                    sb4.append(message);
                    th.printStackTrace();
                    sb4.append(" result: ");
                    sb4.append(i3);
                    String sb5 = sb4.toString();
                    Log.e("SoLoader", sb5);
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb5);
                    unsatisfiedLinkError.initCause(th);
                    throw unsatisfiedLinkError;
                }
            }
            Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
        } finally {
            f10928c.readLock().unlock();
        }
    }

    /* renamed from: h */
    private static int m30174h(Context context, int i) {
        ApplicationInfo applicationInfo;
        int i2 = f10939n;
        if (i2 != 0) {
            return i2;
        }
        int i3 = 1;
        if ((i & 32) == 0 && context != null) {
            int i4 = context.getApplicationInfo().flags;
            if ((i4 & 1) != 0) {
                if ((i4 & 128) != 0) {
                    i3 = 3;
                } else {
                    i3 = 2;
                }
            }
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i3);
            }
        }
        return i3;
    }

    /* renamed from: i */
    private static int m30173i() {
        int i = f10939n;
        if (i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            throw new RuntimeException("Unsupported app type, we should not reach here");
        }
        return 0;
    }

    public static void init(Context context, int i) {
        m30171k(context, i, null, f10937l);
    }

    /* renamed from: j */
    private static Method m30172j() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException | SecurityException e) {
            Log.w("SoLoader", "Cannot get nativeLoad method", e);
            return null;
        }
    }

    /* renamed from: k */
    public static void m30171k(Context context, int i, InterfaceC4324p interfaceC4324p, String[] strArr) {
        if (m30165q()) {
            return;
        }
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean m30168n = m30168n(context);
            f10936k = m30168n;
            if (m30168n) {
                int m30174h = m30174h(context, i);
                f10939n = m30174h;
                if ((i & 128) == 0 && SysUtil.m30142m(context, m30174h)) {
                    i |= 72;
                }
                m30167o(interfaceC4324p);
                m30166p(context, i, strArr);
                Log.v("SoLoader", "Init SoLoader delegate");
                C7018a.m21533b(new C4323o());
            } else {
                m30169m();
                Log.v("SoLoader", "Init System Loader delegate");
                C7018a.m21533b(new C7020c());
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    /* renamed from: l */
    public static void m30170l(Context context, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            m30171k(context, i, null, f10937l);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private static void m30169m() {
        if (f10929d != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f10928c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f10929d != null) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f10929d = new AbstractC4325q[0];
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            f10928c.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: n */
    private static boolean m30168n(Context context) {
        String str;
        Bundle bundle = null;
        try {
            str = context.getPackageName();
            try {
                bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
            } catch (Exception e) {
                e = e;
                Log.w("SoLoader", "Unexpected issue with package manager (" + str + ")", e);
                return bundle == null ? true : true;
            }
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
        if (bundle == null && !bundle.getBoolean("com.facebook.soloader.enabled", true)) {
            return false;
        }
    }

    /* renamed from: o */
    private static synchronized void m30167o(InterfaceC4324p interfaceC4324p) {
        boolean z;
        String str;
        synchronized (SoLoader.class) {
            if (interfaceC4324p == null) {
                if (f10927b != null) {
                    return;
                }
            }
            if (interfaceC4324p != null) {
                f10927b = interfaceC4324p;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method m30172j = m30172j();
            if (m30172j != null) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            if (z2) {
                str = SysUtil.Api14Utils.m30140a();
            } else {
                str = null;
            }
            String str2 = str;
            f10927b = new C4296a(z2, str2, m30158x(str2), runtime, m30172j);
        }
    }

    /* renamed from: p */
    private static void m30166p(Context context, int i, String[] strArr) {
        if (f10929d != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f10928c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f10929d != null) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f10938m = i;
            ArrayList arrayList = new ArrayList();
            m30180b(arrayList, strArr);
            if (context != null) {
                if ((i & 1) != 0) {
                    m30179c(context, arrayList, m30173i());
                    f10931f = null;
                    if (Log.isLoggable("SoLoader", 3)) {
                        Log.d("SoLoader", "adding exo package source: lib-main");
                    }
                    arrayList.add(0, new C4307i(context, "lib-main"));
                } else {
                    if ((i & 64) != 0) {
                        m30177e(context, arrayList);
                    }
                    m30179c(context, arrayList, m30173i());
                    m30181a(context, arrayList, 1);
                }
            }
            AbstractC4325q[] abstractC4325qArr = (AbstractC4325q[]) arrayList.toArray(new AbstractC4325q[arrayList.size()]);
            int m30157y = m30157y();
            int length = abstractC4325qArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    break;
                }
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "Preparing SO source: " + abstractC4325qArr[i2]);
                }
                boolean z = f10926a;
                if (z) {
                    Api18TraceUtils.m30184a("SoLoader", "_", abstractC4325qArr[i2].getClass().getSimpleName());
                }
                abstractC4325qArr[i2].mo30086b(m30157y);
                if (z) {
                    Api18TraceUtils.m30183b();
                }
                length = i2;
            }
            f10929d = abstractC4325qArr;
            f10930e.getAndIncrement();
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "init finish: " + f10929d.length + " SO sources prepared");
            }
        } finally {
            f10928c.writeLock().unlock();
        }
    }

    /* renamed from: q */
    public static boolean m30165q() {
        boolean z = true;
        if (f10929d != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f10928c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f10929d == null) {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th2) {
            f10928c.readLock().unlock();
            throw th2;
        }
    }

    /* renamed from: r */
    public static boolean m30164r(String str) {
        return f10936k ? m30163s(str, 0) : C7018a.m21531d(str);
    }

    /* renamed from: s */
    public static boolean m30163s(String str, int i) {
        String str2;
        Boolean m30159w = m30159w(str);
        if (m30159w != null) {
            return m30159w.booleanValue();
        }
        if (!f10936k) {
            return C7018a.m21531d(str);
        }
        if (f10939n != 2) {
        }
        String m30108b = C4318l.m30108b(str);
        if (m30108b != null) {
            str2 = m30108b;
        } else {
            str2 = str;
        }
        return m30161u(System.mapLibraryName(str2), str, m30108b, i, null);
    }

    /* renamed from: t */
    public static void m30162t(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        m30160v(str, null, null, i, threadPolicy);
    }

    /* renamed from: u */
    private static boolean m30161u(String str, String str2, String str3, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        boolean z2 = false;
        do {
            try {
                z2 = m30160v(str, str2, str3, i, threadPolicy);
                z = false;
                continue;
            } catch (UnsatisfiedLinkError e) {
                int i2 = f10930e.get();
                f10928c.writeLock().lock();
                try {
                    try {
                        if (f10932g != null && f10932g.m30135d()) {
                            Log.w("SoLoader", "sApplicationSoSource updated during load: " + str + ", attempting load again.");
                            f10930e.getAndIncrement();
                            z = true;
                        } else {
                            z = false;
                        }
                        f10928c.writeLock().unlock();
                        if (f10930e.get() == i2) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th2) {
                    f10928c.writeLock().unlock();
                    throw th2;
                }
            }
        } while (z);
        return z2;
    }

    /* renamed from: v */
    private static boolean m30160v(String str, String str2, String str3, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str2) && f10935j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            HashSet<String> hashSet = f10933h;
            if (hashSet.contains(str)) {
                if (str3 == null) {
                    return false;
                }
                z = true;
            } else {
                z = false;
            }
            Map<String, Object> map = f10934i;
            if (map.containsKey(str)) {
                obj = map.get(str);
            } else {
                Object obj2 = new Object();
                map.put(str, obj2);
                obj = obj2;
            }
            ReentrantReadWriteLock reentrantReadWriteLock = f10928c;
            reentrantReadWriteLock.readLock().lock();
            try {
                synchronized (obj) {
                    if (!z) {
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z = true;
                            }
                            if (!z) {
                                try {
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "About to load: " + str);
                                    }
                                    m30175g(str, i, threadPolicy);
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "Loaded: " + str);
                                    }
                                    synchronized (SoLoader.class) {
                                        hashSet.add(str);
                                    }
                                } catch (UnsatisfiedLinkError e) {
                                    String message = e.getMessage();
                                    if (message != null && message.contains("unexpected e_machine:")) {
                                        throw new C4297b(e, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                    }
                                    throw e;
                                }
                            }
                        }
                    }
                    if ((i & 16) == 0) {
                        if (!TextUtils.isEmpty(str2) && f10935j.contains(str2)) {
                            z2 = true;
                        }
                        if (str3 != null && !z2) {
                            boolean z3 = f10926a;
                            if (z3) {
                                Api18TraceUtils.m30184a("MergedSoMapping.invokeJniOnload[", str2, "]");
                            }
                            try {
                                try {
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "About to merge: " + str2 + " / " + str);
                                    }
                                    C4318l.m30109a(str2);
                                    f10935j.add(str2);
                                    if (z3) {
                                        Api18TraceUtils.m30183b();
                                    }
                                } catch (UnsatisfiedLinkError e2) {
                                    throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e2);
                                }
                            } catch (Throwable th2) {
                                if (f10926a) {
                                    Api18TraceUtils.m30183b();
                                }
                                throw th2;
                            }
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return !z;
                }
            } catch (Throwable th3) {
                f10928c.readLock().unlock();
                throw th3;
            }
        }
    }

    /* renamed from: w */
    private static Boolean m30159w(String str) {
        Boolean valueOf;
        if (f10929d == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f10928c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (f10929d == null) {
                    if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        m30176f();
                    } else {
                        synchronized (SoLoader.class) {
                            boolean z = !f10933h.contains(str);
                            if (z) {
                                System.loadLibrary(str);
                            }
                            valueOf = Boolean.valueOf(z);
                        }
                        reentrantReadWriteLock.readLock().unlock();
                        return valueOf;
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                return null;
            } catch (Throwable th2) {
                f10928c.readLock().unlock();
                throw th2;
            }
        }
        return null;
    }

    /* renamed from: x */
    public static String m30158x(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    /* renamed from: y */
    private static int m30157y() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = f10928c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i2 = f10938m;
            if ((i2 & 2) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 256) != 0) {
                i |= 4;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i;
        } catch (Throwable th2) {
            f10928c.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: z */
    public static File m30156z(String str) {
        m30176f();
        try {
            return m30182A(System.mapLibraryName(str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
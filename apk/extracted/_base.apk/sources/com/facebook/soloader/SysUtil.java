package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.soloader.C4319m;
import dalvik.system.BaseDexClassLoader;
import java.io.DataOutput;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SysUtil {

    @InterfaceC4303e
    @TargetApi(14)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Api14Utils {
        /* renamed from: a */
        public static String m30140a() {
            ClassLoader classLoader = SoLoader.class.getClassLoader();
            if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
                throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
            }
            try {
                return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException("Cannot call getLdLibraryPath", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC4303e
    @TargetApi(21)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        @InterfaceC4303e
        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) {
            int i;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && (i = e.errno) != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @InterfaceC4303e
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(C4319m.EnumC4321b.AARCH64.toString());
                    treeSet.add(C4319m.EnumC4321b.X86_64.toString());
                } else {
                    treeSet.add(C4319m.EnumC4321b.ARM.toString());
                    treeSet.add(C4319m.EnumC4321b.X86.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        @InterfaceC4303e
        public static boolean is64Bit() {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC4303e
    @TargetApi(23)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            if (r1.getMethod() != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
            return r2;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean m30139a(android.content.Context r5) {
            /*
                java.io.File r0 = new java.io.File
                android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
                java.lang.String r5 = r5.sourceDir
                r0.<init>(r5)
                java.util.zip.ZipFile r5 = new java.util.zip.ZipFile
                r5.<init>(r0)
                java.util.Enumeration r0 = r5.entries()     // Catch: java.lang.Throwable -> L4a
            L14:
                boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L4a
                r2 = 0
                if (r1 == 0) goto L46
                java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L4a
                java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L14
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L4a
                java.lang.String r4 = ".so"
                boolean r3 = r3.endsWith(r4)     // Catch: java.lang.Throwable -> L4a
                if (r3 == 0) goto L14
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L4a
                java.lang.String r4 = "/lib"
                boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L4a
                if (r3 == 0) goto L14
                int r0 = r1.getMethod()     // Catch: java.lang.Throwable -> L4a
                if (r0 != 0) goto L42
                r2 = 1
            L42:
                r5.close()
                return r2
            L46:
                r5.close()
                return r2
            L4a:
                r0 = move-exception
                r5.close()     // Catch: java.lang.Throwable -> L4f
                goto L53
            L4f:
                r5 = move-exception
                r0.addSuppressed(r5)
            L53:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.MarshmallowSysdeps.m30139a(android.content.Context):boolean");
        }

        /* renamed from: b */
        public static boolean m30138b(Context context) {
            return context != null && (context.getApplicationInfo().flags & 268435456) == 0;
        }

        /* renamed from: c */
        public static boolean m30137c(Context context, int i) {
            if (i == 2) {
                return m30139a(context);
            }
            return m30138b(context);
        }

        @InterfaceC4303e
        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add(C4319m.EnumC4321b.AARCH64.toString());
                treeSet.add(C4319m.EnumC4321b.X86_64.toString());
            } else {
                treeSet.add(C4319m.EnumC4321b.ARM.toString());
                treeSet.add(C4319m.EnumC4321b.X86.toString());
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        @InterfaceC4303e
        public static boolean is64Bit() {
            return Process.is64Bit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m30154a(DataOutput dataOutput, InputStream inputStream, int i, byte[] bArr) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            dataOutput.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    /* renamed from: b */
    public static void m30153b(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            Log.e("SysUtil", "Enable write permission failed: " + parentFile);
        }
        if (!file.delete() && file.exists()) {
            throw new IOException("Could not delete file " + file);
        }
    }

    /* renamed from: c */
    public static void m30152c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                m30152c(file2);
            }
        }
        m30153b(file);
    }

    /* renamed from: d */
    public static void m30151d(FileDescriptor fileDescriptor, long j) {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor, j);
    }

    /* renamed from: e */
    public static int m30150e(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (str2 != null && str.equals(str2)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static void m30149f(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    m30149f(file2);
                }
                return;
            }
            throw new IOException("cannot list directory " + file);
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static int m30148g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    /* renamed from: h */
    public static String m30147h(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0) {
            return str.substring(0, lastIndexOf);
        }
        return str;
    }

    /* renamed from: i */
    private static C4317k m30146i(File file, boolean z) {
        if (z) {
            return C4317k.m30111h(file);
        }
        return C4317k.m30110i(file);
    }

    /* renamed from: j */
    public static C4317k m30145j(File file, File file2, boolean z) {
        boolean z2;
        try {
            return m30146i(file2, z);
        } catch (FileNotFoundException e) {
            z2 = true;
            try {
                if (file.setWritable(true)) {
                    C4317k m30146i = m30146i(file2, z);
                    if (!file.setWritable(false)) {
                        Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                    }
                    return m30146i;
                }
                throw e;
            } catch (Throwable th2) {
                th = th2;
                if (z2 && !file.setWritable(false)) {
                    Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z2 = false;
            if (z2) {
                Log.w("SysUtil", "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    /* renamed from: k */
    public static String[] m30144k() {
        return MarshmallowSysdeps.getSupportedAbis();
    }

    @SuppressLint({"CatchGeneralException"})
    /* renamed from: l */
    public static boolean m30143l() {
        return MarshmallowSysdeps.is64Bit();
    }

    /* renamed from: m */
    public static boolean m30142m(Context context, int i) {
        return MarshmallowSysdeps.m30137c(context, i);
    }

    /* renamed from: n */
    public static void m30141n(File file) {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("cannot mkdir: " + file);
        }
    }
}

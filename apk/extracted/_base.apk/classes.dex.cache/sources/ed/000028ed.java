package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.facebook.react.uimanager.ViewDefaults;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.soloader.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4326r extends C4302d {

    /* renamed from: d */
    protected final Context f11001d;

    /* renamed from: e */
    protected String f11002e;

    /* renamed from: f */
    protected C4317k f11003f;

    /* renamed from: g */
    private String[] f11004g;

    /* renamed from: h */
    private final Map<String, Object> f11005h;

    /* renamed from: com.facebook.soloader.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC4327a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ File f11006j;

        /* renamed from: k */
        final /* synthetic */ byte[] f11007k;

        /* renamed from: l */
        final /* synthetic */ C4329c f11008l;

        /* renamed from: m */
        final /* synthetic */ File f11009m;

        /* renamed from: n */
        final /* synthetic */ C4317k f11010n;

        /* renamed from: o */
        final /* synthetic */ Boolean f11011o;

        RunnableC4327a(File file, byte[] bArr, C4329c c4329c, File file2, C4317k c4317k, Boolean bool) {
            AbstractC4326r.this = r1;
            this.f11006j = file;
            this.f11007k = bArr;
            this.f11008l = c4329c;
            this.f11009m = file2;
            this.f11010n = c4317k;
            this.f11011o = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.v("fb-UnpackingSoSource", "starting syncer worker");
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f11006j, "rw");
                randomAccessFile.write(this.f11007k);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(AbstractC4326r.this.f10955a, "dso_manifest"), "rw");
                this.f11008l.m30067b(randomAccessFile2);
                randomAccessFile2.close();
                SysUtil.m30149f(AbstractC4326r.this.f10955a);
                AbstractC4326r.m30069y(this.f11009m, (byte) 1);
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + AbstractC4326r.this.f10955a + " (from syncer thread)");
                this.f11010n.close();
            } catch (IOException e) {
                if (this.f11011o.booleanValue()) {
                    return;
                }
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.facebook.soloader.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4328b {

        /* renamed from: j */
        public final String f11013j;

        /* renamed from: k */
        public final String f11014k;

        public C4328b(String str, String str2) {
            this.f11013j = str;
            this.f11014k = str2;
        }
    }

    /* renamed from: com.facebook.soloader.r$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4329c {

        /* renamed from: a */
        public final C4328b[] f11015a;

        public C4329c(C4328b[] c4328bArr) {
            this.f11015a = c4328bArr;
        }

        /* renamed from: a */
        static final C4329c m30068a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C4328b[] c4328bArr = new C4328b[readInt];
                    for (int i = 0; i < readInt; i++) {
                        c4328bArr[i] = new C4328b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C4329c(c4328bArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        /* renamed from: b */
        public final void m30067b(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f11015a.length);
            int i = 0;
            while (true) {
                C4328b[] c4328bArr = this.f11015a;
                if (i < c4328bArr.length) {
                    dataOutput.writeUTF(c4328bArr[i].f11013j);
                    dataOutput.writeUTF(this.f11015a[i].f11014k);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.facebook.soloader.r$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4330d extends Closeable {
        int available();

        String getFileName();

        /* renamed from: m0 */
        void mo30064m0(DataOutput dataOutput, byte[] bArr);

        /* renamed from: r0 */
        C4328b mo30063r0();
    }

    /* renamed from: com.facebook.soloader.r$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC4331e implements Closeable {
        /* renamed from: a */
        public abstract boolean mo30066a();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: h */
        public abstract InterfaceC4330d mo30065h();
    }

    /* renamed from: com.facebook.soloader.r$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4332f implements InterfaceC4330d {

        /* renamed from: j */
        private final C4328b f11016j;

        /* renamed from: k */
        private final InputStream f11017k;

        public C4332f(C4328b c4328b, InputStream inputStream) {
            this.f11016j = c4328b;
            this.f11017k = inputStream;
        }

        @Override // com.facebook.soloader.AbstractC4326r.InterfaceC4330d
        public int available() {
            return this.f11017k.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f11017k.close();
        }

        @Override // com.facebook.soloader.AbstractC4326r.InterfaceC4330d
        public String getFileName() {
            return this.f11016j.f11013j;
        }

        @Override // com.facebook.soloader.AbstractC4326r.InterfaceC4330d
        /* renamed from: m0 */
        public void mo30064m0(DataOutput dataOutput, byte[] bArr) {
            SysUtil.m30154a(dataOutput, this.f11017k, ViewDefaults.NUMBER_OF_LINES, bArr);
        }

        @Override // com.facebook.soloader.AbstractC4326r.InterfaceC4330d
        /* renamed from: r0 */
        public C4328b mo30063r0() {
            return this.f11016j;
        }
    }

    /* renamed from: com.facebook.soloader.r$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC4333g implements Closeable {
        /* renamed from: a */
        public abstract C4329c mo30062a();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* renamed from: h */
        public abstract AbstractC4331e mo30061h();
    }

    public AbstractC4326r(Context context, String str) {
        super(m30075s(context, str), 1);
        this.f11005h = new HashMap();
        this.f11001d = context;
    }

    /* renamed from: j */
    private Runnable m30084j(C4317k c4317k, byte[] bArr, File file, File file2, C4329c c4329c, Boolean bool) {
        return new RunnableC4327a(file2, bArr, c4329c, file, c4317k, bool);
    }

    /* renamed from: k */
    private void m30083k(C4328b[] c4328bArr) {
        String[] list = this.f10955a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_instance_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    for (int i = 0; !z && i < c4328bArr.length; i++) {
                        if (c4328bArr[i].f11013j.equals(m30076r(str))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        File file = new File(this.f10955a, str);
                        Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                        SysUtil.m30152c(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f10955a);
    }

    /* renamed from: m */
    private void m30081m(InterfaceC4330d interfaceC4330d, byte[] bArr) {
        boolean writable;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + interfaceC4330d.mo30063r0().f11013j);
        try {
            if (this.f10955a.setWritable(true)) {
                m30080n(interfaceC4330d, bArr);
                if (!writable) {
                    return;
                }
                return;
            }
            throw new IOException("cannot make directory writable for us: " + this.f10955a);
        } finally {
            if (!this.f10955a.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + this.f10955a.getCanonicalPath() + " write permission");
            }
        }
    }

    /* renamed from: n */
    private void m30080n(InterfaceC4330d interfaceC4330d, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        File file = new File(this.f10955a, interfaceC4330d.getFileName());
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists() && !file.setWritable(true)) {
                    Log.w("fb-UnpackingSoSource", "error adding write permission to: " + file);
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (IOException e) {
                    Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e);
                    SysUtil.m30152c(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int available = interfaceC4330d.available();
                if (available > 1) {
                    SysUtil.m30151d(randomAccessFile2.getFD(), available);
                }
                interfaceC4330d.mo30064m0(randomAccessFile2, bArr);
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (file.setExecutable(true, false)) {
                    if (!file.setWritable(false)) {
                        Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
                    }
                    randomAccessFile2.close();
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e2) {
                SysUtil.m30152c(file);
                throw e2;
            }
        } catch (Throwable th2) {
            if (!file.setWritable(false)) {
                Log.w("fb-UnpackingSoSource", "error removing " + file + " write permission");
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th2;
        }
    }

    /* renamed from: p */
    private Object m30078p(String str) {
        Object obj;
        synchronized (this.f11005h) {
            obj = this.f11005h.get(str);
            if (obj == null) {
                obj = new Object();
                this.f11005h.put(str, obj);
            }
        }
        return obj;
    }

    /* renamed from: s */
    public static File m30075s(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0043 A[Catch: all -> 0x0036, TryCatch #4 {all -> 0x0036, blocks: (B:66:0x0031, B:75:0x0043, B:76:0x004a, B:77:0x0054, B:79:0x005a, B:95:0x00a6, B:71:0x003a, B:82:0x0062, B:84:0x0067, B:86:0x0079, B:89:0x008c, B:90:0x008f, B:94:0x00a3), top: B:111:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005a A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #4 {all -> 0x0036, blocks: (B:66:0x0031, B:75:0x0043, B:76:0x004a, B:77:0x0054, B:79:0x005a, B:95:0x00a6, B:71:0x003a, B:82:0x0062, B:84:0x0067, B:86:0x0079, B:89:0x008c, B:90:0x008f, B:94:0x00a3), top: B:111:0x0031 }] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m30071w(byte r10, com.facebook.soloader.AbstractC4326r.C4329c r11, com.facebook.soloader.AbstractC4326r.AbstractC4331e r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "regenerating DSO store "
            r0.append(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "fb-UnpackingSoSource"
            android.util.Log.v(r1, r0)
            java.io.File r0 = new java.io.File
            java.io.File r2 = r9.f10955a
            java.lang.String r3 = "dso_manifest"
            r0.<init>(r2, r3)
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "rw"
            r2.<init>(r0, r3)
            r0 = 1
            if (r10 != r0) goto L3f
            com.facebook.soloader.r$c r10 = com.facebook.soloader.AbstractC4326r.C4329c.m30068a(r2)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L39
            goto L40
        L36:
            r10 = move-exception
            goto Ld6
        L39:
            r10 = move-exception
            java.lang.String r3 = "error reading existing DSO manifest"
            android.util.Log.i(r1, r3, r10)     // Catch: java.lang.Throwable -> L36
        L3f:
            r10 = 0
        L40:
            r3 = 0
            if (r10 != 0) goto L4a
            com.facebook.soloader.r$c r10 = new com.facebook.soloader.r$c     // Catch: java.lang.Throwable -> L36
            com.facebook.soloader.r$b[] r4 = new com.facebook.soloader.AbstractC4326r.C4328b[r3]     // Catch: java.lang.Throwable -> L36
            r10.<init>(r4)     // Catch: java.lang.Throwable -> L36
        L4a:
            com.facebook.soloader.r$b[] r11 = r11.f11015a     // Catch: java.lang.Throwable -> L36
            r9.m30083k(r11)     // Catch: java.lang.Throwable -> L36
            r11 = 32768(0x8000, float:4.5918E-41)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> L36
        L54:
            boolean r4 = r12.mo30066a()     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto Lb6
            com.facebook.soloader.r$d r4 = r12.mo30065h()     // Catch: java.lang.Throwable -> L36
            r5 = r0
            r6 = r3
        L60:
            if (r5 == 0) goto L8f
            com.facebook.soloader.r$b[] r7 = r10.f11015a     // Catch: java.lang.Throwable -> Laa
            int r7 = r7.length     // Catch: java.lang.Throwable -> Laa
            if (r6 >= r7) goto L8f
            com.facebook.soloader.r$b r7 = r4.mo30063r0()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = r7.f11013j     // Catch: java.lang.Throwable -> Laa
            com.facebook.soloader.r$b[] r8 = r10.f11015a     // Catch: java.lang.Throwable -> Laa
            r8 = r8[r6]     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r8.f11013j     // Catch: java.lang.Throwable -> Laa
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L8c
            com.facebook.soloader.r$b[] r7 = r10.f11015a     // Catch: java.lang.Throwable -> Laa
            r7 = r7[r6]     // Catch: java.lang.Throwable -> Laa
            java.lang.String r7 = r7.f11014k     // Catch: java.lang.Throwable -> Laa
            com.facebook.soloader.r$b r8 = r4.mo30063r0()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r8.f11014k     // Catch: java.lang.Throwable -> Laa
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L8c
            r5 = r3
        L8c:
            int r6 = r6 + 1
            goto L60
        L8f:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Laa
            java.io.File r7 = r9.f10955a     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r4.getFileName()     // Catch: java.lang.Throwable -> Laa
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> Laa
            boolean r6 = r6.exists()     // Catch: java.lang.Throwable -> Laa
            if (r6 != 0) goto La1
            r5 = r0
        La1:
            if (r5 == 0) goto La6
            r9.m30081m(r4, r11)     // Catch: java.lang.Throwable -> Laa
        La6:
            r4.close()     // Catch: java.lang.Throwable -> L36
            goto L54
        Laa:
            r10 = move-exception
            if (r4 == 0) goto Lb5
            r4.close()     // Catch: java.lang.Throwable -> Lb1
            goto Lb5
        Lb1:
            r11 = move-exception
            r10.addSuppressed(r11)     // Catch: java.lang.Throwable -> L36
        Lb5:
            throw r10     // Catch: java.lang.Throwable -> L36
        Lb6:
            r2.close()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Finished regenerating DSO store "
            r10.append(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.util.Log.v(r1, r10)
            return
        Ld6:
            r2.close()     // Catch: java.lang.Throwable -> Lda
            goto Lde
        Lda:
            r11 = move-exception
            r10.addSuppressed(r11)
        Lde:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC4326r.m30071w(byte, com.facebook.soloader.r$c, com.facebook.soloader.r$e):void");
    }

    /* renamed from: y */
    public static void m30069y(File file, byte b) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0L);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
        }
    }

    @Override // com.facebook.soloader.C4302d, com.facebook.soloader.AbstractC4325q
    /* renamed from: a */
    public int mo30087a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int m30122h;
        synchronized (m30078p(str)) {
            m30122h = m30122h(str, i, this.f10955a, threadPolicy);
        }
        return m30122h;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0133  */
    @Override // com.facebook.soloader.AbstractC4325q
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo30086b(int r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC4326r.mo30086b(int):void");
    }

    /* renamed from: l */
    protected boolean m30082l(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }

    /* renamed from: o */
    protected byte[] mo30079o() {
        Parcel obtain = Parcel.obtain();
        AbstractC4333g mo30074t = mo30074t((byte) 1);
        try {
            C4328b[] c4328bArr = mo30074t.mo30062a().f11015a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(c4328bArr.length);
            for (int i = 0; i < c4328bArr.length; i++) {
                obtain.writeString(c4328bArr[i].f11013j);
                obtain.writeString(c4328bArr[i].f11014k);
            }
            mo30074t.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th2) {
            if (mo30074t != null) {
                try {
                    mo30074t.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* renamed from: q */
    protected C4317k m30077q(File file, boolean z) {
        return SysUtil.m30145j(this.f10955a, file, z);
    }

    /* renamed from: r */
    protected String m30076r(String str) {
        return str;
    }

    /* renamed from: t */
    protected abstract AbstractC4333g mo30074t(byte b);

    /* renamed from: u */
    public synchronized void m30073u(String str) {
        synchronized (m30078p(str)) {
            this.f11002e = str;
            mo30086b(2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a0  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected boolean m30072v(com.facebook.soloader.C4317k r12, int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC4326r.m30072v(com.facebook.soloader.k, int, byte[]):boolean");
    }

    /* renamed from: x */
    public void m30070x(String[] strArr) {
        this.f11004g = strArr;
    }
}
package com.google.android.exoplayer2.upstream.cache;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import gb.AbstractC6703u0;
import gb.AbstractC6711w;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p174j8.C8869e;
import p174j8.C8871g;
import p174j8.C8872h;
import p174j8.InterfaceC8870f;
import p195k8.C9149a;
import p195k8.C9152b;
import p195k8.C9156c0;
import p195k8.C9191p0;
import p211l6.C10053a;
import p211l6.C10056d;
import p211l6.InterfaceC10054b;

/* renamed from: com.google.android.exoplayer2.upstream.cache.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4533h {

    /* renamed from: a */
    private final HashMap<String, C4531g> f12347a;

    /* renamed from: b */
    private final SparseArray<String> f12348b;

    /* renamed from: c */
    private final SparseBooleanArray f12349c;

    /* renamed from: d */
    private final SparseBooleanArray f12350d;

    /* renamed from: e */
    private InterfaceC4536c f12351e;

    /* renamed from: f */
    private InterfaceC4536c f12352f;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.upstream.cache.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4534a implements InterfaceC4536c {

        /* renamed from: e */
        private static final String[] f12353e = {"id", "key", "metadata"};

        /* renamed from: a */
        private final InterfaceC10054b f12354a;

        /* renamed from: b */
        private final SparseArray<C4531g> f12355b = new SparseArray<>();

        /* renamed from: c */
        private String f12356c;

        /* renamed from: d */
        private String f12357d;

        public C4534a(InterfaceC10054b interfaceC10054b) {
            this.f12354a = interfaceC10054b;
        }

        /* renamed from: i */
        private void m28662i(SQLiteDatabase sQLiteDatabase, C4531g c4531g) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C4533h.m28663t(c4531g.m28694c(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(c4531g.f12340a));
            contentValues.put("key", c4531g.f12341b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) C9149a.m16448e(this.f12357d), null, contentValues);
        }

        /* renamed from: j */
        private static void m28661j(InterfaceC10054b interfaceC10054b, String str) {
            try {
                String m28657n = m28657n(str);
                SQLiteDatabase writableDatabase = interfaceC10054b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                C10056d.m12476c(writableDatabase, 1, str);
                m28659l(writableDatabase, m28657n);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C10053a(e);
            }
        }

        /* renamed from: k */
        private void m28660k(SQLiteDatabase sQLiteDatabase, int i) {
            sQLiteDatabase.delete((String) C9149a.m16448e(this.f12357d), "id = ?", new String[]{Integer.toString(i)});
        }

        /* renamed from: l */
        private static void m28659l(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        /* renamed from: m */
        private Cursor m28658m() {
            return this.f12354a.getReadableDatabase().query((String) C9149a.m16448e(this.f12357d), f12353e, null, null, null, null, null);
        }

        /* renamed from: n */
        private static String m28657n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        /* renamed from: o */
        private void m28656o(SQLiteDatabase sQLiteDatabase) {
            C10056d.m12475d(sQLiteDatabase, 1, (String) C9149a.m16448e(this.f12356c), 1);
            m28659l(sQLiteDatabase, (String) C9149a.m16448e(this.f12357d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f12357d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: a */
        public void mo28650a(C4531g c4531g, boolean z) {
            if (z) {
                this.f12355b.delete(c4531g.f12340a);
            } else {
                this.f12355b.put(c4531g.f12340a, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: b */
        public boolean mo28649b() {
            if (C10056d.m12477b(this.f12354a.getReadableDatabase(), 1, (String) C9149a.m16448e(this.f12356c)) != -1) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: c */
        public void mo28648c(HashMap<String, C4531g> hashMap) {
            if (this.f12355b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f12354a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.f12355b.size(); i++) {
                    C4531g valueAt = this.f12355b.valueAt(i);
                    if (valueAt == null) {
                        m28660k(writableDatabase, this.f12355b.keyAt(i));
                    } else {
                        m28662i(writableDatabase, valueAt);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f12355b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C10053a(e);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: d */
        public void mo28647d(long j) {
            String hexString = Long.toHexString(j);
            this.f12356c = hexString;
            this.f12357d = m28657n(hexString);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: e */
        public void mo28646e(HashMap<String, C4531g> hashMap) {
            try {
                SQLiteDatabase writableDatabase = this.f12354a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                m28656o(writableDatabase);
                for (C4531g c4531g : hashMap.values()) {
                    m28662i(writableDatabase, c4531g);
                }
                writableDatabase.setTransactionSuccessful();
                this.f12355b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C10053a(e);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: f */
        public void mo28645f(C4531g c4531g) {
            this.f12355b.put(c4531g.f12340a, c4531g);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: g */
        public void mo28644g(HashMap<String, C4531g> hashMap, SparseArray<String> sparseArray) {
            boolean z;
            if (this.f12355b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16447f(z);
            try {
                if (C10056d.m12477b(this.f12354a.getReadableDatabase(), 1, (String) C9149a.m16448e(this.f12356c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f12354a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    m28656o(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                }
                Cursor m28658m = m28658m();
                while (m28658m.moveToNext()) {
                    C4531g c4531g = new C4531g(m28658m.getInt(0), m28658m.getString(1), C4533h.m28666q(new DataInputStream(new ByteArrayInputStream(m28658m.getBlob(2)))));
                    hashMap.put(c4531g.f12341b, c4531g);
                    sparseArray.put(c4531g.f12340a, c4531g.f12341b);
                }
                m28658m.close();
            } catch (SQLiteException e) {
                hashMap.clear();
                sparseArray.clear();
                throw new C10053a(e);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: h */
        public void mo28643h() {
            m28661j(this.f12354a, (String) C9149a.m16448e(this.f12356c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.upstream.cache.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4535b implements InterfaceC4536c {

        /* renamed from: a */
        private final boolean f12358a;

        /* renamed from: b */
        private final Cipher f12359b;

        /* renamed from: c */
        private final SecretKeySpec f12360c;

        /* renamed from: d */
        private final SecureRandom f12361d;

        /* renamed from: e */
        private final C9152b f12362e;

        /* renamed from: f */
        private boolean f12363f;

        /* renamed from: g */
        private C9156c0 f12364g;

        public C4535b(File file, byte[] bArr, boolean z) {
            boolean z2;
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            if (bArr == null && z) {
                z2 = false;
            } else {
                z2 = true;
            }
            C9149a.m16447f(z2);
            if (bArr != null) {
                C9149a.m16452a(bArr.length == 16);
                try {
                    cipher = C4533h.m28682a();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                C9149a.m16452a(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.f12358a = z;
            this.f12359b = cipher;
            this.f12360c = secretKeySpec;
            this.f12361d = z ? new SecureRandom() : null;
            this.f12362e = new C9152b(file);
        }

        /* renamed from: i */
        private int m28655i(C4531g c4531g, int i) {
            int i2;
            int hashCode;
            int hashCode2 = (c4531g.f12340a * 31) + c4531g.f12341b.hashCode();
            if (i < 2) {
                long m17142a = C8869e.m17142a(c4531g.m28694c());
                i2 = hashCode2 * 31;
                hashCode = (int) (m17142a ^ (m17142a >>> 32));
            } else {
                i2 = hashCode2 * 31;
                hashCode = c4531g.m28694c().hashCode();
            }
            return i2 + hashCode;
        }

        /* renamed from: j */
        private C4531g m28654j(int i, DataInputStream dataInputStream) {
            C8872h m28666q;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i < 2) {
                long readLong = dataInputStream.readLong();
                C8871g c8871g = new C8871g();
                C8871g.m17134g(c8871g, readLong);
                m28666q = C8872h.f23253c.m17128e(c8871g);
            } else {
                m28666q = C4533h.m28666q(dataInputStream);
            }
            return new C4531g(readInt, readUTF, m28666q);
        }

        /* renamed from: k */
        private boolean m28653k(HashMap<String, C4531g> hashMap, SparseArray<String> sparseArray) {
            boolean z;
            if (!this.f12362e.m16438c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f12362e.m16437d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int readInt = dataInputStream2.readInt();
                    if (readInt >= 0 && readInt <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f12359b == null) {
                                C9191p0.m16233o(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f12359b.init(2, (Key) C9191p0.m16243j(this.f12360c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f12359b));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f12358a) {
                            this.f12363f = true;
                        }
                        int readInt2 = dataInputStream2.readInt();
                        int i = 0;
                        for (int i2 = 0; i2 < readInt2; i2++) {
                            C4531g m28654j = m28654j(readInt, dataInputStream2);
                            hashMap.put(m28654j.f12341b, m28654j);
                            sparseArray.put(m28654j.f12340a, m28654j.f12341b);
                            i += m28655i(m28654j, readInt);
                        }
                        int readInt3 = dataInputStream2.readInt();
                        if (dataInputStream2.read() == -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (readInt3 == i && z) {
                            C9191p0.m16233o(dataInputStream2);
                            return true;
                        }
                        C9191p0.m16233o(dataInputStream2);
                        return false;
                    }
                    C9191p0.m16233o(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C9191p0.m16233o(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        C9191p0.m16233o(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* renamed from: l */
        private void m28652l(C4531g c4531g, DataOutputStream dataOutputStream) {
            dataOutputStream.writeInt(c4531g.f12340a);
            dataOutputStream.writeUTF(c4531g.f12341b);
            C4533h.m28663t(c4531g.m28694c(), dataOutputStream);
        }

        /* renamed from: m */
        private void m28651m(HashMap<String, C4531g> hashMap) {
            C9156c0 c9156c0;
            DataOutputStream dataOutputStream;
            int i;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream m16435f = this.f12362e.m16435f();
                C9156c0 c9156c02 = this.f12364g;
                if (c9156c02 == null) {
                    this.f12364g = new C9156c0(m16435f);
                } else {
                    c9156c02.m16432a(m16435f);
                }
                c9156c0 = this.f12364g;
                dataOutputStream = new DataOutputStream(c9156c0);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                dataOutputStream.writeInt(2);
                int i2 = 0;
                if (this.f12358a) {
                    i = 1;
                } else {
                    i = 0;
                }
                dataOutputStream.writeInt(i);
                if (this.f12358a) {
                    byte[] bArr = new byte[16];
                    ((SecureRandom) C9191p0.m16243j(this.f12361d)).nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        ((Cipher) C9191p0.m16243j(this.f12359b)).init(1, (Key) C9191p0.m16243j(this.f12360c), new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(c9156c0, this.f12359b));
                    } catch (InvalidAlgorithmParameterException e) {
                        e = e;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(hashMap.size());
                for (C4531g c4531g : hashMap.values()) {
                    m28652l(c4531g, dataOutputStream);
                    i2 += m28655i(c4531g, 2);
                }
                dataOutputStream.writeInt(i2);
                this.f12362e.m16439b(dataOutputStream);
                C9191p0.m16233o(null);
            } catch (Throwable th3) {
                th = th3;
                dataOutputStream2 = dataOutputStream;
                C9191p0.m16233o(dataOutputStream2);
                throw th;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: a */
        public void mo28650a(C4531g c4531g, boolean z) {
            this.f12363f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: b */
        public boolean mo28649b() {
            return this.f12362e.m16438c();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: c */
        public void mo28648c(HashMap<String, C4531g> hashMap) {
            if (!this.f12363f) {
                return;
            }
            mo28646e(hashMap);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: d */
        public void mo28647d(long j) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: e */
        public void mo28646e(HashMap<String, C4531g> hashMap) {
            m28651m(hashMap);
            this.f12363f = false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: f */
        public void mo28645f(C4531g c4531g) {
            this.f12363f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: g */
        public void mo28644g(HashMap<String, C4531g> hashMap, SparseArray<String> sparseArray) {
            C9149a.m16447f(!this.f12363f);
            if (!m28653k(hashMap, sparseArray)) {
                hashMap.clear();
                sparseArray.clear();
                this.f12362e.m16440a();
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.C4533h.InterfaceC4536c
        /* renamed from: h */
        public void mo28643h() {
            this.f12362e.m16440a();
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.cache.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4536c {
        /* renamed from: a */
        void mo28650a(C4531g c4531g, boolean z);

        /* renamed from: b */
        boolean mo28649b();

        /* renamed from: c */
        void mo28648c(HashMap<String, C4531g> hashMap);

        /* renamed from: d */
        void mo28647d(long j);

        /* renamed from: e */
        void mo28646e(HashMap<String, C4531g> hashMap);

        /* renamed from: f */
        void mo28645f(C4531g c4531g);

        /* renamed from: g */
        void mo28644g(HashMap<String, C4531g> hashMap, SparseArray<String> sparseArray);

        /* renamed from: h */
        void mo28643h();
    }

    public C4533h(InterfaceC10054b interfaceC10054b, File file, byte[] bArr, boolean z, boolean z2) {
        boolean z3;
        C4534a c4534a;
        if (interfaceC10054b == null && file == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        C9149a.m16447f(z3);
        this.f12347a = new HashMap<>();
        this.f12348b = new SparseArray<>();
        this.f12349c = new SparseBooleanArray();
        this.f12350d = new SparseBooleanArray();
        if (interfaceC10054b != null) {
            c4534a = new C4534a(interfaceC10054b);
        } else {
            c4534a = null;
        }
        C4535b c4535b = file != null ? new C4535b(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (c4534a != null && (c4535b == null || !z2)) {
            this.f12351e = c4534a;
            this.f12352f = c4535b;
            return;
        }
        this.f12351e = (InterfaceC4536c) C9191p0.m16243j(c4535b);
        this.f12352f = c4534a;
    }

    /* renamed from: a */
    static /* synthetic */ Cipher m28682a() {
        return m28674i();
    }

    /* renamed from: d */
    private C4531g m28679d(String str) {
        int m28671l = m28671l(this.f12348b);
        C4531g c4531g = new C4531g(m28671l, str);
        this.f12347a.put(str, c4531g);
        this.f12348b.put(m28671l, str);
        this.f12350d.put(m28671l, true);
        this.f12351e.mo28645f(c4531g);
        return c4531g;
    }

    @SuppressLint({"GetInstance"})
    /* renamed from: i */
    private static Cipher m28674i() {
        if (C9191p0.f24171a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    /* renamed from: l */
    static int m28671l(SparseArray<String> sparseArray) {
        int keyAt;
        int size = sparseArray.size();
        int i = 0;
        if (size == 0) {
            keyAt = 0;
        } else {
            keyAt = sparseArray.keyAt(size - 1) + 1;
        }
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            return i;
        }
        return keyAt;
    }

    /* renamed from: o */
    public static boolean m28668o(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* renamed from: q */
    public static C8872h m28666q(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = C9191p0.f24176f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException("Invalid value size: " + readInt2);
            }
        }
        return new C8872h(hashMap);
    }

    /* renamed from: t */
    public static void m28663t(C8872h c8872h, DataOutputStream dataOutputStream) {
        Set<Map.Entry<String, byte[]>> m17127f = c8872h.m17127f();
        dataOutputStream.writeInt(m17127f.size());
        for (Map.Entry<String, byte[]> entry : m17127f) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    /* renamed from: e */
    public void m28678e(String str, C8871g c8871g) {
        C4531g m28670m = m28670m(str);
        if (m28670m.m28695b(c8871g)) {
            this.f12351e.mo28645f(m28670m);
        }
    }

    /* renamed from: f */
    public int m28677f(String str) {
        return m28670m(str).f12340a;
    }

    /* renamed from: g */
    public C4531g m28676g(String str) {
        return this.f12347a.get(str);
    }

    /* renamed from: h */
    public Collection<C4531g> m28675h() {
        return Collections.unmodifiableCollection(this.f12347a.values());
    }

    /* renamed from: j */
    public InterfaceC8870f m28673j(String str) {
        C4531g m28676g = m28676g(str);
        if (m28676g != null) {
            return m28676g.m28694c();
        }
        return C8872h.f23253c;
    }

    /* renamed from: k */
    public String m28672k(int i) {
        return this.f12348b.get(i);
    }

    /* renamed from: m */
    public C4531g m28670m(String str) {
        C4531g c4531g = this.f12347a.get(str);
        if (c4531g == null) {
            return m28679d(str);
        }
        return c4531g;
    }

    /* renamed from: n */
    public void m28669n(long j) {
        InterfaceC4536c interfaceC4536c;
        this.f12351e.mo28647d(j);
        InterfaceC4536c interfaceC4536c2 = this.f12352f;
        if (interfaceC4536c2 != null) {
            interfaceC4536c2.mo28647d(j);
        }
        if (!this.f12351e.mo28649b() && (interfaceC4536c = this.f12352f) != null && interfaceC4536c.mo28649b()) {
            this.f12352f.mo28644g(this.f12347a, this.f12348b);
            this.f12351e.mo28646e(this.f12347a);
        } else {
            this.f12351e.mo28644g(this.f12347a, this.f12348b);
        }
        InterfaceC4536c interfaceC4536c3 = this.f12352f;
        if (interfaceC4536c3 != null) {
            interfaceC4536c3.mo28643h();
            this.f12352f = null;
        }
    }

    /* renamed from: p */
    public void m28667p(String str) {
        C4531g c4531g = this.f12347a.get(str);
        if (c4531g != null && c4531g.m28691f() && c4531g.m28689h()) {
            this.f12347a.remove(str);
            int i = c4531g.f12340a;
            boolean z = this.f12350d.get(i);
            this.f12351e.mo28650a(c4531g, z);
            if (z) {
                this.f12348b.remove(i);
                this.f12350d.delete(i);
                return;
            }
            this.f12348b.put(i, null);
            this.f12349c.put(i, true);
        }
    }

    /* renamed from: r */
    public void m28665r() {
        AbstractC6703u0 it = AbstractC6711w.m22069s(this.f12347a.keySet()).iterator();
        while (it.hasNext()) {
            m28667p((String) it.next());
        }
    }

    /* renamed from: s */
    public void m28664s() {
        this.f12351e.mo28648c(this.f12347a);
        int size = this.f12349c.size();
        for (int i = 0; i < size; i++) {
            this.f12348b.remove(this.f12349c.keyAt(i));
        }
        this.f12349c.clear();
        this.f12350d.clear();
    }
}
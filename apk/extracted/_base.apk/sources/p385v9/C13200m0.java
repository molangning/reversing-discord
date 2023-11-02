package p385v9;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import p042c9.AbstractC2461a;

/* renamed from: v9.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13200m0 extends AbstractC2461a {
    public static final Parcelable.Creator<C13200m0> CREATOR = new C13198l0();

    /* renamed from: j */
    private byte[] f34225j;

    /* renamed from: k */
    private ParcelFileDescriptor f34226k;

    private C13200m0() {
        this.f34225j = new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static byte[] m3039A(ParcelFileDescriptor parcelFileDescriptor) {
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                return bArr;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            }
        } finally {
            m3038G(dataInputStream);
        }
    }

    /* renamed from: G */
    private static void m3038G(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13200m0) {
            return Arrays.equals(this.f34225j, ((C13200m0) obj).f34225j);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34225j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b9: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:40:0x00b9 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ParcelByteArray"
            byte[] r1 = r7.f34225j
            r2 = 0
            if (r1 == 0) goto Lc0
            android.os.ParcelFileDescriptor r3 = r7.f34226k
            if (r3 != 0) goto Lc0
            java.io.File r3 = p385v9.C13210r0.m3022a()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            if (r3 == 0) goto L6e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L95
            java.lang.String r5 = "teleporter"
            r4.<init>(r5)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L95
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L95
            r4.append(r5)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L95
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L95
            java.lang.String r5 = ".tmp"
            java.io.File r3 = java.io.File.createTempFile(r4, r5, r3)     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L76 java.lang.IllegalStateException -> L95
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L5c java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            r4.<init>(r3)     // Catch: java.io.FileNotFoundException -> L5c java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r5 = android.os.ParcelFileDescriptor.open(r3, r5)     // Catch: java.io.FileNotFoundException -> L5c java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            r3.delete()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            android.util.Pair r3 = android.util.Pair.create(r4, r5)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            java.lang.Object r5 = r3.first     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            java.io.OutputStream r5 = (java.io.OutputStream) r5     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            int r4 = r1.length     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> Lb8
            r5.writeInt(r4)     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> Lb8
            r5.write(r1)     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> Lb8
            java.lang.Object r1 = r3.second     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> Lb8
            android.os.ParcelFileDescriptor r1 = (android.os.ParcelFileDescriptor) r1     // Catch: java.io.IOException -> L58 java.lang.IllegalStateException -> L5a java.lang.Throwable -> Lb8
            m3038G(r5)
            goto Lb5
        L58:
            r1 = move-exception
            goto L7a
        L5a:
            r1 = move-exception
            goto L97
        L5c:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            java.lang.String r4 = "Temporary file is somehow already deleted"
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            throw r3     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
        L65:
            r1 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            java.lang.String r4 = "Could not create temporary file"
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            throw r3     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            java.lang.String r3 = "Must set temp dir before writing this object to a parcel"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
            throw r1     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L78 java.lang.IllegalStateException -> L95
        L76:
            r8 = move-exception
            goto Lba
        L78:
            r1 = move-exception
            r5 = r2
        L7a:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r3.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = "Could not write into unlinked file. "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb8
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lb8
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lb8
            if (r5 == 0) goto Lb4
            goto Lb1
        L95:
            r1 = move-exception
            r5 = r2
        L97:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r3.<init>()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r4 = "Could not create unlinked file. "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lb8
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lb8
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lb8
            if (r5 == 0) goto Lb4
        Lb1:
            m3038G(r5)
        Lb4:
            r1 = r2
        Lb5:
            r7.f34226k = r1
            goto Lc0
        Lb8:
            r8 = move-exception
            r2 = r5
        Lba:
            if (r2 == 0) goto Lbf
            m3038G(r2)
        Lbf:
            throw r8
        Lc0:
            int r0 = p042c9.C2464c.m33183a(r8)
            android.os.ParcelFileDescriptor r1 = r7.f34226k
            r3 = 1
            r9 = r9 | r3
            r4 = 0
            p042c9.C2464c.m33170n(r8, r3, r1, r9, r4)
            p042c9.C2464c.m33182b(r8, r0)
            r7.f34226k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p385v9.C13200m0.writeToParcel(android.os.Parcel, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13200m0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f34225j = new byte[0];
        this.f34226k = parcelFileDescriptor;
    }
}

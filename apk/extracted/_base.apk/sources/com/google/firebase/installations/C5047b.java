package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.google.firebase.installations.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5047b {

    /* renamed from: a */
    private final FileChannel f14233a;

    /* renamed from: b */
    private final FileLock f14234b;

    private C5047b(FileChannel fileChannel, FileLock fileLock) {
        this.f14233a = fileChannel;
        this.f14234b = fileLock;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.installations.C5047b m26437a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.io.File r4 = r4.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L2e java.io.IOException -> L30
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            com.google.firebase.installations.b r1 = new com.google.firebase.installations.b     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            return r1
        L1f:
            r1 = move-exception
            goto L33
        L21:
            r1 = move-exception
            goto L33
        L23:
            r1 = move-exception
            goto L33
        L25:
            r1 = move-exception
            goto L2a
        L27:
            r1 = move-exception
            goto L2a
        L29:
            r1 = move-exception
        L2a:
            r5 = r0
            goto L33
        L2c:
            r1 = move-exception
            goto L31
        L2e:
            r1 = move-exception
            goto L31
        L30:
            r1 = move-exception
        L31:
            r4 = r0
            r5 = r4
        L33:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L3f
            r5.release()     // Catch: java.io.IOException -> L3f
        L3f:
            if (r4 == 0) goto L44
            r4.close()     // Catch: java.io.IOException -> L44
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C5047b.m26437a(android.content.Context, java.lang.String):com.google.firebase.installations.b");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m26436b() {
        try {
            this.f14234b.release();
            this.f14233a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}

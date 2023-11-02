package com.discord.minibsdiff;

import gg.C6752e;
import gg.C6755g;
import gg.C6759j;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p355ti.C12785a;
import p467zf.C14180c;
import si.C12552o;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ8\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/minibsdiff/BSDiff;", "", "()V", "BSDIFF_CONFIG_MAGIC", "", "BUFFER_SIZE_BYTES", "", "bspatchStreaming", "", "oldPath", "Ljava/io/File;", "patchPath", "newPath", "bspatchStreamingInner", "oldRandomAccessFile", "Ljava/io/RandomAccessFile;", "oldInputStream", "Ljava/io/InputStream;", "ctrlInputStream", "diffInputStream", "extraInputStream", "newOutputStream", "Ljava/io/OutputStream;", "chunkRange", "Lkotlin/sequences/Sequence;", "", "total", "BsPatchError", "minibsdiff_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class BSDiff {
    private static final byte[] BSDIFF_CONFIG_MAGIC;
    private static final long BUFFER_SIZE_BYTES = 1000000;
    public static final BSDiff INSTANCE = new BSDiff();

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/minibsdiff/BSDiff$BsPatchError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "minibsdiff_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class BsPatchError extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BsPatchError(String message) {
            super(message);
            C9612q.m13917h(message, "message");
        }
    }

    static {
        byte[] bytes = "MBSDIF43".getBytes(C12785a.f33142b);
        C9612q.m13918g(bytes, "this as java.lang.String).getBytes(charset)");
        BSDIFF_CONFIG_MAGIC = bytes;
    }

    private BSDiff() {
    }

    private final void bspatchStreamingInner(RandomAccessFile randomAccessFile, InputStream inputStream, InputStream inputStream2, InputStream inputStream3, InputStream inputStream4, OutputStream outputStream) {
        byte[] bArr = new byte[1000000];
        byte[] bArr2 = new byte[1000000];
        if (Arrays.equals(InputStreamUtilsKt.readNBytesCompat(inputStream2, 8), BSDIFF_CONFIG_MAGIC)) {
            long readOffset = InputStreamUtilsKt.readOffset(inputStream2);
            long readOffset2 = InputStreamUtilsKt.readOffset(inputStream2);
            long readOffset3 = InputStreamUtilsKt.readOffset(inputStream2);
            long j = 32 + readOffset;
            InputStreamUtilsKt.skipNBytes(inputStream3, j);
            InputStreamUtilsKt.skipNBytes(inputStream4, j + readOffset2);
            long j2 = 0;
            while (j2 < readOffset3) {
                long readOffset4 = InputStreamUtilsKt.readOffset(inputStream2);
                long readOffset5 = InputStreamUtilsKt.readOffset(inputStream2);
                long readOffset6 = InputStreamUtilsKt.readOffset(inputStream2);
                if (j2 + readOffset4 + readOffset5 <= readOffset3) {
                    Iterator<Integer> it = chunkRange(readOffset4).iterator();
                    while (true) {
                        int i = 0;
                        if (!it.hasNext()) {
                            break;
                        }
                        Iterator<Integer> it2 = it;
                        int intValue = it.next().intValue();
                        long j3 = readOffset3;
                        InputStreamUtilsKt.readNBytesCompat(inputStream, bArr, 0, intValue);
                        InputStreamUtilsKt.readNBytesCompat(inputStream3, bArr2, 0, intValue);
                        int i2 = 0;
                        while (i2 < intValue) {
                            bArr[i2] = (byte) (bArr[i2] + bArr2[i2]);
                            i2++;
                            i = 0;
                        }
                        outputStream.write(bArr, i, intValue);
                        it = it2;
                        readOffset3 = j3;
                    }
                    long j4 = readOffset3;
                    for (Integer num : chunkRange(readOffset5)) {
                        int intValue2 = num.intValue();
                        InputStreamUtilsKt.readNBytesCompat(inputStream4, bArr, 0, intValue2);
                        outputStream.write(bArr, 0, intValue2);
                    }
                    randomAccessFile.seek(randomAccessFile.getFilePointer() + readOffset6);
                    j2 += readOffset4 + readOffset5;
                    readOffset3 = j4;
                } else {
                    throw new BsPatchError("Corrupted patch, attempting to make new file that's too big");
                }
            }
            outputStream.close();
            return;
        }
        throw new BsPatchError("Bad magic config header for patch file!");
    }

    private final Sequence<Integer> chunkRange(long j) {
        C6755g m21917p;
        C6752e m21919n;
        Sequence m14066K;
        Sequence<Integer> m4851y;
        m21917p = C6759j.m21917p(0, j);
        m21919n = C6759j.m21919n(m21917p, BUFFER_SIZE_BYTES);
        m14066K = C9553r.m14066K(m21919n);
        m4851y = C12552o.m4851y(m14066K, new BSDiff$chunkRange$1(j));
        return m4851y;
    }

    public final void bspatchStreaming(File oldPath, File patchPath, File newPath) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        BufferedInputStream bufferedInputStream3;
        BufferedOutputStream bufferedOutputStream;
        C9612q.m13917h(oldPath, "oldPath");
        C9612q.m13917h(patchPath, "patchPath");
        C9612q.m13917h(newPath, "newPath");
        RandomAccessFile randomAccessFile = new RandomAccessFile(oldPath, "r");
        InputStream inputStream = RandomFileAccessInputStreamKt.inputStream(randomAccessFile);
        FileInputStream fileInputStream = new FileInputStream(patchPath);
        if (fileInputStream instanceof BufferedInputStream) {
            bufferedInputStream = (BufferedInputStream) fileInputStream;
        } else {
            bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
        }
        FileInputStream fileInputStream2 = new FileInputStream(patchPath);
        if (fileInputStream2 instanceof BufferedInputStream) {
            bufferedInputStream2 = (BufferedInputStream) fileInputStream2;
        } else {
            bufferedInputStream2 = new BufferedInputStream(fileInputStream2, 8192);
        }
        FileInputStream fileInputStream3 = new FileInputStream(patchPath);
        if (fileInputStream3 instanceof BufferedInputStream) {
            bufferedInputStream3 = (BufferedInputStream) fileInputStream3;
        } else {
            bufferedInputStream3 = new BufferedInputStream(fileInputStream3, 8192);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(newPath);
        if (fileOutputStream instanceof BufferedOutputStream) {
            bufferedOutputStream = (BufferedOutputStream) fileOutputStream;
        } else {
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
        }
        try {
            try {
                INSTANCE.bspatchStreamingInner(randomAccessFile, inputStream, bufferedInputStream, bufferedInputStream2, bufferedInputStream3, bufferedOutputStream);
                Unit unit = Unit.f25302a;
                C14180c.m514a(bufferedOutputStream, null);
                C14180c.m514a(bufferedInputStream3, null);
                C14180c.m514a(bufferedInputStream2, null);
                C14180c.m514a(bufferedInputStream, null);
                C14180c.m514a(inputStream, null);
            } finally {
            }
        } finally {
        }
    }
}

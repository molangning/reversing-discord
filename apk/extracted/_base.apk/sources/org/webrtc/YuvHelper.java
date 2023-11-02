package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        nativeABGRToI420(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i6);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = (i5 + 1) / 2;
        int i11 = (i6 * i5) + 0;
        int i12 = (i6 * i7) + 0;
        int i13 = (i8 * i10) + i12;
        int i14 = (i8 * i9) + i12;
        int i15 = ((i10 - 1) * i8) + i14 + ((i4 + 1) / 2);
        if (byteBuffer4.capacity() >= i15) {
            ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer4.limit(i11);
            ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            ByteBuffer byteBuffer7 = (ByteBuffer) byteBuffer4.limit(i13);
            ByteBuffer byteBuffer8 = (ByteBuffer) byteBuffer4.position(i12);
            ByteBuffer slice2 = byteBuffer4.slice();
            ByteBuffer byteBuffer9 = (ByteBuffer) byteBuffer4.limit(i15);
            ByteBuffer byteBuffer10 = (ByteBuffer) byteBuffer4.position(i14);
            I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i6, slice2, i8, byteBuffer4.slice(), i8, i4, i5);
            return;
        }
        int capacity = byteBuffer4.capacity();
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i15 + " was " + capacity);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6) {
        int i7 = i6 % 180;
        int i8 = i7 == 0 ? i4 : i5;
        int i9 = i7 == 0 ? i5 : i4;
        int i10 = (i8 + 1) / 2;
        int i11 = i9 * i8;
        int i12 = ((i9 + 1) / 2) * i10;
        int i13 = (i12 * 2) + i11;
        if (byteBuffer4.capacity() >= i13) {
            int i14 = i12 + i11;
            ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer4.position(i11);
            ByteBuffer slice2 = byteBuffer4.slice();
            ByteBuffer byteBuffer7 = (ByteBuffer) byteBuffer4.position(i14);
            nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i8, slice2, i10, byteBuffer4.slice(), i10, i4, i5, i6);
            return;
        }
        int capacity = byteBuffer4.capacity();
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i13 + " was " + capacity);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6, int i7) {
        int i8 = (i4 + 1) / 2;
        int i9 = (i6 * i5) + 0;
        int i10 = (i6 * i7) + 0;
        int i11 = (((i5 + 1) / 2) * i8 * 2) + i10;
        if (byteBuffer4.capacity() >= i11) {
            ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer4.limit(i9);
            ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer4.position(0);
            ByteBuffer slice = byteBuffer4.slice();
            ByteBuffer byteBuffer7 = (ByteBuffer) byteBuffer4.limit(i11);
            ByteBuffer byteBuffer8 = (ByteBuffer) byteBuffer4.position(i10);
            I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, slice, i6, byteBuffer4.slice(), i8 * 2, i4, i5);
            return;
        }
        int capacity = byteBuffer4.capacity();
        throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i11 + " was " + capacity);
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        nativeCopyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8, int i9) {
        nativeI420Rotate(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8, i9);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, int i6, int i7) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && i6 > 0 && i7 > 0) {
            nativeI420ToNV12(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, i6, i7);
            return;
        }
        throw new IllegalArgumentException("Invalid I420ToNV12 input arguments");
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5) {
        I420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, i5, i4, i5, (i4 + 1) / 2, (i5 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, ByteBuffer byteBuffer5, int i5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null && i7 > 0 && i8 > 0) {
            nativeI420Copy(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, byteBuffer4, i4, byteBuffer5, i5, byteBuffer6, i6, i7, i8);
            return;
        }
        throw new IllegalArgumentException("Invalid I420Copy input arguments");
    }
}

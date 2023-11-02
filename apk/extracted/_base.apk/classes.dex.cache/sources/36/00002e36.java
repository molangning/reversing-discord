package com.mrousavy.camera.frameprocessor;

import android.media.Image;
import java.nio.ByteBuffer;
import p077e5.InterfaceC6107a;
import p465zd.EnumC14156e;
import p465zd.EnumC14161g;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class Frame {

    /* renamed from: f */
    private static ByteBuffer f15071f;

    /* renamed from: a */
    private final Image f15072a;

    /* renamed from: b */
    private final boolean f15073b;

    /* renamed from: c */
    private final long f15074c;

    /* renamed from: d */
    private final EnumC14156e f15075d;

    /* renamed from: e */
    private int f15076e = 0;

    public Frame(Image image, long j, EnumC14156e enumC14156e, boolean z) {
        this.f15072a = image;
        this.f15074c = j;
        this.f15075d = enumC14156e;
        this.f15073b = z;
    }

    @InterfaceC6107a
    private void close() {
        this.f15072a.close();
    }

    @InterfaceC6107a
    public void decrementRefCount() {
        synchronized (this) {
            int i = this.f15076e - 1;
            this.f15076e = i;
            if (i <= 0) {
                this.f15072a.close();
            }
        }
    }

    @InterfaceC6107a
    public int getBytesPerRow() {
        return this.f15072a.getPlanes()[0].getRowStride();
    }

    @InterfaceC6107a
    public int getHeight() {
        return this.f15072a.getHeight();
    }

    @InterfaceC6107a
    public boolean getIsMirrored() {
        return this.f15073b;
    }

    @InterfaceC6107a
    public boolean getIsValid() {
        try {
            this.f15072a.getCropRect();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @InterfaceC6107a
    public String getOrientation() {
        return this.f15075d.m552b();
    }

    @InterfaceC6107a
    public String getPixelFormat() {
        return EnumC14161g.f36439k.m541a(this.f15072a.getFormat()).m543b();
    }

    @InterfaceC6107a
    public int getPlanesCount() {
        return this.f15072a.getPlanes().length;
    }

    @InterfaceC6107a
    public long getTimestamp() {
        return this.f15074c;
    }

    @InterfaceC6107a
    public int getWidth() {
        return this.f15072a.getWidth();
    }

    @InterfaceC6107a
    public void incrementRefCount() {
        synchronized (this) {
            this.f15076e++;
        }
    }

    @InterfaceC6107a
    public ByteBuffer toByteBuffer() {
        int format = this.f15072a.getFormat();
        if (format != 35) {
            if (format == 256) {
                return this.f15072a.getPlanes()[0].getBuffer();
            }
            throw new RuntimeException("Cannot convert Frame with Format " + this.f15072a.getFormat() + " to byte array!");
        }
        ByteBuffer buffer = this.f15072a.getPlanes()[0].getBuffer();
        ByteBuffer buffer2 = this.f15072a.getPlanes()[1].getBuffer();
        ByteBuffer buffer3 = this.f15072a.getPlanes()[2].getBuffer();
        int remaining = buffer.remaining() + buffer2.remaining() + buffer3.remaining();
        ByteBuffer byteBuffer = f15071f;
        if (byteBuffer != null) {
            byteBuffer.rewind();
        }
        ByteBuffer byteBuffer2 = f15071f;
        if (byteBuffer2 == null || byteBuffer2.remaining() != remaining) {
            f15071f = ByteBuffer.allocateDirect(remaining);
        }
        f15071f.put(buffer).put(buffer2).put(buffer3);
        return f15071f;
    }
}
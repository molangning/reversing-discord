package org.webrtc;

import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        @CalledByNative("Buffer")
        int getBufferType();

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @Override // org.webrtc.RefCounted
        @CalledByNative("Buffer")
        void release();

        @Override // org.webrtc.RefCounted
        @CalledByNative("Buffer")
        void retain();

        @CalledByNative("Buffer")
        I420Buffer toI420();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface I420Buffer extends Buffer {
        @Override // org.webrtc.VideoFrame.Buffer
        int getBufferType();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I420Buffer")
        int getStrideU();

        @CalledByNative("I420Buffer")
        int getStrideV();

        @CalledByNative("I420Buffer")
        int getStrideY();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface TextureBuffer extends Buffer {

        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public enum Type {
            OES(36197),
            RGB(3553);
            
            private final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2);

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    @CalledByNative
    public VideoFrame(Buffer buffer, int i, long j) {
        if (buffer != null) {
            if (i % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i;
                this.timestampNs = j;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        if (this.rotation % 180 == 0) {
            return this.buffer.getHeight();
        }
        return this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        if (this.rotation % 180 == 0) {
            return this.buffer.getWidth();
        }
        return this.buffer.getHeight();
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // org.webrtc.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }
}
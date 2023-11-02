package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecMimeType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        DecodedTextureMetadata(long j, Integer num) {
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        FrameInfo(long j, int i) {
            this.decodeStartTimeMs = j;
            this.rotation = i;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecMimeType videoCodecMimeType, int i, EglBase.Context context) {
        if (isSupportedColorFormat(i)) {
            Logging.m8411d(TAG, "ctor name: " + str + " type: " + videoCodecMimeType + " color format: " + i + " context: " + context);
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
            this.codecName = str;
            this.codecType = videoCodecMimeType;
            this.colorFormat = i;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            return;
        }
        throw new IllegalArgumentException("Unsupported color format: " + i);
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5;
        if (i % 2 == 0) {
            int i6 = (i3 + 1) / 2;
            int i7 = i2 % 2;
            if (i7 == 0) {
                i5 = (i4 + 1) / 2;
            } else {
                i5 = i4 / 2;
            }
            int i8 = i5;
            int i9 = i / 2;
            int i10 = (i * i2) + 0;
            int i11 = i9 * i8;
            int i12 = i10 + ((i9 * i2) / 2);
            int i13 = i12 + i11;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i3, i4);
            ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.limit((i * i4) + 0);
            ByteBuffer byteBuffer3 = (ByteBuffer) byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i3, i4);
            ByteBuffer byteBuffer4 = (ByteBuffer) byteBuffer.limit(i10 + i11);
            ByteBuffer byteBuffer5 = (ByteBuffer) byteBuffer.position(i10);
            copyPlane(byteBuffer.slice(), i9, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i6, i8);
            if (i7 == 1) {
                ByteBuffer byteBuffer6 = (ByteBuffer) byteBuffer.position(i10 + ((i8 - 1) * i9));
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                ByteBuffer byteBuffer7 = (ByteBuffer) dataU.position(allocateI420Buffer.getStrideU() * i8);
                dataU.put(byteBuffer);
            }
            ByteBuffer byteBuffer8 = (ByteBuffer) byteBuffer.limit(i13);
            ByteBuffer byteBuffer9 = (ByteBuffer) byteBuffer.position(i12);
            copyPlane(byteBuffer.slice(), i9, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i6, i8);
            if (i7 == 1) {
                ByteBuffer byteBuffer10 = (ByteBuffer) byteBuffer.position(i12 + (i9 * (i8 - 1)));
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                ByteBuffer byteBuffer11 = (ByteBuffer) dataV.position(allocateI420Buffer.getStrideV() * i8);
                dataV.put(byteBuffer);
            }
            return allocateI420Buffer;
        }
        throw new AssertionError("Stride is not divisible by two: " + i);
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
            i5 = this.stride;
            i6 = this.sliceHeight;
        }
        int i8 = bufferInfo.size;
        if (i8 < ((i3 * i4) * 3) / 2) {
            Logging.m8410e(TAG, "Insufficient output buffer size: " + i8);
            return;
        }
        if (i8 < ((i5 * i4) * 3) / 2 && i6 == i4 && i5 > i3) {
            i7 = (i8 * 2) / (i4 * 3);
        } else {
            i7 = i5;
        }
        ByteBuffer outputBuffer = this.codec.getOutputBuffer(i);
        ByteBuffer byteBuffer = (ByteBuffer) outputBuffer.position(bufferInfo.offset);
        ByteBuffer byteBuffer2 = (ByteBuffer) outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = outputBuffer.slice();
        if (this.colorFormat == 19) {
            copyNV12ToI420Buffer = copyI420Buffer(slice, i7, i6, i3, i4);
        } else {
            copyNV12ToI420Buffer = copyNV12ToI420Buffer(slice, i7, i6, i3, i4);
        }
        this.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(copyNV12ToI420Buffer, i2, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                this.codec.releaseOutputBuffer(i, false);
                return;
            }
            if (i3 > 0 && i4 > 0) {
                this.surfaceTextureHelper.setTextureSize(i3, i4);
                this.surfaceTextureHelper.setFrameRotation(i2);
                this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i, true);
                return;
            }
            this.codec.releaseOutputBuffer(i, false);
        }
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        String str = this.codecName;
        VideoCodecMimeType videoCodecMimeType = this.codecType;
        Logging.m8411d(TAG, "initDecodeInternal name: " + str + " type: " + videoCodecMimeType + " width: " + i + " height: " + i2);
        if (this.outputThread != null) {
            Logging.m8410e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i;
        this.height = i2;
        this.stride = i;
        this.sliceHeight = i2;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                Logging.m8411d(TAG, "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalArgumentException | IllegalStateException e) {
                Logging.m8409e(TAG, "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException unused) {
            String str2 = this.codecName;
            Logging.m8410e(TAG, "Cannot create media decoder " + str2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        String mediaFormat2 = mediaFormat.toString();
        Logging.m8411d(TAG, "Decoder format changed: " + mediaFormat2);
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            int i = this.width;
            if (integer != i || integer2 != this.height) {
                if (this.hasDecodedFirstFrame) {
                    int i2 = this.width;
                    int i3 = this.height;
                    stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + i2 + "*" + i3 + ". New " + integer + "*" + integer2));
                    return;
                }
                if (integer > 0 && integer2 > 0) {
                    this.width = integer;
                    this.height = integer2;
                }
                int i4 = this.height;
                Logging.m8407w(TAG, "Unexpected format dimensions. Configured " + i + "*" + i4 + ". New " + integer + "*" + integer2 + ". Skip it");
                return;
            }
            if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                int integer3 = mediaFormat.getInteger("color-format");
                this.colorFormat = integer3;
                String hexString = Integer.toHexString(integer3);
                Logging.m8411d(TAG, "Color: 0x" + hexString);
                if (!isSupportedColorFormat(this.colorFormat)) {
                    int i5 = this.colorFormat;
                    stopOnOutputThread(new IllegalStateException("Unsupported color format: " + i5));
                    return;
                }
            }
            synchronized (this.dimensionLock) {
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_STRIDE)) {
                    this.stride = mediaFormat.getInteger(MEDIA_FORMAT_KEY_STRIDE);
                }
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT)) {
                    this.sliceHeight = mediaFormat.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
                }
                int i6 = this.stride;
                int i7 = this.sliceHeight;
                Logging.m8411d(TAG, "Frame stride and slice height: " + i6 + " x " + i7);
                this.stride = Math.max(this.width, this.stride);
                this.sliceHeight = Math.max(this.height, this.sliceHeight);
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal != VideoCodecStatus.OK) {
            return releaseInternal;
        }
        return initDecodeInternal(i, i2);
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m8411d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.m8409e(TAG, "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.m8409e(TAG, "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        Logging.m8411d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.webrtc.MediaCodecWrapper, java.lang.Thread] */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.m8411d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.m8409e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.m8409e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    protected VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    protected void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    @Override // org.webrtc.VideoDecoder
    public /* synthetic */ long createNativeVideoDecoder() {
        return C11301f1.m8307a(this);
    }

    protected SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i;
        int i2;
        VideoCodecStatus reinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        boolean z = false;
        if (mediaCodecWrapper != null && this.callback != null) {
            ByteBuffer byteBuffer = encodedImage.buffer;
            if (byteBuffer == null) {
                Logging.m8410e(TAG, "decode() - no input data");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            int remaining = byteBuffer.remaining();
            if (remaining == 0) {
                Logging.m8410e(TAG, "decode() - input buffer empty");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            synchronized (this.dimensionLock) {
                i = this.width;
                i2 = this.height;
            }
            int i3 = encodedImage.encodedWidth;
            int i4 = encodedImage.encodedHeight;
            if (i3 * i4 > 0 && ((i3 != i || i4 != i2) && (reinitDecode = reinitDecode(i3, i4)) != VideoCodecStatus.OK)) {
                return reinitDecode;
            }
            if (this.keyFrameRequired && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                Logging.m8410e(TAG, "decode() - key frame required first");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
                if (dequeueInputBuffer < 0) {
                    Logging.m8410e(TAG, "decode() - no HW buffers available; decoder falling behind");
                    return VideoCodecStatus.ERROR;
                }
                try {
                    ByteBuffer inputBuffer = this.codec.getInputBuffer(dequeueInputBuffer);
                    if (inputBuffer.capacity() < remaining) {
                        Logging.m8410e(TAG, "decode() - HW buffer too small");
                        return VideoCodecStatus.ERROR;
                    }
                    inputBuffer.put(encodedImage.buffer);
                    this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                    try {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                        if (this.keyFrameRequired) {
                            this.keyFrameRequired = false;
                        }
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e) {
                        Logging.m8409e(TAG, "queueInputBuffer failed", e);
                        this.frameInfos.pollLast();
                        return VideoCodecStatus.ERROR;
                    }
                } catch (IllegalStateException e2) {
                    Logging.m8409e(TAG, "getInputBuffer with index=" + dequeueInputBuffer + " failed", e2);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e3) {
                Logging.m8409e(TAG, "dequeueInputBuffer failed", e3);
                return VideoCodecStatus.ERROR;
            }
        }
        if (mediaCodecWrapper != null) {
            z = true;
        }
        VideoDecoder.Callback callback = this.callback;
        Logging.m8411d(TAG, "decode uninitalized, codec: " + z + ", callback: " + callback);
        return VideoCodecStatus.UNINITIALIZED;
    }

    protected void deliverDecodedFrame() {
        Integer num;
        int i;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                Logging.m8408v(TAG, "dequeueOutputBuffer returned " + dequeueOutputBuffer);
            } else {
                FrameInfo poll = this.frameInfos.poll();
                if (poll != null) {
                    num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                    i = poll.rotation;
                } else {
                    num = null;
                    i = 0;
                }
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i, num);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo, i, num);
                }
            }
        } catch (IllegalStateException e) {
            Logging.m8409e(TAG, "deliverDecodedFrame failed", e);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            try {
                this.surfaceTextureHelper = createSurfaceTextureHelper();
                this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
                this.surfaceTextureHelper.startListening(this);
            } catch (Throwable th2) {
                Logging.m8409e(TAG, "Error creating SurfaceTextureHelper", th2);
                Surface surface = this.surface;
                if (surface != null) {
                    surface.release();
                    this.surface = null;
                }
                SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.dispose();
                    this.surfaceTextureHelper = null;
                }
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j;
        Integer num;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                j = decodedTextureMetadata.presentationTimestampUs * 1000;
                num = decodedTextureMetadata.decodeTimeMs;
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j), num, null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        Logging.m8411d(TAG, "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    protected void releaseSurface() {
        this.surface.release();
    }
}
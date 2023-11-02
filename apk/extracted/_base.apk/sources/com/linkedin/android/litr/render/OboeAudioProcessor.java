package com.linkedin.android.litr.render;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md.C10438c;
import td.InterfaceC12655a;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0082 J!\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0082 J\t\u0010\u000e\u001a\u00020\u0007H\u0082 J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006#"}, m14357d2 = {"Lcom/linkedin/android/litr/render/OboeAudioProcessor;", "Ltd/a;", "", "sourceChannelCount", "sourceSampleRate", "targetChannelCount", "targetSampleRate", "", "initProcessor", "Ljava/nio/ByteBuffer;", "sourceBuffer", "sampleCount", "targetBuffer", "processAudioFrame", "releaseProcessor", "Lmd/c;", "sourceFrame", "targetFrame", "a", "release", "", "D", "samplingRatio", "b", "sampleDurationUs", "", "c", "J", "presentationTimeNs", "d", "I", "e", "<init>", "(IIII)V", "f", "litr_release"}, m14356k = 1, m14355mv = {1, 4, 2})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class OboeAudioProcessor implements InterfaceC12655a {

    /* renamed from: f */
    public static final C5274a f15007f = new C5274a(null);

    /* renamed from: a */
    private final double f15008a;

    /* renamed from: b */
    private double f15009b;

    /* renamed from: c */
    private long f15010c;

    /* renamed from: d */
    private final int f15011d;

    /* renamed from: e */
    private final int f15012e;

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lcom/linkedin/android/litr/render/OboeAudioProcessor$a;", "", "<init>", "()V", "litr_release"}, m14356k = 1, m14355mv = {1, 4, 2})
    /* renamed from: com.linkedin.android.litr.render.OboeAudioProcessor$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5274a {
        private C5274a() {
        }

        public /* synthetic */ C5274a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        System.loadLibrary("litr-jni");
    }

    public OboeAudioProcessor(int i, int i2, int i3, int i4) {
        this.f15011d = i;
        this.f15012e = i3;
        initProcessor(i, i2, i3, i4);
        double d = i4;
        this.f15008a = d / i2;
        this.f15009b = 1000000.0d / d;
        this.f15010c = 0L;
    }

    private final native void initProcessor(int i, int i2, int i3, int i4);

    private final native int processAudioFrame(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2);

    private final native void releaseProcessor();

    @Override // td.InterfaceC12655a
    /* renamed from: a */
    public void mo4587a(C10438c sourceFrame, C10438c targetFrame) {
        ByteBuffer byteBuffer;
        C9612q.m13917h(sourceFrame, "sourceFrame");
        C9612q.m13917h(targetFrame, "targetFrame");
        ByteBuffer byteBuffer2 = sourceFrame.f27261b;
        if (byteBuffer2 != null && (byteBuffer = targetFrame.f27261b) != null) {
            int processAudioFrame = processAudioFrame(byteBuffer2, sourceFrame.f27262c.size / (this.f15011d * 2), byteBuffer);
            int i = processAudioFrame * 2 * this.f15012e;
            targetFrame.f27261b.rewind();
            targetFrame.f27261b.limit(i);
            targetFrame.f27262c.set(0, i, this.f15010c, sourceFrame.f27262c.flags);
            this.f15010c += (long) (processAudioFrame * this.f15009b);
            return;
        }
        throw new IllegalArgumentException("Source or target frame doesn't have a buffer, cannot process it!");
    }

    @Override // td.InterfaceC12655a
    public void release() {
        releaseProcessor();
    }
}

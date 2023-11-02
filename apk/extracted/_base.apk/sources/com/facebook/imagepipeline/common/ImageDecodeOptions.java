package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import p294q4.C11700b;
import p346t4.InterfaceC12579c;
import p394w2.C13375i;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ImageDecodeOptions {

    /* renamed from: l */
    private static final ImageDecodeOptions f10284l = m31193b().m7153a();

    /* renamed from: a */
    public final int f10285a;

    /* renamed from: b */
    public final int f10286b;

    /* renamed from: c */
    public final boolean f10287c;

    /* renamed from: d */
    public final boolean f10288d;

    /* renamed from: e */
    public final boolean f10289e;

    /* renamed from: f */
    public final boolean f10290f;

    /* renamed from: g */
    public final Bitmap.Config f10291g;

    /* renamed from: h */
    public final Bitmap.Config f10292h;

    /* renamed from: i */
    public final InterfaceC12579c f10293i;

    /* renamed from: j */
    public final ColorSpace f10294j;

    /* renamed from: k */
    private final boolean f10295k;

    public ImageDecodeOptions(C11700b c11700b) {
        this.f10285a = c11700b.m7142l();
        this.f10286b = c11700b.m7143k();
        this.f10287c = c11700b.m7146h();
        this.f10288d = c11700b.m7141m();
        this.f10289e = c11700b.m7147g();
        this.f10290f = c11700b.m7144j();
        this.f10291g = c11700b.m7151c();
        this.f10292h = c11700b.m7152b();
        this.f10293i = c11700b.m7148f();
        c11700b.m7150d();
        this.f10294j = c11700b.m7149e();
        this.f10295k = c11700b.m7145i();
    }

    /* renamed from: a */
    public static ImageDecodeOptions m31194a() {
        return f10284l;
    }

    /* renamed from: b */
    public static C11700b m31193b() {
        return new C11700b();
    }

    /* renamed from: c */
    protected C13375i.C13377b m31192c() {
        return C13375i.m2689c(this).m2688a("minDecodeIntervalMs", this.f10285a).m2688a("maxDimensionPx", this.f10286b).m2686c("decodePreviewFrame", this.f10287c).m2686c("useLastFrameForPreview", this.f10288d).m2686c("decodeAllFrames", this.f10289e).m2686c("forceStaticImage", this.f10290f).m2687b("bitmapConfigName", this.f10291g.name()).m2687b("animatedBitmapConfigName", this.f10292h.name()).m2687b("customImageDecoder", this.f10293i).m2687b("bitmapTransformation", null).m2687b("colorSpace", this.f10294j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageDecodeOptions imageDecodeOptions = (ImageDecodeOptions) obj;
        if (this.f10285a != imageDecodeOptions.f10285a || this.f10286b != imageDecodeOptions.f10286b || this.f10287c != imageDecodeOptions.f10287c || this.f10288d != imageDecodeOptions.f10288d || this.f10289e != imageDecodeOptions.f10289e || this.f10290f != imageDecodeOptions.f10290f) {
            return false;
        }
        boolean z = this.f10295k;
        if (!z && this.f10291g != imageDecodeOptions.f10291g) {
            return false;
        }
        if ((z || this.f10292h == imageDecodeOptions.f10292h) && this.f10293i == imageDecodeOptions.f10293i && this.f10294j == imageDecodeOptions.f10294j) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = (((((((((this.f10285a * 31) + this.f10286b) * 31) + (this.f10287c ? 1 : 0)) * 31) + (this.f10288d ? 1 : 0)) * 31) + (this.f10289e ? 1 : 0)) * 31) + (this.f10290f ? 1 : 0);
        if (!this.f10295k) {
            i3 = (i3 * 31) + this.f10291g.ordinal();
        }
        int i4 = 0;
        if (!this.f10295k) {
            int i5 = i3 * 31;
            Bitmap.Config config = this.f10292h;
            if (config != null) {
                i2 = config.ordinal();
            } else {
                i2 = 0;
            }
            i3 = i5 + i2;
        }
        int i6 = i3 * 31;
        InterfaceC12579c interfaceC12579c = this.f10293i;
        if (interfaceC12579c != null) {
            i = interfaceC12579c.hashCode();
        } else {
            i = 0;
        }
        int i7 = (((i6 + i) * 31) + 0) * 31;
        ColorSpace colorSpace = this.f10294j;
        if (colorSpace != null) {
            i4 = colorSpace.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        return "ImageDecodeOptions{" + m31192c().toString() + "}";
    }
}

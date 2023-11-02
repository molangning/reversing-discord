package p278p4;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import p075e3.C6099b;
import p394w2.C13375i;
import p394w2.C13379j;

/* renamed from: p4.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11383b implements CacheKey {

    /* renamed from: a */
    private final String f29653a;

    /* renamed from: b */
    private final ResizeOptions f29654b;

    /* renamed from: c */
    private final RotationOptions f29655c;

    /* renamed from: d */
    private final ImageDecodeOptions f29656d;

    /* renamed from: e */
    private final CacheKey f29657e;

    /* renamed from: f */
    private final String f29658f;

    /* renamed from: g */
    private final int f29659g;

    /* renamed from: h */
    private final Object f29660h;

    /* renamed from: i */
    private final long f29661i;

    public C11383b(String str, ResizeOptions resizeOptions, RotationOptions rotationOptions, ImageDecodeOptions imageDecodeOptions, CacheKey cacheKey, String str2, Object obj) {
        int i;
        this.f29653a = (String) C13379j.m2677g(str);
        this.f29654b = resizeOptions;
        this.f29655c = rotationOptions;
        this.f29656d = imageDecodeOptions;
        this.f29657e = cacheKey;
        this.f29658f = str2;
        Integer valueOf = Integer.valueOf(str.hashCode());
        if (resizeOptions != null) {
            i = resizeOptions.hashCode();
        } else {
            i = 0;
        }
        this.f29659g = C6099b.m23578d(valueOf, Integer.valueOf(i), Integer.valueOf(rotationOptions.hashCode()), imageDecodeOptions, cacheKey, str2);
        this.f29660h = obj;
        this.f29661i = RealtimeSinceBootClock.get().now();
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: a */
    public String mo714a() {
        return this.f29653a;
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: b */
    public boolean mo713b(Uri uri) {
        return mo714a().contains(uri.toString());
    }

    @Override // com.facebook.cache.common.CacheKey
    /* renamed from: c */
    public boolean mo712c() {
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(Object obj) {
        if (!(obj instanceof C11383b)) {
            return false;
        }
        C11383b c11383b = (C11383b) obj;
        if (this.f29659g != c11383b.f29659g || !this.f29653a.equals(c11383b.f29653a) || !C13375i.m2691a(this.f29654b, c11383b.f29654b) || !C13375i.m2691a(this.f29655c, c11383b.f29655c) || !C13375i.m2691a(this.f29656d, c11383b.f29656d) || !C13375i.m2691a(this.f29657e, c11383b.f29657e) || !C13375i.m2691a(this.f29658f, c11383b.f29658f)) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.f29659g;
    }

    public String toString() {
        return String.format(null, "%s_%s_%s_%s_%s_%s_%d", this.f29653a, this.f29654b, this.f29655c, this.f29656d, this.f29657e, this.f29658f, Integer.valueOf(this.f29659g));
    }
}

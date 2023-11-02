package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.Format;
import p195k8.C9149a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class DecoderReuseEvaluation {

    /* renamed from: a */
    public final String f11468a;

    /* renamed from: b */
    public final Format f11469b;

    /* renamed from: c */
    public final Format f11470c;

    /* renamed from: d */
    public final int f11471d;

    /* renamed from: e */
    public final int f11472e;

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        C9149a.m16452a(z);
        this.f11468a = C9149a.m16449d(str);
        this.f11469b = (Format) C9149a.m16448e(format);
        this.f11470c = (Format) C9149a.m16448e(format2);
        this.f11471d = i;
        this.f11472e = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DecoderReuseEvaluation.class != obj.getClass()) {
            return false;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
        if (this.f11471d == decoderReuseEvaluation.f11471d && this.f11472e == decoderReuseEvaluation.f11472e && this.f11468a.equals(decoderReuseEvaluation.f11468a) && this.f11469b.equals(decoderReuseEvaluation.f11469b) && this.f11470c.equals(decoderReuseEvaluation.f11470c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f11471d) * 31) + this.f11472e) * 31) + this.f11468a.hashCode()) * 31) + this.f11469b.hashCode()) * 31) + this.f11470c.hashCode();
    }
}

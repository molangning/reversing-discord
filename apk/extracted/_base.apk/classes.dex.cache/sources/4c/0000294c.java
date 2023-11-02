package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import p195k8.C9191p0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AudioAttributes {

    /* renamed from: f */
    public static final AudioAttributes f11425f = new C4385b().m29567a();

    /* renamed from: a */
    public final int f11426a;

    /* renamed from: b */
    public final int f11427b;

    /* renamed from: c */
    public final int f11428c;

    /* renamed from: d */
    public final int f11429d;

    /* renamed from: e */
    private android.media.AudioAttributes f11430e;

    /* renamed from: com.google.android.exoplayer2.audio.AudioAttributes$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4385b {

        /* renamed from: a */
        private int f11431a = 0;

        /* renamed from: b */
        private int f11432b = 0;

        /* renamed from: c */
        private int f11433c = 1;

        /* renamed from: d */
        private int f11434d = 1;

        /* renamed from: a */
        public AudioAttributes m29567a() {
            return new AudioAttributes(this.f11431a, this.f11432b, this.f11433c, this.f11434d);
        }
    }

    /* renamed from: a */
    public android.media.AudioAttributes m29568a() {
        if (this.f11430e == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f11426a).setFlags(this.f11427b).setUsage(this.f11428c);
            if (C9191p0.f24171a >= 29) {
                usage.setAllowedCapturePolicy(this.f11429d);
            }
            this.f11430e = usage.build();
        }
        return this.f11430e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        if (this.f11426a == audioAttributes.f11426a && this.f11427b == audioAttributes.f11427b && this.f11428c == audioAttributes.f11428c && this.f11429d == audioAttributes.f11429d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f11426a) * 31) + this.f11427b) * 31) + this.f11428c) * 31) + this.f11429d;
    }

    private AudioAttributes(int i, int i2, int i3, int i4) {
        this.f11426a = i;
        this.f11427b = i2;
        this.f11428c = i3;
        this.f11429d = i4;
    }
}
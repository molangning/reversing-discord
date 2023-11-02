package com.linkedin.android.litr;

import android.media.MediaFormat;
import md.InterfaceC10436a;
import md.InterfaceC10437b;
import sd.InterfaceC12458c;
import sd.InterfaceC12459d;
import td.InterfaceC12664i;

/* renamed from: com.linkedin.android.litr.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5267b {

    /* renamed from: a */
    private final InterfaceC12458c f14967a;

    /* renamed from: b */
    private final InterfaceC10436a f14968b;

    /* renamed from: c */
    private final InterfaceC12664i f14969c;

    /* renamed from: d */
    private final InterfaceC10437b f14970d;

    /* renamed from: e */
    private final InterfaceC12459d f14971e;

    /* renamed from: f */
    private final MediaFormat f14972f;

    /* renamed from: g */
    private final int f14973g;

    /* renamed from: h */
    private final int f14974h;

    /* renamed from: com.linkedin.android.litr.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5269b {

        /* renamed from: a */
        private final InterfaceC12458c f14975a;

        /* renamed from: b */
        private final int f14976b;

        /* renamed from: c */
        private final InterfaceC12459d f14977c;

        /* renamed from: d */
        private InterfaceC10436a f14978d;

        /* renamed from: e */
        private InterfaceC12664i f14979e;

        /* renamed from: f */
        private InterfaceC10437b f14980f;

        /* renamed from: g */
        private MediaFormat f14981g;

        /* renamed from: h */
        private int f14982h;

        public C5269b(InterfaceC12458c interfaceC12458c, int i, InterfaceC12459d interfaceC12459d) {
            this.f14975a = interfaceC12458c;
            this.f14976b = i;
            this.f14977c = interfaceC12459d;
            this.f14982h = i;
        }

        /* renamed from: a */
        public C5267b m25562a() {
            return new C5267b(this.f14975a, this.f14978d, this.f14979e, this.f14980f, this.f14977c, this.f14981g, this.f14976b, this.f14982h);
        }

        /* renamed from: b */
        public C5269b m25561b(InterfaceC10436a interfaceC10436a) {
            this.f14978d = interfaceC10436a;
            return this;
        }

        /* renamed from: c */
        public C5269b m25560c(InterfaceC10437b interfaceC10437b) {
            this.f14980f = interfaceC10437b;
            return this;
        }

        /* renamed from: d */
        public C5269b m25559d(InterfaceC12664i interfaceC12664i) {
            this.f14979e = interfaceC12664i;
            return this;
        }

        /* renamed from: e */
        public C5269b m25558e(MediaFormat mediaFormat) {
            this.f14981g = mediaFormat;
            return this;
        }

        /* renamed from: f */
        public C5269b m25557f(int i) {
            this.f14982h = i;
            return this;
        }
    }

    /* renamed from: a */
    public InterfaceC10436a m25570a() {
        return this.f14968b;
    }

    /* renamed from: b */
    public InterfaceC10437b m25569b() {
        return this.f14970d;
    }

    /* renamed from: c */
    public InterfaceC12458c m25568c() {
        return this.f14967a;
    }

    /* renamed from: d */
    public InterfaceC12459d m25567d() {
        return this.f14971e;
    }

    /* renamed from: e */
    public InterfaceC12664i m25566e() {
        return this.f14969c;
    }

    /* renamed from: f */
    public int m25565f() {
        return this.f14973g;
    }

    /* renamed from: g */
    public MediaFormat m25564g() {
        return this.f14972f;
    }

    /* renamed from: h */
    public int m25563h() {
        return this.f14974h;
    }

    private C5267b(InterfaceC12458c interfaceC12458c, InterfaceC10436a interfaceC10436a, InterfaceC12664i interfaceC12664i, InterfaceC10437b interfaceC10437b, InterfaceC12459d interfaceC12459d, MediaFormat mediaFormat, int i, int i2) {
        this.f14967a = interfaceC12458c;
        this.f14968b = interfaceC10436a;
        this.f14969c = interfaceC12664i;
        this.f14970d = interfaceC10437b;
        this.f14971e = interfaceC12459d;
        this.f14972f = mediaFormat;
        this.f14973g = i;
        this.f14974h = i2;
    }
}
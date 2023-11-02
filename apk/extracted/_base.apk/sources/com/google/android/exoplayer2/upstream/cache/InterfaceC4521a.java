package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;
import p174j8.C8868d;
import p174j8.C8871g;
import p174j8.InterfaceC8870f;

/* renamed from: com.google.android.exoplayer2.upstream.cache.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC4521a {

    /* renamed from: com.google.android.exoplayer2.upstream.cache.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4522a extends IOException {
        public C4522a(String str) {
            super(str);
        }

        public C4522a(Throwable th2) {
            super(th2);
        }

        public C4522a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.cache.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4523b {
        /* renamed from: b */
        void mo17122b(InterfaceC4521a interfaceC4521a, C8868d c8868d);

        /* renamed from: c */
        void mo17121c(InterfaceC4521a interfaceC4521a, C8868d c8868d, C8868d c8868d2);

        /* renamed from: f */
        void mo17118f(InterfaceC4521a interfaceC4521a, C8868d c8868d);
    }

    /* renamed from: a */
    File mo28726a(String str, long j, long j2);

    /* renamed from: b */
    void mo28725b(C8868d c8868d);

    /* renamed from: c */
    void mo28724c(String str, C8871g c8871g);

    /* renamed from: d */
    InterfaceC8870f mo28723d(String str);

    /* renamed from: e */
    C8868d mo28722e(String str, long j, long j2);

    /* renamed from: f */
    void mo28721f(C8868d c8868d);

    /* renamed from: g */
    C8868d mo28720g(String str, long j, long j2);

    /* renamed from: h */
    void mo28719h(File file, long j);
}

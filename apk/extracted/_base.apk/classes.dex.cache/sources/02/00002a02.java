package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC4540f extends DataSource {

    /* renamed from: com.google.android.exoplayer2.upstream.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC4541a implements InterfaceC4543c {

        /* renamed from: a */
        private final C4547g f12371a = new C4547g();

        /* renamed from: a */
        protected abstract InterfaceC4540f mo8047a(C4547g c4547g);

        @Deprecated
        /* renamed from: b */
        public final C4547g m28634b() {
            return this.f12371a;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final InterfaceC4540f createDataSource() {
            return mo8047a(this.f12371a);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4542b extends C4544d {
        public C4542b(IOException iOException, C4515a c4515a) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, c4515a, 1);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4543c extends DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        InterfaceC4540f createDataSource();
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4545e extends C4544d {

        /* renamed from: l */
        public final String f12374l;

        public C4545e(String str, C4515a c4515a) {
            super("Invalid content type: " + str, c4515a, 1);
            this.f12374l = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4546f extends C4544d {

        /* renamed from: l */
        public final int f12375l;

        /* renamed from: m */
        public final String f12376m;

        /* renamed from: n */
        public final Map<String, List<String>> f12377n;

        /* renamed from: o */
        public final byte[] f12378o;

        public C4546f(int i, String str, Map<String, List<String>> map, C4515a c4515a, byte[] bArr) {
            super("Response code: " + i, c4515a, 1);
            this.f12375l = i;
            this.f12376m = str;
            this.f12377n = map;
            this.f12378o = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4547g {

        /* renamed from: a */
        private final Map<String, String> f12379a = new HashMap();

        /* renamed from: b */
        private Map<String, String> f12380b;

        /* renamed from: a */
        public synchronized Map<String, String> m28633a() {
            if (this.f12380b == null) {
                this.f12380b = Collections.unmodifiableMap(new HashMap(this.f12379a));
            }
            return this.f12380b;
        }

        /* renamed from: b */
        public synchronized void m28632b(Map<String, String> map) {
            this.f12380b = null;
            this.f12379a.putAll(map);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4544d extends IOException {

        /* renamed from: j */
        public final int f12372j;

        /* renamed from: k */
        public final C4515a f12373k;

        public C4544d(String str, C4515a c4515a, int i) {
            super(str);
            this.f12373k = c4515a;
            this.f12372j = i;
        }

        public C4544d(IOException iOException, C4515a c4515a, int i) {
            super(iOException);
            this.f12373k = c4515a;
            this.f12372j = i;
        }

        public C4544d(String str, IOException iOException, C4515a c4515a, int i) {
            super(str, iOException);
            this.f12373k = c4515a;
            this.f12372j = i;
        }
    }
}
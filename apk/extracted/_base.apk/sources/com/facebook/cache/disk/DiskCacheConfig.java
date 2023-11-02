package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.common.internal.Supplier;
import java.io.File;
import p292q2.C11692f;
import p292q2.C11693g;
import p292q2.InterfaceC11685a;
import p292q2.InterfaceC11688c;
import p312r2.C12032b;
import p312r2.InterfaceC12044g;
import p344t2.C12573c;
import p344t2.InterfaceC12572b;
import p394w2.C13379j;
import p394w2.C13382m;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DiskCacheConfig {

    /* renamed from: a */
    private final int f9670a;

    /* renamed from: b */
    private final String f9671b;

    /* renamed from: c */
    private final Supplier<File> f9672c;

    /* renamed from: d */
    private final long f9673d;

    /* renamed from: e */
    private final long f9674e;

    /* renamed from: f */
    private final long f9675f;

    /* renamed from: g */
    private final InterfaceC12044g f9676g;

    /* renamed from: h */
    private final InterfaceC11685a f9677h;

    /* renamed from: i */
    private final InterfaceC11688c f9678i;

    /* renamed from: j */
    private final InterfaceC12572b f9679j;

    /* renamed from: k */
    private final Context f9680k;

    /* renamed from: l */
    private final boolean f9681l;

    /* renamed from: com.facebook.cache.disk.DiskCacheConfig$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C3559a implements Supplier<File> {
        C3559a() {
        }

        @Override // com.facebook.common.internal.Supplier
        /* renamed from: a */
        public File get() {
            C13379j.m2677g(DiskCacheConfig.this.f9680k);
            return DiskCacheConfig.this.f9680k.getApplicationContext().getCacheDir();
        }
    }

    /* renamed from: com.facebook.cache.disk.DiskCacheConfig$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3560b {

        /* renamed from: a */
        private int f9683a;

        /* renamed from: b */
        private String f9684b;

        /* renamed from: c */
        private Supplier<File> f9685c;

        /* renamed from: d */
        private long f9686d;

        /* renamed from: e */
        private long f9687e;

        /* renamed from: f */
        private long f9688f;

        /* renamed from: g */
        private InterfaceC12044g f9689g;

        /* renamed from: h */
        private InterfaceC11685a f9690h;

        /* renamed from: i */
        private InterfaceC11688c f9691i;

        /* renamed from: j */
        private InterfaceC12572b f9692j;

        /* renamed from: k */
        private boolean f9693k;

        /* renamed from: l */
        private final Context f9694l;

        /* synthetic */ C3560b(Context context, C3559a c3559a) {
            this(context);
        }

        /* renamed from: n */
        public DiskCacheConfig m31735n() {
            return new DiskCacheConfig(this);
        }

        /* renamed from: o */
        public C3560b m31734o(String str) {
            this.f9684b = str;
            return this;
        }

        /* renamed from: p */
        public C3560b m31733p(File file) {
            this.f9685c = C13382m.m2669a(file);
            return this;
        }

        /* renamed from: q */
        public C3560b m31732q(long j) {
            this.f9686d = j;
            return this;
        }

        private C3560b(Context context) {
            this.f9683a = 1;
            this.f9684b = "image_cache";
            this.f9686d = 41943040L;
            this.f9687e = 10485760L;
            this.f9688f = 2097152L;
            this.f9689g = new C12032b();
            this.f9694l = context;
        }
    }

    protected DiskCacheConfig(C3560b c3560b) {
        boolean z;
        InterfaceC11685a interfaceC11685a;
        InterfaceC11688c interfaceC11688c;
        InterfaceC12572b interfaceC12572b;
        Context context = c3560b.f9694l;
        this.f9680k = context;
        if (c3560b.f9685c == null && context == null) {
            z = false;
        } else {
            z = true;
        }
        C13379j.m2674j(z, "Either a non-null context or a base directory path or supplier must be provided.");
        if (c3560b.f9685c == null && context != null) {
            c3560b.f9685c = new C3559a();
        }
        this.f9670a = c3560b.f9683a;
        this.f9671b = (String) C13379j.m2677g(c3560b.f9684b);
        this.f9672c = (Supplier) C13379j.m2677g(c3560b.f9685c);
        this.f9673d = c3560b.f9686d;
        this.f9674e = c3560b.f9687e;
        this.f9675f = c3560b.f9688f;
        this.f9676g = (InterfaceC12044g) C13379j.m2677g(c3560b.f9689g);
        if (c3560b.f9690h == null) {
            interfaceC11685a = C11692f.m7169b();
        } else {
            interfaceC11685a = c3560b.f9690h;
        }
        this.f9677h = interfaceC11685a;
        if (c3560b.f9691i == null) {
            interfaceC11688c = C11693g.m7160i();
        } else {
            interfaceC11688c = c3560b.f9691i;
        }
        this.f9678i = interfaceC11688c;
        if (c3560b.f9692j == null) {
            interfaceC12572b = C12573c.m4780b();
        } else {
            interfaceC12572b = c3560b.f9692j;
        }
        this.f9679j = interfaceC12572b;
        this.f9681l = c3560b.f9693k;
    }

    /* renamed from: m */
    public static C3560b m31750m(Context context) {
        return new C3560b(context, null);
    }

    /* renamed from: b */
    public String m31761b() {
        return this.f9671b;
    }

    /* renamed from: c */
    public Supplier<File> m31760c() {
        return this.f9672c;
    }

    /* renamed from: d */
    public InterfaceC11685a m31759d() {
        return this.f9677h;
    }

    /* renamed from: e */
    public InterfaceC11688c m31758e() {
        return this.f9678i;
    }

    /* renamed from: f */
    public long m31757f() {
        return this.f9673d;
    }

    /* renamed from: g */
    public InterfaceC12572b m31756g() {
        return this.f9679j;
    }

    /* renamed from: h */
    public InterfaceC12044g m31755h() {
        return this.f9676g;
    }

    /* renamed from: i */
    public boolean m31754i() {
        return this.f9681l;
    }

    /* renamed from: j */
    public long m31753j() {
        return this.f9674e;
    }

    /* renamed from: k */
    public long m31752k() {
        return this.f9675f;
    }

    /* renamed from: l */
    public int m31751l() {
        return this.f9670a;
    }
}

package io.sentry;

import io.sentry.protocol.C8066b0;

/* renamed from: io.sentry.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7830b {

    /* renamed from: a */
    private byte[] f21397a;

    /* renamed from: b */
    private final InterfaceC8026n1 f21398b;

    /* renamed from: c */
    private String f21399c;

    /* renamed from: d */
    private final String f21400d;

    /* renamed from: e */
    private final String f21401e;

    /* renamed from: f */
    private final boolean f21402f;

    /* renamed from: g */
    private String f21403g;

    public C7830b(byte[] bArr, String str, String str2, boolean z) {
        this(bArr, str, str2, "event.attachment", z);
    }

    /* renamed from: a */
    public static C7830b m19611a(byte[] bArr) {
        return new C7830b(bArr, "screenshot.png", "image/png", false);
    }

    /* renamed from: b */
    public static C7830b m19610b(byte[] bArr) {
        return new C7830b(bArr, "thread-dump.txt", "text/plain", false);
    }

    /* renamed from: c */
    public static C7830b m19609c(C8066b0 c8066b0) {
        return new C7830b((InterfaceC8026n1) c8066b0, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    /* renamed from: d */
    public String m19608d() {
        return this.f21403g;
    }

    /* renamed from: e */
    public byte[] m19607e() {
        return this.f21397a;
    }

    /* renamed from: f */
    public String m19606f() {
        return this.f21401e;
    }

    /* renamed from: g */
    public String m19605g() {
        return this.f21400d;
    }

    /* renamed from: h */
    public String m19604h() {
        return this.f21399c;
    }

    /* renamed from: i */
    public InterfaceC8026n1 m19603i() {
        return this.f21398b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m19602j() {
        return this.f21402f;
    }

    public C7830b(byte[] bArr, String str, String str2, String str3, boolean z) {
        this.f21397a = bArr;
        this.f21398b = null;
        this.f21400d = str;
        this.f21401e = str2;
        this.f21403g = str3;
        this.f21402f = z;
    }

    public C7830b(InterfaceC8026n1 interfaceC8026n1, String str, String str2, String str3, boolean z) {
        this.f21397a = null;
        this.f21398b = interfaceC8026n1;
        this.f21400d = str;
        this.f21401e = str2;
        this.f21403g = str3;
        this.f21402f = z;
    }
}

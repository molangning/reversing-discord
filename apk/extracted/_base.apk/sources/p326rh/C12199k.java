package p326rh;

import java.io.IOException;

/* renamed from: rh.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12199k extends IOException {

    /* renamed from: j */
    private InterfaceC12210q f31750j;

    public C12199k(String str) {
        super(str);
        this.f31750j = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C12199k m5795b() {
        return new C12199k("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C12199k m5794c() {
        return new C12199k("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C12199k m5793d() {
        return new C12199k("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C12199k m5792e() {
        return new C12199k("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static C12199k m5791f() {
        return new C12199k("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C12199k m5790g() {
        return new C12199k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static C12199k m5789h() {
        return new C12199k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C12199k m5787j() {
        return new C12199k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C12199k m5786k() {
        return new C12199k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public InterfaceC12210q m5796a() {
        return this.f31750j;
    }

    /* renamed from: i */
    public C12199k m5788i(InterfaceC12210q interfaceC12210q) {
        this.f31750j = interfaceC12210q;
        return this;
    }
}

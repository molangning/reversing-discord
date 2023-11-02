package p326rh;

import java.util.List;

/* renamed from: rh.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12229w extends RuntimeException {

    /* renamed from: j */
    private final List<String> f31801j;

    public C12229w(InterfaceC12210q interfaceC12210q) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f31801j = null;
    }

    /* renamed from: a */
    public C12199k m5702a() {
        return new C12199k(getMessage());
    }
}
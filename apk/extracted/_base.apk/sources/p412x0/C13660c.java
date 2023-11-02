package p412x0;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: x0.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13660c implements InterfaceC13668h {

    /* renamed from: a */
    private static final String[] f35132a = new String[0];

    @Override // p412x0.InterfaceC13668h
    /* renamed from: a */
    public String[] mo1887a() {
        return f35132a;
    }

    @Override // p412x0.InterfaceC13668h
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}

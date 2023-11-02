package p412x0;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p185jk.C9030a;

/* renamed from: x0.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13669i implements InterfaceC13668h {

    /* renamed from: a */
    WebViewProviderFactoryBoundaryInterface f35186a;

    public C13669i(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f35186a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // p412x0.InterfaceC13668h
    /* renamed from: a */
    public String[] mo1887a() {
        return this.f35186a.getSupportedFeatures();
    }

    @Override // p412x0.InterfaceC13668h
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C9030a.m16843a(WebkitToCompatConverterBoundaryInterface.class, this.f35186a.getWebkitToCompatConverter());
    }
}
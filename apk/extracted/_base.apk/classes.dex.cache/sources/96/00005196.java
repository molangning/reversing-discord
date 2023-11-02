package p412x0;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p185jk.C9030a;

/* renamed from: x0.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13670j {

    /* renamed from: a */
    private final WebkitToCompatConverterBoundaryInterface f35187a;

    public C13670j(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f35187a = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: a */
    public C13661d m1886a(WebSettings webSettings) {
        return new C13661d((WebSettingsBoundaryInterface) C9030a.m16843a(WebSettingsBoundaryInterface.class, this.f35187a.convertSettings(webSettings)));
    }
}
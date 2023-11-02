package p104fd;

import com.facebook.react.bridge.Dynamic;
import com.henninghall.date_picker.C5146f;
import java.util.Locale;

/* renamed from: fd.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6397f extends AbstractC6402k<Locale> {

    /* renamed from: b */
    private String f18043b;

    public C6397f() {
        super(m22803e());
        this.f18043b = m22804d();
    }

    /* renamed from: d */
    private static String m22804d() {
        return Locale.getDefault().toLanguageTag().replace('-', '_');
    }

    /* renamed from: e */
    private static Locale m22803e() {
        return C5146f.m26072f(m22804d());
    }

    /* renamed from: f */
    public String m22802f() {
        return this.f18043b;
    }

    @Override // p104fd.AbstractC6402k
    /* renamed from: g */
    public Locale mo22792c(Dynamic dynamic) {
        String replace = dynamic.asString().replace('-', '_');
        this.f18043b = replace;
        return C5146f.m26072f(replace);
    }
}

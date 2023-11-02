package p402wa;

import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: wa.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13466a {
    /* renamed from: a */
    public float m2425a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}

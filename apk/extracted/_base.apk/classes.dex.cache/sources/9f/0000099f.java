package p029b9;

import android.content.Context;
import android.content.res.Resources;
import p441y8.C13939j;

/* renamed from: b9.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2207s {

    /* renamed from: a */
    private final Resources f6207a;

    /* renamed from: b */
    private final String f6208b;

    public C2207s(Context context) {
        C2198p.m33985j(context);
        Resources resources = context.getResources();
        this.f6207a = resources;
        this.f6208b = resources.getResourcePackageName(C13939j.f35895a);
    }

    /* renamed from: a */
    public String m33966a(String str) {
        int identifier = this.f6207a.getIdentifier(str, "string", this.f6208b);
        if (identifier == 0) {
            return null;
        }
        return this.f6207a.getString(identifier);
    }
}
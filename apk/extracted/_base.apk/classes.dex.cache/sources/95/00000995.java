package p029b9;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: b9.o1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2197o1 {

    /* renamed from: a */
    private static final Uri f6188a;

    /* renamed from: b */
    private static final Uri f6189b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f6188a = parse;
        f6189b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m33997a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* renamed from: b */
    public static Intent m33996b(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: c */
    public static Intent m33995c(String str) {
        Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
package com.discord.misc.utilities.intent;

import ag.C0156a;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.content.C0955e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;

@Metadata(m14358d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a1\u0010\u0007\u001a\u0012\u0012\f\u0012\n \t*\u0004\u0018\u0001H\u0001H\u0001\u0018\u00010\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b\u001a\u0016\u0010\n\u001a\u00020\u000b*\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r\u001a\u0018\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\u00050\u0005*\u0006\u0012\u0002\b\u00030\rH\u0002\u001a\u0016\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r\u001a\u001a\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0002¨\u0006\u0012"}, m14357d2 = {"getIntentParcelable", "T", "Landroid/os/Parcelable;", "Landroid/content/Intent;", "parcelableKey", "", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "getIntentParcelableArrayList", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "hasExtra", "", "className", "Lkotlin/reflect/KClass;", "key", "putExtra", "putIntentParcelable", "actionIntent", "misc_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class IntentUtilsKt {
    public static final /* synthetic */ <T extends Parcelable> T getIntentParcelable(Intent intent, String parcelableKey) {
        C9612q.m13917h(intent, "<this>");
        C9612q.m13917h(parcelableKey, "parcelableKey");
        C9612q.m13912m(4, "T");
        return (T) C0955e.m38374b(intent, parcelableKey, Parcelable.class);
    }

    public static final /* synthetic */ <T extends Parcelable> ArrayList<T> getIntentParcelableArrayList(Intent intent, String parcelableKey) {
        C9612q.m13917h(intent, "<this>");
        C9612q.m13917h(parcelableKey, "parcelableKey");
        C9612q.m13912m(4, "T");
        return C0955e.m38375a(intent, parcelableKey, Parcelable.class);
    }

    public static final boolean hasExtra(Intent intent, KClass<?> className) {
        C9612q.m13917h(intent, "<this>");
        C9612q.m13917h(className, "className");
        return intent.hasExtra(key(className));
    }

    private static final String key(KClass<?> kClass) {
        return C0156a.m41055b(kClass).getName();
    }

    public static final Intent putExtra(Intent intent, KClass<?> className) {
        C9612q.m13917h(intent, "<this>");
        C9612q.m13917h(className, "className");
        Intent putExtra = intent.putExtra(key(className), true);
        C9612q.m13918g(putExtra, "putExtra(className.key(), true)");
        return putExtra;
    }

    public static final Intent putIntentParcelable(Intent intent, String parcelableKey, Parcelable actionIntent) {
        C9612q.m13917h(intent, "<this>");
        C9612q.m13917h(parcelableKey, "parcelableKey");
        C9612q.m13917h(actionIntent, "actionIntent");
        Intent putExtra = intent.putExtra(parcelableKey, actionIntent);
        C9612q.m13918g(putExtra, "putExtra(parcelableKey, actionIntent)");
        return putExtra;
    }
}

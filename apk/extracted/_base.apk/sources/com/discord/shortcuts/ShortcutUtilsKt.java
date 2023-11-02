package com.discord.shortcuts;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.content.C0958g;
import androidx.core.content.p017pm.C0965b;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9559v;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000D\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001aL\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016¨\u0006\u0017"}, m14357d2 = {"getShareCategories", "", "", "addShortcut", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "shortcutInfo", "Landroidx/core/content/pm/ShortcutInfoCompat;", "createShortcut", "id", "label", "", "longLabel", "icon", "Landroid/graphics/Bitmap;", "persons", "", "Landroidx/core/app/Person;", "intent", "Landroid/content/Intent;", "rank", "", "shortcuts_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class ShortcutUtilsKt {
    public static final NotificationCompat.Builder addShortcut(NotificationCompat.Builder builder, Context context, ShortcutInfoCompat shortcutInfo) {
        C9612q.m13917h(builder, "<this>");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(shortcutInfo, "shortcutInfo");
        builder.m39000W(shortcutInfo.m38355g());
        builder.m39008O(new C0958g(shortcutInfo.m38355g()));
        C0965b.m38321g(context, shortcutInfo);
        return builder;
    }

    public static final ShortcutInfoCompat createShortcut(Context context, String id2, CharSequence label, CharSequence longLabel, Bitmap bitmap, List<? extends Person> persons, Intent intent, int i) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(label, "label");
        C9612q.m13917h(longLabel, "longLabel");
        C9612q.m13917h(persons, "persons");
        C9612q.m13917h(intent, "intent");
        ShortcutInfoCompat m38343a = new ShortcutInfoCompat.C0962b(context, id2).m38336h(new C0958g(id2)).m38331m(label).m38335i(longLabel).m38339e(bitmap != null ? IconCompat.m38129i(bitmap) : null).m38338f(intent).m38332l(i).m38334j(true).m38341c(getShareCategories()).m38333k((Person[]) persons.toArray(new Person[0])).m38343a();
        C9612q.m13918g(m38343a, "Builder(this, id)\n      …Array())\n        .build()");
        return m38343a;
    }

    public static /* synthetic */ ShortcutInfoCompat createShortcut$default(Context context, String str, CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, List list, Intent intent, int i, int i2, Object obj) {
        return createShortcut(context, str, charSequence, charSequence2, bitmap, list, intent, (i2 & 64) != 0 ? 0 : i);
    }

    private static final Set<String> getShareCategories() {
        Set<String> m14002i;
        Set<String> m14008c;
        if (Build.VERSION.SDK_INT < 25) {
            m14008c = C9559v.m14008c(BuildConfig.SHARE_CATEGORY);
            return m14008c;
        }
        m14002i = C9560w.m14002i(BuildConfig.SHARE_CATEGORY, "android.shortcut.conversation");
        return m14002i;
    }
}

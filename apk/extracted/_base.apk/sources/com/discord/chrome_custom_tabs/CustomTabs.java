package com.discord.chrome_custom_tabs;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p204l.C9988a;
import p204l.C9990b;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jy\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0012\u001a\u0012\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/chrome_custom_tabs/CustomTabs;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "", "showTitle", "", "toolbarColor", "animShowEnterResId", "animShowExitResId", "animHideEnterResId", "animHideExitResId", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onFailure", "openUrlWithCustomTabs", "(Landroid/content/Context;Landroid/net/Uri;ZILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "chrome_custom_tabs_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class CustomTabs {
    public static final CustomTabs INSTANCE = new CustomTabs();

    private CustomTabs() {
    }

    public final void openUrlWithCustomTabs(Context context, Uri uri, boolean z, int i, Integer num, Integer num2, Integer num3, Integer num4, Function1<? super Exception, Unit> onFailure) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(uri, "uri");
        C9612q.m13917h(onFailure, "onFailure");
        if (CustomTabsPackages.INSTANCE.getCustomTabsDefaultPackage(context) != null) {
            C9988a m12676a = new C9988a.C9989a().m12675b(i).m12673d(i).m12674c(i).m12676a();
            C9612q.m13918g(m12676a, "Builder()\n              …\n                .build()");
            C9990b.C9991a m12667e = new C9990b.C9991a().m12670b(m12676a).m12667e(z);
            if (num != null && num2 != null) {
                m12667e.m12666f(context, num.intValue(), num2.intValue());
            }
            if (num3 != null && num4 != null) {
                m12667e.m12669c(context, num3.intValue(), num4.intValue());
            }
            C9990b m12671a = m12667e.m12671a();
            C9612q.m13918g(m12671a, "Builder()\n              …\n                .build()");
            try {
                m12671a.f25903a.setData(uri);
                m12671a.m12672a(context, uri);
                return;
            } catch (ActivityNotFoundException e) {
                onFailure.invoke(e);
                return;
            }
        }
        onFailure.invoke(new IllegalStateException("Unable to find custom tabs package."));
    }
}

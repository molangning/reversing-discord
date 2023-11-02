package com.swmansion.rnscreens;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m14357d2 = {"Lcom/swmansion/rnscreens/d;", "Landroidx/appcompat/widget/Toolbar;", "Lcom/swmansion/rnscreens/s;", "g0", "Lcom/swmansion/rnscreens/s;", "getConfig", "()Lcom/swmansion/rnscreens/s;", "config", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/swmansion/rnscreens/s;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5604d extends Toolbar {

    /* renamed from: g0 */
    private final C5649s f15615g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5604d(Context context, C5649s config) {
        super(context);
        C9612q.m13917h(context, "context");
        C9612q.m13917h(config, "config");
        this.f15615g0 = config;
    }

    public final C5649s getConfig() {
        return this.f15615g0;
    }
}
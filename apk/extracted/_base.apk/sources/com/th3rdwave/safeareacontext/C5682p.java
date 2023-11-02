package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, m14357d2 = {"Landroid/view/View;", "view", "Lcom/facebook/react/bridge/ReactContext;", "a", "Landroid/content/Context;", "context", "", "b", "react-native-safe-area-context_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5682p {
    /* renamed from: a */
    public static final ReactContext m24748a(View view) {
        C9612q.m13917h(view, "view");
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    /* renamed from: b */
    public static final int m24747b(Context context) {
        C9612q.m13917h(context, "context");
        return -1;
    }
}

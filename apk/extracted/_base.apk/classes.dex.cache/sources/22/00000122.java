package android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"Landroid/view/View;", "Landroidx/activity/k;", "onBackPressedDispatcherOwner", "", "a", "(Landroid/view/View;Landroidx/activity/k;)V", "activity_release"}, m14356k = 2, m14355mv = {1, 7, 1})
/* renamed from: androidx.activity.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class View {
    /* renamed from: a */
    public static final void m40810a(android.view.View view, InterfaceC0260k onBackPressedDispatcherOwner) {
        C9612q.m13917h(view, "<this>");
        C9612q.m13917h(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(C0261l.f788a, onBackPressedDispatcherOwner);
    }
}
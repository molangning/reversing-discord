package com.discord.chat.presentation.message.view.botuikit;

import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.bridge.botuikit.Component;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004¨\u0006\u0007"}, m14357d2 = {"replaceViews", "", "Landroid/view/ViewGroup;", "views", "", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/Component;", "chat_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageComponentsViewKt {
    public static final void replaceViews(ViewGroup viewGroup, List<? extends ComponentView<? extends Component>> views) {
        C9612q.m13917h(viewGroup, "<this>");
        C9612q.m13917h(views, "views");
        int i = 0;
        for (Object obj : views) {
            int i2 = i + 1;
            if (i < 0) {
                C9545j.m14094s();
            }
            ComponentView componentView = (ComponentView) obj;
            if (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) != componentView) {
                    viewGroup.removeViewAt(i);
                    C9612q.m13919f(componentView, "null cannot be cast to non-null type android.view.View");
                    viewGroup.addView((View) componentView, i);
                }
            } else {
                C9612q.m13919f(componentView, "null cannot be cast to non-null type android.view.View");
                viewGroup.addView((View) componentView, i);
            }
            i = i2;
        }
        if (views.size() < viewGroup.getChildCount()) {
            viewGroup.removeViews(views.size(), viewGroup.getChildCount() - views.size());
        }
    }
}
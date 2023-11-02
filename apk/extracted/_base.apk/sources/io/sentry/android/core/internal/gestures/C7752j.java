package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.C7981b;
import io.sentry.internal.gestures.InterfaceC7980a;
import io.sentry.util.C8229o;
import java.util.LinkedList;

/* renamed from: io.sentry.android.core.internal.gestures.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7752j {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C7981b m19794a(SentryAndroidOptions sentryAndroidOptions, View view, float f, float f2, C7981b.EnumC7982a enumC7982a) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        C7981b c7981b = null;
        while (linkedList.size() > 0) {
            View view2 = (View) C8229o.m18169c((View) linkedList.poll(), "view is required");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
            for (InterfaceC7980a interfaceC7980a : sentryAndroidOptions.getGestureTargetLocators()) {
                C7981b mo19107a = interfaceC7980a.mo19107a(view2, f, f2, enumC7982a);
                if (mo19107a != null) {
                    if (enumC7982a == C7981b.EnumC7982a.CLICKABLE) {
                        c7981b = mo19107a;
                    } else {
                        return mo19107a;
                    }
                }
            }
        }
        return c7981b;
    }

    /* renamed from: b */
    public static String m19793b(View view) {
        int id2 = view.getId();
        if (id2 != -1 && !m19792c(id2)) {
            Resources resources = view.getContext().getResources();
            if (resources != null) {
                return resources.getResourceEntryName(id2);
            }
            return "";
        }
        throw new Resources.NotFoundException();
    }

    /* renamed from: c */
    private static boolean m19792c(int i) {
        return ((-16777216) & i) == 0 && (i & 16777215) != 0;
    }
}

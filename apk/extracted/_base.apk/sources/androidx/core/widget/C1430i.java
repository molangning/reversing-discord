package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1430i {

    /* renamed from: androidx.core.widget.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1431a {
        /* renamed from: a */
        static boolean m36890a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        static void m36889b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static boolean m36892a(ListView listView, int i) {
        return C1431a.m36890a(listView, i);
    }

    /* renamed from: b */
    public static void m36891b(ListView listView, int i) {
        C1431a.m36889b(listView, i);
    }
}

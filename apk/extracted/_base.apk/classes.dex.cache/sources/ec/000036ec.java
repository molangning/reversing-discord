package p150i5;

import java.util.Iterator;

/* renamed from: i5.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final /* synthetic */ class C7388c {
    /* renamed from: a */
    public static /* synthetic */ String m20796a(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append(charSequence);
                }
            }
            return sb2.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
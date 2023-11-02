package p446yd;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0005"}, m14357d2 = {"T", "", "elements", "", "a", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14002n {
    /* renamed from: a */
    public static final <T> boolean m937a(List<? extends T> list, List<? extends T> elements) {
        C9612q.m13917h(list, "<this>");
        C9612q.m13917h(elements, "elements");
        if ((elements instanceof Collection) && elements.isEmpty()) {
            return false;
        }
        for (T t : elements) {
            if (list.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
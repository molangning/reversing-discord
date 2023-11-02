package p446yd;

import android.util.Size;
import android.util.SizeF;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0015\u0010\u0007\u001a\u00020\u0004*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0004*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m14357d2 = {"", "Landroid/util/Size;", "size", "a", "", "c", "(Landroid/util/Size;)I", "bigger", "d", "smaller", "Landroid/util/SizeF;", "", "b", "(Landroid/util/SizeF;)F", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14006q {
    /* renamed from: a */
    public static final Size m933a(List<Size> list, Size size) {
        C9612q.m13917h(list, "<this>");
        if (size != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    Size size2 = (Size) next;
                    int abs = Math.abs(size2.getWidth() - size.getWidth()) + Math.abs(size2.getHeight() - size.getHeight());
                    do {
                        Object next2 = it.next();
                        Size size3 = (Size) next2;
                        int abs2 = Math.abs(size3.getWidth() - size.getWidth()) + Math.abs(size3.getHeight() - size.getHeight());
                        if (abs > abs2) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it.hasNext());
                    return (Size) next;
                }
                return (Size) next;
            }
            throw new NoSuchElementException();
        }
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            Object next3 = it2.next();
            if (it2.hasNext()) {
                Size size4 = (Size) next3;
                int width = size4.getWidth() * size4.getHeight();
                do {
                    Object next4 = it2.next();
                    Size size5 = (Size) next4;
                    int width2 = size5.getWidth() * size5.getHeight();
                    if (width < width2) {
                        next3 = next4;
                        width = width2;
                    }
                } while (it2.hasNext());
                return (Size) next3;
            }
            return (Size) next3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public static final float m932b(SizeF sizeF) {
        C9612q.m13917h(sizeF, "<this>");
        return Math.max(sizeF.getWidth(), sizeF.getHeight());
    }

    /* renamed from: c */
    public static final int m931c(Size size) {
        C9612q.m13917h(size, "<this>");
        return Math.max(size.getWidth(), size.getHeight());
    }

    /* renamed from: d */
    public static final int m930d(Size size) {
        C9612q.m13917h(size, "<this>");
        return Math.min(size.getWidth(), size.getHeight());
    }
}
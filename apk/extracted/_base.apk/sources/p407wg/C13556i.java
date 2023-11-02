package p407wg;

import ag.C0156a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import ph.C11633c;

/* renamed from: wg.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13556i {
    /* renamed from: a */
    public static final C13551e m2227a(Annotation[] annotationArr, C11633c fqName) {
        Annotation annotation;
        C9612q.m13917h(annotationArr, "<this>");
        C9612q.m13917h(fqName, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                annotation = annotationArr[i];
                if (C9612q.m13922c(C13548d.m2246a(C0156a.m41055b(C0156a.m41056a(annotation))).m7471b(), fqName)) {
                    break;
                }
                i++;
            } else {
                annotation = null;
                break;
            }
        }
        if (annotation == null) {
            return null;
        }
        return new C13551e(annotation);
    }

    /* renamed from: b */
    public static final List<C13551e> m2226b(Annotation[] annotationArr) {
        C9612q.m13917h(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C13551e(annotation));
        }
        return arrayList;
    }
}

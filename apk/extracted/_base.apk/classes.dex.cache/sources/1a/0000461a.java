package p270oh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import p250nh.C10890a;

/* renamed from: oh.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11121h {
    /* renamed from: a */
    public static final List<C10890a.C10901e.C10904c> m9134a(List<C10890a.C10901e.C10904c> list) {
        C9612q.m13917h(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (C10890a.C10901e.C10904c c10904c : list) {
            int m9615G = c10904c.m9615G();
            for (int i = 0; i < m9615G; i++) {
                arrayList.add(c10904c);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
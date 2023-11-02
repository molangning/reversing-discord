package p164j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p164j$.util.function.Function;

/* renamed from: j$.util.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8380b implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f22457a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f22458b;

    /* renamed from: c */
    public final /* synthetic */ Object f22459c;

    public /* synthetic */ C8380b(Comparator comparator, Object obj, int i) {
        this.f22457a = i;
        this.f22458b = comparator;
        this.f22459c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f22457a;
        Comparator comparator = this.f22458b;
        Object obj3 = this.f22459c;
        switch (i) {
            case 0:
                Comparator comparator2 = (Comparator) obj3;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
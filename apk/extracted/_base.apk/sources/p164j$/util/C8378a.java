package p164j$.util;

import java.io.Serializable;
import java.util.Comparator;
import p164j$.util.function.Function;
import p164j$.util.function.ToDoubleFunction;
import p164j$.util.function.ToIntFunction;
import p164j$.util.function.ToLongFunction;

/* renamed from: j$.util.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8378a implements Comparator, Serializable {

    /* renamed from: a */
    public final /* synthetic */ int f22450a;

    /* renamed from: b */
    public final /* synthetic */ Object f22451b;

    public /* synthetic */ C8378a(int i, Object obj) {
        this.f22450a = i;
        this.f22451b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f22450a;
        Object obj3 = this.f22451b;
        switch (i) {
            case 0:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) obj3;
                return Double.compare(toDoubleFunction.applyAsDouble(obj), toDoubleFunction.applyAsDouble(obj2));
            case 1:
                ToIntFunction toIntFunction = (ToIntFunction) obj3;
                return Integer.compare(toIntFunction.applyAsInt(obj), toIntFunction.applyAsInt(obj2));
            case 2:
                ToLongFunction toLongFunction = (ToLongFunction) obj3;
                return Long.compare(toLongFunction.applyAsLong(obj), toLongFunction.applyAsLong(obj2));
            default:
                Function function = (Function) obj3;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
        }
    }
}

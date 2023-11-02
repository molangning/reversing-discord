package kg;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kg.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C9325o implements Comparator {

    /* renamed from: j */
    private final Function2 f24425j;

    public C9325o(Function2 function2) {
        this.f24425j = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int m15869x;
        m15869x = AbstractC9327p.m15869x(this.f24425j, obj, obj2);
        return m15869x;
    }
}

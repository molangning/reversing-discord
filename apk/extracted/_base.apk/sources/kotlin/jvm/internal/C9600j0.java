package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9600j0 {

    /* renamed from: a */
    private final ArrayList<Object> f25349a;

    public C9600j0(int i) {
        this.f25349a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void m13945a(Object obj) {
        this.f25349a.add(obj);
    }

    /* renamed from: b */
    public void m13944b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f25349a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f25349a, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f25349a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f25349a.add(obj2);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.f25349a.add(it.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* renamed from: c */
    public int m13943c() {
        return this.f25349a.size();
    }

    /* renamed from: d */
    public Object[] m13942d(Object[] objArr) {
        return this.f25349a.toArray(objArr);
    }
}

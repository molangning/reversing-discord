package p218lg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lg.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C10147b implements InvocationHandler {

    /* renamed from: a */
    private final Class f26462a;

    /* renamed from: b */
    private final Map f26463b;

    /* renamed from: c */
    private final Lazy f26464c;

    /* renamed from: d */
    private final Lazy f26465d;

    /* renamed from: e */
    private final List f26466e;

    public C10147b(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f26462a = cls;
        this.f26463b = map;
        this.f26464c = lazy;
        this.f26465d = lazy2;
        this.f26466e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object m12164i;
        m12164i = C10148c.m12164i(this.f26462a, this.f26463b, this.f26464c, this.f26465d, this.f26466e, obj, method, objArr);
        return m12164i;
    }
}

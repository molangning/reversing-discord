package p271oi;

import kotlin.jvm.internal.C9612q;
import kotlin.properties.InterfaceC9625d;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import p271oi.AbstractC11124a;

/* renamed from: oi.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11151n<K, V, T extends V> extends AbstractC11124a.AbstractC11125a<K, V, T> implements InterfaceC9625d<AbstractC11124a<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11151n(KClass<? extends K> key, int i) {
        super(key, i);
        C9612q.m13917h(key, "key");
    }

    @Override // kotlin.properties.InterfaceC9625d
    /* renamed from: b */
    public T getValue(AbstractC11124a<K, V> thisRef, KProperty<?> property) {
        C9612q.m13917h(thisRef, "thisRef");
        C9612q.m13917h(property, "property");
        return m9118a(thisRef);
    }
}

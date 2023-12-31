package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0007\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m14357d2 = {"Lkotlin/properties/b;", "", "T", "Lkotlin/properties/ReadWriteProperty;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.properties.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C9623b<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a */
    private T f25359a;

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.InterfaceC9625d
    public T getValue(Object obj, KProperty<?> property) {
        C9612q.m13917h(property, "property");
        T t = this.f25359a;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj, KProperty<?> property, T value) {
        C9612q.m13917h(property, "property");
        C9612q.m13917h(value, "value");
        this.f25359a = value;
    }
}

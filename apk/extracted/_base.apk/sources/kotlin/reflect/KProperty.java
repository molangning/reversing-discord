package kotlin.reflect;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0007\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m14357d2 = {"Lkotlin/reflect/KProperty;", "V", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/KProperty$b;", "f", "()Lkotlin/reflect/KProperty$b;", "getter", "a", "b", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface KProperty<V> extends KCallable<V> {

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m14357d2 = {"Lkotlin/reflect/KProperty$a;", "V", "", "Lkotlin/reflect/KProperty;", "e", "()Lkotlin/reflect/KProperty;", "property", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.KProperty$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9629a<V> {
        /* renamed from: e */
        KProperty<V> mo13881e();
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m14357d2 = {"Lkotlin/reflect/KProperty$b;", "V", "Lkotlin/reflect/KProperty$a;", "Lkotlin/reflect/KFunction;", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.KProperty$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9630b<V> extends InterfaceC9629a<V>, KFunction<V> {
    }

    /* renamed from: f */
    InterfaceC9630b<V> mo13882f();
}

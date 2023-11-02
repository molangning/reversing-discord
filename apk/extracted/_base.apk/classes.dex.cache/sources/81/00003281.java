package p088ej;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import p470zi.InterfaceC14279h;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H'J9\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00028\u0000H'¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH'J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H'\u0082\u0001\u0001\u0018¨\u0006\u0019"}, m14357d2 = {"Lej/c;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "b", "baseClass", "value", "Lzi/h;", "e", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lzi/h;", "", "serializedClassName", "Lkotlinx/serialization/DeserializationStrategy;", "d", "Lej/e;", "collector", "", "a", "<init>", "()V", "Lej/b;", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ej.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC6257c {
    private AbstractC6257c() {
    }

    public /* synthetic */ AbstractC6257c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static /* synthetic */ KSerializer m23143c(AbstractC6257c abstractC6257c, KClass kClass, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                list = C9545j.m14104i();
            }
            return abstractC6257c.mo23144b(kClass, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    /* renamed from: a */
    public abstract void mo23145a(InterfaceC6259e interfaceC6259e);

    /* renamed from: b */
    public abstract <T> KSerializer<T> mo23144b(KClass<T> kClass, List<? extends KSerializer<?>> list);

    /* renamed from: d */
    public abstract <T> DeserializationStrategy<T> mo23142d(KClass<? super T> kClass, String str);

    /* renamed from: e */
    public abstract <T> InterfaceC14279h<T> mo23141e(KClass<? super T> kClass, T t);
}
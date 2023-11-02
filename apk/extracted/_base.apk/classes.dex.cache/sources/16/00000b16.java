package p045cj;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, m14357d2 = {"Lcj/f0;", "T", "Lkotlinx/serialization/KSerializer;", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "typeParametersSerializers", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC2582f0<T> extends KSerializer<T> {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: cj.f0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C2583a {
        /* renamed from: a */
        public static <T> KSerializer<?>[] m32915a(InterfaceC2582f0<T> interfaceC2582f0) {
            return C2628p1.f7106a;
        }
    }

    KSerializer<?>[] childSerializers();

    KSerializer<?>[] typeParametersSerializers();
}
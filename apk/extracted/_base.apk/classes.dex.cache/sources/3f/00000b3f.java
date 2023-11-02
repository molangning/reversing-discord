package p045cj;

import ag.C0156a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import p140hg.C7142j;
import p140hg.InterfaceC7130c;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m14357d2 = {"Lcj/o0;", "Lkotlin/reflect/KType;", "", "other", "", "equals", "", "hashCode", "", "toString", "j", "Lkotlin/reflect/KType;", "origin", "", "Lhg/j;", "k", "()Ljava/util/List;", "arguments", "Lhg/c;", "()Lhg/c;", "classifier", "b", "()Z", "isMarkedNullable", "<init>", "(Lkotlin/reflect/KType;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2623o0 implements KType {

    /* renamed from: j */
    private final KType f7099j;

    public C2623o0(KType origin) {
        C9612q.m13917h(origin, "origin");
        this.f7099j = origin;
    }

    @Override // kotlin.reflect.KType
    /* renamed from: b */
    public boolean mo13880b() {
        return this.f7099j.mo13880b();
    }

    public boolean equals(Object obj) {
        KType kType;
        if (obj == null || !C9612q.m13922c(this.f7099j, obj)) {
            return false;
        }
        InterfaceC7130c mo13879j = mo13879j();
        if (mo13879j instanceof KClass) {
            InterfaceC7130c interfaceC7130c = null;
            if (obj instanceof KType) {
                kType = (KType) obj;
            } else {
                kType = null;
            }
            if (kType != null) {
                interfaceC7130c = kType.mo13879j();
            }
            if (interfaceC7130c != null && (interfaceC7130c instanceof KClass)) {
                return C9612q.m13922c(C0156a.m41055b((KClass) mo13879j), C0156a.m41055b((KClass) interfaceC7130c));
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f7099j.hashCode();
    }

    @Override // kotlin.reflect.KType
    /* renamed from: j */
    public InterfaceC7130c mo13879j() {
        return this.f7099j.mo13879j();
    }

    @Override // kotlin.reflect.KType
    /* renamed from: k */
    public List<C7142j> mo13878k() {
        return this.f7099j.mo13878k();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f7099j;
    }
}
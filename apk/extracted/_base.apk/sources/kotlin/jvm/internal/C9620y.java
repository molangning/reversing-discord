package kotlin.jvm.internal;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"Lkotlin/jvm/internal/y;", "Lkotlin/jvm/internal/g;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/Class;", "j", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "jClass", "k", "Ljava/lang/String;", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kotlin.jvm.internal.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9620y implements InterfaceC9592g {

    /* renamed from: j */
    private final Class<?> f25356j;

    /* renamed from: k */
    private final String f25357k;

    public C9620y(Class<?> jClass, String moduleName) {
        C9612q.m13917h(jClass, "jClass");
        C9612q.m13917h(moduleName, "moduleName");
        this.f25356j = jClass;
        this.f25357k = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC9592g
    /* renamed from: e */
    public Class<?> mo13896e() {
        return this.f25356j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9620y) && C9612q.m13922c(mo13896e(), ((C9620y) obj).mo13896e());
    }

    public int hashCode() {
        return mo13896e().hashCode();
    }

    public String toString() {
        return mo13896e().toString() + " (Kotlin reflection is not available)";
    }
}

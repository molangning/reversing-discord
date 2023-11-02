package p140hg;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m14357d2 = {"Lhg/l;", "Ljava/lang/reflect/ParameterizedType;", "", "Ljava/lang/reflect/Type;", "getRawType", "getOwnerType", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "Ljava/lang/Class;", "j", "Ljava/lang/Class;", "rawType", "k", "Ljava/lang/reflect/Type;", "ownerType", "l", "[Ljava/lang/reflect/Type;", "typeArguments", "", "<init>", "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: hg.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7146l implements ParameterizedType, Type {

    /* renamed from: j */
    private final Class<?> f19503j;

    /* renamed from: k */
    private final Type f19504k;

    /* renamed from: l */
    private final Type[] f19505l;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: hg.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C7147a extends C9609n implements Function1<Type, String> {

        /* renamed from: j */
        public static final C7147a f19506j = new C7147a();

        C7147a() {
            super(1, C7149n.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final String invoke(Type p0) {
            String m21368h;
            C9612q.m13917h(p0, "p0");
            m21368h = C7149n.m21368h(p0);
            return m21368h;
        }
    }

    public C7146l(Class<?> rawType, Type type, List<? extends Type> typeArguments) {
        C9612q.m13917h(rawType, "rawType");
        C9612q.m13917h(typeArguments, "typeArguments");
        this.f19503j = rawType;
        this.f19504k = type;
        this.f19505l = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (C9612q.m13922c(this.f19503j, parameterizedType.getRawType()) && C9612q.m13922c(this.f19504k, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f19505l;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f19504k;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f19503j;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String m21368h;
        boolean z;
        String m21368h2;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f19504k;
        if (type != null) {
            m21368h2 = C7149n.m21368h(type);
            sb2.append(m21368h2);
            sb2.append("$");
            sb2.append(this.f19503j.getSimpleName());
        } else {
            m21368h = C7149n.m21368h(this.f19503j);
            sb2.append(m21368h);
        }
        Type[] typeArr = this.f19505l;
        if (typeArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C9538f.m14225U(typeArr, sb2, null, "<", ">", 0, null, C7147a.f19506j, 50, null);
        }
        String sb3 = sb2.toString();
        C9612q.m13918g(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public int hashCode() {
        int hashCode = this.f19503j.hashCode();
        Type type = this.f19504k;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}

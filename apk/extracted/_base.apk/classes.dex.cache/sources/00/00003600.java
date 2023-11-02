package p140hg;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0018B\u001b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0019"}, m14357d2 = {"Lhg/o;", "Ljava/lang/reflect/WildcardType;", "", "", "Ljava/lang/reflect/Type;", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "j", "Ljava/lang/reflect/Type;", "upperBound", "k", "lowerBound", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V", "l", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: hg.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7152o implements WildcardType, Type {

    /* renamed from: l */
    public static final C7153a f19510l = new C7153a(null);

    /* renamed from: m */
    private static final C7152o f19511m = new C7152o(null, null);

    /* renamed from: j */
    private final Type f19512j;

    /* renamed from: k */
    private final Type f19513k;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m14357d2 = {"Lhg/o$a;", "", "Lhg/o;", "STAR", "Lhg/o;", "a", "()Lhg/o;", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: hg.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7153a {
        private C7153a() {
        }

        public /* synthetic */ C7153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7152o m21365a() {
            return C7152o.f19511m;
        }
    }

    public C7152o(Type type, Type type2) {
        this.f19512j = type;
        this.f19513k = type2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getLowerBounds() {
        Type type = this.f19513k;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        String m21368h;
        String m21368h2;
        if (this.f19513k != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? super ");
            m21368h2 = C7149n.m21368h(this.f19513k);
            sb2.append(m21368h2);
            return sb2.toString();
        }
        Type type = this.f19512j;
        if (type != null && !C9612q.m13922c(type, Object.class)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("? extends ");
            m21368h = C7149n.m21368h(this.f19512j);
            sb3.append(m21368h);
            return sb3.toString();
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f19512j;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public String toString() {
        return getTypeName();
    }
}
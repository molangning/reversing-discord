package p140hg;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KType;
import pf.C11582r;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m14357d2 = {"Lhg/m;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "", "", "getName", "getGenericDeclaration", "", "Ljava/lang/reflect/Type;", "getBounds", "()[Ljava/lang/reflect/Type;", "getTypeName", "other", "", "equals", "", "hashCode", "toString", "Lhg/i;", "j", "Lhg/i;", "typeParameter", "<init>", "(Lhg/i;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: hg.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7148m implements TypeVariable<GenericDeclaration>, Type {

    /* renamed from: j */
    private final InterfaceC7141i f19507j;

    public C7148m(InterfaceC7141i typeParameter) {
        C9612q.m13917h(typeParameter, "typeParameter");
        this.f19507j = typeParameter;
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            if (C9612q.m13922c(getName(), typeVariable.getName()) && C9612q.m13922c(getGenericDeclaration(), typeVariable.getGenericDeclaration())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public Type[] getBounds() {
        int m14093t;
        Type m21373c;
        List<KType> upperBounds = this.f19507j.getUpperBounds();
        m14093t = C9546k.m14093t(upperBounds, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (KType kType : upperBounds) {
            m21373c = C7149n.m21373c(kType, true);
            arrayList.add(m21373c);
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public GenericDeclaration getGenericDeclaration() {
        throw new C11582r("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f19507j));
    }

    @Override // java.lang.reflect.TypeVariable
    public String getName() {
        return this.f19507j.getName();
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
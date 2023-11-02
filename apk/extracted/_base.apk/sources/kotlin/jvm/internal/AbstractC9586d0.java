package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* renamed from: kotlin.jvm.internal.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9586d0 extends AbstractC9587e implements KProperty {
    public AbstractC9586d0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC9587e
    /* renamed from: e */
    public KProperty getReflected() {
        return (KProperty) super.getReflected();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9586d0) {
            AbstractC9586d0 abstractC9586d0 = (AbstractC9586d0) obj;
            if (getOwner().equals(abstractC9586d0.getOwner()) && getName().equals(abstractC9586d0.getName()) && getSignature().equals(abstractC9586d0.getSignature()) && C9612q.m13922c(getBoundReceiver(), abstractC9586d0.getBoundReceiver())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof KProperty)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC9586d0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }
}

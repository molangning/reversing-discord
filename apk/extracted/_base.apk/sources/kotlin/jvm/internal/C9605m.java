package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* renamed from: kotlin.jvm.internal.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9605m extends AbstractC9587e implements InterfaceC9603l, KFunction {
    private final int arity;
    private final int flags;

    public C9605m(int i) {
        this(i, AbstractC9587e.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC9587e
    protected KCallable computeReflected() {
        return C9591f0.m13970a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9605m) {
            C9605m c9605m = (C9605m) obj;
            if (getName().equals(c9605m.getName()) && getSignature().equals(c9605m.getSignature()) && this.flags == c9605m.flags && this.arity == c9605m.arity && C9612q.m13922c(getBoundReceiver(), c9605m.getBoundReceiver()) && C9612q.m13922c(getOwner(), c9605m.getOwner())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof KFunction)) {
            return false;
        } else {
            return obj.equals(compute());
        }
    }

    @Override // kotlin.jvm.internal.InterfaceC9603l
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC9587e, kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C9605m(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC9587e
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    public C9605m(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}

package kotlin.jvm.internal;

import ag.C0157b;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.reflect.KCallable;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import p140hg.InterfaceC7135f;
import p140hg.InterfaceC7141i;

/* renamed from: kotlin.jvm.internal.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC9587e implements KCallable, Serializable {
    public static final Object NO_RECEIVER = C9588a.f25334j;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient KCallable reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C9588a implements Serializable {

        /* renamed from: j */
        private static final C9588a f25334j = new C9588a();

        private C9588a() {
        }
    }

    public AbstractC9587e() {
        this(NO_RECEIVER);
    }

    @Override // kotlin.reflect.KCallable
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.KCallable
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public KCallable compute() {
        KCallable kCallable = this.reflected;
        if (kCallable == null) {
            KCallable computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return kCallable;
    }

    protected abstract KCallable computeReflected();

    @Override // p140hg.InterfaceC7129b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        return this.name;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return C9591f0.m13968c(cls);
        }
        return C9591f0.m13969b(cls);
    }

    @Override // kotlin.reflect.KCallable
    public List<InterfaceC7135f> getParameters() {
        return getReflected().getParameters();
    }

    public KCallable getReflected() {
        KCallable compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C0157b();
    }

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.KCallable
    public List<InterfaceC7141i> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.KCallable
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    protected AbstractC9587e(Object obj) {
        this(obj, null, null, null, false);
    }

    public AbstractC9587e(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
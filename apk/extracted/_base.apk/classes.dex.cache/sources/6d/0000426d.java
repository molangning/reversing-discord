package p218lg;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"Llg/k;", "Llg/e;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "c", "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: lg.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10187k implements InterfaceC10153e {

    /* renamed from: a */
    public static final C10187k f26494a = new C10187k();

    private C10187k() {
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: a */
    public List<Type> mo12139a() {
        List<Type> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p218lg.InterfaceC10153e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo12138b() {
        return (Member) m12137c();
    }

    /* renamed from: c */
    public Void m12137c() {
        return null;
    }

    @Override // p218lg.InterfaceC10153e
    public Object call(Object[] args) {
        C9612q.m13917h(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // p218lg.InterfaceC10153e
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        C9612q.m13918g(TYPE, "TYPE");
        return TYPE;
    }
}
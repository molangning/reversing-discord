package p218lg;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b`\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0003J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m14357d2 = {"Llg/e;", "Ljava/lang/reflect/Member;", "M", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "checkArguments", "([Ljava/lang/Object;)V", "b", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "a", "()Ljava/util/List;", "parameterTypes", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: lg.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC10153e<M extends Member> {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: lg.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C10154a {
        /* renamed from: a */
        public static <M extends Member> void m12160a(InterfaceC10153e<? extends M> interfaceC10153e, Object[] args) {
            C9612q.m13917h(args, "args");
            if (C10180g.m12155a(interfaceC10153e) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + C10180g.m12155a(interfaceC10153e) + " arguments, but " + args.length + " were provided.");
        }
    }

    /* renamed from: a */
    List<Type> mo12139a();

    /* renamed from: b */
    M mo12138b();

    Object call(Object[] objArr);

    Type getReturnType();
}
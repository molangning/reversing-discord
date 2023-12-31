package kotlin.reflect;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p140hg.InterfaceC7129b;
import p140hg.InterfaceC7135f;
import p140hg.InterfaceC7141i;

@Metadata(m14358d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J'\u0010\u0006\u001a\u00028\u00002\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00028\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH&¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8&X§\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0010\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0010\u001a\u0004\b'\u0010%R\u001a\u0010)\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0010\u001a\u0004\b)\u0010%R\u001a\u0010+\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0010\u001a\u0004\b+\u0010%¨\u0006-"}, m14357d2 = {"Lkotlin/reflect/KCallable;", "R", "Lhg/b;", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lhg/f;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", ZeroconfModule.KEY_SERVICE_NAME, "", "getParameters", "()Ljava/util/List;", "parameters", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lhg/i;", "getTypeParameters", "getTypeParameters$annotations", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSuspend", "isSuspend$annotations", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface KCallable<R> extends InterfaceC7129b {
    R call(Object... objArr);

    R callBy(Map<InterfaceC7135f, ? extends Object> map);

    String getName();

    List<InterfaceC7135f> getParameters();

    KType getReturnType();

    List<InterfaceC7141i> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
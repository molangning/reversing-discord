package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0001\" \u0010\t\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0004\u0010\u0006\" \u0010\f\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006*\n\u0010\u000e\"\u00020\r2\u00020\r*\u001c\u0010\u0010\u001a\u0004\b\u0000\u0010\u000f\"\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u0000*\f\b\u0002\u0010\u0011\"\u00020\u00012\u00020\u0001*\n\u0010\u0013\"\u00020\u00122\u00020\u0012*\u001c\u0010\u0015\u001a\u0004\b\u0000\u0010\u000f\"\b\u0012\u0004\u0012\u00028\u00000\u00142\b\u0012\u0004\u0012\u00028\u00000\u0014¨\u0006\u0016"}, m14357d2 = {"", "Lkotlinx/coroutines/internal/p;", "Lkotlinx/coroutines/internal/Node;", "c", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "getCONDITION_FALSE$annotations", "()V", "CONDITION_FALSE", "b", "getLIST_EMPTY$annotations", "LIST_EMPTY", "Lkotlinx/coroutines/internal/p$a;", "AbstractAtomicDesc", "T", "AddLastDesc", "Node", "Lkotlinx/coroutines/internal/p$c;", "PrepareOp", "Lkotlinx/coroutines/internal/p$d;", "RemoveFirstDesc", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9790o {

    /* renamed from: a */
    private static final Object f25603a = new C9768d0("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f25604b = new C9768d0("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m13263a() {
        return f25603a;
    }

    /* renamed from: b */
    public static final Object m13262b() {
        return f25604b;
    }

    /* renamed from: c */
    public static final C9791p m13261c(Object obj) {
        C9791p c9791p;
        C9809z c9809z = obj instanceof C9809z ? (C9809z) obj : null;
        return (c9809z == null || (c9791p = c9809z.f25636a) == null) ? (C9791p) obj : c9791p;
    }
}
package p029b9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p461z8.AbstractC14127g;
import p461z8.C14131j;
import p461z8.InterfaceC14132k;

/* renamed from: b9.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2194o {

    /* renamed from: a */
    private static final InterfaceC2192n0 f6183a = new C2179j0();

    /* renamed from: b9.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC2195a<R extends InterfaceC14132k, T> {
        /* renamed from: a */
        T mo28256a(R r);
    }

    /* renamed from: a */
    public static <R extends InterfaceC14132k, T extends C14131j<R>> Task<T> m34000a(AbstractC14127g<R> abstractC14127g, T t) {
        return m33999b(abstractC14127g, new C2185l0(t));
    }

    /* renamed from: b */
    public static <R extends InterfaceC14132k, T> Task<T> m33999b(AbstractC14127g<R> abstractC14127g, InterfaceC2195a<R, T> interfaceC2195a) {
        InterfaceC2192n0 interfaceC2192n0 = f6183a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        abstractC14127g.addStatusListener(new C2182k0(abstractC14127g, taskCompletionSource, interfaceC2195a, interfaceC2192n0));
        return taskCompletionSource.m28013a();
    }

    /* renamed from: c */
    public static <R extends InterfaceC14132k> Task<Void> m33998c(AbstractC14127g<R> abstractC14127g) {
        return m33999b(abstractC14127g, new C2188m0());
    }
}
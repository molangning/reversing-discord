package p120gc;

import android.content.Context;
import p247nb.C10533d;
import p247nb.C10558q;
import p247nb.InterfaceC10538e;
import p247nb.InterfaceC10544h;

/* renamed from: gc.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6725h {

    /* renamed from: gc.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC6726a<T> {
        /* renamed from: a */
        String mo12273a(T t);
    }

    /* renamed from: b */
    public static C10533d<?> m22031b(String str, String str2) {
        return C10533d.m11302i(AbstractC6723f.m22035a(str, str2), AbstractC6723f.class);
    }

    /* renamed from: c */
    public static C10533d<?> m22030c(final String str, final InterfaceC6726a<Context> interfaceC6726a) {
        return C10533d.m11301j(AbstractC6723f.class).m11293b(C10558q.m11234i(Context.class)).m11290e(new InterfaceC10544h() { // from class: gc.g
            @Override // p247nb.InterfaceC10544h
            /* renamed from: a */
            public final Object mo1055a(InterfaceC10538e interfaceC10538e) {
                AbstractC6723f m22029d;
                m22029d = C6725h.m22029d(str, interfaceC6726a, interfaceC10538e);
                return m22029d;
            }
        }).m11291d();
    }

    /* renamed from: d */
    public static /* synthetic */ AbstractC6723f m22029d(String str, InterfaceC6726a interfaceC6726a, InterfaceC10538e interfaceC10538e) {
        return AbstractC6723f.m22035a(str, interfaceC6726a.mo12273a((Context) interfaceC10538e.mo11278a(Context.class)));
    }
}
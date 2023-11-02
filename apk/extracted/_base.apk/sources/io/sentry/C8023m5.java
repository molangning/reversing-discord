package io.sentry;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: io.sentry.m5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8023m5 implements InterfaceC8040o0 {
    /* renamed from: e */
    private String m18984e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: a */
    public void mo18137a(EnumC8021m4 enumC8021m4, Throwable th2, String str, Object... objArr) {
        if (th2 == null) {
            mo18135c(enumC8021m4, str, objArr);
        } else {
            System.out.println(String.format("%s: %s \n %s\n%s", enumC8021m4, String.format(str, objArr), th2.toString(), m18984e(th2)));
        }
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: b */
    public void mo18136b(EnumC8021m4 enumC8021m4, String str, Throwable th2) {
        if (th2 == null) {
            mo18135c(enumC8021m4, str, new Object[0]);
        } else {
            System.out.println(String.format("%s: %s\n%s", enumC8021m4, String.format(str, th2.toString()), m18984e(th2)));
        }
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: c */
    public void mo18135c(EnumC8021m4 enumC8021m4, String str, Object... objArr) {
        System.out.println(String.format("%s: %s", enumC8021m4, String.format(str, objArr)));
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: d */
    public boolean mo18134d(EnumC8021m4 enumC8021m4) {
        return true;
    }
}

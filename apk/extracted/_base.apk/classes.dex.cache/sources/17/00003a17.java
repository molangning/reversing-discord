package io.sentry;

import io.sentry.protocol.C8108u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.sentry.t4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8166t4 {

    /* renamed from: a */
    private final C8132r4 f22088a;

    public C8166t4(C8132r4 c8132r4) {
        this.f22088a = c8132r4;
    }

    /* renamed from: a */
    public List<C8108u> m18352a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                        C8108u c8108u = new C8108u();
                        c8108u.m18538t(m18351b(className));
                        c8108u.m18535w(className);
                        c8108u.m18539s(stackTraceElement.getMethodName());
                        c8108u.m18540r(stackTraceElement.getFileName());
                        if (stackTraceElement.getLineNumber() >= 0) {
                            c8108u.m18537u(Integer.valueOf(stackTraceElement.getLineNumber()));
                        }
                        c8108u.m18534x(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                        arrayList.add(c8108u);
                    }
                }
            }
            Collections.reverse(arrayList);
            return arrayList;
        }
        return null;
    }

    /* renamed from: b */
    public Boolean m18351b(String str) {
        if (str != null && !str.isEmpty()) {
            for (String str2 : this.f22088a.getInAppIncludes()) {
                if (str.startsWith(str2)) {
                    return Boolean.TRUE;
                }
            }
            for (String str3 : this.f22088a.getInAppExcludes()) {
                if (str.startsWith(str3)) {
                    return Boolean.FALSE;
                }
            }
            return null;
        }
        return Boolean.TRUE;
    }
}
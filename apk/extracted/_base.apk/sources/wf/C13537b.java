package wf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p427xf.C13796a;
import p447yf.C14017a;

@Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, m14357d2 = {"Lwf/a;", "a", "Lwf/a;", "IMPLEMENTATIONS", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: wf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13537b {

    /* renamed from: a */
    public static final C13535a f34906a;

    static {
        C13535a c13535a;
        Object newInstance;
        try {
            newInstance = C14017a.class.newInstance();
            C9612q.m13918g(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                } catch (ClassCastException e) {
                    ClassLoader classLoader = newInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = C13535a.class.getClassLoader();
                    if (!C9612q.m13922c(classLoader, classLoader2)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                    }
                    throw e;
                }
            } catch (ClassNotFoundException unused) {
                Object newInstance2 = C13796a.class.newInstance();
                C9612q.m13918g(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        if (newInstance2 != null) {
                            c13535a = (C13535a) newInstance2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                    } catch (ClassNotFoundException unused2) {
                        c13535a = new C13535a();
                    }
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = C13535a.class.getClassLoader();
                    if (!C9612q.m13922c(classLoader3, classLoader4)) {
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                    }
                    throw e2;
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            C9612q.m13918g(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    if (newInstance3 != null) {
                        c13535a = (C13535a) newInstance3;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C9612q.m13918g(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 != null) {
                            c13535a = (C13535a) newInstance4;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C13535a.class.getClassLoader();
                        if (!C9612q.m13922c(classLoader5, classLoader6)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                        }
                        throw e3;
                    }
                }
            } catch (ClassCastException e4) {
                ClassLoader classLoader7 = newInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = C13535a.class.getClassLoader();
                if (!C9612q.m13922c(classLoader7, classLoader8)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                }
                throw e4;
            }
        }
        if (newInstance != null) {
            c13535a = (C13535a) newInstance;
            f34906a = c13535a;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
    }
}

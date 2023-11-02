package kotlinx.coroutines.internal;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.collections.C9550o;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import p467zf.C14180c;
import pf.C11560f;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J3\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m14357d2 = {"Lkotlinx/coroutines/internal/i;", "", "S", "Ljava/lang/Class;", "service", "Ljava/lang/ClassLoader;", "loader", "", "b", "", ZeroconfModule.KEY_SERVICE_NAME, "a", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/net/URL;", "url", "e", "Ljava/io/BufferedReader;", "r", "f", "Lkotlinx/coroutines/internal/t;", "c", "()Ljava/util/List;", "d", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9780i {

    /* renamed from: a */
    public static final C9780i f25591a = new C9780i();

    private C9780i() {
    }

    /* renamed from: a */
    private final <S> S m13295a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final <S> List<S> m13294b(Class<S> cls, ClassLoader classLoader) {
        List<S> m14075C0;
        try {
            return m13292d(cls, classLoader);
        } catch (Throwable unused) {
            m14075C0 = C9553r.m14075C0(ServiceLoader.load(cls, classLoader));
            return m14075C0;
        }
    }

    /* renamed from: e */
    private final List<String> m13291e(URL url) {
        boolean m13758H;
        String m13734K0;
        String m13724P0;
        String m13734K02;
        String url2 = url.toString();
        m13758H = C9653o.m13758H(url2, "jar", false, 2, null);
        if (m13758H) {
            m13734K0 = C9654p.m13734K0(url2, "jar:file:", null, 2, null);
            m13724P0 = C9654p.m13724P0(m13734K0, '!', null, 2, null);
            m13734K02 = C9654p.m13734K0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(m13724P0, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m13734K02)), "UTF-8"));
                List<String> m13290f = f25591a.m13290f(bufferedReader);
                C14180c.m514a(bufferedReader, null);
                jarFile.close();
                return m13290f;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        jarFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        C11560f.m7637a(th2, th4);
                        throw th2;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List<String> m13290f2 = f25591a.m13290f(bufferedReader2);
            C14180c.m514a(bufferedReader2, null);
            return m13290f2;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                C14180c.m514a(bufferedReader2, th5);
                throw th6;
            }
        }
    }

    /* renamed from: f */
    private final List<String> m13290f(BufferedReader bufferedReader) {
        List<String> m14075C0;
        String m13722Q0;
        CharSequence m13712V0;
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                m14075C0 = C9553r.m14075C0(linkedHashSet);
                return m14075C0;
            }
            m13722Q0 = C9654p.m13722Q0(readLine, "#", null, 2, null);
            m13712V0 = C9654p.m13712V0(m13722Q0);
            String obj = m13712V0.toString();
            boolean z3 = false;
            int i = 0;
            while (true) {
                if (i < obj.length()) {
                    char charAt = obj.charAt(i);
                    if (charAt != '.' && !Character.isJavaIdentifierPart(charAt)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                if (obj.length() > 0) {
                    z3 = true;
                }
                if (z3) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    /* renamed from: c */
    public final List<InterfaceC9802t> m13293c() {
        InterfaceC9802t interfaceC9802t;
        if (!C9782j.m13276a()) {
            return m13294b(InterfaceC9802t.class, InterfaceC9802t.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            InterfaceC9802t interfaceC9802t2 = null;
            try {
                interfaceC9802t = (InterfaceC9802t) InterfaceC9802t.class.cast(Class.forName("vi.a", true, InterfaceC9802t.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                interfaceC9802t = null;
            }
            if (interfaceC9802t != null) {
                arrayList.add(interfaceC9802t);
            }
            try {
                interfaceC9802t2 = (InterfaceC9802t) InterfaceC9802t.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, InterfaceC9802t.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (interfaceC9802t2 != null) {
                arrayList.add(interfaceC9802t2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return m13294b(InterfaceC9802t.class, InterfaceC9802t.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final <S> List<S> m13292d(Class<S> cls, ClassLoader classLoader) {
        Set<String> m14071G0;
        int m14093t;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        C9612q.m13918g(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            C9550o.m14085y(arrayList, f25591a.m13291e(url));
        }
        m14071G0 = C9553r.m14071G0(arrayList);
        if (!m14071G0.isEmpty()) {
            m14093t = C9546k.m14093t(m14071G0, 10);
            ArrayList arrayList2 = new ArrayList(m14093t);
            for (String str : m14071G0) {
                arrayList2.add(f25591a.m13295a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}

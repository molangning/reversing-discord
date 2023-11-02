package p119g9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import p154i9.C7478d;

/* renamed from: g9.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6591n {

    /* renamed from: a */
    private static final int f18731a = Process.myUid();

    /* renamed from: b */
    private static final Method f18732b;

    /* renamed from: c */
    private static final Method f18733c;

    /* renamed from: d */
    private static final Method f18734d;

    /* renamed from: e */
    private static final Method f18735e;

    /* renamed from: f */
    private static final Method f18736f;

    /* renamed from: g */
    private static final Method f18737g;

    /* renamed from: h */
    private static final Method f18738h;

    /* renamed from: i */
    private static final Method f18739i;

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|2|3|4|(21:49|50|7|8|9|10|11|12|13|(12:41|42|16|(9:36|37|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            p119g9.C6591n.f18731a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L18
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L18
            r5[r3] = r6     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r5 = r4
        L19:
            p119g9.C6591n.f18732b = r5
            boolean r5 = p119g9.C6587j.m22365c()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L31
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L31
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L31
            r5[r3] = r8     // Catch: java.lang.Exception -> L31
            r5[r2] = r6     // Catch: java.lang.Exception -> L31
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L31
            goto L32
        L31:
            r0 = r4
        L32:
            p119g9.C6591n.f18733c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L3d
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
            r0 = r4
        L3e:
            p119g9.C6591n.f18734d = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L4d
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4d
            r0[r3] = r5     // Catch: java.lang.Exception -> L4d
            java.lang.String r5 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r0 = r4
        L4e:
            p119g9.C6591n.f18735e = r0
            boolean r0 = p119g9.C6587j.m22365c()
            if (r0 == 0) goto L63
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L63
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L63
            r0[r3] = r5     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L63
            goto L64
        L63:
            r0 = r4
        L64:
            p119g9.C6591n.f18736f = r0
            boolean r0 = p119g9.C6587j.m22359i()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L7d
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L77
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch: java.lang.Exception -> L77
            goto L7e
        L77:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L7d:
            r0 = r4
        L7e:
            p119g9.C6591n.f18737g = r0
            boolean r0 = p119g9.C6587j.m22359i()
            if (r0 == 0) goto La1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L9b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L9b
            r7[r3] = r8     // Catch: java.lang.Exception -> L9b
            r7[r2] = r6     // Catch: java.lang.Exception -> L9b
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.Exception -> L9b
            goto La2
        L9b:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        La1:
            r0 = r4
        La2:
            p119g9.C6591n.f18738h = r0
            boolean r0 = p119g9.C6587j.m22359i()
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lb5
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> Lb5
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> Lb5
        Lb5:
            p119g9.C6591n.f18739i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p119g9.C6591n.<clinit>():void");
    }

    /* renamed from: a */
    public static void m22352a(WorkSource workSource, int i, String str) {
        Method method = f18733c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = f18732b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m22351b(Context context, String str) {
        String str2;
        String str3;
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo m20602c = C7478d.m20598a(context).m20602c(str, 0);
                if (m20602c == null) {
                    if (str.length() != 0) {
                        str3 = "Could not get applicationInfo from package: ".concat(str);
                    } else {
                        str3 = new String("Could not get applicationInfo from package: ");
                    }
                    Log.e("WorkSourceUtil", str3);
                    return null;
                }
                int i = m20602c.uid;
                WorkSource workSource = new WorkSource();
                m22352a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                if (str.length() != 0) {
                    str2 = "Could not find package: ".concat(str);
                } else {
                    str2 = new String("Could not find package: ");
                }
                Log.e("WorkSourceUtil", str2);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m22350c(Context context) {
        if (context == null || context.getPackageManager() == null || C7478d.m20598a(context).m20603b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}

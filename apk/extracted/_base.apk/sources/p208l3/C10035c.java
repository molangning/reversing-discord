package p208l3;

import android.content.Context;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.C3712b;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import p006a5.C0025b;

/* renamed from: l3.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10035c {

    /* renamed from: a */
    private static final Class<?> f26079a = C10035c.class;

    /* renamed from: b */
    private static C10036d f26080b = null;

    /* renamed from: c */
    private static volatile boolean f26081c = false;

    private C10035c() {
    }

    /* renamed from: a */
    public static ImagePipeline m12512a() {
        return m12511b().m31045j();
    }

    /* renamed from: b */
    public static C3712b m12511b() {
        return C3712b.m31043l();
    }

    /* renamed from: c */
    public static void m12510c(Context context, ImagePipelineConfig imagePipelineConfig) {
        m12509d(context, imagePipelineConfig, null);
    }

    /* renamed from: d */
    public static void m12509d(Context context, ImagePipelineConfig imagePipelineConfig, C10034b c10034b) {
        m12508e(context, imagePipelineConfig, c10034b, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (p006a5.C0025b.m41375d() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (p006a5.C0025b.m41375d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (p006a5.C0025b.m41375d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (p006a5.C0025b.m41375d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (p006a5.C0025b.m41375d() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        p006a5.C0025b.m41377b();
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m12508e(android.content.Context r5, com.facebook.imagepipeline.core.ImagePipelineConfig r6, p208l3.C10034b r7, boolean r8) {
        /*
            boolean r0 = p006a5.C0025b.m41375d()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Fresco#initialize"
            p006a5.C0025b.m41378a(r0)
        Lb:
            boolean r0 = p208l3.C10035c.f26081c
            r1 = 1
            if (r0 == 0) goto L18
            java.lang.Class<?> r0 = p208l3.C10035c.f26079a
            java.lang.String r2 = "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!"
            p414x2.C13677a.m1874D(r0, r2)
            goto L1a
        L18:
            p208l3.C10035c.f26081c = r1
        L1a:
            p314r4.C12056h.m6419b(r8)
            boolean r8 = p129h5.C7018a.m21532c()
            if (r8 != 0) goto L97
            boolean r8 = p006a5.C0025b.m41375d()
            if (r8 == 0) goto L2e
            java.lang.String r8 = "Fresco.initialize->SoLoader.init"
            p006a5.C0025b.m41378a(r8)
        L2e:
            java.lang.Class<com.facebook.imagepipeline.nativecode.NativeCodeInitializer> r8 = com.facebook.imagepipeline.nativecode.NativeCodeInitializer.class
            java.lang.String r0 = "init"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            java.lang.reflect.Method r8 = r8.getMethod(r0, r2)     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            r0[r4] = r5     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            r1 = 0
            r8.invoke(r1, r0)     // Catch: java.lang.Throwable -> L4c java.lang.NoSuchMethodException -> L4e java.lang.reflect.InvocationTargetException -> L5d java.lang.IllegalAccessException -> L6c java.lang.ClassNotFoundException -> L7b
            boolean r8 = p006a5.C0025b.m41375d()
            if (r8 == 0) goto L97
            goto L89
        L4c:
            r5 = move-exception
            goto L8d
        L4e:
            h5.c r8 = new h5.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            p129h5.C7018a.m21533b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = p006a5.C0025b.m41375d()
            if (r8 == 0) goto L97
            goto L89
        L5d:
            h5.c r8 = new h5.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            p129h5.C7018a.m21533b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = p006a5.C0025b.m41375d()
            if (r8 == 0) goto L97
            goto L89
        L6c:
            h5.c r8 = new h5.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            p129h5.C7018a.m21533b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = p006a5.C0025b.m41375d()
            if (r8 == 0) goto L97
            goto L89
        L7b:
            h5.c r8 = new h5.c     // Catch: java.lang.Throwable -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4c
            p129h5.C7018a.m21533b(r8)     // Catch: java.lang.Throwable -> L4c
            boolean r8 = p006a5.C0025b.m41375d()
            if (r8 == 0) goto L97
        L89:
            p006a5.C0025b.m41377b()
            goto L97
        L8d:
            boolean r6 = p006a5.C0025b.m41375d()
            if (r6 == 0) goto L96
            p006a5.C0025b.m41377b()
        L96:
            throw r5
        L97:
            android.content.Context r5 = r5.getApplicationContext()
            if (r6 != 0) goto La1
            com.facebook.imagepipeline.core.C3712b.m31034u(r5)
            goto La4
        La1:
            com.facebook.imagepipeline.core.C3712b.m31033v(r6)
        La4:
            m12507f(r5, r7)
            boolean r5 = p006a5.C0025b.m41375d()
            if (r5 == 0) goto Lb0
            p006a5.C0025b.m41377b()
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p208l3.C10035c.m12508e(android.content.Context, com.facebook.imagepipeline.core.ImagePipelineConfig, l3.b, boolean):void");
    }

    /* renamed from: f */
    private static void m12507f(Context context, C10034b c10034b) {
        if (C0025b.m41375d()) {
            C0025b.m41378a("Fresco.initializeDrawee");
        }
        C10036d c10036d = new C10036d(context, c10034b);
        f26080b = c10036d;
        SimpleDraweeView.initialize(c10036d);
        if (C0025b.m41375d()) {
            C0025b.m41377b();
        }
    }

    /* renamed from: g */
    public static PipelineDraweeControllerBuilder m12506g() {
        return f26080b.get();
    }
}

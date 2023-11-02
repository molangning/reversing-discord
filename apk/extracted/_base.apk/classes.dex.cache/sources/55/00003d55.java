package p182jh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p160ih.InterfaceC7564r;
import p182jh.C8942a;
import p270oh.C11109a;
import p270oh.C11115e;
import p305qg.InterfaceC11900a1;
import p389vh.C13300f;
import p468zg.C14208b0;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;

/* renamed from: jh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public class C8945b implements InterfaceC7564r.InterfaceC7567c {

    /* renamed from: j */
    private static final boolean f23406j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    private static final Map<C11632b, C8942a.EnumC8943a> f23407k;

    /* renamed from: a */
    private int[] f23408a = null;

    /* renamed from: b */
    private String f23409b = null;

    /* renamed from: c */
    private int f23410c = 0;

    /* renamed from: d */
    private String f23411d = null;

    /* renamed from: e */
    private String[] f23412e = null;

    /* renamed from: f */
    private String[] f23413f = null;

    /* renamed from: g */
    private String[] f23414g = null;

    /* renamed from: h */
    private C8942a.EnumC8943a f23415h = null;

    /* renamed from: i */
    private String[] f23416i = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jh.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static abstract class AbstractC8947b implements InterfaceC7564r.InterfaceC7566b {

        /* renamed from: a */
        private final List<String> f23417a = new ArrayList();

        /* renamed from: f */
        private static /* synthetic */ void m16984f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7566b
        /* renamed from: a */
        public void mo16989a() {
            mo16964g((String[]) this.f23417a.toArray(new String[0]));
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7566b
        /* renamed from: b */
        public InterfaceC7564r.InterfaceC7565a mo16988b(C11632b c11632b) {
            if (c11632b == null) {
                m16984f(3);
                return null;
            }
            return null;
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7566b
        /* renamed from: c */
        public void mo16987c(C11632b c11632b, C11638f c11638f) {
            if (c11632b == null) {
                m16984f(0);
            }
            if (c11638f == null) {
                m16984f(1);
            }
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7566b
        /* renamed from: d */
        public void mo16986d(C13300f c13300f) {
            if (c13300f == null) {
                m16984f(2);
            }
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7566b
        /* renamed from: e */
        public void mo16985e(Object obj) {
            if (obj instanceof String) {
                this.f23417a.add((String) obj);
            }
        }

        /* renamed from: g */
        protected abstract void mo16964g(String[] strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jh.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C8948c implements InterfaceC7564r.InterfaceC7565a {

        /* renamed from: jh.b$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C8949a extends AbstractC8947b {
            C8949a() {
                C8948c.this = r1;
            }

            /* renamed from: f */
            private static /* synthetic */ void m16980f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // p182jh.C8945b.AbstractC8947b
            /* renamed from: g */
            protected void mo16964g(String[] strArr) {
                if (strArr == null) {
                    m16980f(0);
                }
                C8945b.this.f23412e = strArr;
            }
        }

        /* renamed from: jh.b$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C8950b extends AbstractC8947b {
            C8950b() {
                C8948c.this = r1;
            }

            /* renamed from: f */
            private static /* synthetic */ void m16979f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // p182jh.C8945b.AbstractC8947b
            /* renamed from: g */
            protected void mo16964g(String[] strArr) {
                if (strArr == null) {
                    m16979f(0);
                }
                C8945b.this.f23413f = strArr;
            }
        }

        private C8948c() {
            C8945b.this = r1;
        }

        /* renamed from: g */
        private static /* synthetic */ void m16983g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private InterfaceC7564r.InterfaceC7566b m16982h() {
            return new C8949a();
        }

        /* renamed from: i */
        private InterfaceC7564r.InterfaceC7566b m16981i() {
            return new C8950b();
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: a */
        public void mo16975a() {
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: b */
        public InterfaceC7564r.InterfaceC7566b mo16974b(C11638f c11638f) {
            String str;
            if (c11638f != null) {
                str = c11638f.m7426b();
            } else {
                str = null;
            }
            if ("d1".equals(str)) {
                return m16982h();
            }
            if (!"d2".equals(str)) {
                return null;
            }
            return m16981i();
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: c */
        public void mo16973c(C11638f c11638f, C13300f c13300f) {
            if (c13300f == null) {
                m16983g(0);
            }
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: d */
        public void mo16972d(C11638f c11638f, C11632b c11632b, C11638f c11638f2) {
            if (c11632b == null) {
                m16983g(1);
            }
            if (c11638f2 == null) {
                m16983g(2);
            }
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: e */
        public InterfaceC7564r.InterfaceC7565a mo16971e(C11638f c11638f, C11632b c11632b) {
            if (c11632b == null) {
                m16983g(3);
                return null;
            }
            return null;
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: f */
        public void mo16970f(C11638f c11638f, Object obj) {
            if (c11638f == null) {
                return;
            }
            String m7426b = c11638f.m7426b();
            if ("k".equals(m7426b)) {
                if (obj instanceof Integer) {
                    C8945b.this.f23415h = C8942a.EnumC8943a.m17002c(((Integer) obj).intValue());
                }
            } else if ("mv".equals(m7426b)) {
                if (obj instanceof int[]) {
                    C8945b.this.f23408a = (int[]) obj;
                }
            } else if ("xs".equals(m7426b)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!str.isEmpty()) {
                        C8945b.this.f23409b = str;
                    }
                }
            } else if ("xi".equals(m7426b)) {
                if (obj instanceof Integer) {
                    C8945b.this.f23410c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(m7426b) && (obj instanceof String)) {
                String str2 = (String) obj;
                if (!str2.isEmpty()) {
                    C8945b.this.f23411d = str2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jh.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C8951d implements InterfaceC7564r.InterfaceC7565a {

        /* renamed from: jh.b$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C8952a extends AbstractC8947b {
            C8952a() {
                C8951d.this = r1;
            }

            /* renamed from: f */
            private static /* synthetic */ void m16976f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // p182jh.C8945b.AbstractC8947b
            /* renamed from: g */
            protected void mo16964g(String[] strArr) {
                if (strArr == null) {
                    m16976f(0);
                }
                C8945b.this.f23416i = strArr;
            }
        }

        private C8951d() {
            C8945b.this = r1;
        }

        /* renamed from: g */
        private static /* synthetic */ void m16978g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private InterfaceC7564r.InterfaceC7566b m16977h() {
            return new C8952a();
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: a */
        public void mo16975a() {
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: b */
        public InterfaceC7564r.InterfaceC7566b mo16974b(C11638f c11638f) {
            String str;
            if (c11638f != null) {
                str = c11638f.m7426b();
            } else {
                str = null;
            }
            if (!"b".equals(str)) {
                return null;
            }
            return m16977h();
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: c */
        public void mo16973c(C11638f c11638f, C13300f c13300f) {
            if (c13300f == null) {
                m16978g(0);
            }
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: d */
        public void mo16972d(C11638f c11638f, C11632b c11632b, C11638f c11638f2) {
            if (c11632b == null) {
                m16978g(1);
            }
            if (c11638f2 == null) {
                m16978g(2);
            }
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: e */
        public InterfaceC7564r.InterfaceC7565a mo16971e(C11638f c11638f, C11632b c11632b) {
            if (c11632b == null) {
                m16978g(3);
                return null;
            }
            return null;
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: f */
        public void mo16970f(C11638f c11638f, Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jh.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public class C8953e implements InterfaceC7564r.InterfaceC7565a {

        /* renamed from: jh.b$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C8954a extends AbstractC8947b {
            C8954a() {
                C8953e.this = r1;
            }

            /* renamed from: f */
            private static /* synthetic */ void m16966f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // p182jh.C8945b.AbstractC8947b
            /* renamed from: g */
            protected void mo16964g(String[] strArr) {
                if (strArr == null) {
                    m16966f(0);
                }
                C8945b.this.f23412e = strArr;
            }
        }

        /* renamed from: jh.b$e$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public class C8955b extends AbstractC8947b {
            C8955b() {
                C8953e.this = r1;
            }

            /* renamed from: f */
            private static /* synthetic */ void m16965f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // p182jh.C8945b.AbstractC8947b
            /* renamed from: g */
            protected void mo16964g(String[] strArr) {
                if (strArr == null) {
                    m16965f(0);
                }
                C8945b.this.f23413f = strArr;
            }
        }

        private C8953e() {
            C8945b.this = r1;
        }

        /* renamed from: g */
        private static /* synthetic */ void m16969g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: h */
        private InterfaceC7564r.InterfaceC7566b m16968h() {
            return new C8954a();
        }

        /* renamed from: i */
        private InterfaceC7564r.InterfaceC7566b m16967i() {
            return new C8955b();
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: a */
        public void mo16975a() {
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: b */
        public InterfaceC7564r.InterfaceC7566b mo16974b(C11638f c11638f) {
            String str;
            if (c11638f != null) {
                str = c11638f.m7426b();
            } else {
                str = null;
            }
            if (!"data".equals(str) && !"filePartClassNames".equals(str)) {
                if (!"strings".equals(str)) {
                    return null;
                }
                return m16967i();
            }
            return m16968h();
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: c */
        public void mo16973c(C11638f c11638f, C13300f c13300f) {
            if (c13300f == null) {
                m16969g(0);
            }
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: d */
        public void mo16972d(C11638f c11638f, C11632b c11632b, C11638f c11638f2) {
            if (c11632b == null) {
                m16969g(1);
            }
            if (c11638f2 == null) {
                m16969g(2);
            }
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: e */
        public InterfaceC7564r.InterfaceC7565a mo16971e(C11638f c11638f, C11632b c11632b) {
            if (c11632b == null) {
                m16969g(3);
                return null;
            }
            return null;
        }

        @Override // p160ih.InterfaceC7564r.InterfaceC7565a
        /* renamed from: f */
        public void mo16970f(C11638f c11638f, Object obj) {
            String str;
            if (c11638f == null) {
                return;
            }
            String m7426b = c11638f.m7426b();
            if ("version".equals(m7426b)) {
                if (obj instanceof int[]) {
                    C8945b.this.f23408a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(m7426b)) {
                C8945b c8945b = C8945b.this;
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                c8945b.f23409b = str;
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f23407k = hashMap;
        hashMap.put(C11632b.m7460m(new C11633c("kotlin.jvm.internal.KotlinClass")), C8942a.EnumC8943a.CLASS);
        hashMap.put(C11632b.m7460m(new C11633c("kotlin.jvm.internal.KotlinFileFacade")), C8942a.EnumC8943a.FILE_FACADE);
        hashMap.put(C11632b.m7460m(new C11633c("kotlin.jvm.internal.KotlinMultifileClass")), C8942a.EnumC8943a.MULTIFILE_CLASS);
        hashMap.put(C11632b.m7460m(new C11633c("kotlin.jvm.internal.KotlinMultifileClassPart")), C8942a.EnumC8943a.MULTIFILE_CLASS_PART);
        hashMap.put(C11632b.m7460m(new C11633c("kotlin.jvm.internal.KotlinSyntheticClass")), C8942a.EnumC8943a.SYNTHETIC_CLASS);
    }

    /* renamed from: d */
    private static /* synthetic */ void m17000d(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: n */
    private boolean m16990n() {
        C8942a.EnumC8943a enumC8943a = this.f23415h;
        return enumC8943a == C8942a.EnumC8943a.CLASS || enumC8943a == C8942a.EnumC8943a.FILE_FACADE || enumC8943a == C8942a.EnumC8943a.MULTIFILE_CLASS_PART;
    }

    @Override // p160ih.InterfaceC7564r.InterfaceC7567c
    /* renamed from: a */
    public void mo11509a() {
    }

    @Override // p160ih.InterfaceC7564r.InterfaceC7567c
    /* renamed from: c */
    public InterfaceC7564r.InterfaceC7565a mo11508c(C11632b c11632b, InterfaceC11900a1 interfaceC11900a1) {
        C8942a.EnumC8943a enumC8943a;
        if (c11632b == null) {
            m17000d(0);
        }
        if (interfaceC11900a1 == null) {
            m17000d(1);
        }
        C11633c m7471b = c11632b.m7471b();
        if (m7471b.equals(C14208b0.f36532a)) {
            return new C8948c();
        }
        if (m7471b.equals(C14208b0.f36550s)) {
            return new C8951d();
        }
        if (f23406j || this.f23415h != null || (enumC8943a = f23407k.get(c11632b)) == null) {
            return null;
        }
        this.f23415h = enumC8943a;
        return new C8953e();
    }

    /* renamed from: m */
    public C8942a m16991m() {
        boolean z;
        byte[] bArr = null;
        if (this.f23415h == null || this.f23408a == null) {
            return null;
        }
        int[] iArr = this.f23408a;
        if ((this.f23410c & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        C11115e c11115e = new C11115e(iArr, z);
        if (!c11115e.m9137h()) {
            this.f23414g = this.f23412e;
            this.f23412e = null;
        } else if (m16990n() && this.f23412e == null) {
            return null;
        }
        String[] strArr = this.f23416i;
        if (strArr != null) {
            bArr = C11109a.m9147e(strArr);
        }
        return new C8942a(this.f23415h, c11115e, this.f23412e, this.f23414g, this.f23413f, this.f23409b, this.f23410c, this.f23411d, bArr);
    }
}
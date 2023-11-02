package p467zf;

import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import p304qf.AbstractC11864b;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\t\u000eBm\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eB\u001b\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR(\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, m14357d2 = {"Lzf/h;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "", "iterator", "a", "Ljava/io/File;", ViewProps.START, "Lzf/i;", "b", "Lzf/i;", "direction", "Lkotlin/Function1;", "", "c", "Lkotlin/jvm/functions/Function1;", "onEnter", "", "d", "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", "e", "Lkotlin/jvm/functions/Function2;", "onFail", "", "f", "I", "maxDepth", "<init>", "(Ljava/io/File;Lzf/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lzf/i;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: zf.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14185h implements Sequence<File> {

    /* renamed from: a */
    private final File f36486a;

    /* renamed from: b */
    private final EnumC14193i f36487b;

    /* renamed from: c */
    private final Function1<File, Boolean> f36488c;

    /* renamed from: d */
    private final Function1<File, Unit> f36489d;

    /* renamed from: e */
    private final Function2<File, IOException, Unit> f36490e;

    /* renamed from: f */
    private final int f36491f;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"Lzf/h$a;", "Lzf/h$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zf.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC14186a extends AbstractC14192c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC14186a(File rootDir) {
            super(rootDir);
            C9612q.m13917h(rootDir, "rootDir");
        }
    }

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082\u0010J\b\u0010\b\u001a\u00020\u0007H\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m14357d2 = {"Lzf/h$b;", "Lqf/b;", "Ljava/io/File;", "root", "Lzf/h$a;", "h", "i", "", "a", "Ljava/util/ArrayDeque;", "Lzf/h$c;", "l", "Ljava/util/ArrayDeque;", "state", "<init>", "(Lzf/h;)V", "b", "c", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zf.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class C14187b extends AbstractC11864b<File> {

        /* renamed from: l */
        private final ArrayDeque<AbstractC14192c> f36492l;

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0014"}, m14357d2 = {"Lzf/h$b$a;", "Lzf/h$a;", "Ljava/io/File;", "b", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "e", "failed", "rootDir", "<init>", "(Lzf/h$b;Ljava/io/File;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: zf.h$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public final class C14188a extends AbstractC14186a {

            /* renamed from: b */
            private boolean f36494b;

            /* renamed from: c */
            private File[] f36495c;

            /* renamed from: d */
            private int f36496d;

            /* renamed from: e */
            private boolean f36497e;

            /* renamed from: f */
            final /* synthetic */ C14187b f36498f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14188a(C14187b c14187b, File rootDir) {
                super(rootDir);
                C9612q.m13917h(rootDir, "rootDir");
                this.f36498f = c14187b;
            }

            @Override // p467zf.C14185h.AbstractC14192c
            /* renamed from: b */
            public File mo498b() {
                if (!this.f36497e && this.f36495c == null) {
                    Function1 function1 = C14185h.this.f36488c;
                    boolean z = false;
                    if (function1 != null && !((Boolean) function1.invoke(m499a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] listFiles = m499a().listFiles();
                    this.f36495c = listFiles;
                    if (listFiles == null) {
                        Function2 function2 = C14185h.this.f36490e;
                        if (function2 != null) {
                            function2.invoke(m499a(), new C14178a(m499a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f36497e = true;
                    }
                }
                File[] fileArr = this.f36495c;
                if (fileArr != null) {
                    int i = this.f36496d;
                    C9612q.m13920e(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f36495c;
                        C9612q.m13920e(fileArr2);
                        int i2 = this.f36496d;
                        this.f36496d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f36494b) {
                    this.f36494b = true;
                    return m499a();
                }
                Function1 function12 = C14185h.this.f36489d;
                if (function12 != null) {
                    function12.invoke(m499a());
                }
                return null;
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, m14357d2 = {"Lzf/h$b$b;", "Lzf/h$c;", "Ljava/io/File;", "b", "", "Z", "visited", "rootFile", "<init>", "(Lzf/h$b;Ljava/io/File;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: zf.h$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        private final class C14189b extends AbstractC14192c {

            /* renamed from: b */
            private boolean f36499b;

            /* renamed from: c */
            final /* synthetic */ C14187b f36500c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14189b(C14187b c14187b, File rootFile) {
                super(rootFile);
                C9612q.m13917h(rootFile, "rootFile");
                this.f36500c = c14187b;
            }

            @Override // p467zf.C14185h.AbstractC14192c
            /* renamed from: b */
            public File mo498b() {
                if (this.f36499b) {
                    return null;
                }
                this.f36499b = true;
                return m499a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, m14357d2 = {"Lzf/h$b$c;", "Lzf/h$a;", "Ljava/io/File;", "b", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "rootDir", "<init>", "(Lzf/h$b;Ljava/io/File;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
        /* renamed from: zf.h$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public final class C14190c extends AbstractC14186a {

            /* renamed from: b */
            private boolean f36501b;

            /* renamed from: c */
            private File[] f36502c;

            /* renamed from: d */
            private int f36503d;

            /* renamed from: e */
            final /* synthetic */ C14187b f36504e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14190c(C14187b c14187b, File rootDir) {
                super(rootDir);
                C9612q.m13917h(rootDir, "rootDir");
                this.f36504e = c14187b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
                if (r0.length == 0) goto L32;
             */
            @Override // p467zf.C14185h.AbstractC14192c
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File mo498b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f36501b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    zf.h$b r0 = r10.f36504e
                    zf.h r0 = p467zf.C14185h.this
                    kotlin.jvm.functions.Function1 r0 = p467zf.C14185h.m506d(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.m499a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f36501b = r3
                    java.io.File r0 = r10.m499a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f36502c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f36503d
                    kotlin.jvm.internal.C9612q.m13920e(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    zf.h$b r0 = r10.f36504e
                    zf.h r0 = p467zf.C14185h.this
                    kotlin.jvm.functions.Function1 r0 = p467zf.C14185h.m504f(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.m499a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f36502c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.m499a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f36502c = r0
                    if (r0 != 0) goto L7b
                    zf.h$b r0 = r10.f36504e
                    zf.h r0 = p467zf.C14185h.this
                    kotlin.jvm.functions.Function2 r0 = p467zf.C14185h.m505e(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.m499a()
                    zf.a r9 = new zf.a
                    java.io.File r4 = r10.m499a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f36502c
                    if (r0 == 0) goto L85
                    kotlin.jvm.internal.C9612q.m13920e(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    zf.h$b r0 = r10.f36504e
                    zf.h r0 = p467zf.C14185h.this
                    kotlin.jvm.functions.Function1 r0 = p467zf.C14185h.m504f(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.m499a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f36502c
                    kotlin.jvm.internal.C9612q.m13920e(r0)
                    int r1 = r10.f36503d
                    int r2 = r1 + 1
                    r10.f36503d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p467zf.C14185h.C14187b.C14190c.mo498b():java.io.File");
            }
        }

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: zf.h$b$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public /* synthetic */ class C14191d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f36505a;

            static {
                int[] iArr = new int[EnumC14193i.values().length];
                try {
                    iArr[EnumC14193i.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC14193i.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f36505a = iArr;
            }
        }

        public C14187b() {
            ArrayDeque<AbstractC14192c> arrayDeque = new ArrayDeque<>();
            this.f36492l = arrayDeque;
            if (C14185h.this.f36486a.isDirectory()) {
                arrayDeque.push(m501h(C14185h.this.f36486a));
            } else if (C14185h.this.f36486a.isFile()) {
                arrayDeque.push(new C14189b(this, C14185h.this.f36486a));
            } else {
                m6811e();
            }
        }

        /* renamed from: h */
        private final AbstractC14186a m501h(File file) {
            int i = C14191d.f36505a[C14185h.this.f36487b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new C14188a(this, file);
                }
                throw new C11581q();
            }
            return new C14190c(this, file);
        }

        /* renamed from: i */
        private final File m500i() {
            File mo498b;
            while (true) {
                AbstractC14192c peek = this.f36492l.peek();
                if (peek == null) {
                    return null;
                }
                mo498b = peek.mo498b();
                if (mo498b == null) {
                    this.f36492l.pop();
                } else if (C9612q.m13922c(mo498b, peek.m499a()) || !mo498b.isDirectory() || this.f36492l.size() >= C14185h.this.f36491f) {
                    break;
                } else {
                    this.f36492l.push(m501h(mo498b));
                }
            }
            return mo498b;
        }

        @Override // p304qf.AbstractC11864b
        /* renamed from: a */
        protected void mo502a() {
            File m500i = m500i();
            if (m500i != null) {
                m6810f(m500i);
            } else {
                m6811e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, m14357d2 = {"Lzf/h$c;", "", "Ljava/io/File;", "b", "a", "Ljava/io/File;", "()Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: zf.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC14192c {

        /* renamed from: a */
        private final File f36506a;

        public AbstractC14192c(File root) {
            C9612q.m13917h(root, "root");
            this.f36506a = root;
        }

        /* renamed from: a */
        public final File m499a() {
            return this.f36506a;
        }

        /* renamed from: b */
        public abstract File mo498b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C14185h(File file, EnumC14193i enumC14193i, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> function2, int i) {
        this.f36486a = file;
        this.f36487b = enumC14193i;
        this.f36488c = function1;
        this.f36489d = function12;
        this.f36490e = function2;
        this.f36491f = i;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<File> iterator() {
        return new C14187b();
    }

    /* synthetic */ C14185h(File file, EnumC14193i enumC14193i, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? EnumC14193i.TOP_DOWN : enumC14193i, function1, function12, function2, (i2 & 32) != 0 ? ViewDefaults.NUMBER_OF_LINES : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14185h(File start, EnumC14193i direction) {
        this(start, direction, null, null, null, 0, 32, null);
        C9612q.m13917h(start, "start");
        C9612q.m13917h(direction, "direction");
    }
}

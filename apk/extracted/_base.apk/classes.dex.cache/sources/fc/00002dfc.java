package com.linecorp.apng;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.AnimationUtils;
import androidx.vectordrawable.graphics.drawable.AbstractC1905b;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.JSStackTrace;
import com.linecorp.apng.decoder.Apng;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p179jd.InterfaceC8897a;
import p467zf.C14180c;

@Metadata(m14358d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0002\u0010\nB\u0011\b\u0001\u0012\u0006\u0010b\u001a\u00020_¢\u0006\u0004\bg\u0010hJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082\u0010J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0003H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010!\u001a\u00020\u0001H\u0016J\u0006\u0010\"\u001a\u00020\u0003R\u001a\u0010&\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u001a\u00107\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R*\u0010=\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010#\u001a\u0004\b:\u0010%\"\u0004\b;\u0010<R\u0017\u0010@\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010,R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010,R\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010#R\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010#R\u0016\u0010V\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010?R\u0016\u0010X\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00104R\u0018\u0010[\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR$\u0010^\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\\\u0010#\"\u0004\b]\u0010<R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010%R\u0011\u0010f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\be\u0010%¨\u0006j"}, m14357d2 = {"Lcom/linecorp/apng/ApngDrawable;", "Landroid/graphics/drawable/Drawable;", "", "", "i", "", "f", "h", "g", "e", "b", "", "lowerBoundIndex", "upperBoundIndex", "", "progressMillisInCurrentLoop", "a", "Landroid/graphics/Canvas;", "canvas", "draw", "alpha", "setAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getIntrinsicWidth", "getIntrinsicHeight", "isRunning", ViewProps.START, "stop", "Landroid/graphics/drawable/Drawable$ConstantState;", "getConstantState", "mutate", "j", "I", "getDurationMillis", "()I", "durationMillis", "k", "getFrameCount", "frameCount", "", "l", "Ljava/util/List;", "getFrameDurations", "()Ljava/util/List;", "frameDurations", "m", "getFrameByteCount", "frameByteCount", "n", "J", "getAllocationByteCount", "()J", "allocationByteCount", "value", "o", "getLoopCount", "setLoopCount", "(I)V", "loopCount", "p", "Z", "isRecycled", "()Z", "Landroid/graphics/Paint;", "q", "Landroid/graphics/Paint;", "paint", "", "Landroidx/vectordrawable/graphics/drawable/b;", "r", "animationCallbacks", "Ljd/a;", "s", "repeatAnimationCallbacks", "", "t", "[I", "frameStartTimes", "u", "scaledWidth", "v", "scaledHeight", "w", "isStarted", "x", "animationElapsedTimeMillis", "y", "Ljava/lang/Long;", "animationPrevDrawTimeMillis", "z", "setTargetDensity", "targetDensity", "Lcom/linecorp/apng/ApngDrawable$a;", "A", "Lcom/linecorp/apng/ApngDrawable$a;", "apngState", "d", "currentLoopIndexInternal", "c", "currentFrameIndex", "<init>", "(Lcom/linecorp/apng/ApngDrawable$a;)V", "B", "apng-drawable_release"}, m14356k = 1, m14355mv = {1, 4, 2})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ApngDrawable extends Drawable implements Animatable {

    /* renamed from: B */
    public static final C5263b f14919B = new C5263b(null);

    /* renamed from: A */
    private C5261a f14920A;

    /* renamed from: j */
    private final int f14921j;

    /* renamed from: k */
    private final int f14922k;

    /* renamed from: l */
    private final List<Integer> f14923l;

    /* renamed from: m */
    private final int f14924m;

    /* renamed from: n */
    private final long f14925n;

    /* renamed from: o */
    private int f14926o;

    /* renamed from: p */
    private final boolean f14927p;

    /* renamed from: q */
    private final Paint f14928q;

    /* renamed from: r */
    private final List<AbstractC1905b> f14929r;

    /* renamed from: s */
    private final List<InterfaceC8897a> f14930s;

    /* renamed from: t */
    private final int[] f14931t;

    /* renamed from: u */
    private int f14932u;

    /* renamed from: v */
    private int f14933v;

    /* renamed from: w */
    private boolean f14934w;

    /* renamed from: x */
    private long f14935x;

    /* renamed from: y */
    private Long f14936y;

    /* renamed from: z */
    private int f14937z;

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018¨\u0006\u001e"}, m14357d2 = {"Lcom/linecorp/apng/ApngDrawable$a;", "Landroid/graphics/drawable/Drawable$ConstantState;", "Landroid/graphics/drawable/Drawable;", "newDrawable", "", "getChangingConfigurations", "Lcom/linecorp/apng/decoder/Apng;", "a", "Lcom/linecorp/apng/decoder/Apng;", "()Lcom/linecorp/apng/decoder/Apng;", "apng", "b", "I", "d", "()I", "width", "c", "height", "getSourceDensity", "sourceDensity", "Lkotlin/Function0;", "", "e", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "currentTimeProvider", "<init>", "(Lcom/linecorp/apng/decoder/Apng;IIILkotlin/jvm/functions/Function0;)V", "apngState", "(Lcom/linecorp/apng/ApngDrawable$a;)V", "apng-drawable_release"}, m14356k = 1, m14355mv = {1, 4, 2})
    /* renamed from: com.linecorp.apng.ApngDrawable$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5261a extends Drawable.ConstantState {

        /* renamed from: a */
        private final Apng f14938a;

        /* renamed from: b */
        private final int f14939b;

        /* renamed from: c */
        private final int f14940c;

        /* renamed from: d */
        private final int f14941d;

        /* renamed from: e */
        private final Function0<Long> f14942e;

        @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"", "a", "()J"}, m14356k = 3, m14355mv = {1, 4, 2})
        /* renamed from: com.linecorp.apng.ApngDrawable$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C5262a extends AbstractC9614s implements Function0<Long> {

            /* renamed from: j */
            public static final C5262a f14943j = new C5262a();

            C5262a() {
                super(0);
            }

            /* renamed from: a */
            public final long m25590a() {
                return AnimationUtils.currentAnimationTimeMillis();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Long invoke() {
                return Long.valueOf(m25590a());
            }
        }

        public /* synthetic */ C5261a(Apng apng, int i, int i2, int i3, Function0 function0, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(apng, i, i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? C5262a.f14943j : function0);
        }

        /* renamed from: a */
        public final Apng m25594a() {
            return this.f14938a;
        }

        /* renamed from: b */
        public final Function0<Long> m25593b() {
            return this.f14942e;
        }

        /* renamed from: c */
        public final int m25592c() {
            return this.f14940c;
        }

        /* renamed from: d */
        public final int m25591d() {
            return this.f14939b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new ApngDrawable(new C5261a(this));
        }

        public C5261a(Apng apng, int i, int i2, int i3, Function0<Long> currentTimeProvider) {
            C9612q.m13917h(apng, "apng");
            C9612q.m13917h(currentTimeProvider, "currentTimeProvider");
            this.f14938a = apng;
            this.f14939b = i;
            this.f14940c = i2;
            this.f14941d = i3;
            this.f14942e = currentTimeProvider;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C5261a(C5261a apngState) {
            this(apngState.f14938a.copy(), apngState.f14939b, apngState.f14940c, apngState.f14941d, apngState.f14942e);
            C9612q.m13917h(apngState, "apngState");
        }
    }

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Lcom/linecorp/apng/ApngDrawable$b;", "", "Ljava/io/File;", JSStackTrace.FILE_KEY, "", "width", "height", "Lcom/linecorp/apng/ApngDrawable;", "a", "(Ljava/io/File;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/linecorp/apng/ApngDrawable;", "Ljava/io/InputStream;", "stream", "b", "(Ljava/io/InputStream;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/linecorp/apng/ApngDrawable;", "LOOP_FOREVER", "I", "LOOP_INTRINSIC", "<init>", "()V", "apng-drawable_release"}, m14356k = 1, m14355mv = {1, 4, 2})
    /* renamed from: com.linecorp.apng.ApngDrawable$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5263b {
        private C5263b() {
        }

        public /* synthetic */ C5263b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ ApngDrawable m25587c(C5263b c5263b, File file, Integer num, Integer num2, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                num2 = null;
            }
            return c5263b.m25589a(file, num, num2);
        }

        /* renamed from: a */
        public final ApngDrawable m25589a(File file, Integer num, Integer num2) {
            BufferedInputStream bufferedInputStream;
            C9612q.m13917h(file, "file");
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream instanceof BufferedInputStream) {
                bufferedInputStream = (BufferedInputStream) fileInputStream;
            } else {
                bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
            }
            try {
                ApngDrawable m25588b = ApngDrawable.f14919B.m25588b(bufferedInputStream, num, num2);
                C14180c.m514a(bufferedInputStream, null);
                return m25588b;
            } finally {
            }
        }

        /* renamed from: b */
        public final ApngDrawable m25588b(InputStream stream, Integer num, Integer num2) {
            boolean z;
            boolean z2;
            boolean z3;
            int width;
            int height;
            C9612q.m13917h(stream, "stream");
            boolean z4 = true;
            int i = 0;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            if (num2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!(z ^ z2)) {
                if (num != null && num.intValue() <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (num2 != null && num2.intValue() <= 0) {
                        z4 = false;
                    }
                    if (z4) {
                        if (num == null && num2 == null) {
                            i = 160;
                        }
                        int i2 = i;
                        Apng decode = Apng.Companion.decode(stream);
                        if (num != null) {
                            width = num.intValue();
                        } else {
                            width = decode.getWidth();
                        }
                        int i3 = width;
                        if (num2 != null) {
                            height = num2.intValue();
                        } else {
                            height = decode.getHeight();
                        }
                        return new ApngDrawable(new C5261a(decode, i3, height, i2, null, 16, null));
                    }
                    throw new IllegalArgumentException(("Can not specify 0 or negative as height value. height = " + num2).toString());
                }
                throw new IllegalArgumentException(("Can not specify 0 or negative as width value. width = " + num).toString());
            }
            throw new IllegalArgumentException(("Can not specify only one side of size. width = " + num + ", height = " + num2).toString());
        }
    }

    public ApngDrawable(C5261a apngState) {
        List<Integer> m14201s0;
        C9612q.m13917h(apngState, "apngState");
        this.f14920A = apngState;
        this.f14921j = apngState.m25594a().getDuration();
        int frameCount = this.f14920A.m25594a().getFrameCount();
        this.f14922k = frameCount;
        m14201s0 = C9538f.m14201s0(this.f14920A.m25594a().getFrameDurations());
        this.f14923l = m14201s0;
        int byteCount = this.f14920A.m25594a().getByteCount();
        this.f14924m = byteCount;
        this.f14925n = this.f14920A.m25594a().getAllFrameByteCount() + byteCount;
        this.f14926o = this.f14920A.m25594a().getLoopCount();
        this.f14927p = this.f14920A.m25594a().isRecycled();
        this.f14928q = new Paint(6);
        this.f14929r = new ArrayList();
        this.f14930s = new ArrayList();
        this.f14931t = new int[frameCount];
        this.f14932u = this.f14920A.m25591d();
        this.f14933v = this.f14920A.m25592c();
        this.f14937z = 160;
        for (int i = 1; i < frameCount; i++) {
            int[] iArr = this.f14931t;
            int i2 = i - 1;
            iArr[i] = iArr[i2] + this.f14920A.m25594a().getFrameDurations()[i2];
        }
        getBounds().set(0, 0, this.f14920A.m25591d(), this.f14920A.m25592c());
    }

    /* renamed from: a */
    private final int m25604a(int i, int i2, long j) {
        int i3;
        while (true) {
            i3 = (i + i2) / 2;
            int[] iArr = this.f14931t;
            int i4 = i3 + 1;
            if (iArr.length > i4 && j >= iArr[i4]) {
                i = i4;
            } else if (i == i2 || j >= iArr[i3]) {
                break;
            } else {
                i2 = i3;
            }
        }
        return i3;
    }

    /* renamed from: b */
    private final boolean m25603b() {
        if (this.f14926o == 0 || m25601d() <= this.f14926o - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final int m25601d() {
        return (int) (this.f14935x / this.f14921j);
    }

    /* renamed from: e */
    private final boolean m25600e() {
        if (this.f14926o == 0 || m25601d() < this.f14926o - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m25599f() {
        return m25602c() == 0;
    }

    /* renamed from: g */
    private final boolean m25598g() {
        return m25601d() == 0;
    }

    /* renamed from: h */
    private final boolean m25597h() {
        return m25602c() == this.f14922k - 1;
    }

    /* renamed from: i */
    private final void m25596i() {
        long longValue;
        boolean z;
        int m25602c = m25602c();
        long longValue2 = this.f14920A.m25593b().invoke().longValue();
        Long l = this.f14936y;
        if (l == null) {
            longValue = this.f14935x;
        } else {
            longValue = (this.f14935x + longValue2) - l.longValue();
        }
        this.f14935x = longValue;
        this.f14936y = Long.valueOf(longValue2);
        if (m25602c() != m25602c) {
            z = true;
        } else {
            z = false;
        }
        if (this.f14934w) {
            if (m25599f() && m25598g() && l == null) {
                for (AbstractC1905b abstractC1905b : this.f14929r) {
                    abstractC1905b.m35079b(this);
                }
            } else if (m25597h() && m25600e() && z) {
                for (InterfaceC8897a interfaceC8897a : this.f14930s) {
                    interfaceC8897a.m17052b(this, m25601d() + 2);
                    interfaceC8897a.m17053a(this, m25601d() + 1);
                }
            }
        }
        if (m25603b()) {
            this.f14934w = false;
            for (AbstractC1905b abstractC1905b2 : this.f14929r) {
                abstractC1905b2.mo26908a(this);
            }
        }
    }

    /* renamed from: c */
    public final int m25602c() {
        int i;
        long j = this.f14935x % this.f14921j;
        if (m25603b()) {
            i = this.f14921j;
        } else {
            i = 0;
        }
        return m25604a(0, this.f14922k - 1, j + i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C9612q.m13917h(canvas, "canvas");
        if (this.f14934w) {
            m25596i();
        }
        Apng m25594a = this.f14920A.m25594a();
        int m25602c = m25602c();
        Rect bounds = getBounds();
        C9612q.m13918g(bounds, "bounds");
        m25594a.drawWithIndex(m25602c, canvas, null, bounds, this.f14928q);
        if (this.f14934w) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f14920A;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f14933v;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f14932u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f14934w;
    }

    /* renamed from: j */
    public final void m25595j() {
        this.f14920A.m25594a().recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f14920A = new C5261a(this.f14920A);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f14928q.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14928q.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f14934w = true;
        this.f14936y = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f14934w = false;
        invalidateSelf();
    }
}
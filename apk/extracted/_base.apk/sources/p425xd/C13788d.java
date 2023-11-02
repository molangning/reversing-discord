package p425xd;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u0000 %2\u00020\u0001:\u0002\u0018&B5\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m14357d2 = {"Lxd/d;", "Ljava/io/Closeable;", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "Landroid/hardware/camera2/params/OutputConfiguration;", "j", "", "toString", "", "close", "Landroid/view/Surface;", "Landroid/view/Surface;", "i", "()Landroid/view/Surface;", "surface", "Landroid/util/Size;", "k", "Landroid/util/Size;", "h", "()Landroid/util/Size;", "size", "Lxd/d$b;", "l", "Lxd/d$b;", "a", "()Lxd/d$b;", "outputType", "", "m", "Ljava/lang/Long;", "dynamicRangeProfile", "", "n", "Z", "closeSurfaceOnEnd", "<init>", "(Landroid/view/Surface;Landroid/util/Size;Lxd/d$b;Ljava/lang/Long;Z)V", "o", "b", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: xd.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13788d implements Closeable {

    /* renamed from: o */
    public static final C13789a f35548o = new C13789a(null);

    /* renamed from: j */
    private final Surface f35549j;

    /* renamed from: k */
    private final Size f35550k;

    /* renamed from: l */
    private final EnumC13790b f35551l;

    /* renamed from: m */
    private final Long f35552m;

    /* renamed from: n */
    private final boolean f35553n;

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m14357d2 = {"Lxd/d$a;", "", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "Lxd/d$b;", "outputType", "", "b", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: xd.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13789a {
        private C13789a() {
        }

        public /* synthetic */ C13789a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final boolean m1526b(CameraCharacteristics cameraCharacteristics, EnumC13790b enumC13790b) {
            long[] jArr;
            boolean m14192x;
            if (Build.VERSION.SDK_INT >= 33 && (jArr = (long[]) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) != null) {
                m14192x = C9538f.m14192x(jArr, enumC13790b.m1524b());
                if (m14192x) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m14357d2 = {"Lxd/d$b;", "", "", "b", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "m", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: xd.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC13790b {
        PHOTO,
        VIDEO,
        PREVIEW,
        VIDEO_AND_PREVIEW;

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: xd.d$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public /* synthetic */ class C13791a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f35559a;

            static {
                int[] iArr = new int[EnumC13790b.values().length];
                try {
                    iArr[EnumC13790b.PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC13790b.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC13790b.PREVIEW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC13790b.VIDEO_AND_PREVIEW.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f35559a = iArr;
            }
        }

        /* renamed from: b */
        public final int m1524b() {
            int i = C13791a.f35559a[ordinal()];
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 1;
            }
            if (i == 4) {
                return 4;
            }
            throw new C11581q();
        }
    }

    public C13788d(Surface surface, Size size, EnumC13790b outputType, Long l, boolean z) {
        C9612q.m13917h(surface, "surface");
        C9612q.m13917h(size, "size");
        C9612q.m13917h(outputType, "outputType");
        this.f35549j = surface;
        this.f35550k = size;
        this.f35551l = outputType;
        this.f35552m = l;
        this.f35553n = z;
    }

    /* renamed from: a */
    public final EnumC13790b m1531a() {
        return this.f35551l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f35553n) {
            this.f35549j.release();
        }
    }

    /* renamed from: h */
    public final Size m1530h() {
        return this.f35550k;
    }

    /* renamed from: i */
    public final Surface m1529i() {
        return this.f35549j;
    }

    /* renamed from: j */
    public final OutputConfiguration m1528j(CameraCharacteristics characteristics) {
        C9612q.m13917h(characteristics, "characteristics");
        OutputConfiguration outputConfiguration = new OutputConfiguration(this.f35549j);
        if (Build.VERSION.SDK_INT >= 33) {
            Long l = this.f35552m;
            if (l != null) {
                outputConfiguration.setDynamicRangeProfile(l.longValue());
                Log.i("SurfaceOutput", "Using dynamic range profile " + outputConfiguration.getDynamicRangeProfile() + " for " + this.f35551l + " output.");
            }
            if (f35548o.m1526b(characteristics, this.f35551l)) {
                outputConfiguration.setStreamUseCase(this.f35551l.m1524b());
                Log.i("SurfaceOutput", "Using optimized stream use case " + outputConfiguration.getStreamUseCase() + " for " + this.f35551l + " output.");
            }
        }
        return outputConfiguration;
    }

    public String toString() {
        return this.f35551l + " (" + this.f35550k.getWidth() + " x " + this.f35550k.getHeight() + ')';
    }

    public /* synthetic */ C13788d(Surface surface, Size size, EnumC13790b enumC13790b, Long l, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(surface, size, enumC13790b, (i & 8) != 0 ? null : l, (i & 16) != 0 ? false : z);
    }
}

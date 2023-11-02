package p405wd;

import android.content.Context;
import android.media.ImageWriter;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import co.discord.media_engine.C2689b;
import com.mrousavy.camera.C5341y;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p465zd.EnumC14156e;
import p465zd.EnumC14168j;
import p465zd.EnumC14171k;

@Metadata(m14358d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u00020\u0001:\u0002\n\u0010Bo\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0002\u0010!\u001a\u00020\u001f\u0012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020\"\u0012\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020\"¢\u0006\u0004\b>\u0010?J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0017\u0010;\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b\u001c\u0010:¨\u0006A"}, m14357d2 = {"Lwd/n;", "", "", "h", "i", "f", "g", "", "toString", "Landroid/util/Size;", "a", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "size", "", "b", "Z", "enableAudio", "", "c", "Ljava/lang/Integer;", "fps", "Lzd/j;", "d", "Lzd/j;", "codec", "Lzd/e;", "e", "Lzd/e;", "orientation", "Lzd/k;", "Lzd/k;", "fileType", "Lkotlin/Function1;", "Lwd/n$b;", "Lkotlin/jvm/functions/Function1;", "callback", "Lcom/mrousavy/camera/y;", "onError", "Landroid/media/MediaRecorder;", "Landroid/media/MediaRecorder;", "recorder", "Ljava/io/File;", "j", "Ljava/io/File;", "outputFile", "", "k", "Ljava/lang/Long;", "startTime", "Landroid/media/ImageWriter;", "l", "Landroid/media/ImageWriter;", "imageWriter", "Landroid/view/Surface;", "m", "Landroid/view/Surface;", "()Landroid/view/Surface;", "surface", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Landroid/util/Size;ZLjava/lang/Integer;Lzd/j;Lzd/e;Lzd/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "n", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: wd.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13526n {

    /* renamed from: n */
    public static final C13527a f34877n = new C13527a(null);

    /* renamed from: a */
    private final Size f34878a;

    /* renamed from: b */
    private final boolean f34879b;

    /* renamed from: c */
    private final Integer f34880c;

    /* renamed from: d */
    private final EnumC14168j f34881d;

    /* renamed from: e */
    private final EnumC14156e f34882e;

    /* renamed from: f */
    private final EnumC14171k f34883f;

    /* renamed from: g */
    private final Function1<C13528b, Unit> f34884g;

    /* renamed from: h */
    private final Function1<C5341y, Unit> f34885h;

    /* renamed from: i */
    private final MediaRecorder f34886i;

    /* renamed from: j */
    private final File f34887j;

    /* renamed from: k */
    private Long f34888k;

    /* renamed from: l */
    private ImageWriter f34889l;

    /* renamed from: m */
    private final Surface f34890m;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, m14357d2 = {"Lwd/n$a;", "", "", "AUDIO_BIT_RATE", "I", "AUDIO_CHANNELS", "AUDIO_SAMPLING_RATE", "", "TAG", "Ljava/lang/String;", "VIDEO_BIT_RATE", "<init>", "()V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: wd.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13527a {
        private C13527a() {
        }

        public /* synthetic */ C13527a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, m14357d2 = {"Lwd/n$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "path", "", "J", "()J", "durationMs", "<init>", "(Ljava/lang/String;J)V", "react-native-vision-camera_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: wd.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13528b {

        /* renamed from: a */
        private final String f34891a;

        /* renamed from: b */
        private final long f34892b;

        public C13528b(String path, long j) {
            C9612q.m13917h(path, "path");
            this.f34891a = path;
            this.f34892b = j;
        }

        /* renamed from: a */
        public final long m2295a() {
            return this.f34892b;
        }

        /* renamed from: b */
        public final String m2294b() {
            return this.f34891a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C13528b) {
                C13528b c13528b = (C13528b) obj;
                return C9612q.m13922c(this.f34891a, c13528b.f34891a) && this.f34892b == c13528b.f34892b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f34891a.hashCode() * 31) + C2689b.m32716a(this.f34892b);
        }

        public String toString() {
            return "Video(path=" + this.f34891a + ", durationMs=" + this.f34892b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13526n(Context context, Size size, boolean z, Integer num, EnumC14168j codec, EnumC14156e orientation, EnumC14171k fileType, Function1<? super C13528b, Unit> callback, Function1<? super C5341y, Unit> onError) {
        MediaRecorder mediaRecorder;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(size, "size");
        C9612q.m13917h(codec, "codec");
        C9612q.m13917h(orientation, "orientation");
        C9612q.m13917h(fileType, "fileType");
        C9612q.m13917h(callback, "callback");
        C9612q.m13917h(onError, "onError");
        this.f34878a = size;
        this.f34879b = z;
        this.f34880c = num;
        this.f34881d = codec;
        this.f34882e = orientation;
        this.f34883f = fileType;
        this.f34884g = callback;
        this.f34885h = onError;
        Surface createPersistentInputSurface = MediaCodec.createPersistentInputSurface();
        C9612q.m13918g(createPersistentInputSurface, "createPersistentInputSurface()");
        this.f34890m = createPersistentInputSurface;
        File createTempFile = File.createTempFile("mrousavy", fileType.m531b(), context.getCacheDir());
        C9612q.m13918g(createTempFile, "createTempFile(\"mrousavy…sion(), context.cacheDir)");
        this.f34887j = createTempFile;
        Log.i("RecordingSession", "Creating RecordingSession for " + createTempFile.getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 31) {
            mediaRecorder = new MediaRecorder(context);
        } else {
            mediaRecorder = new MediaRecorder();
        }
        this.f34886i = mediaRecorder;
        if (z) {
            mediaRecorder.setAudioSource(5);
        }
        mediaRecorder.setVideoSource(2);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setOutputFile(createTempFile.getAbsolutePath());
        mediaRecorder.setVideoEncodingBitRate(10000000);
        mediaRecorder.setVideoSize(size.getHeight(), size.getWidth());
        if (num != null) {
            mediaRecorder.setVideoFrameRate(num.intValue());
        }
        Log.i("RecordingSession", "Using " + codec + " Video Codec..");
        mediaRecorder.setVideoEncoder(codec.m534b());
        if (z) {
            Log.i("RecordingSession", "Adding Audio Channel..");
            mediaRecorder.setAudioEncoder(3);
            mediaRecorder.setAudioEncodingBitRate(705600);
            mediaRecorder.setAudioSamplingRate(44100);
            mediaRecorder.setAudioChannels(1);
        }
        mediaRecorder.setInputSurface(createPersistentInputSurface);
        mediaRecorder.setOnErrorListener(new MediaRecorder.OnErrorListener() { // from class: wd.l
            @Override // android.media.MediaRecorder.OnErrorListener
            public final void onError(MediaRecorder mediaRecorder2, int i, int i2) {
                C13526n.m2302c(C13526n.this, mediaRecorder2, i, i2);
            }
        });
        mediaRecorder.setOnInfoListener(new MediaRecorder.OnInfoListener() { // from class: wd.m
            @Override // android.media.MediaRecorder.OnInfoListener
            public final void onInfo(MediaRecorder mediaRecorder2, int i, int i2) {
                C13526n.m2301d(mediaRecorder2, i, i2);
            }
        });
        Log.i("RecordingSession", "Created " + this + '!');
    }

    /* renamed from: c */
    public static final void m2302c(C13526n this$0, MediaRecorder mediaRecorder, int i, int i2) {
        C9612q.m13917h(this$0, "this$0");
        Log.e("RecordingSession", "MediaRecorder Error: " + i + " (" + i2 + ')');
        this$0.m2296i();
        String str = "unknown";
        if (i != 1 && i == 100) {
            str = "server-died";
        }
        this$0.f34885h.invoke(new C5341y(str, i2));
    }

    /* renamed from: d */
    public static final void m2301d(MediaRecorder mediaRecorder, int i, int i2) {
        Log.i("RecordingSession", "MediaRecorder Info: " + i + " (" + i2 + ')');
    }

    /* renamed from: e */
    public final Surface m2300e() {
        return this.f34890m;
    }

    /* renamed from: f */
    public final void m2299f() {
        synchronized (this) {
            Log.i("RecordingSession", "Pausing Recording Session..");
            this.f34886i.pause();
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: g */
    public final void m2298g() {
        synchronized (this) {
            Log.i("RecordingSession", "Resuming Recording Session..");
            this.f34886i.resume();
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: h */
    public final void m2297h() {
        synchronized (this) {
            Log.i("RecordingSession", "Starting RecordingSession..");
            this.f34886i.prepare();
            this.f34886i.start();
            this.f34888k = Long.valueOf(System.currentTimeMillis());
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: i */
    public final void m2296i() {
        long j;
        synchronized (this) {
            Log.i("RecordingSession", "Stopping RecordingSession..");
            try {
                this.f34886i.stop();
                this.f34886i.release();
                ImageWriter imageWriter = this.f34889l;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.f34889l = null;
            } catch (Error e) {
                Log.e("RecordingSession", "Failed to stop MediaRecorder!", e);
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l = this.f34888k;
            if (l != null) {
                j = l.longValue();
            } else {
                j = currentTimeMillis;
            }
            long j2 = currentTimeMillis - j;
            Function1<C13528b, Unit> function1 = this.f34884g;
            String absolutePath = this.f34887j.getAbsolutePath();
            C9612q.m13918g(absolutePath, "outputFile.absolutePath");
            function1.invoke(new C13528b(absolutePath, j2));
            Unit unit = Unit.f25302a;
        }
    }

    public String toString() {
        String str;
        if (this.f34879b) {
            str = "with audio";
        } else {
            str = "without audio";
        }
        return this.f34878a.getWidth() + " x " + this.f34878a.getHeight() + " @ " + this.f34880c + " FPS " + this.f34881d + ' ' + this.f34883f + ' ' + this.f34882e + " RecordingSession (" + str + ')';
    }
}
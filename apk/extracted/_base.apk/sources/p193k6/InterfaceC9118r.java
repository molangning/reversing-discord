package p193k6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.audio.AudioAttributes;
import java.nio.ByteBuffer;

/* renamed from: k6.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC9118r {

    /* renamed from: k6.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9120b extends Exception {

        /* renamed from: j */
        public final int f24003j;

        /* renamed from: k */
        public final boolean f24004k;

        /* renamed from: l */
        public final Format f24005l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C9120b(int r3, int r4, int r5, int r6, com.google.android.exoplayer2.Format r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L32
                java.lang.String r4 = " (recoverable)"
                goto L34
            L32:
                java.lang.String r4 = ""
            L34:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f24003j = r3
                r2.f24004k = r8
                r2.f24005l = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p193k6.InterfaceC9118r.C9120b.<init>(int, int, int, int, com.google.android.exoplayer2.Format, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: k6.r$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9121c {
        /* renamed from: a */
        void mo16542a(boolean z);

        /* renamed from: b */
        void mo16541b(long j);

        /* renamed from: c */
        void mo16540c(Exception exc);

        /* renamed from: d */
        void mo16539d(long j);

        /* renamed from: e */
        void mo16538e(int i, long j, long j2);

        /* renamed from: f */
        void mo16537f();

        /* renamed from: g */
        void mo16536g();
    }

    /* renamed from: k6.r$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9122d extends Exception {

        /* renamed from: j */
        public final int f24006j;

        /* renamed from: k */
        public final boolean f24007k;

        /* renamed from: l */
        public final Format f24008l;

        public C9122d(int i, Format format, boolean z) {
            super("AudioTrack write failed: " + i);
            this.f24007k = z;
            this.f24006j = i;
            this.f24008l = format;
        }
    }

    /* renamed from: a */
    boolean mo16564a(Format format);

    /* renamed from: b */
    PlaybackParameters mo16563b();

    /* renamed from: c */
    boolean mo16562c();

    /* renamed from: f */
    void mo16561f(PlaybackParameters playbackParameters);

    void flush();

    /* renamed from: g */
    boolean mo16560g();

    /* renamed from: h */
    void mo16559h(C9128u c9128u);

    /* renamed from: i */
    void mo16558i(int i);

    /* renamed from: j */
    void mo16557j();

    /* renamed from: k */
    void mo16556k();

    /* renamed from: l */
    void mo16555l(AudioAttributes audioAttributes);

    /* renamed from: m */
    boolean mo16554m(ByteBuffer byteBuffer, long j, int i);

    /* renamed from: n */
    int mo16553n(Format format);

    /* renamed from: o */
    void mo16552o();

    /* renamed from: p */
    void mo16551p();

    /* renamed from: q */
    long mo16550q(boolean z);

    /* renamed from: r */
    void mo16549r(InterfaceC9121c interfaceC9121c);

    void reset();

    /* renamed from: s */
    void mo16548s();

    /* renamed from: t */
    void mo16547t(float f);

    /* renamed from: u */
    void mo16546u();

    /* renamed from: v */
    void mo16545v();

    /* renamed from: w */
    void mo16544w(Format format, int i, int[] iArr);

    /* renamed from: x */
    void mo16543x(boolean z);

    /* renamed from: k6.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9119a extends Exception {

        /* renamed from: j */
        public final Format f24002j;

        public C9119a(Throwable th2, Format format) {
            super(th2);
            this.f24002j = format;
        }

        public C9119a(String str, Format format) {
            super(str);
            this.f24002j = format;
        }
    }
}

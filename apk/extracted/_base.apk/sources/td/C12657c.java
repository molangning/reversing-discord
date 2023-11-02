package td;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import md.C10438c;
import md.InterfaceC10437b;
import p266od.InterfaceC11081a;
import p387vd.C13247a;
import p387vd.C13252f;

@Metadata(m14358d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B#\b\u0007\u0012\u0006\u0010A\u001a\u00020>\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010B¢\u0006\u0004\bC\u0010DJ&\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\t\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR\u0016\u0010#\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\n068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u00060:R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006E"}, m14357d2 = {"Ltd/c;", "Ltd/i;", "Landroid/view/Surface;", "outputSurface", "Landroid/media/MediaFormat;", "sourceMediaFormat", "targetMediaFormat", "", "b", "d", "Lmd/c;", "inputFrame", "", "presentationTimeNs", "c", "release", "", "a", "", "Lod/a;", "Ljava/util/List;", "filters", "Landroid/media/MediaFormat;", "", "D", "targetSampleDurationUs", "", "e", "I", "sourceChannelCount", "f", "targetChannelCount", "g", "sourceSampleRate", "h", "targetSampleRate", "i", "samplingRatio", "Lvd/a;", "j", "Lvd/a;", "bufferPool", "Ltd/b;", "k", "Ltd/b;", "audioProcessorFactory", "Ltd/a;", "l", "Ltd/a;", "audioProcessor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "m", "Ljava/util/concurrent/atomic/AtomicBoolean;", "released", "Ljava/util/concurrent/LinkedBlockingDeque;", "n", "Ljava/util/concurrent/LinkedBlockingDeque;", "renderQueue", "Ltd/c$a;", "o", "Ltd/c$a;", "renderThread", "Lmd/b;", "p", "Lmd/b;", "encoder", "", "<init>", "(Lmd/b;Ljava/util/List;)V", "litr_release"}, m14356k = 1, m14355mv = {1, 4, 2})
/* renamed from: td.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12657c implements InterfaceC12664i {

    /* renamed from: a */
    private final List<InterfaceC11081a> f32798a;

    /* renamed from: b */
    private MediaFormat f32799b;

    /* renamed from: c */
    private MediaFormat f32800c;

    /* renamed from: d */
    private double f32801d;

    /* renamed from: e */
    private int f32802e;

    /* renamed from: f */
    private int f32803f;

    /* renamed from: g */
    private int f32804g;

    /* renamed from: h */
    private int f32805h;

    /* renamed from: i */
    private double f32806i;

    /* renamed from: j */
    private final C13247a f32807j;

    /* renamed from: k */
    private final C12656b f32808k;

    /* renamed from: l */
    private InterfaceC12655a f32809l;

    /* renamed from: m */
    private AtomicBoolean f32810m;

    /* renamed from: n */
    private final LinkedBlockingDeque<C10438c> f32811n;

    /* renamed from: o */
    private final C12658a f32812o;

    /* renamed from: p */
    private final InterfaceC10437b f32813p;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, m14357d2 = {"Ltd/c$a;", "Ljava/lang/Thread;", "", "tag", "Lmd/c;", "inputFrame", "", "a", "run", "<init>", "(Ltd/c;)V", "litr_release"}, m14356k = 1, m14355mv = {1, 4, 2})
    /* renamed from: td.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class C12658a extends Thread {
        public C12658a() {
        }

        /* renamed from: a */
        private final void m4596a(int i, C10438c c10438c) {
            ByteBuffer byteBuffer;
            boolean z;
            C10438c mo11555a = C12657c.this.f32813p.mo11555a(i);
            if (mo11555a != null && mo11555a.f27261b != null && (byteBuffer = c10438c.f27261b) != null) {
                MediaCodec.BufferInfo bufferInfo = mo11555a.f27262c;
                bufferInfo.offset = 0;
                MediaCodec.BufferInfo bufferInfo2 = c10438c.f27262c;
                bufferInfo.flags = bufferInfo2.flags;
                bufferInfo.presentationTimeUs = bufferInfo2.presentationTimeUs + ((long) ((byteBuffer.position() / (C12657c.this.f32803f * 2)) * C12657c.this.f32801d));
                if (mo11555a.f27261b.limit() >= c10438c.f27261b.remaining()) {
                    mo11555a.f27262c.size = c10438c.f27261b.remaining();
                    z = true;
                } else {
                    mo11555a.f27262c.size = mo11555a.f27261b.limit();
                    mo11555a.f27262c.flags &= -5;
                    z = false;
                }
                int i2 = mo11555a.f27262c.size;
                for (int i3 = 0; i3 < i2; i3++) {
                    mo11555a.f27261b.put(c10438c.f27261b.get());
                }
                if (z) {
                    C12657c.this.f32811n.removeFirst();
                    C12657c.this.f32807j.m2940d(c10438c.f27261b);
                }
                C12657c.this.f32813p.mo11550f(mo11555a);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!C12657c.this.f32810m.get()) {
                C10438c c10438c = (C10438c) C12657c.this.f32811n.peekFirst();
                if (c10438c != null) {
                    int mo11552d = C12657c.this.f32813p.mo11552d(0L);
                    if (mo11552d >= 0) {
                        m4596a(mo11552d, c10438c);
                    } else if (mo11552d != -1) {
                        Log.e("AudioRenderer", "Unhandled value " + mo11552d + " when receiving decoded input frame");
                    }
                }
            }
            C12657c.this.f32811n.clear();
        }
    }

    public C12657c(InterfaceC10437b interfaceC10437b) {
        this(interfaceC10437b, null, 2, null);
    }

    public C12657c(InterfaceC10437b encoder, List<InterfaceC11081a> list) {
        C9612q.m13917h(encoder, "encoder");
        this.f32813p = encoder;
        this.f32798a = list == null ? C9545j.m14104i() : list;
        this.f32802e = -1;
        this.f32803f = -1;
        this.f32804g = -1;
        this.f32805h = -1;
        this.f32806i = 1.0d;
        this.f32807j = new C13247a(true);
        this.f32808k = new C12656b();
        this.f32810m = new AtomicBoolean(false);
        this.f32811n = new LinkedBlockingDeque<>();
        this.f32812o = new C12658a();
    }

    @Override // td.InterfaceC12664i
    /* renamed from: a */
    public boolean mo4586a() {
        return !this.f32798a.isEmpty();
    }

    @Override // td.InterfaceC12664i
    /* renamed from: b */
    public void mo4585b(Surface surface, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        mo4583d(mediaFormat, mediaFormat2);
        this.f32810m.set(false);
        this.f32812o.start();
        for (InterfaceC11081a interfaceC11081a : this.f32798a) {
            interfaceC11081a.m9189c(mediaFormat2);
        }
    }

    @Override // td.InterfaceC12664i
    /* renamed from: c */
    public void mo4584c(C10438c c10438c, long j) {
        if (!this.f32810m.get() && c10438c != null) {
            C10438c c10438c2 = new C10438c(c10438c.f27260a, this.f32807j.m2941c(((int) Math.ceil((c10438c.f27262c.size / (this.f32802e * 2)) * this.f32806i)) * this.f32803f * 2), new MediaCodec.BufferInfo());
            InterfaceC12655a interfaceC12655a = this.f32809l;
            if (interfaceC12655a != null) {
                interfaceC12655a.mo4587a(c10438c, c10438c2);
            }
            for (InterfaceC11081a interfaceC11081a : this.f32798a) {
                interfaceC11081a.m9190a(c10438c2);
            }
            this.f32811n.add(c10438c2);
        }
    }

    @Override // td.InterfaceC12664i
    /* renamed from: d */
    public void mo4583d(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        Number number;
        Number number2;
        Number number3;
        Number m2924d;
        Integer num = -1;
        if (mediaFormat == null || (number = C13252f.f34320a.m2927a(mediaFormat, num)) == null) {
            number = num;
        }
        if (mediaFormat2 == null || (number2 = C13252f.f34320a.m2927a(mediaFormat2, num)) == null) {
            number2 = num;
        }
        if (mediaFormat == null || (number3 = C13252f.f34320a.m2924d(mediaFormat, num)) == null) {
            number3 = num;
        }
        if (mediaFormat2 != null && (m2924d = C13252f.f34320a.m2924d(mediaFormat2, num)) != null) {
            num = m2924d;
        }
        int i = this.f32802e;
        if ((number instanceof Integer) && i == ((Integer) number).intValue()) {
            int i2 = this.f32803f;
            if ((number2 instanceof Integer) && i2 == ((Integer) number2).intValue()) {
                int i3 = this.f32804g;
                if ((number3 instanceof Integer) && i3 == ((Integer) number3).intValue()) {
                    int i4 = this.f32805h;
                    if ((num instanceof Integer) && i4 == num.intValue()) {
                        return;
                    }
                }
            }
        }
        InterfaceC12655a interfaceC12655a = this.f32809l;
        if (interfaceC12655a != null) {
            interfaceC12655a.release();
        }
        this.f32809l = this.f32808k.m4603a(mediaFormat, mediaFormat2);
        this.f32802e = number.intValue();
        this.f32803f = number2.intValue();
        this.f32804g = number3.intValue();
        this.f32805h = num.intValue();
        this.f32801d = 1000000.0d / num.doubleValue();
        this.f32806i = num.doubleValue() / number3.doubleValue();
        this.f32799b = mediaFormat;
        this.f32800c = mediaFormat2;
    }

    @Override // td.InterfaceC12664i
    public void release() {
        this.f32810m.set(true);
        InterfaceC12655a interfaceC12655a = this.f32809l;
        if (interfaceC12655a != null) {
            interfaceC12655a.release();
        }
        this.f32807j.m2942b();
        for (InterfaceC11081a interfaceC11081a : this.f32798a) {
            interfaceC11081a.release();
        }
    }

    public /* synthetic */ C12657c(InterfaceC10437b interfaceC10437b, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10437b, (i & 2) != 0 ? null : list);
    }
}

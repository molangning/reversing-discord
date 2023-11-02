package p369ud;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import md.C10438c;
import md.InterfaceC10436a;
import md.InterfaceC10437b;
import p248nd.C10578e;
import sd.InterfaceC12458c;
import sd.InterfaceC12459d;
import td.InterfaceC12664i;

/* renamed from: ud.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12952a extends AbstractC12954c {

    /* renamed from: q */
    private static final String f33674q = "a";

    /* renamed from: m */
    int f33675m;

    /* renamed from: n */
    int f33676n;

    /* renamed from: o */
    int f33677o;

    /* renamed from: p */
    private MediaFormat f33678p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12952a(InterfaceC12458c interfaceC12458c, int i, InterfaceC12459d interfaceC12459d, int i2, MediaFormat mediaFormat, InterfaceC12664i interfaceC12664i, InterfaceC10436a interfaceC10436a, InterfaceC10437b interfaceC10437b) {
        super(interfaceC12458c, i, interfaceC12459d, i2, mediaFormat, interfaceC12664i, interfaceC10436a, interfaceC10437b);
        this.f33675m = 2;
        this.f33676n = 2;
        this.f33677o = 2;
        m3605k();
    }

    /* renamed from: j */
    private int m3606j() {
        int i;
        int sampleTrackIndex = this.f33683a.getSampleTrackIndex();
        if (sampleTrackIndex != this.f33689g && sampleTrackIndex != -1) {
            return 2;
        }
        int mo11560d = this.f33686d.mo11560d(0L);
        if (mo11560d >= 0) {
            C10438c mo11563a = this.f33686d.mo11563a(mo11560d);
            if (mo11563a != null) {
                int readSampleData = this.f33683a.readSampleData(mo11563a.f27261b, 0);
                long sampleTime = this.f33683a.getSampleTime();
                int sampleFlags = this.f33683a.getSampleFlags();
                if (readSampleData >= 0 && (sampleFlags & 4) == 0) {
                    if (sampleTime >= this.f33688f.m25544a()) {
                        mo11563a.f27262c.set(0, 0, -1L, 4);
                        this.f33686d.mo11558f(mo11563a);
                        i = m3601b();
                        Log.d(f33674q, "Selection end reached on the input stream");
                    } else {
                        mo11563a.f27262c.set(0, readSampleData, sampleTime, sampleFlags);
                        this.f33686d.mo11558f(mo11563a);
                        this.f33683a.advance();
                        return 2;
                    }
                } else {
                    mo11563a.f27262c.set(0, 0, -1L, 4);
                    this.f33686d.mo11558f(mo11563a);
                    Log.d(f33674q, "EoS reached on the input stream");
                    i = 4;
                }
                return i;
            }
            throw new C10578e(C10578e.EnumC10579a.NO_FRAME_AVAILABLE);
        } else if (mo11560d == -1) {
            return 2;
        } else {
            String str = f33674q;
            Log.e(str, "Unhandled value " + mo11560d + " when decoding an input frame");
            return 2;
        }
    }

    /* renamed from: k */
    private void m3605k() {
        this.f33678p = this.f33683a.getTrackFormat(this.f33689g);
        this.f33687e.mo11553c(this.f33692j);
        this.f33685c.mo4585b(null, this.f33678p, this.f33692j);
        this.f33686d.mo11557g(this.f33678p, null);
    }

    /* renamed from: l */
    private int m3604l() {
        int mo11562b = this.f33686d.mo11562b(0L);
        if (mo11562b >= 0) {
            C10438c mo11559e = this.f33686d.mo11559e(mo11562b);
            if (mo11559e != null) {
                if (mo11559e.f27262c.presentationTimeUs >= this.f33688f.m25543b() || (mo11559e.f27262c.flags & 4) != 0) {
                    long m25543b = mo11559e.f27262c.presentationTimeUs - this.f33688f.m25543b();
                    mo11559e.f27262c.presentationTimeUs = m25543b;
                    this.f33685c.mo4584c(mo11559e, TimeUnit.MICROSECONDS.toNanos(m25543b));
                }
                this.f33686d.mo11556h(mo11562b, false);
                if ((mo11559e.f27262c.flags & 4) == 0) {
                    return 2;
                }
                Log.d(f33674q, "EoS on decoder output stream");
                return 4;
            }
            throw new C10578e(C10578e.EnumC10579a.NO_FRAME_AVAILABLE);
        } else if (mo11562b != -2) {
            if (mo11562b == -1) {
                return 2;
            }
            String str = f33674q;
            Log.e(str, "Unhandled value " + mo11562b + " when receiving decoded input frame");
            return 2;
        } else {
            MediaFormat outputFormat = this.f33686d.getOutputFormat();
            this.f33678p = outputFormat;
            this.f33685c.mo4583d(outputFormat, this.f33692j);
            String str2 = f33674q;
            Log.d(str2, "Decoder output format changed: " + this.f33678p);
            return 2;
        }
    }

    /* renamed from: m */
    private int m3603m() {
        int mo11554b = this.f33687e.mo11554b(0L);
        int i = 2;
        if (mo11554b >= 0) {
            C10438c mo11551e = this.f33687e.mo11551e(mo11554b);
            if (mo11551e != null) {
                MediaCodec.BufferInfo bufferInfo = mo11551e.f27262c;
                int i2 = bufferInfo.flags;
                if ((i2 & 4) != 0) {
                    Log.d(f33674q, "Encoder produced EoS, we are done");
                    this.f33694l = 1.0f;
                    i = 4;
                } else if (bufferInfo.size > 0 && (i2 & 2) == 0) {
                    this.f33684b.mo5222b(this.f33690h, mo11551e.f27261b, bufferInfo);
                    long j = this.f33693k;
                    if (j > 0) {
                        this.f33694l = ((float) mo11551e.f27262c.presentationTimeUs) / ((float) j);
                    }
                }
                this.f33687e.mo11548h(mo11554b);
            } else {
                throw new C10578e(C10578e.EnumC10579a.NO_FRAME_AVAILABLE);
            }
        } else if (mo11554b != -2) {
            if (mo11554b != -1) {
                Log.e(f33674q, "Unhandled value " + mo11554b + " when receiving encoded output frame");
            }
        } else {
            MediaFormat outputFormat = this.f33687e.getOutputFormat();
            i = 1;
            if (!this.f33691i) {
                MediaFormat m3602a = m3602a(this.f33678p, outputFormat);
                this.f33692j = m3602a;
                this.f33690h = this.f33684b.mo5221c(m3602a, this.f33690h);
                this.f33691i = true;
                this.f33685c.mo4583d(this.f33678p, this.f33692j);
            }
            Log.d(f33674q, "Encoder output format received " + outputFormat);
        }
        return i;
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: g */
    public int mo3595g() {
        if (this.f33687e.isRunning() && this.f33686d.isRunning()) {
            if (this.f33675m == 5) {
                this.f33675m = m3601b();
            }
            int i = this.f33675m;
            if (i != 4 && i != 5) {
                this.f33675m = m3606j();
            }
            if (this.f33676n != 4) {
                this.f33676n = m3604l();
            }
            if (this.f33677o != 4) {
                this.f33677o = m3603m();
            }
            int i2 = this.f33677o;
            int i3 = 1;
            if (i2 != 1) {
                i3 = 2;
            }
            int i4 = this.f33675m;
            if ((i4 == 4 || i4 == 5) && this.f33676n == 4 && i2 == 4) {
                return 4;
            }
            return i3;
        }
        return -3;
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: h */
    public void mo3594h() {
        this.f33683a.selectTrack(this.f33689g);
        this.f33687e.start();
        this.f33686d.start();
    }

    @Override // p369ud.AbstractC12954c
    /* renamed from: i */
    public void mo3593i() {
        this.f33685c.release();
        this.f33687e.stop();
        this.f33687e.release();
        this.f33686d.stop();
        this.f33686d.release();
    }
}

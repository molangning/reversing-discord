package p369ud;

import android.media.MediaFormat;
import android.util.Log;
import md.InterfaceC10436a;
import md.InterfaceC10437b;
import org.webrtc.MediaStreamTrack;
import p248nd.C10578e;
import sd.InterfaceC12458c;
import sd.InterfaceC12459d;
import td.C12657c;
import td.InterfaceC12664i;

/* renamed from: ud.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12955d {

    /* renamed from: a */
    private static final String f33695a = "d";

    /* renamed from: a */
    public AbstractC12954c m3596a(int i, int i2, InterfaceC12458c interfaceC12458c, InterfaceC10436a interfaceC10436a, InterfaceC12664i interfaceC12664i, InterfaceC10437b interfaceC10437b, InterfaceC12459d interfaceC12459d, MediaFormat mediaFormat) {
        C12657c c12657c;
        if (mediaFormat == null) {
            return new C12953b(interfaceC12458c, i, interfaceC12459d, i2);
        }
        String string = mediaFormat.getString("mime");
        if (string != null) {
            if (string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) || string.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                if (interfaceC10436a != null) {
                    if (interfaceC10437b == null) {
                        throw new C10578e(C10578e.EnumC10579a.ENCODER_NOT_PROVIDED, mediaFormat, null, null);
                    }
                } else {
                    throw new C10578e(C10578e.EnumC10579a.DECODER_NOT_PROVIDED, mediaFormat, null, null);
                }
            }
            if (string.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                if (interfaceC12664i != null) {
                    return new C12956e(interfaceC12458c, i, interfaceC12459d, i2, mediaFormat, interfaceC12664i, interfaceC10436a, interfaceC10437b);
                }
                throw new C10578e(C10578e.EnumC10579a.RENDERER_NOT_PROVIDED, mediaFormat, null, null);
            } else if (string.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                if (interfaceC12664i == null) {
                    c12657c = new C12657c(interfaceC10437b);
                } else {
                    c12657c = interfaceC12664i;
                }
                return new C12952a(interfaceC12458c, i, interfaceC12459d, i2, mediaFormat, c12657c, interfaceC10436a, interfaceC10437b);
            } else {
                String str = f33695a;
                Log.i(str, "Unsupported track mime type: " + string + ", will use passthrough transcoder");
                return new C12953b(interfaceC12458c, i, interfaceC12459d, i2);
            }
        }
        throw new C10578e(C10578e.EnumC10579a.SOURCE_TRACK_MIME_TYPE_NOT_FOUND, mediaFormat, null, null);
    }
}

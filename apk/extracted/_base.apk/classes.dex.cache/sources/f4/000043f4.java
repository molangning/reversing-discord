package p248nd;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Log;
import java.util.Arrays;

/* renamed from: nd.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10578e extends AbstractC10577d {

    /* renamed from: o */
    private static final String f27606o = "nd.e";

    /* renamed from: k */
    private final EnumC10579a f27607k;

    /* renamed from: l */
    private final MediaFormat f27608l;

    /* renamed from: m */
    private final MediaCodec f27609m;

    /* renamed from: n */
    private final MediaCodecList f27610n;

    /* renamed from: nd.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC10579a {
        DECODER_FORMAT_NOT_FOUND("Failed to create decoder codec."),
        DECODER_CONFIGURATION_ERROR("Failed to configure decoder codec."),
        ENCODER_FORMAT_NOT_FOUND("Failed to create encoder codec."),
        ENCODER_CONFIGURATION_ERROR("Failed to configure encoder codec."),
        DECODER_NOT_FOUND("No decoder found."),
        ENCODER_NOT_FOUND("No encoder found."),
        CODEC_IN_RELEASED_STATE("Codecs are in released state."),
        SOURCE_TRACK_MIME_TYPE_NOT_FOUND("Mime type not found for the source track."),
        NO_TRACKS_FOUND("No tracks found."),
        INTERNAL_CODEC_ERROR("Internal codec error occurred."),
        NO_FRAME_AVAILABLE("No frame available for specified tag"),
        DECODER_NOT_PROVIDED("Decoder is not provided"),
        ENCODER_NOT_PROVIDED("Encoder is not provided"),
        RENDERER_NOT_PROVIDED("Renderer is not provided");
        

        /* renamed from: j */
        private final String f27626j;

        EnumC10579a(String str) {
            this.f27626j = str;
        }
    }

    public C10578e(EnumC10579a enumC10579a) {
        this(enumC10579a, null, null, null);
    }

    /* renamed from: b */
    private String m11196b(MediaCodec mediaCodec) {
        try {
            return m11195c(mediaCodec.getCodecInfo());
        } catch (IllegalStateException unused) {
            Log.e(f27606o, "Failed to retrieve media codec info.");
            return "";
        }
    }

    /* renamed from: c */
    private String m11195c(MediaCodecInfo mediaCodecInfo) {
        return "MediaCodecInfo: " + mediaCodecInfo.getName() + ',' + mediaCodecInfo.isEncoder() + ',' + Arrays.asList(mediaCodecInfo.getSupportedTypes()).toString();
    }

    /* renamed from: d */
    private String m11194d(MediaCodecList mediaCodecList) {
        MediaCodecInfo[] codecInfos;
        StringBuilder sb2 = new StringBuilder();
        try {
            for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
                if (mediaCodecInfo != null) {
                    sb2.append('\n');
                    sb2.append(m11195c(mediaCodecInfo));
                }
            }
        } catch (IllegalStateException e) {
            Log.e(f27606o, "Failed to retrieve media codec info.", e);
        }
        return sb2.toString();
    }

    /* renamed from: e */
    private String m11193e(Throwable th2) {
        if (!(th2 instanceof MediaCodec.CodecException)) {
            return null;
        }
        return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f27607k.f27626j;
    }

    @Override // p248nd.AbstractC10577d, java.lang.Throwable
    public String toString() {
        String str = super.toString() + '\n';
        if (this.f27608l != null) {
            str = str + "Media format: " + this.f27608l.toString() + '\n';
        }
        if (this.f27609m != null) {
            str = str + "Selected media codec info: " + m11196b(this.f27609m) + '\n';
        }
        if (this.f27610n != null) {
            str = str + "Available media codec info list (Name, IsEncoder, Supported Types): " + m11194d(this.f27610n);
        }
        if (getCause() != null) {
            return str + "Diagnostic info: " + m11193e(getCause());
        }
        return str;
    }

    public C10578e(EnumC10579a enumC10579a, Throwable th2) {
        this(enumC10579a, null, null, null, th2);
    }

    public C10578e(EnumC10579a enumC10579a, MediaFormat mediaFormat, MediaCodec mediaCodec, MediaCodecList mediaCodecList) {
        this(enumC10579a, mediaFormat, mediaCodec, mediaCodecList, null);
    }

    public C10578e(EnumC10579a enumC10579a, MediaFormat mediaFormat, MediaCodec mediaCodec, MediaCodecList mediaCodecList, Throwable th2) {
        super(th2);
        this.f27607k = enumC10579a;
        this.f27608l = mediaFormat;
        this.f27609m = mediaCodec;
        this.f27610n = mediaCodecList;
    }
}
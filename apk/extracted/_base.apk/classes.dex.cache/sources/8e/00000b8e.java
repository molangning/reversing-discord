package co.discord.media_engine;

import android.media.MediaCodecInfo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.webrtc.C11313j1;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import org.webrtc.Predicate;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class DiscordVideoEncoderFactory implements VideoEncoderFactory {
    private static final HashSet<String> KNOWN_BAD_ENCODERS = new HashSet<>(Arrays.asList("c2.mtk.hevc.encoder", "omx.mtk.video.encoder.hevc"));
    private HardwareVideoEncoderFactory fwd;

    public DiscordVideoEncoderFactory(EglBase.Context context) {
        this.fwd = new HardwareVideoEncoderFactory(context, false, true, new Predicate() { // from class: co.discord.media_engine.a
            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate.CC.m8389a(this, predicate);
            }

            @Override // org.webrtc.Predicate
            public /* synthetic */ Predicate negate() {
                return Predicate.CC.m8388b(this);
            }

            @Override // org.webrtc.Predicate
            /* renamed from: or */
            public /* synthetic */ Predicate mo8386or(Predicate predicate) {
                return Predicate.CC.m8387c(this, predicate);
            }

            @Override // org.webrtc.Predicate
            public final boolean test(Object obj) {
                boolean lambda$new$0;
                lambda$new$0 = DiscordVideoEncoderFactory.lambda$new$0((MediaCodecInfo) obj);
                return lambda$new$0;
            }
        });
    }

    public static /* synthetic */ boolean lambda$new$0(MediaCodecInfo mediaCodecInfo) {
        return !KNOWN_BAD_ENCODERS.contains(mediaCodecInfo.getName().toLowerCase(Locale.ROOT));
    }

    @Override // org.webrtc.VideoEncoderFactory
    public org.webrtc.VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        return this.fwd.createEncoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return C11313j1.m8296a(this);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public /* synthetic */ VideoCodecInfo[] getImplementations() {
        return C11313j1.m8295b(this);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return this.fwd.getSupportedCodecs();
    }
}
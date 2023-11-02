package co.discord.media_engine.internal;

import co.discord.media_engine.InboundRtpAudio;
import co.discord.media_engine.InboundRtpVideo;
import co.discord.media_engine.OutboundRtpAudio;
import co.discord.media_engine.OutboundRtpVideo;
import co.discord.media_engine.PlayoutMetric;
import co.discord.media_engine.Resolution;
import co.discord.media_engine.Stats;
import co.discord.media_engine.StatsCodec;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.Gson;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9612q;
import org.webrtc.MediaStreamTrack;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m14357d2 = {"Lco/discord/media_engine/internal/TransformStats;", "", "()V", "gson", "Lcom/google/gson/Gson;", "convertPlayoutMetricToMs", "Lco/discord/media_engine/PlayoutMetric;", "metric", "sumBytes", "", "rtpStats", "Lco/discord/media_engine/internal/RtpStats;", "sumPackets", ViewProps.TRANSFORM, "Lco/discord/media_engine/Stats;", "stats", "", "transformPlayoutStats", "Lco/discord/media_engine/internal/InboundPlayout;", "playout", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class TransformStats {
    public static final TransformStats INSTANCE = new TransformStats();
    private static final Gson gson = new Gson();

    private TransformStats() {
    }

    private final PlayoutMetric convertPlayoutMetricToMs(PlayoutMetric playoutMetric) {
        double last = playoutMetric.getLast();
        double d = (double) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        return new PlayoutMetric(Math.rint(last * d), Math.rint(playoutMetric.getMean() * d), Math.rint(playoutMetric.getP75() * d), Math.rint(playoutMetric.getP95() * d), Math.rint(playoutMetric.getP99() * d), Math.rint(playoutMetric.getMax() * d));
    }

    private final long sumBytes(RtpStats rtpStats) {
        return rtpStats.getFec().getHeaderBytes() + rtpStats.getFec().getPayloadBytes() + rtpStats.getFec().getPaddingBytes() + rtpStats.getRetransmitted().getHeaderBytes() + rtpStats.getRetransmitted().getPayloadBytes() + rtpStats.getRetransmitted().getPaddingBytes() + rtpStats.getTransmitted().getHeaderBytes() + rtpStats.getTransmitted().getPayloadBytes() + rtpStats.getTransmitted().getPaddingBytes();
    }

    private final long sumPackets(RtpStats rtpStats) {
        return rtpStats.getFec().getPackets() + rtpStats.getRetransmitted().getPackets() + rtpStats.getTransmitted().getPackets();
    }

    public static final Stats transform(String stats) {
        OutboundRtpAudio outboundRtpAudio;
        OutboundVideo outboundVideo;
        Substream substream;
        OutboundRtpVideo outboundRtpVideo;
        HashMap hashMap;
        HashMap hashMap2;
        co.discord.media_engine.Transport transport;
        InboundPlayout inboundPlayout;
        boolean z;
        PlayoutMetric playoutMetric;
        PlayoutMetric playoutMetric2;
        PlayoutMetric playoutMetric3;
        PlayoutMetric playoutMetric4;
        PlayoutMetric playoutMetric5;
        PlayoutMetric playoutMetric6;
        StatsCodec statsCodec;
        Substream[] substreams;
        boolean z2;
        OutboundVideo[] videos;
        Object m14247E;
        OutboundAudio audio;
        boolean z3;
        boolean z4;
        long j;
        boolean z5;
        long j2;
        C9612q.m13917h(stats, "stats");
        NativeStats nativeStats = (NativeStats) gson.fromJson(stats, NativeStats.class);
        Outbound outbound = nativeStats.getOutbound();
        if (outbound != null && (audio = outbound.getAudio()) != null) {
            long ssrc = audio.getSsrc();
            StatsCodec statsCodec2 = new StatsCodec(audio.getCodecPayloadType(), audio.getCodecName());
            long bytesSent = audio.getBytesSent();
            long packetsSent = audio.getPacketsSent();
            int max = Math.max(0, audio.getPacketsLost());
            float fractionLost = 100 * audio.getFractionLost();
            float audioLevel = audio.getAudioLevel() / 32768.0f;
            if (audio.getSpeaking() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            long framesCaptured = audio.getFramesCaptured();
            long framesRendered = audio.getFramesRendered();
            Boolean noiseCancellerIsEnabled = audio.getNoiseCancellerIsEnabled();
            if (noiseCancellerIsEnabled != null) {
                z4 = noiseCancellerIsEnabled.booleanValue();
            } else {
                z4 = false;
            }
            Long noiseCancellerProcessTime = audio.getNoiseCancellerProcessTime();
            if (noiseCancellerProcessTime != null) {
                j = noiseCancellerProcessTime.longValue();
            } else {
                j = 0;
            }
            Boolean voiceActivityDetectorIsEnabled = audio.getVoiceActivityDetectorIsEnabled();
            if (voiceActivityDetectorIsEnabled != null) {
                z5 = voiceActivityDetectorIsEnabled.booleanValue();
            } else {
                z5 = false;
            }
            Long voiceActivityDetectorProcessTime = audio.getVoiceActivityDetectorProcessTime();
            if (voiceActivityDetectorProcessTime != null) {
                j2 = voiceActivityDetectorProcessTime.longValue();
            } else {
                j2 = 0;
            }
            outboundRtpAudio = new OutboundRtpAudio(MediaStreamTrack.AUDIO_TRACK_KIND, ssrc, statsCodec2, bytesSent, packetsSent, max, fractionLost, audioLevel, z3, framesCaptured, framesRendered, z4, j, z5, j2);
        } else {
            outboundRtpAudio = null;
        }
        Outbound outbound2 = nativeStats.getOutbound();
        if (outbound2 != null && (videos = outbound2.getVideos()) != null) {
            m14247E = C9538f.m14247E(videos);
            outboundVideo = (OutboundVideo) m14247E;
        } else {
            outboundVideo = null;
        }
        if (outboundVideo != null && (substreams = outboundVideo.getSubstreams()) != null) {
            int length = substreams.length;
            for (int i = 0; i < length; i++) {
                substream = substreams[i];
                if (!substream.isFlexFEC() && !substream.isRTX()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
            }
        }
        substream = null;
        if (substream != null) {
            long j3 = 0;
            for (Substream substream2 : outboundVideo.getSubstreams()) {
                j3 += INSTANCE.sumBytes(substream2.getRtpStats());
            }
            long ssrc2 = substream.getSsrc();
            StatsCodec statsCodec3 = new StatsCodec(outboundVideo.getCodecPayloadType(), outboundVideo.getCodecName());
            long j4 = 0;
            for (Substream substream3 : outboundVideo.getSubstreams()) {
                j4 += INSTANCE.sumPackets(substream3.getRtpStats());
            }
            outboundRtpVideo = new OutboundRtpVideo(MediaStreamTrack.VIDEO_TRACK_KIND, ssrc2, statsCodec3, j3, j4, substream.getRtcpStats().getPacketsLost(), substream.getRtcpStats().getFractionLost(), outboundVideo.getMediaBitrate(), outboundVideo.getTargetMediaBitrate(), outboundVideo.getEncodeUsage(), outboundVideo.getEncoderImplementationName(), outboundVideo.getAvgEncodeTime(), new Resolution(substream.getWidth(), substream.getHeight()), substream.getFrameCounts().getDeltaFrames() + substream.getFrameCounts().getKeyFrames(), outboundVideo.getFramesEncoded(), outboundVideo.getInputFrameRate(), outboundVideo.getEncodeFrameRate(), substream.getRtcpStats().getFirPackets(), substream.getRtcpStats().getNackPackets(), substream.getRtcpStats().getPliPackets(), outboundVideo.getQpSum(), outboundVideo.getBwLimitedResolution(), outboundVideo.getCpuLimitedResolution());
            Unit unit = Unit.f25302a;
        } else {
            outboundRtpVideo = null;
        }
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        Inbound[] inbound = nativeStats.getInbound();
        if (inbound != null) {
            for (Inbound inbound2 : inbound) {
                String id2 = inbound2.getId();
                InboundAudio audio2 = inbound2.getAudio();
                if (inbound2.getPlayout() != null) {
                    inboundPlayout = INSTANCE.transformPlayoutStats(inbound2.getPlayout());
                } else {
                    inboundPlayout = null;
                }
                long ssrc3 = audio2.getSsrc();
                StatsCodec statsCodec4 = new StatsCodec(audio2.getCodecPayloadType(), audio2.getCodecName());
                long bytesReceived = audio2.getBytesReceived();
                long packetsReceived = audio2.getPacketsReceived();
                long packetsLost = audio2.getPacketsLost();
                float audioLevel2 = audio2.getAudioLevel() / 32768.0f;
                if (audio2.getSpeaking() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                long jitter = audio2.getJitter();
                long jitterBuffer = audio2.getJitterBuffer();
                long jitterBufferPreferred = audio2.getJitterBufferPreferred();
                long delayEstimate = audio2.getDelayEstimate();
                int decodingCNG = audio2.getDecodingCNG();
                int decodingMutedOutput = audio2.getDecodingMutedOutput();
                int decodingNormal = audio2.getDecodingNormal();
                int decodingPLC = audio2.getDecodingPLC();
                int decodingPLCCNG = audio2.getDecodingPLCCNG();
                Long valueOf = Long.valueOf(audio2.getOpSilence());
                Long valueOf2 = Long.valueOf(audio2.getOpNormal());
                Long valueOf3 = Long.valueOf(audio2.getOpMerge());
                Long valueOf4 = Long.valueOf(audio2.getOpExpand());
                Long valueOf5 = Long.valueOf(audio2.getOpAccelerate());
                Long valueOf6 = Long.valueOf(audio2.getOpPreemptiveExpand());
                Long valueOf7 = Long.valueOf(audio2.getOpCNG());
                if (inboundPlayout != null) {
                    playoutMetric = inboundPlayout.getAudioJitterBuffer();
                } else {
                    playoutMetric = null;
                }
                if (inboundPlayout != null) {
                    playoutMetric2 = inboundPlayout.getAudioJitterDelay();
                } else {
                    playoutMetric2 = null;
                }
                if (inboundPlayout != null) {
                    playoutMetric3 = inboundPlayout.getAudioJitterTarget();
                } else {
                    playoutMetric3 = null;
                }
                if (inboundPlayout != null) {
                    playoutMetric4 = inboundPlayout.getAudioPlayoutUnderruns();
                } else {
                    playoutMetric4 = null;
                }
                if (inboundPlayout != null) {
                    playoutMetric5 = inboundPlayout.getRelativeReceptionDelay();
                } else {
                    playoutMetric5 = null;
                }
                if (inboundPlayout != null) {
                    playoutMetric6 = inboundPlayout.getRelativePlayoutDelay();
                } else {
                    playoutMetric6 = null;
                }
                InboundRtpAudio inboundRtpAudio = (InboundRtpAudio) hashMap3.put(id2, new InboundRtpAudio(MediaStreamTrack.AUDIO_TRACK_KIND, ssrc3, statsCodec4, bytesReceived, packetsReceived, packetsLost, audioLevel2, z, jitter, jitterBuffer, jitterBufferPreferred, delayEstimate, decodingCNG, decodingMutedOutput, decodingNormal, decodingPLC, decodingPLCCNG, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, playoutMetric, playoutMetric2, playoutMetric3, playoutMetric4, playoutMetric5, playoutMetric6));
                if (inbound2.getVideo() != null) {
                    InboundVideo video = inbound2.getVideo();
                    if (video.getCodecPayloadType() == -1) {
                        statsCodec = null;
                    } else {
                        statsCodec = new StatsCodec(video.getCodecPayloadType(), video.getCodecName());
                    }
                    InboundRtpVideo inboundRtpVideo = (InboundRtpVideo) hashMap4.put(id2, new InboundRtpVideo(MediaStreamTrack.VIDEO_TRACK_KIND, video.getSsrc(), statsCodec, video.getRtpStats().getHeaderBytes() + video.getRtpStats().getPaddingBytes() + video.getRtpStats().getPayloadBytes(), (int) video.getRtpStats().getPackets(), video.getRtpStats().getPacketsLost(), video.getTotalBitrate(), video.getDecode(), new Resolution(video.getWidth(), video.getHeight()), video.getDecoderImplementationName(), (int) video.getFramesDecoded(), video.getFramesDropped(), video.getFrameCounts().getDeltaFrames() + video.getFrameCounts().getKeyFrames(), video.getDecodeFrameRate(), video.getNetworkFrameRate(), video.getRenderFrameRate(), video.getRtcpStats().getFirPackets(), video.getRtcpStats().getNackPackets(), video.getRtcpStats().getPliPackets(), video.getQpSum(), video.getFreezeCount(), video.getPauseCount(), video.getTotalFreezesDuration(), video.getTotalPausesDuration(), video.getTotalFramesDuration(), video.getSumOfSquaredFramesDurations()));
                }
            }
            Unit unit2 = Unit.f25302a;
        }
        Transport transport2 = nativeStats.getTransport();
        if (transport2 != null) {
            transport = new co.discord.media_engine.Transport(transport2.getSendBandwidth(), transport2.getBytesReceived(), transport2.getBytesSent(), Long.valueOf(transport2.getInboundBitrateEstimate()), transport2.getLocalAddress(), Integer.valueOf(transport2.getOutboundBitrateEstimate()), Long.valueOf(transport2.getPacerDelay()), transport2.getPacketsReceived(), transport2.getPacketsSent(), transport2.getRtt(), Integer.valueOf((int) transport2.getDecryptionFailures()), Long.valueOf(transport2.getReceiverBitrateEstimate()), transport2.getReceiverReports(), Long.valueOf(transport2.getRoutingFailures()));
            hashMap = hashMap4;
            hashMap2 = hashMap3;
        } else {
            hashMap = hashMap4;
            hashMap2 = hashMap3;
            transport = new co.discord.media_engine.Transport(0, 0L, 0L, 0L, "", 0, 0L, 0L, 0L, 0, 0, 0L, null, 0L);
        }
        return new Stats(transport, outboundRtpAudio, outboundRtpVideo, hashMap2, hashMap);
    }

    private final InboundPlayout transformPlayoutStats(InboundPlayout inboundPlayout) {
        return new InboundPlayout(convertPlayoutMetricToMs(inboundPlayout.getAudioJitterBuffer()), convertPlayoutMetricToMs(inboundPlayout.getAudioJitterDelay()), convertPlayoutMetricToMs(inboundPlayout.getAudioJitterTarget()), convertPlayoutMetricToMs(inboundPlayout.getAudioPlayoutUnderruns()), convertPlayoutMetricToMs(inboundPlayout.getAudioCaptureOverruns()), convertPlayoutMetricToMs(inboundPlayout.getVideoJitterBuffer()), convertPlayoutMetricToMs(inboundPlayout.getVideoJitterDelay()), convertPlayoutMetricToMs(inboundPlayout.getVideoJitterTarget()), convertPlayoutMetricToMs(inboundPlayout.getRelativeReceptionDelay()), convertPlayoutMetricToMs(inboundPlayout.getRelativePlayoutDelay()));
    }
}
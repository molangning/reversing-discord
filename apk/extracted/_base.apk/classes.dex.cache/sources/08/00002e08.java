package com.linkedin.android.litr;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.linkedin.android.litr.C5267b;
import com.linkedin.android.litr.C5271d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import md.C10439d;
import md.C10440e;
import org.webrtc.MediaStreamTrack;
import p200kd.InterfaceC9216a;
import p215ld.C10131a;
import p248nd.C10573b;
import p248nd.C10575c;
import p387vd.C13252f;
import p387vd.C13255h;
import sd.C12454a;
import sd.C12455b;
import sd.InterfaceC12458c;
import td.C12657c;
import td.C12662g;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MediaTransformer {

    /* renamed from: e */
    private static final String f14956e = "MediaTransformer";

    /* renamed from: a */
    private final Context f14957a;

    /* renamed from: b */
    private final ExecutorService f14958b;

    /* renamed from: c */
    private final Looper f14959c;

    /* renamed from: d */
    private final Map<String, Future<?>> f14960d;

    public MediaTransformer(Context context) {
        this(context, Looper.getMainLooper(), Executors.newSingleThreadExecutor());
    }

    /* renamed from: b */
    private MediaFormat m25584b(InterfaceC12458c interfaceC12458c, int i, String str) {
        String str2;
        int i2;
        int i3;
        MediaFormat trackFormat = interfaceC12458c.getTrackFormat(i);
        MediaFormat mediaFormat = null;
        if (trackFormat.containsKey("mime")) {
            str2 = trackFormat.getString("mime");
        } else {
            str2 = null;
        }
        if (str2 != null) {
            if (str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                mediaFormat = MediaFormat.createVideoFormat(str2, trackFormat.getInteger("width"), trackFormat.getInteger("height"));
                mediaFormat.setInteger("bitrate", C13255h.m2922a(interfaceC12458c, i));
                if (trackFormat.containsKey("i-frame-interval")) {
                    i3 = trackFormat.getInteger("i-frame-interval");
                } else {
                    i3 = 5;
                }
                mediaFormat.setInteger("i-frame-interval", i3);
                mediaFormat.setInteger("frame-rate", C13252f.m2929a(trackFormat, 30).intValue());
            } else if (str2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                if (m25582d(interfaceC12458c, i, str)) {
                    str2 = m25583c(str);
                }
                mediaFormat = MediaFormat.createAudioFormat(str2, trackFormat.getInteger("sample-rate"), trackFormat.getInteger("channel-count"));
                if (trackFormat.containsKey("bitrate")) {
                    i2 = trackFormat.getInteger("bitrate");
                } else {
                    i2 = 256000;
                }
                mediaFormat.setInteger("bitrate", i2);
                if (trackFormat.containsKey("durationUs")) {
                    mediaFormat.setLong("durationUs", trackFormat.getLong("durationUs"));
                }
            }
        }
        return mediaFormat;
    }

    /* renamed from: c */
    private String m25583c(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 0;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 1;
                    break;
                }
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return "audio/mp4a-latm";
            case 2:
            case 3:
                return "audio/opus";
            default:
                return null;
        }
    }

    /* renamed from: d */
    private boolean m25582d(InterfaceC12458c interfaceC12458c, int i, String str) {
        if (str == null) {
            return false;
        }
        MediaFormat trackFormat = interfaceC12458c.getTrackFormat(i);
        char c = 65535;
        switch (str.hashCode()) {
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 0;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 1;
                    break;
                }
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 2;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                if (!trackFormat.containsKey("mime") || !TextUtils.equals(trackFormat.getString("mime"), "audio/raw")) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (!trackFormat.containsKey("mime") || TextUtils.equals(trackFormat.getString("mime"), "audio/opus") || TextUtils.equals(trackFormat.getString("mime"), "audio/vorbis")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: f */
    private boolean m25580f(MediaFormat mediaFormat, boolean z, boolean z2) {
        String str;
        if (mediaFormat.containsKey("mime")) {
            str = mediaFormat.getString("mime");
        } else {
            str = null;
        }
        return m25579g(str, z, z2);
    }

    /* renamed from: g */
    private boolean m25579g(String str, boolean z, boolean z2) {
        if (str == null) {
            Log.e(f14956e, "Mime type is null for track ");
            return false;
        } else if (z && str.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            return false;
        } else {
            if (z2 && !str.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND) && !str.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public void m25585a(String str) {
        Future<?> future = this.f14960d.get(str);
        if (future != null && !future.isCancelled() && !future.isDone()) {
            future.cancel(true);
        }
    }

    /* renamed from: e */
    public void m25581e() {
        this.f14958b.shutdownNow();
    }

    /* renamed from: h */
    public void m25578h(String str, Uri uri, Uri uri2, MediaFormat mediaFormat, MediaFormat mediaFormat2, InterfaceC9216a interfaceC9216a, C5271d c5271d) {
        C5271d c5271d2;
        List<C10131a> list;
        boolean z;
        int i;
        String str2;
        if (c5271d == null) {
            c5271d2 = new C5271d.C5273b().m25545a();
        } else {
            c5271d2 = c5271d;
        }
        try {
            C12454a c12454a = new C12454a(this.f14957a, uri, c5271d2.f14996d);
            int i2 = 0;
            for (int i3 = 0; i3 < c12454a.getTrackCount(); i3++) {
                if (m25580f(c12454a.getTrackFormat(i3), c5271d2.f14997e, c5271d2.f14998f)) {
                    i2++;
                }
            }
            if (mediaFormat != null && mediaFormat.containsKey("mime") && (TextUtils.equals(mediaFormat.getString("mime"), "video/x-vnd.on2.vp9") || TextUtils.equals(mediaFormat.getString("mime"), "video/x-vnd.on2.vp8"))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            if (i2 > 0) {
                C12455b c12455b = new C12455b(this.f14957a, uri2, i2, c12454a.getOrientationHint(), i);
                int trackCount = c12454a.getTrackCount();
                ArrayList arrayList = new ArrayList(trackCount);
                for (int i4 = 0; i4 < trackCount; i4++) {
                    MediaFormat trackFormat = c12454a.getTrackFormat(i4);
                    if (trackFormat.containsKey("mime")) {
                        str2 = trackFormat.getString("mime");
                    } else {
                        str2 = null;
                    }
                    if (m25579g(str2, c5271d2.f14997e, c5271d2.f14998f)) {
                        C5267b.C5269b m25557f = new C5267b.C5269b(c12454a, i4, c12455b).m25557f(arrayList.size());
                        if (str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                            m25557f.m25561b(new C10439d()).m25559d(new C12662g(c5271d2.f14994b)).m25560c(new C10440e()).m25558e(mediaFormat);
                        } else if (str2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                            C10440e c10440e = new C10440e();
                            m25557f.m25561b(new C10439d()).m25560c(c10440e).m25559d(new C12657c(c10440e, c5271d2.f14995c)).m25558e(mediaFormat2);
                        } else {
                            try {
                                m25557f.m25558e(null);
                            } catch (C10573b e) {
                                e = e;
                                list = null;
                                interfaceC9216a.onError(str, e, list);
                                return;
                            } catch (C10575c e2) {
                                e = e2;
                                list = null;
                                interfaceC9216a.onError(str, e, list);
                                return;
                            }
                        }
                        arrayList.add(m25557f.m25562a());
                    }
                }
                m25577i(str, arrayList, interfaceC9216a, c5271d2.f14993a);
                return;
            }
            throw new C10575c(C10575c.EnumC10576a.NO_OUTPUT_TRACKS, uri2, i, new IllegalArgumentException("No output tracks left"));
        } catch (C10573b | C10575c e3) {
            e = e3;
            list = null;
        }
    }

    /* renamed from: i */
    public void m25577i(String str, List<C5267b> list, InterfaceC9216a interfaceC9216a, int i) {
        String str2;
        if (!this.f14960d.containsKey(str)) {
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    C5267b c5267b = list.get(i2);
                    MediaFormat trackFormat = c5267b.m25568c().getTrackFormat(c5267b.m25565f());
                    MediaFormat m25564g = c5267b.m25564g();
                    if (m25564g != null && m25564g.containsKey("mime") && m25564g.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        str2 = m25564g.getString("mime");
                        break;
                    } else if (trackFormat.containsKey("mime") && trackFormat.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        str2 = trackFormat.getString("mime");
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            for (int i3 = 0; i3 < size; i3++) {
                C5267b c5267b2 = list.get(i3);
                if (c5267b2.m25564g() == null && ((c5267b2.m25566e() != null && c5267b2.m25566e().mo4586a()) || m25582d(c5267b2.m25568c(), c5267b2.m25565f(), str2))) {
                    list.set(i3, new C5267b.C5269b(c5267b2.m25568c(), c5267b2.m25565f(), c5267b2.m25567d()).m25557f(c5267b2.m25563h()).m25561b(c5267b2.m25570a()).m25560c(c5267b2.m25569b()).m25559d(c5267b2.m25566e()).m25558e(m25584b(c5267b2.m25568c(), c5267b2.m25565f(), str2)).m25562a());
                }
            }
            this.f14960d.put(str, this.f14958b.submit(new RunnableC5270c(str, list, i, new C5264a(this.f14960d, interfaceC9216a, this.f14959c))));
            return;
        }
        throw new IllegalArgumentException("Request with id " + str + " already exists");
    }

    public MediaTransformer(Context context, Looper looper, ExecutorService executorService) {
        this.f14957a = context.getApplicationContext();
        this.f14960d = new HashMap(10);
        this.f14959c = looper;
        this.f14958b = executorService;
    }
}
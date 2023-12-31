package p387vd;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.util.JSStackTrace;
import com.linkedin.android.litr.C5267b;
import com.linkedin.android.litr.p050io.MediaRange;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.webrtc.MediaStreamTrack;
import sd.InterfaceC12458c;

/* renamed from: vd.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13255h {

    /* renamed from: a */
    private static final String f34321a = "h";

    /* renamed from: a */
    public static int m2922a(InterfaceC12458c interfaceC12458c, int i) {
        MediaFormat trackFormat = interfaceC12458c.getTrackFormat(i);
        if (trackFormat.containsKey("bitrate")) {
            return trackFormat.getInteger("bitrate");
        }
        float m2923a = C13254g.m2923a(trackFormat.getLong("durationUs"));
        if (m2923a == 0.0f) {
            return 0;
        }
        float size = (float) interfaceC12458c.getSize();
        int trackCount = interfaceC12458c.getTrackCount();
        float f = 0.0f;
        for (int i2 = 0; i2 < trackCount; i2++) {
            MediaFormat trackFormat2 = interfaceC12458c.getTrackFormat(i2);
            if (trackFormat2.containsKey("mime")) {
                if (trackFormat2.containsKey("bitrate") && trackFormat2.containsKey("durationUs")) {
                    size -= (trackFormat2.getInteger("bitrate") * C13254g.m2923a(trackFormat2.getLong("durationUs"))) / 8.0f;
                } else if (trackFormat2.getString("mime").startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    f += trackFormat2.getInteger("width") * trackFormat2.getInteger("height") * C13254g.m2923a(trackFormat2.getLong("durationUs"));
                }
            }
        }
        float integer = trackFormat.getInteger("width") * trackFormat.getInteger("height") * m2923a;
        if (f > 0.0f) {
            size = (size * integer) / f;
        }
        return (int) ((size * 8.0f) / m2923a);
    }

    /* renamed from: b */
    private static int m2921b(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("bitrate")) {
            return mediaFormat.getInteger("bitrate");
        }
        return -1;
    }

    /* renamed from: c */
    private static long m2920c(C5267b c5267b) {
        MediaFormat trackFormat = c5267b.m25568c().getTrackFormat(c5267b.m25565f());
        if (trackFormat.containsKey("durationUs")) {
            long j = trackFormat.getLong("durationUs");
            MediaRange selection = c5267b.m25568c().getSelection();
            return Math.min(j, selection.m25544a()) - Math.max(0L, selection.m25543b());
        }
        return -1L;
    }

    /* renamed from: d */
    public static long m2919d(List<C5267b> list) {
        long j = 0;
        for (C5267b c5267b : list) {
            j = Math.max(m2920c(c5267b), j);
        }
        float f = 0.0f;
        for (C5267b c5267b2 : list) {
            MediaFormat trackFormat = c5267b2.m25568c().getTrackFormat(c5267b2.m25565f());
            int m2921b = m2921b(trackFormat);
            long m2920c = m2920c(c5267b2);
            if (m2920c < 0) {
                Log.d(f34321a, "Track duration is not available, using maximum duration");
                m2920c = j;
            }
            String m2918e = m2918e(trackFormat);
            if (m2918e != null) {
                if (c5267b2.m25564g() != null) {
                    m2921b = m2921b(c5267b2.m25564g());
                } else if (m2918e.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND) && m2921b < 0) {
                    m2921b = 320000;
                }
            }
            if (m2921b < 0) {
                Log.d(f34321a, "Bitrate is not available, cannot use that track to estimate size");
                m2921b = 0;
            }
            f += m2921b * C13254g.m2923a(m2920c);
        }
        return f / 8.0f;
    }

    /* renamed from: e */
    private static String m2918e(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("mime")) {
            return mediaFormat.getString("mime");
        }
        return null;
    }

    /* renamed from: f */
    public static long m2917f(Context context, Uri uri) {
        long j;
        long j2 = -1;
        if ("content".equals(uri.getScheme())) {
            AssetFileDescriptor assetFileDescriptor = null;
            try {
                try {
                    assetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptor != null) {
                        j = assetFileDescriptor.getParcelFileDescriptor().getStatSize();
                    } else {
                        j = 0;
                    }
                    if (j >= 0) {
                        j2 = j;
                    }
                    return j2;
                } catch (FileNotFoundException | IllegalStateException e) {
                    Log.e(f34321a, "Unable to extract length from targetFile: " + uri, e);
                    if (assetFileDescriptor != null) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e2) {
                            Log.e(f34321a, "Unable to close file descriptor from targetFile: " + uri, e2);
                        }
                    }
                    return -1L;
                }
            } finally {
                if (0 != 0) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e3) {
                        Log.e(f34321a, "Unable to close file descriptor from targetFile: " + uri, e3);
                    }
                }
            }
        } else if (!JSStackTrace.FILE_KEY.equals(uri.getScheme()) || uri.getPath() == null) {
            return -1L;
        } else {
            return new File(uri.getPath()).length();
        }
    }
}

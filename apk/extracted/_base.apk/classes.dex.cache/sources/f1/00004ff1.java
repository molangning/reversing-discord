package p387vd;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p248nd.C10578e;

/* renamed from: vd.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13249c {

    /* renamed from: a */
    private static Map<String, int[]> f34318a = new HashMap();

    static {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            iArr = new int[]{65536, 1, 4, 2, 524288, 8, 16, 32, 64};
        } else {
            iArr = new int[]{1, 4, 2, 8, 16, 32, 64};
        }
        f34318a.put("video/avc", iArr);
        f34318a.put("video/x-vnd.on2.vp8", new int[]{1});
        if (i >= 29) {
            iArr2 = new int[]{1, 2, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 8192};
        } else if (i >= 24) {
            iArr2 = new int[]{1, 2, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT};
        } else {
            iArr2 = new int[]{1, 2};
        }
        f34318a.put("video/hevc", iArr2);
        if (i >= 24) {
            if (i >= 29) {
                iArr3 = new int[]{1, 2, 4, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 16384, 8, 8192, 32768};
            } else {
                iArr3 = new int[]{1, 2, 4, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 8, 8192};
            }
            f34318a.put("video/x-vnd.on2.vp9", iArr3);
        }
        if (i >= 29) {
            f34318a.put("video/av01", new int[]{1, 2, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 8192});
        }
    }

    /* renamed from: b */
    private static void m2938b(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface, boolean z) {
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, z ? 1 : 0);
    }

    /* renamed from: c */
    private static MediaCodec m2937c(MediaFormat mediaFormat, Surface surface, boolean z, List<Callable<MediaCodec>> list) {
        MediaCodec mediaCodec;
        Exception e;
        Iterator<Callable<MediaCodec>> it = list.iterator();
        MediaCodec mediaCodec2 = null;
        IOException iOException = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                mediaCodec = it.next().call();
            } catch (Exception e2) {
                mediaCodec = mediaCodec2;
                e = e2;
            }
            if (mediaCodec != null) {
                try {
                    m2938b(mediaCodec, mediaFormat, surface, z);
                    mediaCodec2 = mediaCodec;
                    break;
                } catch (Exception e3) {
                    e = e3;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                        mediaCodec = null;
                    }
                    if (e instanceof IOException) {
                        iOException = (IOException) e;
                    }
                    mediaCodec2 = mediaCodec;
                }
            } else {
                continue;
                mediaCodec2 = mediaCodec;
            }
        }
        if (mediaCodec2 == null) {
            if (iOException != null) {
                throw iOException;
            }
            throw new IllegalStateException();
        }
        return mediaCodec2;
    }

    /* renamed from: d */
    private static List<Callable<MediaCodec>> m2936d(boolean z, String str, MediaFormat mediaFormat) {
        MediaCodecInfo[] codecInfos;
        ArrayList arrayList = new ArrayList();
        for (final MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder() == z) {
                try {
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                    if (capabilitiesForType != null && (mediaFormat == null || capabilitiesForType.isFormatSupported(mediaFormat))) {
                        arrayList.add(new Callable() { // from class: vd.b
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                MediaCodec m2932h;
                                m2932h = C13249c.m2932h(mediaCodecInfo);
                                return m2932h;
                            }
                        });
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static MediaCodec m2935e(MediaFormat mediaFormat, Surface surface, boolean z, C10578e.EnumC10579a enumC10579a, C10578e.EnumC10579a enumC10579a2, C10578e.EnumC10579a enumC10579a3) {
        try {
            try {
                MediaCodec m2934f = m2934f(mediaFormat, surface, z);
                if (m2934f != null) {
                    return m2934f;
                }
                throw new IllegalStateException("Try fallbackToGetCodecByType");
            } catch (IOException | IllegalStateException e) {
                if (e instanceof IOException) {
                    throw new C10578e(enumC10579a2, mediaFormat, null, null, e);
                }
                throw new C10578e(enumC10579a3, mediaFormat, null, null, e);
            }
        } catch (IOException | IllegalStateException unused) {
            MediaCodec m2933g = m2933g(mediaFormat, surface, z);
            if (m2933g != null) {
                return m2933g;
            }
            throw new C10578e(enumC10579a, mediaFormat, null, null);
        }
    }

    /* renamed from: f */
    private static MediaCodec m2934f(MediaFormat mediaFormat, Surface surface, boolean z) {
        List<Callable<MediaCodec>> m2936d = m2936d(z, mediaFormat.getString("mime"), mediaFormat);
        if (!m2936d.isEmpty()) {
            return m2937c(mediaFormat, surface, z, m2936d);
        }
        return null;
    }

    /* renamed from: g */
    private static MediaCodec m2933g(MediaFormat mediaFormat, Surface surface, boolean z) {
        List<Callable<MediaCodec>> m2936d = m2936d(z, mediaFormat.getString("mime"), null);
        if (m2936d.isEmpty()) {
            return null;
        }
        return m2937c(mediaFormat, surface, z, m2936d);
    }

    /* renamed from: h */
    public static /* synthetic */ MediaCodec m2932h(MediaCodecInfo mediaCodecInfo) {
        return MediaCodec.createByCodecName(mediaCodecInfo.getName());
    }
}
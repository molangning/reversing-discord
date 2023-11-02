package p195k8;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: k8.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9180k {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m16371a(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String m16150t = C9200u.m16150t(str);
        m16150t.hashCode();
        switch (m16150t.hashCode()) {
            case -2123537834:
                if (m16150t.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (m16150t.equals("video/mp2p")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (m16150t.equals("video/mp2t")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (m16150t.equals("video/webm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (m16150t.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (m16150t.equals("image/jpeg")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (m16150t.equals("application/mp4")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (m16150t.equals("text/vtt")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (m16150t.equals("audio/x-matroska")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (m16150t.equals("application/webm")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (m16150t.equals("video/x-flv")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (m16150t.equals("audio/ac3")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (m16150t.equals("audio/ac4")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (m16150t.equals("audio/amr")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (m16150t.equals("audio/mp4")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (m16150t.equals("audio/ogg")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (m16150t.equals("audio/wav")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (m16150t.equals("video/mp4")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (m16150t.equals("audio/3gpp")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (m16150t.equals("audio/eac3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (m16150t.equals("audio/flac")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (m16150t.equals("audio/mpeg")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (m16150t.equals("audio/webm")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (m16150t.equals("video/x-matroska")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 11:
            case 19:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case '\b':
            case '\t':
            case 22:
            case 23:
                return 6;
            case 4:
            case '\r':
            case 18:
                return 3;
            case 5:
                return 14;
            case 6:
            case 14:
            case 17:
                return 8;
            case 7:
                return 13;
            case '\n':
                return 5;
            case '\f':
                return 1;
            case 15:
                return 9;
            case 16:
                return 12;
            case 20:
                return 4;
            case 21:
                return 7;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public static int m16370b(Map<String, List<String>> map) {
        String str;
        List<String> list = map.get("Content-Type");
        if (list != null && !list.isEmpty()) {
            str = list.get(0);
        } else {
            str = null;
        }
        return m16371a(str);
    }

    /* renamed from: c */
    public static int m16369c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                    if (lastPathSegment.endsWith(".mp3")) {
                        return 7;
                    }
                    if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                            if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                    if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                        if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                            if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                return -1;
                                            }
                                            return 14;
                                        }
                                        return 13;
                                    }
                                    return 12;
                                }
                                return 11;
                            }
                            return 10;
                        }
                        return 9;
                    }
                    return 8;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }
}
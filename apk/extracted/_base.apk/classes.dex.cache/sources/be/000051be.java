package p418x6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p152i7.AbstractC7428i;
import p152i7.C7412a;
import p152i7.C7420e;
import p152i7.C7429j;
import p152i7.C7435m;
import p173j7.C8854a;
import p195k8.C9197r;
import p195k8.C9208y;
import p296q6.C11762u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x6.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13710h {

    /* renamed from: a */
    static final String[] f35308a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    private static C7420e m1702a(int i, C9208y c9208y) {
        int m16084n = c9208y.m16084n();
        if (c9208y.m16084n() == 1684108385) {
            c9208y.m16098Q(8);
            String m16073y = c9208y.m16073y(m16084n - 16);
            return new C7420e("und", m16073y, m16073y);
        }
        C9197r.m16178h("MetadataUtil", "Failed to parse comment attribute: " + AbstractC13691a.m1798a(i));
        return null;
    }

    /* renamed from: b */
    private static C7412a m1701b(C9208y c9208y) {
        String str;
        int m16084n = c9208y.m16084n();
        if (c9208y.m16084n() == 1684108385) {
            int m1797b = AbstractC13691a.m1797b(c9208y.m16084n());
            if (m1797b == 13) {
                str = "image/jpeg";
            } else if (m1797b == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                C9197r.m16178h("MetadataUtil", "Unrecognized cover art flags: " + m1797b);
                return null;
            }
            c9208y.m16098Q(4);
            int i = m16084n - 16;
            byte[] bArr = new byte[i];
            c9208y.m16088j(bArr, 0, i);
            return new C7412a(str, null, 3, bArr);
        }
        C9197r.m16178h("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: c */
    public static Metadata.InterfaceC4429b m1700c(C9208y c9208y) {
        int m16093e = c9208y.m16093e() + c9208y.m16084n();
        int m16084n = c9208y.m16084n();
        int i = (m16084n >> 24) & 255;
        try {
            if (i != 169 && i != 253) {
                if (m16084n == 1735291493) {
                    return m1696g(c9208y);
                }
                if (m16084n == 1684632427) {
                    return m1699d(m16084n, "TPOS", c9208y);
                }
                if (m16084n == 1953655662) {
                    return m1699d(m16084n, "TRCK", c9208y);
                }
                if (m16084n == 1953329263) {
                    return m1694i(m16084n, "TBPM", c9208y, true, false);
                }
                if (m16084n == 1668311404) {
                    return m1694i(m16084n, "TCMP", c9208y, true, true);
                }
                if (m16084n == 1668249202) {
                    return m1701b(c9208y);
                }
                if (m16084n == 1631670868) {
                    return m1695h(m16084n, "TPE2", c9208y);
                }
                if (m16084n == 1936682605) {
                    return m1695h(m16084n, "TSOT", c9208y);
                }
                if (m16084n == 1936679276) {
                    return m1695h(m16084n, "TSO2", c9208y);
                }
                if (m16084n == 1936679282) {
                    return m1695h(m16084n, "TSOA", c9208y);
                }
                if (m16084n == 1936679265) {
                    return m1695h(m16084n, "TSOP", c9208y);
                }
                if (m16084n == 1936679791) {
                    return m1695h(m16084n, "TSOC", c9208y);
                }
                if (m16084n == 1920233063) {
                    return m1694i(m16084n, "ITUNESADVISORY", c9208y, false, false);
                }
                if (m16084n == 1885823344) {
                    return m1694i(m16084n, "ITUNESGAPLESS", c9208y, false, true);
                }
                if (m16084n == 1936683886) {
                    return m1695h(m16084n, "TVSHOWSORT", c9208y);
                }
                if (m16084n == 1953919848) {
                    return m1695h(m16084n, "TVSHOW", c9208y);
                }
                if (m16084n == 757935405) {
                    return m1698e(c9208y, m16093e);
                }
            } else {
                int i2 = 16777215 & m16084n;
                if (i2 == 6516084) {
                    return m1702a(m16084n, c9208y);
                }
                if (i2 != 7233901 && i2 != 7631467) {
                    if (i2 != 6516589 && i2 != 7828084) {
                        if (i2 == 6578553) {
                            return m1695h(m16084n, "TDRC", c9208y);
                        }
                        if (i2 == 4280916) {
                            return m1695h(m16084n, "TPE1", c9208y);
                        }
                        if (i2 == 7630703) {
                            return m1695h(m16084n, "TSSE", c9208y);
                        }
                        if (i2 == 6384738) {
                            return m1695h(m16084n, "TALB", c9208y);
                        }
                        if (i2 == 7108978) {
                            return m1695h(m16084n, "USLT", c9208y);
                        }
                        if (i2 == 6776174) {
                            return m1695h(m16084n, "TCON", c9208y);
                        }
                        if (i2 == 6779504) {
                            return m1695h(m16084n, "TIT1", c9208y);
                        }
                    } else {
                        return m1695h(m16084n, "TCOM", c9208y);
                    }
                } else {
                    return m1695h(m16084n, "TIT2", c9208y);
                }
            }
            C9197r.m16184b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC13691a.m1798a(m16084n));
            c9208y.m16099P(m16093e);
            return null;
        } finally {
            c9208y.m16099P(m16093e);
        }
    }

    /* renamed from: d */
    private static C7435m m1699d(int i, String str, C9208y c9208y) {
        int m16084n = c9208y.m16084n();
        if (c9208y.m16084n() == 1684108385 && m16084n >= 22) {
            c9208y.m16098Q(10);
            int m16105J = c9208y.m16105J();
            if (m16105J > 0) {
                String str2 = "" + m16105J;
                int m16105J2 = c9208y.m16105J();
                if (m16105J2 > 0) {
                    str2 = str2 + "/" + m16105J2;
                }
                return new C7435m(str, null, str2);
            }
        }
        C9197r.m16178h("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC13691a.m1798a(i));
        return null;
    }

    /* renamed from: e */
    private static AbstractC7428i m1698e(C9208y c9208y, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (c9208y.m16093e() < i) {
            int m16093e = c9208y.m16093e();
            int m16084n = c9208y.m16084n();
            int m16084n2 = c9208y.m16084n();
            c9208y.m16098Q(4);
            if (m16084n2 == 1835360622) {
                str = c9208y.m16073y(m16084n - 12);
            } else if (m16084n2 == 1851878757) {
                str2 = c9208y.m16073y(m16084n - 12);
            } else {
                if (m16084n2 == 1684108385) {
                    i2 = m16093e;
                    i3 = m16084n;
                }
                c9208y.m16098Q(m16084n - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        c9208y.m16099P(i2);
        c9208y.m16098Q(16);
        return new C7429j(str, str2, c9208y.m16073y(i3 - 16));
    }

    /* renamed from: f */
    public static C8854a m1697f(C9208y c9208y, int i, String str) {
        while (true) {
            int m16093e = c9208y.m16093e();
            if (m16093e < i) {
                int m16084n = c9208y.m16084n();
                if (c9208y.m16084n() == 1684108385) {
                    int m16084n2 = c9208y.m16084n();
                    int m16084n3 = c9208y.m16084n();
                    int i2 = m16084n - 16;
                    byte[] bArr = new byte[i2];
                    c9208y.m16088j(bArr, 0, i2);
                    return new C8854a(str, bArr, m16084n3, m16084n2);
                }
                c9208y.m16099P(m16093e + m16084n);
            } else {
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001c  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p152i7.C7435m m1696g(p195k8.C9208y r3) {
        /*
            int r3 = m1693j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = p418x6.C13710h.f35308a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L1c
            i7.m r1 = new i7.m
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L1c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p195k8.C9197r.m16178h(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p418x6.C13710h.m1696g(k8.y):i7.m");
    }

    /* renamed from: h */
    private static C7435m m1695h(int i, String str, C9208y c9208y) {
        int m16084n = c9208y.m16084n();
        if (c9208y.m16084n() == 1684108385) {
            c9208y.m16098Q(8);
            return new C7435m(str, null, c9208y.m16073y(m16084n - 16));
        }
        C9197r.m16178h("MetadataUtil", "Failed to parse text attribute: " + AbstractC13691a.m1798a(i));
        return null;
    }

    /* renamed from: i */
    private static AbstractC7428i m1694i(int i, String str, C9208y c9208y, boolean z, boolean z2) {
        int m1693j = m1693j(c9208y);
        if (z2) {
            m1693j = Math.min(1, m1693j);
        }
        if (m1693j >= 0) {
            if (z) {
                return new C7435m(str, null, Integer.toString(m1693j));
            }
            return new C7420e("und", str, Integer.toString(m1693j));
        }
        C9197r.m16178h("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC13691a.m1798a(i));
        return null;
    }

    /* renamed from: j */
    private static int m1693j(C9208y c9208y) {
        c9208y.m16098Q(4);
        if (c9208y.m16084n() == 1684108385) {
            c9208y.m16098Q(8);
            return c9208y.m16111D();
        }
        C9197r.m16178h("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: k */
    public static void m1692k(int i, C11762u c11762u, Format.C4362b c4362b) {
        if (i == 1 && c11762u.m6962a()) {
            c4362b.m29906M(c11762u.f30661a).m29905N(c11762u.f30662b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x000b, code lost:
        if (r6 != null) goto L5;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m1691l(int r5, com.google.android.exoplayer2.metadata.Metadata r6, com.google.android.exoplayer2.metadata.Metadata r7, com.google.android.exoplayer2.Format.C4362b r8, com.google.android.exoplayer2.metadata.Metadata... r9) {
        /*
            com.google.android.exoplayer2.metadata.Metadata r0 = new com.google.android.exoplayer2.metadata.Metadata
            r1 = 0
            com.google.android.exoplayer2.metadata.Metadata$b[] r2 = new com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.m29247e()
            if (r5 >= r6) goto L3c
            com.google.android.exoplayer2.metadata.Metadata$b r6 = r7.m29248d(r5)
            boolean r3 = r6 instanceof p173j7.C8854a
            if (r3 == 0) goto L39
            j7.a r6 = (p173j7.C8854a) r6
            java.lang.String r3 = r6.f23228j
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            com.google.android.exoplayer2.metadata.Metadata r5 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$b[] r7 = new com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            com.google.android.exoplayer2.metadata.Metadata r6 = r6.m29249b(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.m29247e()
            if (r5 <= 0) goto L52
            r8.m29895X(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p418x6.C13710h.m1691l(int, com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.metadata.Metadata, com.google.android.exoplayer2.Format$b, com.google.android.exoplayer2.metadata.Metadata[]):void");
    }
}
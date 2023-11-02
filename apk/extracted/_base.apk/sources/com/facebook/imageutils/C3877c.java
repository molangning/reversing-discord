package com.facebook.imageutils;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.io.InputStream;
import p394w2.C13379j;

/* renamed from: com.facebook.imageutils.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3877c {
    /* renamed from: a */
    public static int m30549a(int i) {
        return C3879e.m30543a(i);
    }

    /* renamed from: b */
    public static int m30548b(InputStream inputStream) {
        try {
            int m30546d = m30546d(inputStream);
            if (m30546d == 0) {
                return 0;
            }
            return C3879e.m30540d(inputStream, m30546d);
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private static boolean m30547c(int i) {
        switch (i) {
            case 192:
            case 193:
            case 194:
            case 195:
            case 197:
            case 198:
            case 199:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case 196:
            case ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
            case 204:
            default:
                return false;
        }
    }

    /* renamed from: d */
    private static int m30546d(InputStream inputStream) {
        int m30544a;
        if (m30545e(inputStream, 225) && (m30544a = C3878d.m30544a(inputStream, 2, false) - 2) > 6) {
            int m30544a2 = C3878d.m30544a(inputStream, 4, false);
            int m30544a3 = C3878d.m30544a(inputStream, 2, false);
            int i = (m30544a - 4) - 2;
            if (m30544a2 == 1165519206 && m30544a3 == 0) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public static boolean m30545e(InputStream inputStream, int i) {
        C13379j.m2677g(inputStream);
        while (C3878d.m30544a(inputStream, 1, false) == 255) {
            int i2 = 255;
            while (i2 == 255) {
                i2 = C3878d.m30544a(inputStream, 1, false);
            }
            if ((i == 192 && m30547c(i2)) || i2 == i) {
                return true;
            }
            if (i2 != 216 && i2 != 1) {
                if (i2 == 217 || i2 == 218) {
                    break;
                }
                inputStream.skip(C3878d.m30544a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }
}

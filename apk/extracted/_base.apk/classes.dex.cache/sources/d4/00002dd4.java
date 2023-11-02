package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.horcrux.svg.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5225k {

    /* renamed from: a */
    private final ArrayList<Path> f14736a;

    /* renamed from: b */
    private final int[][] f14737b;

    /* renamed from: c */
    private final Paint f14738c;

    public C5225k(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.f14736a = arrayList;
        this.f14737b = new int[256];
        this.f14738c = paint;
        arrayList.add(new Path());
    }

    /* renamed from: a */
    private int m25839a(char c) {
        int[] iArr = this.f14737b[c >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c & 255];
    }

    /* renamed from: b */
    public Path m25838b(char c, String str) {
        Path path;
        int m25839a = m25839a(c);
        if (m25839a != 0) {
            path = this.f14736a.get(m25839a);
        } else {
            Path path2 = new Path();
            this.f14738c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f14737b;
            int i = c >> '\b';
            int[] iArr2 = iArr[i];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i] = iArr2;
            }
            iArr2[c & 255] = this.f14736a.size();
            this.f14736a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
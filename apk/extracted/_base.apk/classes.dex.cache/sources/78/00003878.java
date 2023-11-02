package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.util.ArrayList;

/* renamed from: io.sentry.android.core.internal.threaddump.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7756b {

    /* renamed from: a */
    private final ArrayList<? extends C7755a> f21236a;

    /* renamed from: b */
    private final int f21237b = 0;

    /* renamed from: c */
    private final int f21238c;

    /* renamed from: d */
    public int f21239d;

    public C7756b(ArrayList<? extends C7755a> arrayList) {
        this.f21236a = arrayList;
        this.f21238c = arrayList.size();
    }

    /* renamed from: c */
    public static C7756b m19789c(BufferedReader bufferedReader) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                i++;
                arrayList.add(new C7755a(i, readLine));
            } else {
                return new C7756b(arrayList);
            }
        }
    }

    /* renamed from: a */
    public boolean m19791a() {
        return this.f21239d < this.f21238c;
    }

    /* renamed from: b */
    public C7755a m19790b() {
        int i = this.f21239d;
        if (i >= this.f21237b && i < this.f21238c) {
            ArrayList<? extends C7755a> arrayList = this.f21236a;
            this.f21239d = i + 1;
            return arrayList.get(i);
        }
        return null;
    }

    /* renamed from: d */
    public void m19788d() {
        this.f21239d--;
    }
}
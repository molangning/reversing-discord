package p001a0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a0.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0009c extends AbstractC0004a {

    /* renamed from: r */
    private int f13r;

    /* renamed from: s */
    private int f14s;

    /* renamed from: t */
    private LayoutInflater f15t;

    @Deprecated
    public AbstractC0009c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f14s = i;
        this.f13r = i;
        this.f15t = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p001a0.AbstractC0004a
    /* renamed from: f */
    public View mo41403f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f15t.inflate(this.f14s, viewGroup, false);
    }

    @Override // p001a0.AbstractC0004a
    /* renamed from: g */
    public View mo39872g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f15t.inflate(this.f13r, viewGroup, false);
    }
}
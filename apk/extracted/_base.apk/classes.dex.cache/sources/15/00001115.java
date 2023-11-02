package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbedFieldViewBinding implements ViewBinding {
    public final SimpleDraweeSpanTextView name;
    private final View rootView;
    public final SimpleDraweeSpanTextView value;

    private EmbedFieldViewBinding(View view, SimpleDraweeSpanTextView simpleDraweeSpanTextView, SimpleDraweeSpanTextView simpleDraweeSpanTextView2) {
        this.rootView = view;
        this.name = simpleDraweeSpanTextView;
        this.value = simpleDraweeSpanTextView2;
    }

    public static EmbedFieldViewBinding bind(View view) {
        int i = C2912R.C2914id.name;
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
        if (simpleDraweeSpanTextView != null) {
            i = C2912R.C2914id.value;
            SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
            if (simpleDraweeSpanTextView2 != null) {
                return new EmbedFieldViewBinding(view, simpleDraweeSpanTextView, simpleDraweeSpanTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static EmbedFieldViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.embed_field_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
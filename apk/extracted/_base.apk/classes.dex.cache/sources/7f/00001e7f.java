package com.discord.reactions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.reactions.C3428R;
import com.facebook.drawee.view.SimpleDraweeView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class AddReactionViewBinding implements ViewBinding {
    public final SimpleDraweeView addReactionImage;
    public final TextView addReactionText;
    private final View rootView;

    private AddReactionViewBinding(View view, SimpleDraweeView simpleDraweeView, TextView textView) {
        this.rootView = view;
        this.addReactionImage = simpleDraweeView;
        this.addReactionText = textView;
    }

    public static AddReactionViewBinding bind(View view) {
        int i = C3428R.C3430id.add_reaction_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C12815a.m3875a(view, i);
        if (simpleDraweeView != null) {
            i = C3428R.C3430id.add_reaction_text;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                return new AddReactionViewBinding(view, simpleDraweeView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static AddReactionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3428R.layout.add_reaction_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
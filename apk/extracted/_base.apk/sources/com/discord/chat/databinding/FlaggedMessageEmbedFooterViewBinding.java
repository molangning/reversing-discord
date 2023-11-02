package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class FlaggedMessageEmbedFooterViewBinding implements ViewBinding {
    public final TextView flaggedMessageKeyword;
    public final TextView flaggedMessageRuleName;
    private final View rootView;
    public final ImageView separatorDot;

    private FlaggedMessageEmbedFooterViewBinding(View view, TextView textView, TextView textView2, ImageView imageView) {
        this.rootView = view;
        this.flaggedMessageKeyword = textView;
        this.flaggedMessageRuleName = textView2;
        this.separatorDot = imageView;
    }

    public static FlaggedMessageEmbedFooterViewBinding bind(View view) {
        int i = C2912R.C2914id.flagged_message_keyword;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C2912R.C2914id.flagged_message_rule_name;
            TextView textView2 = (TextView) C12815a.m3875a(view, i);
            if (textView2 != null) {
                i = C2912R.C2914id.separator_dot;
                ImageView imageView = (ImageView) C12815a.m3875a(view, i);
                if (imageView != null) {
                    return new FlaggedMessageEmbedFooterViewBinding(view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FlaggedMessageEmbedFooterViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.flagged_message_embed_footer_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}

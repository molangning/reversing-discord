package com.discord.reactions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.reactions.C3428R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class ReactionViewBinding implements ViewBinding {
    public final TextView reactionCount1;
    public final TextView reactionCount2;
    public final TextSwitcher reactionCountSwitcher;
    public final SimpleDraweeSpanTextView reactionEmoji;
    private final View rootView;

    private ReactionViewBinding(View view, TextView textView, TextView textView2, TextSwitcher textSwitcher, SimpleDraweeSpanTextView simpleDraweeSpanTextView) {
        this.rootView = view;
        this.reactionCount1 = textView;
        this.reactionCount2 = textView2;
        this.reactionCountSwitcher = textSwitcher;
        this.reactionEmoji = simpleDraweeSpanTextView;
    }

    public static ReactionViewBinding bind(View view) {
        int i = C3428R.C3430id.reaction_count_1;
        TextView textView = (TextView) C12815a.m3875a(view, i);
        if (textView != null) {
            i = C3428R.C3430id.reaction_count_2;
            TextView textView2 = (TextView) C12815a.m3875a(view, i);
            if (textView2 != null) {
                i = C3428R.C3430id.reaction_count_switcher;
                TextSwitcher textSwitcher = (TextSwitcher) C12815a.m3875a(view, i);
                if (textSwitcher != null) {
                    i = C3428R.C3430id.reaction_emoji;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) C12815a.m3875a(view, i);
                    if (simpleDraweeSpanTextView != null) {
                        return new ReactionViewBinding(view, textView, textView2, textSwitcher, simpleDraweeSpanTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ReactionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C3428R.layout.reaction_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
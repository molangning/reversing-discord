package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;
import com.discord.core.DCDButton;
import p357u0.C12815a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollRecyclerViewBinding implements ViewBinding {
    public final RecyclerView answers;
    public final TextView expirationLabel;
    public final TextView questionText;
    private final View rootView;
    public final DCDButton submitVote;

    private PollRecyclerViewBinding(View view, RecyclerView recyclerView, TextView textView, TextView textView2, DCDButton dCDButton) {
        this.rootView = view;
        this.answers = recyclerView;
        this.expirationLabel = textView;
        this.questionText = textView2;
        this.submitVote = dCDButton;
    }

    public static PollRecyclerViewBinding bind(View view) {
        int i = C2912R.C2914id.answers;
        RecyclerView recyclerView = (RecyclerView) C12815a.m3875a(view, i);
        if (recyclerView != null) {
            i = C2912R.C2914id.expiration_label;
            TextView textView = (TextView) C12815a.m3875a(view, i);
            if (textView != null) {
                i = C2912R.C2914id.question_text;
                TextView textView2 = (TextView) C12815a.m3875a(view, i);
                if (textView2 != null) {
                    i = C2912R.C2914id.submit_vote;
                    DCDButton dCDButton = (DCDButton) C12815a.m3875a(view, i);
                    if (dCDButton != null) {
                        return new PollRecyclerViewBinding(view, recyclerView, textView, textView2, dCDButton);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static PollRecyclerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C2912R.layout.poll_recycler_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }
}
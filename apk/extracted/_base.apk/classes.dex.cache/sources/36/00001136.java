package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageStartGuidelineBinding implements ViewBinding {
    public final Guideline messageStartGuideline;
    private final Guideline rootView;

    private MessageStartGuidelineBinding(Guideline guideline, Guideline guideline2) {
        this.rootView = guideline;
        this.messageStartGuideline = guideline2;
    }

    public static MessageStartGuidelineBinding bind(View view) {
        if (view != null) {
            Guideline guideline = (Guideline) view;
            return new MessageStartGuidelineBinding(guideline, guideline);
        }
        throw new NullPointerException("rootView");
    }

    public static MessageStartGuidelineBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MessageStartGuidelineBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2912R.layout.message_start_guideline, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public Guideline getRoot() {
        return this.rootView;
    }
}
package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.C2912R;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TimestampViewBinding implements ViewBinding {
    private final TextView rootView;

    private TimestampViewBinding(TextView textView) {
        this.rootView = textView;
    }

    public static TimestampViewBinding bind(View view) {
        if (view != null) {
            return new TimestampViewBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    public static TimestampViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static TimestampViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C2912R.layout.timestamp_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }
}

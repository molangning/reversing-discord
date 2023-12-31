package com.discord.mobile_voice_overlay.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0016\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/mobile_voice_overlay/views/VoiceUserAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/mobile_voice_overlay/views/VoiceUserViewHolder;", "()V", "data", "", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "getItemCount", "", "onBindViewHolder", "", "holder", ViewProps.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "mobile_voice_overlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class VoiceUserAdapter extends RecyclerView.Adapter<VoiceUserViewHolder> {
    private List<MobileVoiceOverlayDataUser> data;

    public VoiceUserAdapter() {
        List<MobileVoiceOverlayDataUser> m14104i;
        m14104i = C9545j.m14104i();
        this.data = m14104i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(List<MobileVoiceOverlayDataUser> data) {
        C9612q.m13917h(data, "data");
        this.data = data;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VoiceUserViewHolder holder, int i) {
        C9612q.m13917h(holder, "holder");
        holder.bind(this.data.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VoiceUserViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        C9612q.m13917h(parent, "parent");
        Context context = parent.getContext();
        C9612q.m13918g(context, "parent.context");
        return new VoiceUserViewHolder(new OverlayVoiceBubble(context));
    }
}
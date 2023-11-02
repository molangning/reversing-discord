package com.discord.chat.presentation.message.view.polls;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.C1786c;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import com.discord.chat.presentation.message.view.polls.PollAnswerViewHolder;
import com.discord.recycler_view.utils.ItemDiffer;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH\u0007R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "Lcom/discord/chat/presentation/message/view/polls/PollAnswerViewHolder;", "THolder", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "", "getItemCount", "holder", ViewProps.POSITION, "", "onBindViewHolder", "(Lcom/discord/chat/presentation/message/view/polls/PollAnswerViewHolder;I)V", "", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "answers", "Lkotlin/Function1;", "", "onTapAnswer", "setData", "items", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "getOnTapAnswer", "()Lkotlin/jvm/functions/Function1;", "setOnTapAnswer", "(Lkotlin/jvm/functions/Function1;)V", "myAvatarUrl", "Ljava/lang/String;", "getMyAvatarUrl", "()Ljava/lang/String;", "setMyAvatarUrl", "(Ljava/lang/String;)V", "<init>", "()V", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class PollAnswerAdapter<THolder extends PollAnswerViewHolder<?>> extends RecyclerView.Adapter<THolder> {
    private List<PollAnswerAccessory> items;
    private String myAvatarUrl;
    private Function1<? super String, Unit> onTapAnswer;

    public PollAnswerAdapter() {
        List<PollAnswerAccessory> m14104i;
        m14104i = C9545j.m14104i();
        this.items = m14104i;
        this.onTapAnswer = PollAnswerAdapter$onTapAnswer$1.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    public final String getMyAvatarUrl() {
        return this.myAvatarUrl;
    }

    public final Function1<String, Unit> getOnTapAnswer() {
        return this.onTapAnswer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((PollAnswerAdapter<THolder>) ((PollAnswerViewHolder) viewHolder), i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(List<PollAnswerAccessory> answers, Function1<? super String, Unit> onTapAnswer) {
        C9612q.m13917h(answers, "answers");
        C9612q.m13917h(onTapAnswer, "onTapAnswer");
        List<PollAnswerAccessory> list = this.items;
        this.items = answers;
        this.onTapAnswer = onTapAnswer;
        C1786c.C1791e m35427b = C1786c.m35427b(new ItemDiffer(list, answers), true);
        C9612q.m13918g(m35427b, "calculateDiff(differ, true)");
        m35427b.m35416c(this);
    }

    public final void setMyAvatarUrl(String str) {
        this.myAvatarUrl = str;
    }

    public final void setOnTapAnswer(Function1<? super String, Unit> function1) {
        C9612q.m13917h(function1, "<set-?>");
        this.onTapAnswer = function1;
    }

    public void onBindViewHolder(THolder holder, int i) {
        C9612q.m13917h(holder, "holder");
        holder.bind(this.items.get(i));
    }
}
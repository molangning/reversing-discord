package com.discord.chat.presentation.message.view.polls;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.presentation.message.messagepart.polls.PollAnswerAccessory;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/chat/presentation/message/view/polls/PollAnswerViewHolder;", "T", "Landroidx/viewbinding/ViewBinding;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "(Landroidx/viewbinding/ViewBinding;)V", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "Landroidx/viewbinding/ViewBinding;", "pollAnswerAdapter", "Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "getPollAnswerAdapter", "()Lcom/discord/chat/presentation/message/view/polls/PollAnswerAdapter;", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/polls/PollAnswerAccessory;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class PollAnswerViewHolder<T extends ViewBinding> extends RecyclerView.ViewHolder {
    private final T binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollAnswerViewHolder(T binding) {
        super(binding.getRoot());
        C9612q.m13917h(binding, "binding");
        this.binding = binding;
    }

    public abstract void bind(PollAnswerAccessory pollAnswerAccessory);

    public final T getBinding() {
        return this.binding;
    }

    public final PollAnswerAdapter<?> getPollAnswerAdapter() {
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
        C9612q.m13919f(bindingAdapter, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.polls.PollAnswerAdapter<*>");
        return (PollAnswerAdapter) bindingAdapter;
    }
}

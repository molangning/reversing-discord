package com.discord.chat.bridge.polls;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2590h;
import p045cj.C2620n1;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0BQ\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J!\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\f\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, m14357d2 = {"Lcom/discord/chat/bridge/polls/PollAnswer;", "", "seen1", "", "answerId", "", "pollMedia", "Lcom/discord/chat/bridge/polls/PollMedia;", "didSelfVote", "", "votes", "votesPercentage", "isSelected", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/chat/bridge/polls/PollMedia;ZLjava/lang/String;ILjava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollMedia;ZLjava/lang/String;ILjava/lang/Boolean;)V", "getAnswerId", "()Ljava/lang/String;", "getDidSelfVote", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPollMedia", "()Lcom/discord/chat/bridge/polls/PollMedia;", "getVotes", "getVotesPercentage", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/discord/chat/bridge/polls/PollMedia;ZLjava/lang/String;ILjava/lang/Boolean;)Lcom/discord/chat/bridge/polls/PollAnswer;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class PollAnswer {
    public static final Companion Companion = new Companion(null);
    private final String answerId;
    private final boolean didSelfVote;
    private final Boolean isSelected;
    private final PollMedia pollMedia;
    private final String votes;
    private final int votesPercentage;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/polls/PollAnswer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/polls/PollAnswer;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PollAnswer> serializer() {
            return PollAnswer$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PollAnswer(int i, String str, PollMedia pollMedia, boolean z, String str2, int i2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            C2620n1.m32836b(i, 31, PollAnswer$$serializer.INSTANCE.getDescriptor());
        }
        this.answerId = str;
        this.pollMedia = pollMedia;
        this.didSelfVote = z;
        this.votes = str2;
        this.votesPercentage = i2;
        if ((i & 32) == 0) {
            this.isSelected = null;
        } else {
            this.isSelected = bool;
        }
    }

    public static /* synthetic */ PollAnswer copy$default(PollAnswer pollAnswer, String str, PollMedia pollMedia, boolean z, String str2, int i, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pollAnswer.answerId;
        }
        if ((i2 & 2) != 0) {
            pollMedia = pollAnswer.pollMedia;
        }
        PollMedia pollMedia2 = pollMedia;
        if ((i2 & 4) != 0) {
            z = pollAnswer.didSelfVote;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str2 = pollAnswer.votes;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            i = pollAnswer.votesPercentage;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            bool = pollAnswer.isSelected;
        }
        return pollAnswer.copy(str, pollMedia2, z2, str3, i3, bool);
    }

    public static final void write$Self(PollAnswer self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        boolean z = false;
        output.mo12880y(serialDesc, 0, self.answerId);
        output.mo12894i(serialDesc, 1, PollMedia$$serializer.INSTANCE, self.pollMedia);
        output.mo12881x(serialDesc, 2, self.didSelfVote);
        output.mo12880y(serialDesc, 3, self.votes);
        output.mo12882w(serialDesc, 4, self.votesPercentage);
        if (output.mo12879z(serialDesc, 5) || self.isSelected != null) {
            z = true;
        }
        if (z) {
            output.mo12904E(serialDesc, 5, C2590h.f7055a, self.isSelected);
        }
    }

    public final String component1() {
        return this.answerId;
    }

    public final PollMedia component2() {
        return this.pollMedia;
    }

    public final boolean component3() {
        return this.didSelfVote;
    }

    public final String component4() {
        return this.votes;
    }

    public final int component5() {
        return this.votesPercentage;
    }

    public final Boolean component6() {
        return this.isSelected;
    }

    public final PollAnswer copy(String answerId, PollMedia pollMedia, boolean z, String votes, int i, Boolean bool) {
        C9612q.m13917h(answerId, "answerId");
        C9612q.m13917h(pollMedia, "pollMedia");
        C9612q.m13917h(votes, "votes");
        return new PollAnswer(answerId, pollMedia, z, votes, i, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollAnswer) {
            PollAnswer pollAnswer = (PollAnswer) obj;
            return C9612q.m13922c(this.answerId, pollAnswer.answerId) && C9612q.m13922c(this.pollMedia, pollAnswer.pollMedia) && this.didSelfVote == pollAnswer.didSelfVote && C9612q.m13922c(this.votes, pollAnswer.votes) && this.votesPercentage == pollAnswer.votesPercentage && C9612q.m13922c(this.isSelected, pollAnswer.isSelected);
        }
        return false;
    }

    public final String getAnswerId() {
        return this.answerId;
    }

    public final boolean getDidSelfVote() {
        return this.didSelfVote;
    }

    public final PollMedia getPollMedia() {
        return this.pollMedia;
    }

    public final String getVotes() {
        return this.votes;
    }

    public final int getVotesPercentage() {
        return this.votesPercentage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.answerId.hashCode() * 31) + this.pollMedia.hashCode()) * 31;
        boolean z = this.didSelfVote;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((((hashCode + i) * 31) + this.votes.hashCode()) * 31) + this.votesPercentage) * 31;
        Boolean bool = this.isSelected;
        return hashCode2 + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String str = this.answerId;
        PollMedia pollMedia = this.pollMedia;
        boolean z = this.didSelfVote;
        String str2 = this.votes;
        int i = this.votesPercentage;
        Boolean bool = this.isSelected;
        return "PollAnswer(answerId=" + str + ", pollMedia=" + pollMedia + ", didSelfVote=" + z + ", votes=" + str2 + ", votesPercentage=" + i + ", isSelected=" + bool + ")";
    }

    public PollAnswer(String answerId, PollMedia pollMedia, boolean z, String votes, int i, Boolean bool) {
        C9612q.m13917h(answerId, "answerId");
        C9612q.m13917h(pollMedia, "pollMedia");
        C9612q.m13917h(votes, "votes");
        this.answerId = answerId;
        this.pollMedia = pollMedia;
        this.didSelfVote = z;
        this.votes = votes;
        this.votesPercentage = i;
        this.isSelected = bool;
    }

    public /* synthetic */ PollAnswer(String str, PollMedia pollMedia, boolean z, String str2, int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pollMedia, z, str2, i, (i2 & 32) != 0 ? null : bool);
    }
}

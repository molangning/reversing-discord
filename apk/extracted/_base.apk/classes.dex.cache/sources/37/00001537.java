package com.discord.chat.reactevents;

import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2620n1;
import p470zi.C14272c;
import p470zi.InterfaceC14277f;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, m14357d2 = {"Lcom/discord/chat/reactevents/TapCopyText;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "text", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/CharSequence;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/CharSequence;)V", "getText", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", "other", "", "hashCode", "serialize", "Lcom/facebook/react/bridge/WritableNativeMap;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class TapCopyText implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final CharSequence text;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/reactevents/TapCopyText$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapCopyText;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapCopyText> serializer() {
            return TapCopyText$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapCopyText(int i, CharSequence charSequence, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C2620n1.m32836b(i, 1, TapCopyText$$serializer.INSTANCE.getDescriptor());
        }
        this.text = charSequence;
    }

    public static /* synthetic */ TapCopyText copy$default(TapCopyText tapCopyText, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = tapCopyText.text;
        }
        return tapCopyText.copy(charSequence);
    }

    public static final void write$Self(TapCopyText self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        output.mo12894i(serialDesc, 0, new C14272c(C9591f0.m13969b(CharSequence.class), new Annotation[0]), self.text);
    }

    public final CharSequence component1() {
        return this.text;
    }

    public final TapCopyText copy(CharSequence text) {
        C9612q.m13917h(text, "text");
        return new TapCopyText(text);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapCopyText) && C9612q.m13922c(this.text, ((TapCopyText) obj).text);
    }

    public final CharSequence getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode();
    }

    public String toString() {
        CharSequence charSequence = this.text;
        return "TapCopyText(text=" + ((Object) charSequence) + ")";
    }

    public TapCopyText(CharSequence text) {
        C9612q.m13917h(text, "text");
        this.text = text;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableNativeMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("text", this.text.toString()));
    }
}
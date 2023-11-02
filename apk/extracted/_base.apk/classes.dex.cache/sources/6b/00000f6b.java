package com.discord.chat.bridge.botuikit;

import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p045cj.C2581f;
import p470zi.InterfaceC14277f;
import pf.C11577n;
import pf.EnumC11580p;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0005¢\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014HÇ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016\u0080å\b\u0004"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "seen1", "", "selectedOptions", "", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getSelectedOptions", "()Ljava/util/List;", "getSelectedItems", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
@InterfaceC14277f
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class SearchableSelectComponent extends SelectComponent {
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion = new Companion(null);
    private final List<SearchableSelectItem> selectedOptions;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectComponent;", "chat_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return SearchableSelectComponent.$cachedSerializer$delegate;
        }

        public final KSerializer<SearchableSelectComponent> serializer() {
            return (KSerializer) get$cachedSerializer$delegate().getValue();
        }
    }

    static {
        Lazy<KSerializer<Object>> m7600b;
        m7600b = C11577n.m7600b(EnumC11580p.PUBLICATION, SearchableSelectComponent$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = m7600b;
    }

    public /* synthetic */ SearchableSelectComponent(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((i & 1) == 0) {
            this.selectedOptions = null;
        } else {
            this.selectedOptions = list;
        }
    }

    public static final void write$Self(SearchableSelectComponent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9612q.m13917h(self, "self");
        C9612q.m13917h(output, "output");
        C9612q.m13917h(serialDesc, "serialDesc");
        SelectComponent.write$Self(self, output, serialDesc);
        boolean z = true;
        if (!output.mo12879z(serialDesc, 0) && self.selectedOptions == null) {
            z = false;
        }
        if (z) {
            output.mo12904E(serialDesc, 0, new C2581f(SearchableSelectItem$$serializer.INSTANCE), self.selectedOptions);
        }
    }

    @Override // com.discord.chat.bridge.botuikit.SelectComponent
    public List<SearchableSelectItem> getSelectedItems() {
        List<SearchableSelectItem> m14104i;
        List<SearchableSelectItem> list = this.selectedOptions;
        if (list == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return list;
    }

    public final List<SearchableSelectItem> getSelectedOptions() {
        return this.selectedOptions;
    }

    public SearchableSelectComponent() {
    }
}
package com.discord.simpleast.core.node;

import android.text.SpannableStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m14357d2 = {"Lcom/discord/simpleast/core/node/TextNode;", "R", "Lcom/discord/simpleast/core/node/Node;", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "render", "", "builder", "Landroid/text/SpannableStringBuilder;", "renderContext", "(Landroid/text/SpannableStringBuilder;Ljava/lang/Object;)V", "toString", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public class TextNode<R> extends Node<R> {
    private final String content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextNode(String content) {
        super(null, 1, null);
        C9612q.m13917h(content, "content");
        this.content = content;
    }

    public final String getContent() {
        return this.content;
    }

    @Override // com.discord.simpleast.core.node.Node
    public void render(SpannableStringBuilder builder, R r) {
        C9612q.m13917h(builder, "builder");
        builder.append((CharSequence) this.content);
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + this.content;
    }
}

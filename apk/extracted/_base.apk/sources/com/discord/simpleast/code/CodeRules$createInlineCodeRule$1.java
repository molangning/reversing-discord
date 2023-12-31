package com.discord.simpleast.code;

import android.text.SpannableStringBuilder;
import com.discord.simpleast.code.CodeNode;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.node.TextNode;
import com.discord.simpleast.core.parser.ParseSpec;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Add missing generic type declarations: [R, S] */
@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\u0001JK\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m14357d2 = {"com/discord/simpleast/code/CodeRules$createInlineCodeRule$1", "Lcom/discord/simpleast/core/parser/Rule;", "Lcom/discord/simpleast/core/node/Node;", "parse", "Lcom/discord/simpleast/core/parser/ParseSpec;", "matcher", "Ljava/util/regex/Matcher;", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "state", "(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class CodeRules$createInlineCodeRule$1<R, S> extends Rule<R, Node<R>, S> {
    final /* synthetic */ StyleNode.SpanProvider $bgStyleProvider;
    final /* synthetic */ StyleNode.SpanProvider $textStyleProvider;
    final /* synthetic */ CodeRules this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeRules$createInlineCodeRule$1(CodeRules codeRules, StyleNode.SpanProvider spanProvider, StyleNode.SpanProvider spanProvider2, Pattern pattern) {
        super(pattern);
        this.this$0 = codeRules;
        this.$textStyleProvider = spanProvider;
        this.$bgStyleProvider = spanProvider2;
    }

    @Override // com.discord.simpleast.core.parser.Rule
    public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s) {
        boolean z;
        C9612q.m13917h(matcher, "matcher");
        C9612q.m13917h(parser, "parser");
        String group = matcher.group(2);
        if (group == null) {
            group = "";
        }
        if (group.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ParseSpec.Companion companion = ParseSpec.Companion;
            String group2 = matcher.group();
            C9612q.m13918g(group2, "matcher.group()");
            return companion.createTerminal(new TextNode(group2), s);
        }
        final CodeNode codeNode = new CodeNode(new CodeNode.Content.Raw(group), null, this.$textStyleProvider);
        final Node[] nodeArr = {codeNode};
        return ParseSpec.Companion.createTerminal(new Node.Parent<R>(nodeArr) { // from class: com.discord.simpleast.code.CodeRules$createInlineCodeRule$1$parse$node$1
            @Override // com.discord.simpleast.core.node.Node.Parent, com.discord.simpleast.core.node.Node
            public void render(SpannableStringBuilder builder, R r) {
                C9612q.m13917h(builder, "builder");
                int length = builder.length();
                super.render(builder, r);
                Iterator<?> it = CodeRules$createInlineCodeRule$1.this.$bgStyleProvider.get(r).iterator();
                while (it.hasNext()) {
                    builder.setSpan(it.next(), length, builder.length(), 33);
                }
            }
        }, s);
    }
}

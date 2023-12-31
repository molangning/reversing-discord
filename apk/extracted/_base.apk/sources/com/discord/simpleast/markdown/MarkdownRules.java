package com.discord.simpleast.markdown;

import android.content.Context;
import android.text.style.BulletSpan;
import android.text.style.CharacterStyle;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.parser.ParseSpec;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\r\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u0011\u0012\u0004\u0012\u0002H\u00120\u000f0\u000e\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eH\u0007JJ\u0010\u0017\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u0011\u0012\u0004\u0012\u0002H\u00120\u000f0\u000e\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000eH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/simpleast/markdown/MarkdownRules;", "", "()V", "PATTERN_HEADER_ITEM", "Ljava/util/regex/Pattern;", "getPATTERN_HEADER_ITEM", "()Ljava/util/regex/Pattern;", "PATTERN_HEADER_ITEM_ALT", "getPATTERN_HEADER_ITEM_ALT", "PATTERN_HEADER_ITEM_ALT_CLASSED", "getPATTERN_HEADER_ITEM_ALT_CLASSED", "PATTERN_LIST_ITEM", "getPATTERN_LIST_ITEM", "createHeaderRules", "", "Lcom/discord/simpleast/core/parser/Rule;", "R", "Lcom/discord/simpleast/core/node/Node;", "S", "context", "Landroid/content/Context;", "headerStyles", "", "createMarkdownRules", "HeaderLineClassedRule", "HeaderLineRule", "HeaderRule", "ListItemRule", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class MarkdownRules {
    public static final MarkdownRules INSTANCE = new MarkdownRules();
    private static final Pattern PATTERN_HEADER_ITEM;
    private static final Pattern PATTERN_HEADER_ITEM_ALT;
    private static final Pattern PATTERN_HEADER_ITEM_ALT_CLASSED;
    private static final Pattern PATTERN_LIST_ITEM;

    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u0003*\u0004\b\u0002\u0010\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\u0005B1\b\u0016\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007¢\u0006\u0002\u0010\fBU\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007\u0012$\u0010\r\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0004\u0012\u00028\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0011JK\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192 \u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0004\u0012\u00028\u00020\u001b2\u0006\u0010\u001c\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u001dR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R2\u0010\r\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0004\u0012\u00028\u00020\u000f0\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/simpleast/markdown/MarkdownRules$HeaderLineClassedRule;", "RC", "T", "", "S", "Lcom/discord/simpleast/markdown/MarkdownRules$HeaderLineRule;", "styleSpanProvider", "Lkotlin/Function1;", "", "Landroid/text/style/CharacterStyle;", "classSpanProvider", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "innerRules", "", "Lcom/discord/simpleast/core/parser/Rule;", "Lcom/discord/simpleast/core/node/Node;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/List;)V", "getClassSpanProvider", "()Lkotlin/jvm/functions/Function1;", "getInnerRules", "()Ljava/util/List;", "parse", "Lcom/discord/simpleast/core/parser/ParseSpec;", "matcher", "Ljava/util/regex/Matcher;", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "state", "(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static class HeaderLineClassedRule<RC, T, S> extends HeaderLineRule<RC, S> {
        private final Function1<String, T> classSpanProvider;
        private final List<Rule<RC, Node<RC>, S>> innerRules;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public HeaderLineClassedRule(Function1<? super Integer, ? extends CharacterStyle> styleSpanProvider, Function1<? super String, ? extends T> classSpanProvider, List<? extends Rule<RC, Node<RC>, S>> innerRules) {
            super(MarkdownRules.INSTANCE.getPATTERN_HEADER_ITEM_ALT_CLASSED(), styleSpanProvider);
            C9612q.m13917h(styleSpanProvider, "styleSpanProvider");
            C9612q.m13917h(classSpanProvider, "classSpanProvider");
            C9612q.m13917h(innerRules, "innerRules");
            this.classSpanProvider = classSpanProvider;
            this.innerRules = innerRules;
        }

        public final Function1<String, T> getClassSpanProvider() {
            return this.classSpanProvider;
        }

        protected final List<Rule<RC, Node<RC>, S>> getInnerRules() {
            return this.innerRules;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
        @Override // com.discord.simpleast.markdown.MarkdownRules.HeaderLineRule, com.discord.simpleast.markdown.MarkdownRules.HeaderRule, com.discord.simpleast.core.parser.Rule
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.discord.simpleast.core.parser.ParseSpec<RC, S> parse(java.util.regex.Matcher r9, com.discord.simpleast.core.parser.Parser<RC, ? super com.discord.simpleast.core.node.Node<RC>, S> r10, S r11) {
            /*
                r8 = this;
                java.lang.String r0 = "matcher"
                kotlin.jvm.internal.C9612q.m13917h(r9, r0)
                java.lang.String r0 = "parser"
                kotlin.jvm.internal.C9612q.m13917h(r10, r0)
                r0 = 4
                java.lang.String r0 = r9.group(r0)
                java.lang.String r1 = "matcher.group(4)"
                kotlin.jvm.internal.C9612q.m13918g(r0, r1)
                com.discord.simpleast.core.node.StyleNode r0 = r8.createHeaderStyleNode(r0)
                r1 = 1
                java.lang.String r2 = r9.group(r1)
                if (r2 == 0) goto L20
                goto L25
            L20:
                r2 = 3
                java.lang.String r2 = r9.group(r2)
            L25:
                java.lang.String r3 = "headerBody"
                kotlin.jvm.internal.C9612q.m13918g(r2, r3)
                java.util.List<com.discord.simpleast.core.parser.Rule<RC, com.discord.simpleast.core.node.Node<RC>, S>> r3 = r8.innerRules
                java.util.List r10 = r10.parse(r2, r11, r3)
                java.util.Iterator r10 = r10.iterator()
            L34:
                boolean r2 = r10.hasNext()
                if (r2 == 0) goto L4e
                java.lang.Object r2 = r10.next()
                if (r2 == 0) goto L46
                com.discord.simpleast.core.node.Node r2 = (com.discord.simpleast.core.node.Node) r2
                r0.addChild(r2)
                goto L34
            L46:
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r10 = "null cannot be cast to non-null type com.discord.simpleast.core.node.Node<RC>"
                r9.<init>(r10)
                throw r9
            L4e:
                r10 = 2
                java.lang.String r9 = r9.group(r10)
                if (r9 == 0) goto L6f
                java.lang.CharSequence r9 = kotlin.text.C9642f.m13819V0(r9)
                java.lang.String r2 = r9.toString()
                if (r2 == 0) goto L6f
                char[] r3 = new char[r1]
                r9 = 0
                r10 = 32
                r3[r9] = r10
                r4 = 0
                r5 = 0
                r6 = 6
                r7 = 0
                java.util.List r9 = kotlin.text.C9642f.m13786y0(r2, r3, r4, r5, r6, r7)
                goto L70
            L6f:
                r9 = 0
            L70:
                if (r9 == 0) goto L93
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.Iterator r9 = r9.iterator()
            L7b:
                boolean r2 = r9.hasNext()
                if (r2 == 0) goto L97
                java.lang.Object r2 = r9.next()
                java.lang.String r2 = (java.lang.String) r2
                kotlin.jvm.functions.Function1<java.lang.String, T> r3 = r8.classSpanProvider
                java.lang.Object r2 = r3.invoke(r2)
                if (r2 == 0) goto L7b
                r10.add(r2)
                goto L7b
            L93:
                java.util.List r10 = kotlin.collections.C9543h.m14145i()
            L97:
                boolean r9 = r10.isEmpty()
                r9 = r9 ^ r1
                if (r9 == 0) goto La7
                com.discord.simpleast.core.node.StyleNode r9 = new com.discord.simpleast.core.node.StyleNode
                r9.<init>(r10)
                r9.addChild(r0)
                r0 = r9
            La7:
                com.discord.simpleast.core.parser.ParseSpec$Companion r9 = com.discord.simpleast.core.parser.ParseSpec.Companion
                com.discord.simpleast.core.parser.ParseSpec r9 = r9.createTerminal(r0, r11)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.simpleast.markdown.MarkdownRules.HeaderLineClassedRule.parse(java.util.regex.Matcher, com.discord.simpleast.core.parser.Parser, java.lang.Object):com.discord.simpleast.core.parser.ParseSpec");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public HeaderLineClassedRule(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends android.text.style.CharacterStyle> r4, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> r5) {
            /*
                r3 = this;
                java.lang.String r0 = "styleSpanProvider"
                kotlin.jvm.internal.C9612q.m13917h(r4, r0)
                java.lang.String r0 = "classSpanProvider"
                kotlin.jvm.internal.C9612q.m13917h(r5, r0)
                r0 = 2
                r1 = 0
                r2 = 0
                java.util.List r0 = com.discord.simpleast.core.simple.SimpleMarkdownRules.createSimpleMarkdownRules$default(r2, r2, r0, r1)
                com.discord.simpleast.core.simple.SimpleMarkdownRules r1 = com.discord.simpleast.core.simple.SimpleMarkdownRules.INSTANCE
                com.discord.simpleast.core.parser.Rule r1 = r1.createTextRule()
                java.util.List r0 = kotlin.collections.C9543h.m14132o0(r0, r1)
                r3.<init>(r4, r5, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.simpleast.markdown.MarkdownRules.HeaderLineClassedRule.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
        }
    }

    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014JK\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122 \u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u0015\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m14357d2 = {"Lcom/discord/simpleast/markdown/MarkdownRules$HeaderLineRule;", "R", "S", "Lcom/discord/simpleast/markdown/MarkdownRules$HeaderRule;", "pattern", "Ljava/util/regex/Pattern;", "styleSpanProvider", "Lkotlin/Function1;", "", "Landroid/text/style/CharacterStyle;", "(Ljava/util/regex/Pattern;Lkotlin/jvm/functions/Function1;)V", "createHeaderStyleNode", "Lcom/discord/simpleast/core/node/StyleNode;", "headerStyleGroup", "", "parse", "Lcom/discord/simpleast/core/parser/ParseSpec;", "matcher", "Ljava/util/regex/Matcher;", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "Lcom/discord/simpleast/core/node/Node;", "state", "(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static class HeaderLineRule<R, S> extends HeaderRule<R, S> {
        public /* synthetic */ HeaderLineRule(Pattern pattern, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MarkdownRules.INSTANCE.getPATTERN_HEADER_ITEM_ALT() : pattern, function1);
        }

        @Override // com.discord.simpleast.markdown.MarkdownRules.HeaderRule
        protected StyleNode<R, CharacterStyle> createHeaderStyleNode(String headerStyleGroup) {
            int i;
            List m14109d;
            C9612q.m13917h(headerStyleGroup, "headerStyleGroup");
            if (headerStyleGroup.hashCode() == 61 && headerStyleGroup.equals("=")) {
                i = 1;
            } else {
                i = 2;
            }
            m14109d = C9544i.m14109d(getStyleSpanProvider().invoke(Integer.valueOf(i)));
            return new StyleNode<>(m14109d);
        }

        @Override // com.discord.simpleast.markdown.MarkdownRules.HeaderRule, com.discord.simpleast.core.parser.Rule
        public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s) {
            C9612q.m13917h(matcher, "matcher");
            C9612q.m13917h(parser, "parser");
            ParseSpec.Companion companion = ParseSpec.Companion;
            String group = matcher.group(2);
            C9612q.m13918g(group, "matcher.group(2)");
            return companion.createNonterminal(createHeaderStyleNode(group), s, matcher.start(1), matcher.end(1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderLineRule(Pattern pattern, Function1<? super Integer, ? extends CharacterStyle> styleSpanProvider) {
            super(pattern, styleSpanProvider);
            C9612q.m13917h(pattern, "pattern");
            C9612q.m13917h(styleSpanProvider, "styleSpanProvider");
        }
    }

    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u0002H\u00020\u0003B\u001b\b\u0016\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tB!\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\fJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014JK\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162 \u0010\u0017\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u00182\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/simpleast/markdown/MarkdownRules$HeaderRule;", "R", "S", "Lcom/discord/simpleast/core/parser/Rule$BlockRule;", "Lcom/discord/simpleast/core/node/Node;", "styleSpanProvider", "Lkotlin/Function1;", "", "Landroid/text/style/CharacterStyle;", "(Lkotlin/jvm/functions/Function1;)V", "pattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;Lkotlin/jvm/functions/Function1;)V", "getStyleSpanProvider", "()Lkotlin/jvm/functions/Function1;", "createHeaderStyleNode", "Lcom/discord/simpleast/core/node/StyleNode;", "headerStyleGroup", "", "parse", "Lcom/discord/simpleast/core/parser/ParseSpec;", "matcher", "Ljava/util/regex/Matcher;", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "state", "(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static class HeaderRule<R, S> extends Rule.BlockRule<R, Node<R>, S> {
        private final Function1<Integer, CharacterStyle> styleSpanProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public HeaderRule(Pattern pattern, Function1<? super Integer, ? extends CharacterStyle> styleSpanProvider) {
            super(pattern);
            C9612q.m13917h(pattern, "pattern");
            C9612q.m13917h(styleSpanProvider, "styleSpanProvider");
            this.styleSpanProvider = styleSpanProvider;
        }

        protected StyleNode<R, CharacterStyle> createHeaderStyleNode(String headerStyleGroup) {
            List m14109d;
            C9612q.m13917h(headerStyleGroup, "headerStyleGroup");
            m14109d = C9544i.m14109d(this.styleSpanProvider.invoke(Integer.valueOf(headerStyleGroup.length())));
            return new StyleNode<>(m14109d);
        }

        protected final Function1<Integer, CharacterStyle> getStyleSpanProvider() {
            return this.styleSpanProvider;
        }

        @Override // com.discord.simpleast.core.parser.Rule
        public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s) {
            C9612q.m13917h(matcher, "matcher");
            C9612q.m13917h(parser, "parser");
            ParseSpec.Companion companion = ParseSpec.Companion;
            String group = matcher.group(1);
            C9612q.m13918g(group, "matcher.group(1)");
            return companion.createNonterminal(createHeaderStyleNode(group), s, matcher.start(2), matcher.end(2));
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public HeaderRule(Function1<? super Integer, ? extends CharacterStyle> styleSpanProvider) {
            this(MarkdownRules.INSTANCE.getPATTERN_HEADER_ITEM(), styleSpanProvider);
            C9612q.m13917h(styleSpanProvider, "styleSpanProvider");
        }
    }

    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u0002H\u00020\u0003B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJK\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/simpleast/markdown/MarkdownRules$ListItemRule;", "R", "S", "Lcom/discord/simpleast/core/parser/Rule$BlockRule;", "Lcom/discord/simpleast/core/node/Node;", "bulletSpanProvider", "Lkotlin/Function0;", "Landroid/text/style/BulletSpan;", "(Lkotlin/jvm/functions/Function0;)V", "parse", "Lcom/discord/simpleast/core/parser/ParseSpec;", "matcher", "Ljava/util/regex/Matcher;", "parser", "Lcom/discord/simpleast/core/parser/Parser;", "state", "(Ljava/util/regex/Matcher;Lcom/discord/simpleast/core/parser/Parser;Ljava/lang/Object;)Lcom/discord/simpleast/core/parser/ParseSpec;", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class ListItemRule<R, S> extends Rule.BlockRule<R, Node<R>, S> {
        private final Function0<BulletSpan> bulletSpanProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ListItemRule(Function0<? extends BulletSpan> bulletSpanProvider) {
            super(MarkdownRules.INSTANCE.getPATTERN_LIST_ITEM());
            C9612q.m13917h(bulletSpanProvider, "bulletSpanProvider");
            this.bulletSpanProvider = bulletSpanProvider;
        }

        @Override // com.discord.simpleast.core.parser.Rule
        public ParseSpec<R, S> parse(Matcher matcher, Parser<R, ? super Node<R>, S> parser, S s) {
            C9612q.m13917h(matcher, "matcher");
            C9612q.m13917h(parser, "parser");
            return ParseSpec.Companion.createNonterminal(new MarkdownListItemNode(this.bulletSpanProvider), s, matcher.start(1), matcher.end(1));
        }
    }

    static {
        Pattern compile = Pattern.compile("^\\*[ \\t](.*)(?=\\n|$)", 0);
        C9612q.m13918g(compile, "java.util.regex.Pattern.compile(this, flags)");
        PATTERN_LIST_ITEM = compile;
        Pattern compile2 = Pattern.compile("^\\s*(#+)[ \\t](.*) *(?=\\n|$)", 0);
        C9612q.m13918g(compile2, "java.util.regex.Pattern.compile(this, flags)");
        PATTERN_HEADER_ITEM = compile2;
        Pattern compile3 = Pattern.compile("^\\s*(.+)\\n *(=|-){3,} *(?=\\n|$)", 0);
        C9612q.m13918g(compile3, "java.util.regex.Pattern.compile(this, flags)");
        PATTERN_HEADER_ITEM_ALT = compile3;
        PATTERN_HEADER_ITEM_ALT_CLASSED = new Regex("^\\s*(?:(?:(.+)(?: +\\{([\\w ]*)\\}))|(.*))[ \\t]*\\n *([=\\-]){3,}[ \\t]*(?=\\n|$)").m13864k();
    }

    private MarkdownRules() {
    }

    public static final <R, S> List<Rule<R, Node<R>, S>> createHeaderRules(Context context, List<Integer> headerStyles) {
        List<Rule<R, Node<R>, S>> m14101l;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(headerStyles, "headerStyles");
        MarkdownRules$createHeaderRules$1 markdownRules$createHeaderRules$1 = new MarkdownRules$createHeaderRules$1(context, headerStyles);
        m14101l = C9545j.m14101l(new HeaderRule(new MarkdownRules$createHeaderRules$2(markdownRules$createHeaderRules$1)), new HeaderLineRule(null, new MarkdownRules$createHeaderRules$3(markdownRules$createHeaderRules$1), 1, null));
        return m14101l;
    }

    public static final <R, S> List<Rule<R, Node<R>, S>> createMarkdownRules(Context context, List<Integer> headerStyles) {
        List<Rule<R, Node<R>, S>> m14035o0;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(headerStyles, "headerStyles");
        m14035o0 = C9553r.m14035o0(createHeaderRules(context, headerStyles), new ListItemRule(MarkdownRules$createMarkdownRules$1.INSTANCE));
        return m14035o0;
    }

    public final Pattern getPATTERN_HEADER_ITEM() {
        return PATTERN_HEADER_ITEM;
    }

    public final Pattern getPATTERN_HEADER_ITEM_ALT() {
        return PATTERN_HEADER_ITEM_ALT;
    }

    public final Pattern getPATTERN_HEADER_ITEM_ALT_CLASSED() {
        return PATTERN_HEADER_ITEM_ALT_CLASSED;
    }

    public final Pattern getPATTERN_LIST_ITEM() {
        return PATTERN_LIST_ITEM;
    }
}

package com.discord.simpleast.code;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.simpleast.code.Kotlin;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.parser.ParseSpec;
import com.discord.simpleast.core.parser.Parser;
import com.discord.simpleast.core.parser.Rule;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import p355ti.EnumC12793f;

@Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u0002H\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0014\u0012\u0004\u0012\u0002H\u00150\u00120\u0011\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0017H\u0000¢\u0006\u0002\b\u0018R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/simpleast/code/Kotlin;", "", "()V", "BUILT_INS", "", "", "getBUILT_INS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "KEYWORDS", "getKEYWORDS", "PATTERN_KOTLIN_ANNOTATION", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN_KOTLIN_COMMENTS", "PATTERN_KOTLIN_STRINGS", "createKotlinCodeRules", "", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "createKotlinCodeRules$simpleast_core_release", "FieldNode", "FunctionNode", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class Kotlin {
    public static final Kotlin INSTANCE = new Kotlin();
    private static final String[] KEYWORDS = {"public|private|internal|inline|lateinit|abstract|open|reified", "import|package", "class|interface|data|enum|sealed|object|typealias", "fun|override|this|super|where|constructor|init|param|delegate", "const|val|var|get|final|vararg|it", "return|break|continue|suspend", "for|while|do|if|else|when|try|catch|finally|throw", "in|out|is|as|typeof", "shr|ushr|shl|ushl", "true|false|null"};
    private static final String[] BUILT_INS = {"true|false|Boolean|String|Char", "Int|UInt|Long|ULong|Float|Double|Byte|UByte|Short|UShort", "Self|Set|Map|MutableMap|List|MutableList|Array|Runnable|Unit", "arrayOf|listOf|mapOf|setOf|let|also|apply|run"};
    private static final Pattern PATTERN_KOTLIN_COMMENTS = Pattern.compile("^(?:(?://.*?(?=\\n|$))|(/\\*.*?\\*/))", 32);
    private static final Pattern PATTERN_KOTLIN_ANNOTATION = Pattern.compile("^@(\\w+)");
    private static final Pattern PATTERN_KOTLIN_STRINGS = Pattern.compile("^\"[\\s\\S]*?(?<!\\\\)\"(?=\\W|\\s|$)");

    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\tB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\b¨\u0006\n"}, m14357d2 = {"Lcom/discord/simpleast/code/Kotlin$FieldNode;", "RC", "Lcom/discord/simpleast/core/node/Node$Parent;", "definition", "", ZeroconfModule.KEY_SERVICE_NAME, "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V", "Companion", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class FieldNode<RC> extends Node.Parent<RC> {
        public static final Companion Companion = new Companion(null);
        private static final Pattern PATTERN_KOTLIN_FIELD = Pattern.compile("^(val|var)(\\s+\\w+)", 32);

        @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u0002H\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\t\u0012\u0004\u0012\u0002H\n0\u0007\"\u0004\b\u0001\u0010\b\"\u0004\b\u0002\u0010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m14357d2 = {"Lcom/discord/simpleast/code/Kotlin$FieldNode$Companion;", "", "()V", "PATTERN_KOTLIN_FIELD", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "createFieldRule", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <RC, S> Rule<RC, Node<RC>, S> createFieldRule(final CodeStyleProviders<RC> codeStyleProviders) {
                C9612q.m13917h(codeStyleProviders, "codeStyleProviders");
                Pattern PATTERN_KOTLIN_FIELD = FieldNode.PATTERN_KOTLIN_FIELD;
                C9612q.m13918g(PATTERN_KOTLIN_FIELD, "PATTERN_KOTLIN_FIELD");
                return new Rule<RC, Node<RC>, S>(PATTERN_KOTLIN_FIELD) { // from class: com.discord.simpleast.code.Kotlin$FieldNode$Companion$createFieldRule$1
                    @Override // com.discord.simpleast.core.parser.Rule
                    public ParseSpec<RC, S> parse(Matcher matcher, Parser<RC, ? super Node<RC>, S> parser, S s) {
                        C9612q.m13917h(matcher, "matcher");
                        C9612q.m13917h(parser, "parser");
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        ParseSpec.Companion companion = ParseSpec.Companion;
                        C9612q.m13920e(group);
                        C9612q.m13920e(group2);
                        return companion.createTerminal(new Kotlin.FieldNode(group, group2, codeStyleProviders), s);
                    }
                };
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldNode(String definition, String name, CodeStyleProviders<RC> codeStyleProviders) {
            super(new StyleNode.TextStyledNode(definition, codeStyleProviders.getKeywordStyleProvider()), new StyleNode.TextStyledNode(name, codeStyleProviders.getIdentifierStyleProvider()));
            C9612q.m13917h(definition, "definition");
            C9612q.m13917h(name, "name");
            C9612q.m13917h(codeStyleProviders, "codeStyleProviders");
        }
    }

    @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000bB5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\n¨\u0006\f"}, m14357d2 = {"Lcom/discord/simpleast/code/Kotlin$FunctionNode;", "RC", "Lcom/discord/simpleast/core/node/Node$Parent;", "pre", "", "generic", "signature", "params", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/simpleast/code/CodeStyleProviders;)V", "Companion", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class FunctionNode<RC> extends Node.Parent<RC> {
        public static final Companion Companion = new Companion(null);
        private static final Pattern PATTERN_KOTLIN_FUNC = new Regex("^(fun)( *<.*>)?( \\w+)( *\\(.*?\\))", EnumC12793f.DOT_MATCHES_ALL).m13864k();

        @Metadata(m14359bv = {1, 0, 3}, m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u0002H\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\b\u0012\u0004\u0012\u0002H\t0\u0006\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/simpleast/code/Kotlin$FunctionNode$Companion;", "", "()V", "PATTERN_KOTLIN_FUNC", "Ljava/util/regex/Pattern;", "createFunctionRule", "Lcom/discord/simpleast/core/parser/Rule;", "RC", "Lcom/discord/simpleast/core/node/Node;", "S", "codeStyleProviders", "Lcom/discord/simpleast/code/CodeStyleProviders;", "simpleast-core_release"}, m14356k = 1, m14355mv = {1, 4, 0})
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final <RC, S> Rule<RC, Node<RC>, S> createFunctionRule(final CodeStyleProviders<RC> codeStyleProviders) {
                C9612q.m13917h(codeStyleProviders, "codeStyleProviders");
                return new Rule<RC, Node<RC>, S>(FunctionNode.PATTERN_KOTLIN_FUNC) { // from class: com.discord.simpleast.code.Kotlin$FunctionNode$Companion$createFunctionRule$1
                    @Override // com.discord.simpleast.core.parser.Rule
                    public ParseSpec<RC, S> parse(Matcher matcher, Parser<RC, ? super Node<RC>, S> parser, S s) {
                        C9612q.m13917h(matcher, "matcher");
                        C9612q.m13917h(parser, "parser");
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        String group3 = matcher.group(3);
                        String group4 = matcher.group(4);
                        ParseSpec.Companion companion = ParseSpec.Companion;
                        C9612q.m13920e(group);
                        C9612q.m13920e(group3);
                        C9612q.m13920e(group4);
                        return companion.createTerminal(new Kotlin.FunctionNode(group, group2, group3, group4, codeStyleProviders), s);
                    }
                };
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public FunctionNode(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.discord.simpleast.code.CodeStyleProviders<RC> r8) {
            /*
                r3 = this;
                java.lang.String r0 = "pre"
                kotlin.jvm.internal.C9612q.m13917h(r4, r0)
                java.lang.String r0 = "signature"
                kotlin.jvm.internal.C9612q.m13917h(r6, r0)
                java.lang.String r0 = "params"
                kotlin.jvm.internal.C9612q.m13917h(r7, r0)
                java.lang.String r0 = "codeStyleProviders"
                kotlin.jvm.internal.C9612q.m13917h(r8, r0)
                r0 = 4
                com.discord.simpleast.core.node.Node[] r0 = new com.discord.simpleast.core.node.Node[r0]
                com.discord.simpleast.core.node.StyleNode$TextStyledNode r1 = new com.discord.simpleast.core.node.StyleNode$TextStyledNode
                com.discord.simpleast.core.node.StyleNode$SpanProvider r2 = r8.getKeywordStyleProvider()
                r1.<init>(r4, r2)
                r4 = 0
                r0[r4] = r1
                if (r5 == 0) goto L2f
                com.discord.simpleast.core.node.StyleNode$TextStyledNode r4 = new com.discord.simpleast.core.node.StyleNode$TextStyledNode
                com.discord.simpleast.core.node.StyleNode$SpanProvider r1 = r8.getGenericsStyleProvider()
                r4.<init>(r5, r1)
                goto L30
            L2f:
                r4 = 0
            L30:
                r5 = 1
                r0[r5] = r4
                com.discord.simpleast.core.node.StyleNode$TextStyledNode r4 = new com.discord.simpleast.core.node.StyleNode$TextStyledNode
                com.discord.simpleast.core.node.StyleNode$SpanProvider r5 = r8.getIdentifierStyleProvider()
                r4.<init>(r6, r5)
                r5 = 2
                r0[r5] = r4
                com.discord.simpleast.core.node.StyleNode$TextStyledNode r4 = new com.discord.simpleast.core.node.StyleNode$TextStyledNode
                com.discord.simpleast.core.node.StyleNode$SpanProvider r5 = r8.getParamsStyleProvider()
                r4.<init>(r7, r5)
                r5 = 3
                r0[r5] = r4
                r3.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.simpleast.code.Kotlin.FunctionNode.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.discord.simpleast.code.CodeStyleProviders):void");
        }
    }

    private Kotlin() {
    }

    public final <RC, S> List<Rule<RC, Node<RC>, S>> createKotlinCodeRules$simpleast_core_release(CodeStyleProviders<RC> codeStyleProviders) {
        List<Rule<RC, Node<RC>, S>> m14101l;
        C9612q.m13917h(codeStyleProviders, "codeStyleProviders");
        CodeRules codeRules = CodeRules.INSTANCE;
        Pattern PATTERN_KOTLIN_COMMENTS2 = PATTERN_KOTLIN_COMMENTS;
        C9612q.m13918g(PATTERN_KOTLIN_COMMENTS2, "PATTERN_KOTLIN_COMMENTS");
        Pattern PATTERN_KOTLIN_STRINGS2 = PATTERN_KOTLIN_STRINGS;
        C9612q.m13918g(PATTERN_KOTLIN_STRINGS2, "PATTERN_KOTLIN_STRINGS");
        Pattern PATTERN_KOTLIN_ANNOTATION2 = PATTERN_KOTLIN_ANNOTATION;
        C9612q.m13918g(PATTERN_KOTLIN_ANNOTATION2, "PATTERN_KOTLIN_ANNOTATION");
        m14101l = C9545j.m14101l(CodeRules.toMatchGroupRule$default(codeRules, PATTERN_KOTLIN_COMMENTS2, 0, codeStyleProviders.getCommentStyleProvider(), 1, null), CodeRules.toMatchGroupRule$default(codeRules, PATTERN_KOTLIN_STRINGS2, 0, codeStyleProviders.getLiteralStyleProvider(), 1, null), CodeRules.toMatchGroupRule$default(codeRules, PATTERN_KOTLIN_ANNOTATION2, 0, codeStyleProviders.getGenericsStyleProvider(), 1, null), FieldNode.Companion.createFieldRule(codeStyleProviders), FunctionNode.Companion.createFunctionRule(codeStyleProviders));
        return m14101l;
    }

    public final String[] getBUILT_INS() {
        return BUILT_INS;
    }

    public final String[] getKEYWORDS() {
        return KEYWORDS;
    }
}
package saturday.patterns.interpreter;

import java.util.Map;

interface Expression {
    int interpret(Map<String, Integer> context);

    static Expression plus(Expression left, Expression right) {
        return context -> left.interpret(context) + right.interpret(context);
    }

    static Expression variable(String name) {
        return context -> context.getOrDefault(name, 0);
    }

    static Expression minus(Expression left, Expression right) {
        return context -> left.interpret(context) - right.interpret(context);
    }
}

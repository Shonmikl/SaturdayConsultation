package saturday.patterns.interpreter;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Expression parseToken(String token, ArrayDeque<Expression> stack) {
        Expression left;
        Expression right;

        if("+".equals(token)) {
            right = stack.pop();
            left = stack.pop();
            return Expression.plus(left, right);
        } else if("-".equals(token)) {
            right = stack.pop();
            left = stack.pop();
            return Expression.minus(left, right);
        }

        return Expression.variable(token);
    }

    private static Expression parse(String exp) {
        ArrayDeque<Expression> stack = new ArrayDeque<>();
        Arrays.stream(exp.split(" "))
                .filter(token -> Character.isLetter(token.charAt(0)))
                .forEach(token -> stack.push(parseToken(token, stack)));

        Arrays.stream(exp.split(" "))
                .filter(token -> !Character.isLetter(token.charAt(0)))
                .forEach(token -> stack.push(parseToken(token, stack)));

        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "a + b";
        Expression parse = parse(exp);

        Map<String, Integer> context = new HashMap<>();
        context.put("a", 10);
        context.put("b", 20);

        System.out.println(parse.interpret(context));

    }
}
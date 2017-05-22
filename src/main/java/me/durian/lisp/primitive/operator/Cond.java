package me.durian.lisp.primitive.operator;

import me.durian.lisp.expression.derived.expression.DerivedConditional;

/**
 * Created by durianskh on 4/19/17.
 * <p>
 * (cond (p1 e1) ... (pn en)) is evaluated as follow.
 * the p expressions are evaluated in order until one return t
 * when one is found, the value of corresponding e expression is returned as the value of the whole cond expression
 */
public interface Cond extends Operator, DerivedConditional {
}

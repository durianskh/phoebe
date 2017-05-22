package me.durian.lisp.primitive.operator;

import me.durian.lisp.expression.derived.expression.BindingConstruct;

/**
 * Created by durianskh on 5/22/17.
 * in a let* expression, the bindings and evaluations are performed sequentially
 */
public interface LetStar extends Operator, BindingConstruct {
}

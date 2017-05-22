package me.durian.lisp.primitive.operator;

import me.durian.lisp.expression.derived.expression.BindingConstruct;

/**
 * Created by durianskh on 5/22/17.
 * In a let expression, the initial values are computed before any of the variables become bound
 */
public interface Let extends Operator, BindingConstruct {
}

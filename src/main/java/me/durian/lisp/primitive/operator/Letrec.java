package me.durian.lisp.primitive.operator;

import me.durian.lisp.expression.derived.expression.BindingConstruct;

/**
 * Created by durianskh on 5/22/17.
 * in a letrec expression, all the bindings are in effect while their initial values are being computed,
 * thus allowing mutually recursive definitions
 */
public interface Letrec extends Operator, BindingConstruct {
}

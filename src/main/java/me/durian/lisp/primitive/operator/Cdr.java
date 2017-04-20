package me.durian.lisp.primitive.operator;

/**
 * Created by durianskh on 4/19/17.
 * <p>
 * cdr x expects the value of x is a list, and returns everything after the first element
 * the law of cdr: the primitive of cdr is defined only of non-empty list. the cdr of any non-empty list is aways a list
 */
public interface Cdr extends Operator {
}

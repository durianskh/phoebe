package me.durian.lisp.primitive.operator;

/**
 * Created by durianskh on 4/19/17.
 * <p>
 * (cons x y) expects the value of y is a list, and returns a list containing the value of x followed by the elements of the value of y
 * the law of cons: the primitive cons takes two arguments, the second argument to cons must be a list. the result is a list
 */
public interface Cons extends Operator {
}

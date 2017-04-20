package me.durian.lisp.primitive.operator;

/**
 * Created by durianskh on 4/19/17.
 * <p>
 * (atom x) returns the atom t if the value of x is an atom or the empty list
 * In Lisp we conventionally use the atom t to represent truth, and the empty list to represent falsity
 */
public interface Atom extends Operator {
}

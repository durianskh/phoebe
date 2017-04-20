package me.durian.lisp.core;

/**
 * Created by durianskh on 4/19/17.
 * <p>
 * a function is an expression like (lambda (p1 p2 ... pn) e) where p1 p2 ... pn are atoms (called parameters) and e is an expression
 * function call is like ((lambda (p1 p2 ... pn) e) a1 a2 ... an)
 * if an expression has as its first element an atom of f that is not of the primitive operators (f a1 a2 ... an) and the value of f is a function
 * then the value of the expression is the value: ((lambda (p1 p2 ... pn) e) a1 a2 ... an)
 */
public interface CoreFunction {
}

/***
 * Copyright (C) 2015 by Chang Liu <liuchang@cs.umd.edu>
 */
package com.oblivm.compiler.ast.expr;


public class ASTRecTupleExpression extends ASTTupleExpression {
	public ASTExpression base;
	
	public ASTRecTupleExpression(ASTExpression base, ASTTupleExpression tuple) {
		this.base = base;
		this.exps = tuple.exps;
	}
	
	@Override
	public int level() {
		return 100;
	}
	
	public String toString() {
		return base.toString() + ".(" + super.toString() + ")";
	}

}

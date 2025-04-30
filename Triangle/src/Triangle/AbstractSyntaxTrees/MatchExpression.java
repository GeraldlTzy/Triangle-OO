/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author andre
 */
public class MatchExpression extends Expression {
    public Expression E;
    public LinkedHashMap<ArrayList<Expression>,Expression> MAP;
    public Expression OTHERWISE;
    
    public MatchExpression(Expression expr, 
                        LinkedHashMap<ArrayList<Expression>,Expression> map,
                        Expression expro,
                        SourcePosition thePosition){
        super(thePosition);
        this.E = expr;
        this.MAP = map;
        this.OTHERWISE = expro;
    
    }
    public Object visit(Visitor v, Object o){
        return v.visitMatchExpression(this, o);
    }
    
}

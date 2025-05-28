/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangle.AbstractSyntaxTrees;

/**
 *
 * @author geral
 */
import Triangle.SyntacticAnalyzer.SourcePosition;
public class MethodCallExpression extends Expression {
    public Vname object;
    public Identifier methodName;
    public FuncDeclaration methodDecl;
    public ActualParameterSequence aps;
    
    public MethodCallExpression(Vname object, Identifier methodName, 
                                ActualParameterSequence aps, 
                                SourcePosition pos) {
        super(pos);
        this.object = object;
        this.methodName = methodName;
        this.aps = aps;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitMethodCallExpression(this, o);
    }
}

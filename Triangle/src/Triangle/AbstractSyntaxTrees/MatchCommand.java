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
public class MatchCommand extends Command{
    
    public Expression E;
    public LinkedHashMap<ArrayList<Expression>,Command> MAP;
    public Command OTHERWISE;
    
    public MatchCommand(Expression expr, 
                        LinkedHashMap<ArrayList<Expression>,Command> map,
                        Command command,
                        SourcePosition thePosition){
        super(thePosition);
        this.E = expr;
        this.MAP = map;
        this.OTHERWISE = command;
    
    }
    public Object visit(Visitor v, Object o){
        return v.visitMatchCommand(this, o);
    }
    
}

// Gerald
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public abstract class ClassAggregate extends AST {

  public ClassAggregate (SourcePosition thePosition) {
    super (thePosition);
    type = null;
  }

  public FieldTypeDenoter type;
}
// agregado
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ClassTypeDenoter extends TypeDenoter {
    public Identifier classId;
    public Identifier parentId;
    public Declaration body;    

    public ClassTypeDenoter (Identifier classId, Identifier parentId, Declaration body, SourcePosition pos) {
        super(pos);
        this.classId = classId;
        this.parentId = parentId;
        this.body = body;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitClassTypeDenoter(this, o);
    }

  public boolean equals (Object obj) {
    if (obj != null && obj instanceof ErrorTypeDenoter)
      return true;
    else if (obj != null && obj instanceof ClassTypeDenoter)
      return this.body.equals(((ClassTypeDenoter) obj).body);
    else
      return false;
  }

}

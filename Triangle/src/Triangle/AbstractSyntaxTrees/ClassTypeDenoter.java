// agregado
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ClassTypeDenoter extends TypeDenoter {
    public Identifier classId;
    public Identifier parentId;
    public Declaration body;
    public TypeDenoter parentType;

    public ClassTypeDenoter (Identifier classId, Identifier parentId, Declaration body, SourcePosition pos) {
        super(pos);
        this.classId = classId;
        this.parentId = parentId;
        this.parentType = null;
        this.body = body;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitClassTypeDenoter(this, o);
    }

  public boolean equals (Object obj) {
    if (obj != null && obj instanceof ErrorTypeDenoter)
      return true;
    else if (obj != null && obj instanceof RecordTypeDenoter)
      return this.FT.equals(((RecordTypeDenoter) obj).FT);
    else
      return false;
  }

  public FieldTypeDenoter FT;
}

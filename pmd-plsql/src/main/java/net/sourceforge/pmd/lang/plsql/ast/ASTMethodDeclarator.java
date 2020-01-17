/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

/* Generated By:JJTree: Do not edit this line. ASTMethodDeclarator.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */

package net.sourceforge.pmd.lang.plsql.ast;

public class ASTMethodDeclarator extends net.sourceforge.pmd.lang.plsql.ast.AbstractPLSQLNode {
    public ASTMethodDeclarator(int id) {
        super(id);
    }

    public ASTMethodDeclarator(PLSQLParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    @Override
    public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    public int getParameterCount() {
        return this.getChild(0).getNumChildren();
    }
}
/*
 * JavaCC - OriginalChecksum=e8cd0d5365aa4895507ff58801756649 (do not edit this
 * line)
 */

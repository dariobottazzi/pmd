/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.ast;

public class ASTArrayTypeDim extends AbstractJavaTypeNode {
    public ASTArrayTypeDim(int id) {
        super(id);
    }

    public ASTArrayTypeDim(JavaParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}

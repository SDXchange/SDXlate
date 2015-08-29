package org.sdxchange.insight.app;

public class LinkNode extends BaseImNode {

    public LinkNode(String name, int parent, int id) {
        this.name = name;
        this.parent = parent;
        this.id = id;
        style="link";

    }
/*
 * <Link name="Link" Note="" BiDirectional="false" id="68">
<mxCell style="link" edge="1" parent="74" source="60" target="56">
<mxGeometry relative="1" as="geometry"/>
</mxCell>
</Link>
(non-Javadoc)
 * @see org.sdxchange.insight.app.BaseImNode#marshall()
 */
    @Override
    public String marshall(){
        String rval = "<Link "
//                + attr("name", name)
                + attr("id", id)
                + attr("BiDirectional",false)
                + ">\n";

        rval += "<mxCell "
                + attr("style", style)
                + attr("edge", 1)
                + attr("parent", parent)
                + attr("source", source)
                + attr("target", target)
                +">\n";

        rval += "<mxGeometry relative=\"1\" as=\"geometry\"/>\n";

        rval += "</mxCell>\n";

        rval += "</Link>\n";

        return rval;

    }

}

package org.sdxchange.insight.app;

public abstract class BaseImNode implements ImNode {

    boolean edge;
    boolean vertex;
    int parent;
    int source=0;
    int target=0;
    int id;
    String style;
    String name;
    int x;
    int y;
    int width;
    int height;
    boolean relative;
    boolean visible;
    String eqn = "";

    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#isEdge()
     */
    @Override
    public boolean isEdge() {
        return edge;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setEdge(boolean)
     */
    @Override
    public void setEdge(boolean edge) {
        this.edge = edge;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#isVertex()
     */
    @Override
    public boolean isVertex() {
        return vertex;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setVertex(boolean)
     */
    @Override
    public void setVertex(boolean vertex) {
        this.vertex = vertex;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getParent()
     */
    @Override
    public int getParent() {
        return parent;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setParent(int)
     */
    @Override
    public void setParent(int parent) {
        this.parent = parent;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getSource()
     */
    @Override
    public int getSource() {
        return source;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setSource(int)
     */
    @Override
    public void setSource(int source) {
        this.source = source;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getTarget()
     */
    @Override
    public int getTarget() {
        return target;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setTarget(int)
     */
    @Override
    public void setTarget(int target) {
        this.target = target;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getId()
     */
    @Override
    public int getId() {
        return id;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setId(int)
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getStyle()
     */
    @Override
    public String getStyle() {
        return style;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setStyle(java.lang.String)
     */
    @Override
    public void setStyle(String style) {
        this.style = style;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getName()
     */
    @Override
    public String getName() {
        return name;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setName(java.lang.String)
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getX()
     */
    @Override
    public int getX() {
        return x;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setX(int)
     */
    @Override
    public void setX(int x) {
        this.x = x;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getY()
     */
    @Override
    public int getY() {
        return y;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setY(int)
     */
    @Override
    public void setY(int y) {
        this.y = y;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getWidth()
     */
    @Override
    public int getWidth() {
        return width;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setWidth(int)
     */
    @Override
    public void setWidth(int width) {
        this.width = width;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#getHeight()
     */
    @Override
    public int getHeight() {
        return height;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setHeight(int)
     */
    @Override
    public void setHeight(int height) {
        this.height = height;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#isRelative()
     */
    @Override
    public boolean isRelative() {
        return relative;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.insight.app.ImNode#setRelative(boolean)
     */
    @Override
    public void setRelative(boolean relative) {
        this.relative = relative;
    }
    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String marshall() {
        return "";
    }

    public String marshallCell() {
        return "<mxCell "
                + ((style != null && ! style.isEmpty()) ? attr("style",style):"")
                + attr("parent",parent)
                + ((vertex)? attr("vertex", vertex) : "")
                + ((edge)? attr("edge", edge) : "")
                + ((source != 0 )? attr("source", source): "")
                + ((target != 0 )? attr("target", target): "")
                + attr("visible",visible)
                +">\n"
                + marshallGeometry()
                +"</mxCell>\n";
    }

    public String marshallGeometry() {
        String rval = "";
        if (relative){
            rval = "<mxGeometry relative=\"1\" as=\"geometry\"/>\n";
        }
        else {
            rval = "<mxGeometry "
                    + attr("x",x) +attr("y",y) + attr("width", width) + attr("height",height)
                    + attr("as","geometry") +"/>\n";

        }
        return rval;
    }

    public String attr(String name, String val) {
        return name +"=\""+val+"\" ";
    }

    public String attr(String name, int val) {
        return attr(name, ""+val);
    }

    public String attr(String name, boolean val){
        return attr(name, (val)? 1 : 0);
    }
}

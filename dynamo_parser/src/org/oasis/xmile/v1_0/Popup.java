//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.24 at 12:14:36 AM CST 
//


package org.oasis.xmile.v1_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://docs.oasis-open.org/xmile/ns/XMILE/v1.0}text_box"/>
 *         &lt;element ref="{http://docs.oasis-open.org/xmile/ns/XMILE/v1.0}image"/>
 *         &lt;element ref="{http://docs.oasis-open.org/xmile/ns/XMILE/v1.0}video"/>
 *         &lt;element ref="{http://docs.oasis-open.org/xmile/ns/XMILE/v1.0}sound"/>
 *         &lt;element ref="{http://docs.oasis-open.org/xmile/ns/XMILE/v1.0}link"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/xmile/ns/XMILE/v1.0}style_attributes"/>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/xmile/ns/XMILE/v1.0}positioning_attributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textBox",
    "image",
    "video",
    "sound",
    "link"
})
@XmlRootElement(name = "popup")
public class Popup {

    @XmlElement(name = "text_box")
    protected TextBox textBox;
    protected Image image;
    protected Video video;
    protected Sound sound;
    protected Link link;
    @XmlAttribute(name = "border_width")
    protected String borderWidth;
    @XmlAttribute(name = "border_color")
    protected String borderColor;
    @XmlAttribute(name = "border_style")
    protected String borderStyle;
    @XmlAttribute(name = "font_family")
    protected String fontFamily;
    @XmlAttribute(name = "font_style")
    protected String fontStyle;
    @XmlAttribute(name = "font_weight")
    protected String fontWeight;
    @XmlAttribute(name = "text_decoration")
    protected String textDecoration;
    @XmlAttribute(name = "text_align")
    protected TextAlign textAlign;
    @XmlAttribute(name = "vertical_text_align")
    protected VerticalTextAlign verticalTextAlign;
    @XmlAttribute(name = "font_color")
    protected String fontColor;
    @XmlAttribute(name = "text_background")
    protected String textBackground;
    @XmlAttribute(name = "font_size")
    protected String fontSize;
    @XmlAttribute(name = "padding")
    protected String padding;
    @XmlAttribute(name = "color")
    protected String color;
    @XmlAttribute(name = "background")
    protected String background;
    @XmlAttribute(name = "z_index")
    protected BigInteger zIndex;
    @XmlAttribute(name = "x")
    protected Double x;
    @XmlAttribute(name = "y")
    protected Double y;
    @XmlAttribute(name = "height")
    protected Double height;
    @XmlAttribute(name = "width")
    protected Double width;
    @XmlAttribute(name = "label_side")
    protected String labelSide;
    @XmlAttribute(name = "label_angle")
    protected Double labelAngle;

    /**
     * Gets the value of the textBox property.
     * 
     * @return
     *     possible object is
     *     {@link TextBox }
     *     
     */
    public TextBox getTextBox() {
        return textBox;
    }

    /**
     * Sets the value of the textBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextBox }
     *     
     */
    public void setTextBox(TextBox value) {
        this.textBox = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the video property.
     * 
     * @return
     *     possible object is
     *     {@link Video }
     *     
     */
    public Video getVideo() {
        return video;
    }

    /**
     * Sets the value of the video property.
     * 
     * @param value
     *     allowed object is
     *     {@link Video }
     *     
     */
    public void setVideo(Video value) {
        this.video = value;
    }

    /**
     * Gets the value of the sound property.
     * 
     * @return
     *     possible object is
     *     {@link Sound }
     *     
     */
    public Sound getSound() {
        return sound;
    }

    /**
     * Sets the value of the sound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sound }
     *     
     */
    public void setSound(Sound value) {
        this.sound = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Link }
     *     
     */
    public Link getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Link }
     *     
     */
    public void setLink(Link value) {
        this.link = value;
    }

    /**
     * Gets the value of the borderWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderWidth() {
        return borderWidth;
    }

    /**
     * Sets the value of the borderWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderWidth(String value) {
        this.borderWidth = value;
    }

    /**
     * Gets the value of the borderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * Sets the value of the borderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderColor(String value) {
        this.borderColor = value;
    }

    /**
     * Gets the value of the borderStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderStyle() {
        if (borderStyle == null) {
            return "none";
        } else {
            return borderStyle;
        }
    }

    /**
     * Sets the value of the borderStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderStyle(String value) {
        this.borderStyle = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStyle() {
        if (fontStyle == null) {
            return "normal";
        } else {
            return fontStyle;
        }
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStyle(String value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the fontWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontWeight() {
        if (fontWeight == null) {
            return "normal";
        } else {
            return fontWeight;
        }
    }

    /**
     * Sets the value of the fontWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontWeight(String value) {
        this.fontWeight = value;
    }

    /**
     * Gets the value of the textDecoration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextDecoration() {
        if (textDecoration == null) {
            return "normal";
        } else {
            return textDecoration;
        }
    }

    /**
     * Sets the value of the textDecoration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextDecoration(String value) {
        this.textDecoration = value;
    }

    /**
     * Gets the value of the textAlign property.
     * 
     * @return
     *     possible object is
     *     {@link TextAlign }
     *     
     */
    public TextAlign getTextAlign() {
        if (textAlign == null) {
            return TextAlign.LEFT;
        } else {
            return textAlign;
        }
    }

    /**
     * Sets the value of the textAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAlign }
     *     
     */
    public void setTextAlign(TextAlign value) {
        this.textAlign = value;
    }

    /**
     * Gets the value of the verticalTextAlign property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalTextAlign }
     *     
     */
    public VerticalTextAlign getVerticalTextAlign() {
        if (verticalTextAlign == null) {
            return VerticalTextAlign.CENTER;
        } else {
            return verticalTextAlign;
        }
    }

    /**
     * Sets the value of the verticalTextAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalTextAlign }
     *     
     */
    public void setVerticalTextAlign(VerticalTextAlign value) {
        this.verticalTextAlign = value;
    }

    /**
     * Gets the value of the fontColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * Sets the value of the fontColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontColor(String value) {
        this.fontColor = value;
    }

    /**
     * Gets the value of the textBackground property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextBackground() {
        return textBackground;
    }

    /**
     * Sets the value of the textBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextBackground(String value) {
        this.textBackground = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the padding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Sets the value of the padding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the background property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackground() {
        return background;
    }

    /**
     * Sets the value of the background property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackground(String value) {
        this.background = value;
    }

    /**
     * Gets the value of the zIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZIndex() {
        return zIndex;
    }

    /**
     * Sets the value of the zIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZIndex(BigInteger value) {
        this.zIndex = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX(Double value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setY(Double value) {
        this.y = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

    /**
     * Gets the value of the labelSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelSide() {
        return labelSide;
    }

    /**
     * Sets the value of the labelSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelSide(String value) {
        this.labelSide = value;
    }

    /**
     * Gets the value of the labelAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLabelAngle() {
        return labelAngle;
    }

    /**
     * Sets the value of the labelAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLabelAngle(Double value) {
        this.labelAngle = value;
    }

}

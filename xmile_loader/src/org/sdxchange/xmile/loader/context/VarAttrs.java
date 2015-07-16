package org.sdxchange.xmile.loader.context;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.oasis.xmile.v1_0.Conveyor;
import org.oasis.xmile.v1_0.Dimensions;
import org.oasis.xmile.v1_0.EventPoster;
import org.oasis.xmile.v1_0.Format;
import org.oasis.xmile.v1_0.Gf;
import org.oasis.xmile.v1_0.Range;
import org.oasis.xmile.v1_0.Scale;

public class VarAttrs {

    private List<String> inflows = new ArrayList<String>();
    private String eqn ="";
    private List<String> outflows = new ArrayList<String>();
    private boolean hasNestedTable;
    private Gf nestedTable;


    public VarAttrs( List< Object> items) {
        for (Object item: items){
            if (item instanceof JAXBElement<?>) {
                String elementName = ((JAXBElement) item).getName().getLocalPart();
                switch (elementName){
                    case "inflow":
                        this.inflows.add( ((JAXBElement) item).getValue().toString() );
                        break;
                    case "outflow":
                        this.outflows.add( ((JAXBElement) item).getValue().toString() );
                        break;
                    case "eqn":
                        this.eqn = ((JAXBElement) item).getValue().toString();
                        break;
                    default:
                        System.out.println("unprocessed stock element "+elementName);
                }
            }
            else {
                if (item instanceof Gf){
                    this.hasNestedTable = true;
                    this.nestedTable = (Gf) item;
                } else if (item instanceof Format){
                    System.err.println("Not implemented: "+ item.toString());
                } else if (item instanceof EventPoster) {
                    System.err.println("Not implemented: "+ item.toString());
                } else if (item instanceof Conveyor ){
                    System.err.println("Not implemented: "+ item.toString());
                } else if (item instanceof Dimensions) {
                    System.err.println("Not implemented: "+ item.toString());
                } else if (item instanceof Range){
                    System.err.println("Not implemented: "+ item.toString());
                } else if (item instanceof Scale){
                    System.err.println("Not implemented: "+ item.toString());
                }  else {
                    System.err.println("Unrecognized child of stock: "+ item.toString());
                }
            }
        }
    }


    public List<String> getInflows() {
        return inflows;
    }


    public String getEqn() {
        return eqn;
    }


    public List<String> getOutflows() {
        return outflows;
    }


    public boolean hasNestedTable() {
        return hasNestedTable;
    }


    public Gf getNestedTable() {
        return nestedTable;
    }


}




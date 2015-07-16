package org.sdxchange.xmile.loader.context;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.oasis.xmile.devkit.view.DrawingAttributes;

public class VarViewContext implements DrawingAttributes {

    Object objInstance;
    private static Class[] noArgs = {};
    private static Object[] noParams = {};
    public VarViewContext(Object viewObj) {
        objInstance = viewObj;
    }

    /* (non-Javadoc)
     * @see org.sdxchange.xmile.loader.DrawingAttributes#getName()
     */
    @Override
    public String getName() {
        Object rval = getDynamic("getName", noArgs, noParams);
        return (rval == null) ? null: (String) rval;
    }
    /* (non-Javadoc)
     * @see org.sdxchange.xmile.loader.DrawingAttributes#getX()
     */
    @Override
    public Double getX() {
        Object rval = getDynamic("getX", noArgs, noParams);
        return (rval == null) ? null: (Double) rval;
    }

    /* (non-Javadoc)
     * @see org.sdxchange.xmile.loader.DrawingAttributes#getY()
     */
    @Override
    public Double getY() {
        Object rval = getDynamic("getY", noArgs, noParams);
        return (rval == null) ? null: (Double) rval;
    }

    private Object getDynamic (String name, Class[] args, Object[] params){
        Object rval = null;
        try {
            Method method = objInstance.getClass().getMethod(name, args);
            rval =  method.invoke(objInstance, params);
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rval;
    }

}

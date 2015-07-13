package org.sdxchange.xmile.loader;

import org.sdxchange.xmile.loader.context.AuxvarContext;
import org.sdxchange.xmile.loader.context.FlowContext;
import org.sdxchange.xmile.loader.context.ModelCtx;
import org.sdxchange.xmile.loader.context.SimSpecsCtx;
import org.sdxchange.xmile.loader.context.VarsContext;

/**
 *
 * @author rward
 *
 */

public interface XmileListener {

    void enterModel(ModelCtx ctx);

    void exitModel(ModelCtx ctx);

    void enterSimSpecs(SimSpecsCtx ctx);

    void exitSimSpecs(SimSpecsCtx ctx);

    boolean targetSupportsMultipleViewsPerModel();

    void enterVariables(VarsContext varsCtx);

    void exitVariables(VarsContext varsCtx);

    void enterAuxvar(AuxvarContext ctx);

    void exitAuxvar(AuxvarContext ctx);

    void enterFlow(FlowContext ctx);

    void exitFlow(FlowContext ctx);

    void process(FlowContext flowContext);

}

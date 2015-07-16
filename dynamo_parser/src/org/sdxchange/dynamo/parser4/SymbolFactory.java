package org.sdxchange.dynamo.parser4;

import java.util.List;
import java.util.Map;

import org.sdxchange.dynamo.parser4.DynamoParser.AUX_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.CONST_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.INIT_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.LVL_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.PlotCardContext;
import org.sdxchange.dynamo.parser4.DynamoParser.PrintCardContext;
import org.sdxchange.dynamo.parser4.DynamoParser.RATE_EQNContext;
import org.sdxchange.dynamo.parser4.DynamoParser.SpecCardContext;
import org.sdxchange.dynamo.parser4.DynamoParser.TBL_EQNContext;

/**
 *
 *
 * @author RWard
 *
 */
public interface SymbolFactory {

    public List<ErrorMsg> processAuxDecl(IXFrame currentFrame, AUX_EQNContext ctx, Map<String, TableInfo> tInfoIndex);

    public List<ErrorMsg> processInitDecl(IXFrame currentFrame, INIT_EQNContext ctx);

    public List<ErrorMsg> processLvlDecl(IXFrame currentFrame, LVL_EQNContext ctx);

    public List<ErrorMsg> processConstDecl(IXFrame currentFrame, CONST_EQNContext ctx);

    public List<ErrorMsg> processTblDecl(IXFrame currentFrame, TBL_EQNContext ctx, Map<String, TableInfo> tInfoIndex);

    public void processPlotCard(IXFrame currentFrame, PlotCardContext ctx);

    public void processPrintCard(IXFrame currentFrame, PrintCardContext ctx);

    public void processSpecCard(IXFrame currentFrame, SpecCardContext ctx);

    public Symbol forceInitTerms(InitSymbol sym);

    List<ErrorMsg> processRateDecl(IXFrame frame, RATE_EQNContext ctx, Map<String, TableInfo> tInfoIndex);

}

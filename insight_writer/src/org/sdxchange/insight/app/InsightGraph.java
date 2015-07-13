package org.sdxchange.insight.app;

import java.util.ArrayList;
import java.util.List;

public class InsightGraph {

    ImNode root = new RootNode();
    ImNode settings;
    List<FolderNode> folders = new ArrayList<FolderNode>();
    ImNode model;
    List<DisplayNode> displays = new ArrayList<DisplayNode>();
    //all other nodes.
    List<ImNode> graph = new ArrayList<ImNode>();
    FolderNode currentFolder = null;
    int nextNodeId = 10;

    public InsightGraph(String simulationName) {
        root = new RootNode();
        model = new ModelNode();
        settings = new SettingsNode();
        add(new FolderNode(simulationName, nextNodeId++));
    }

    public String marshal() {
        String rval = "<InsightMakerModel>\n<root>\n";
        rval += root.marshall();
        rval += model.marshall();
        rval += settings.marshall();
        rval += marshallDisplays();
        rval += marshallFolders();
        rval += marshallChildren();
        rval += "</root>\n</InsightMakerModel>\n";
        return rval;
    }

    private String marshallChildren() {
        String rval = "";
        for (ImNode node: graph){
            rval += node.marshall();
        };
        return rval;
    }

    public void add(FolderNode folder){
        int pid = (currentFolder == null)? 1 : currentFolder.getId();
        folder.setParent(pid);
        currentFolder = folder;
        folders.add(folder);
    }

    public void addNode(ImNode node){
        node.setParent(currentFolder.getId());
        graph.add(node);
    }

    private String marshallFolders() {
        String rval = "";
        for (FolderNode node: folders){
            rval += node.marshall();
        }
        return rval;
    }

    private String marshallDisplays() {
        String rval = "";
        for (DisplayNode node: displays){
            rval += node.marshall();
        }
        return rval;
    }

    public void updateFolderSizes(int x, int y) {
        currentFolder.height = y;
        currentFolder.width = y;
    }

}

package io.searchbox.indices;

import io.searchbox.AbstractAction;
import io.searchbox.Action;

/**
 * @author ferhat
 */


public class GetMapping extends AbstractAction implements Action {

    public GetMapping(String indexName, String type) {
        setURI(buildGetURI(indexName, type));
        setRestMethodName("GET");
    }

    private String buildGetURI(String indexName, String type) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.buildURI(indexName, type, null))
                .append("/")
                .append("_mapping");
        return sb.toString();
    }
}

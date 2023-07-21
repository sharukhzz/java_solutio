package com.onlinetutorilspoint.solr;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;

public class AddDocuments {
    public static void main(String[] args) throws Exception{
        String SOLR_URL="http://localhost:8983/solr/sample-items";
        SolrClient solrClient = new HttpSolrClient.Builder(SOLR_URL).build();

        SolrInputDocument document = new SolrInputDocument();
        document.addField("item_id",101);
        document.addField("item_name","Spring in action");
        document.addField("item_category","Books");

        solrClient.add(document);
        solrClient.commit();
    }

}
package com.example.user.happiness_new_peyk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Pojo  implements Serializable {

    @SerializedName("batchcomplete")
    @Expose
    private String batchcomplete;
    @SerializedName("continue")
    @Expose
    private Continue _continue;
    @SerializedName("query")
    @Expose
    private Query query;



    public String getBatchcomplete() {
        return batchcomplete;
    }

    public void setBatchcomplete(String batchcomplete) {
        this.batchcomplete = batchcomplete;
    }

    public Continue getContinue() {
        return _continue;
    }

    public void setContinue(Continue _continue) {
        this._continue = _continue;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

   /* @Override
    public String toString() {
        return new ToStringBuilder(this).append("batchcomplete", batchcomplete).append("_continue", _continue).append("query", query).toString();
    }*/



    public class Query {

        @SerializedName("allimages")
        @Expose
       private List<Allimage> allimages ;

        public List<Allimage> getAllimages() {
            return allimages;
        }

        public void setAllimages(List<Allimage> allimages) {
            this.allimages = allimages;
        }

     /*   @Override
        public String toString() {
            return new ToStringBuilder(this).append("allimages", allimages).toString();
        }*/

    }

    public class Allimage {

        @SerializedName("url")
        @Expose
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }


      /*  @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("timestamp")
        @Expose
        private String timestamp;
        @SerializedName("descriptionurl")
        @Expose
        private String descriptionurl;
        @SerializedName("descriptionshorturl")
        @Expose
        private String descriptionshorturl;
        @SerializedName("ns")
        @Expose
        private Integer ns;
        @SerializedName("title")
        @Expose
        private String title;*/

        /*public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getDescriptionurl() {
            return descriptionurl;
        }

        public void setDescriptionurl(String descriptionurl) {
            this.descriptionurl = descriptionurl;
        }

        public String getDescriptionshorturl() {
            return descriptionshorturl;
        }

        public void setDescriptionshorturl(String descriptionshorturl) {
            this.descriptionshorturl = descriptionshorturl;
        }

        public Integer getNs() {
            return ns;
        }

        public void setNs(Integer ns) {
            this.ns = ns;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }*/

       /* @Override
        public String toString() {
            return new ToStringBuilder(this).append("name", name).append("timestamp", timestamp).append("url", url).append("descriptionurl", descriptionurl).append("descriptionshorturl", descriptionshorturl).append("ns", ns).append("title", title).toString();
        }*/

    }

    public class Continue {

        @SerializedName("aicontinue")
        @Expose
        private String aicontinue;
        @SerializedName("continue")
        @Expose
        private String _continue;

        public String getAicontinue() {
            return aicontinue;
        }

        public void setAicontinue(String aicontinue) {
            this.aicontinue = aicontinue;
        }

        public String getContinue() {
            return _continue;
        }

        public void setContinue(String _continue) {
            this._continue = _continue;
        }

       /* @Override
        public String toString() {
            return new ToStringBuilder(this).append("aicontinue", aicontinue).append("_continue", _continue).toString();
        }*/

    }


}
